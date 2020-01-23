import os

print('Enter feature name')
featureName= input()
lowerFeatureName= featureName.lower()

basePackageName='com.hsmnzaydn.term_commands_clean'
packageName='package '+basePackageName
basePackage=   packageName+'.'+featureName
#Feature klasörünü oluşturur
os.system('mkdir '+featureName)

#Feature için data klasörü oluşturur
os.system('mkdir data')

#Feature için oluşturan data klasörünün api klasörünü oluşturur
os.system('mkdir api')

#Feature için servis dosyasını oluşturup api klasörünün içine atar
serviceFileName= featureName+'Services'
os.system('touch '+serviceFileName+'.kt')
servicesFileCode= basePackage+'.data.api \n\n\n interface '+ serviceFileName+' { \n\n }'

with open(serviceFileName+".kt", 'a') as file:
    file.write(servicesFileCode)

os.system('mv '+serviceFileName+'.kt api/ && mv api data')

#Feature için entities klasörü oluşturup feature klasörüne atar
os.system('mkdir entities')
os.system('mv entities data')


#Feature için repository katmanı oluşturup klasöre atar
os.system('mkdir repository')
repositoryImpName= featureName+'RepositoryImpl'
repositoryName= featureName+'Repository'
os.system('touch '+repositoryImpName+'.kt')
repositoryFileCode= basePackage+'.data.repository \n\n import retrofit2.Retrofit \n import com.google.gson.Gson \n import com.basefy.base_mvvm_libraries.network.BaseServicesImp \nimport '+ basePackageName+'.'+featureName+'.domain.repository.'+featureName+'Repository\n\n class '+repositoryImpName+'(private val retrofit:Retrofit,\n gson:Gson):BaseServicesImp(retrofit,gson),'+repositoryName+'{\n\n}'

with open(repositoryImpName+".kt", 'a') as file:
    file.write(repositoryFileCode)
os.system('mv '+repositoryImpName+'.kt repository && mv repository data')

#Data klasörünün featurenin içine atar
os.system('mv data '+featureName)


#Feature için domain katmanını oluşturur
os.system('mkdir domain')

#Domain için entities klasörünün oluşturur ve domaine atar
os.system('mkdir entities')
os.system('mv entities domain')

#Domain için Mapper klasörünü oluşturur ve içine mapper extensionu atar ve domaine atar
os.system('mkdir mapper')
os.system('touch '+featureName+'Mapper.kt')
os.system('mv '+featureName+'Mapper.kt mapper')
os.system('mv mapper domain')

#Domain için repository intefacesini ve klasörünü oluşturur ve bunu domaine atar
os.system('mkdir repository')
os.system('touch '+repositoryName+'.kt')
repositoryFileCode= basePackage+'.domain.repository \n\n interface '+repositoryName+' { \n\n }'

with open(repositoryName+".kt", 'a') as file:
    file.write(repositoryFileCode)

os.system('mv '+repositoryName+'.kt repository')
os.system('mv repository domain')

#UseCase için klasör ve usecase dosyasını oluşturur
os.system('mkdir usecases')
useCaseFileName=featureName+'UseCase'
lowerUseCaseFileName=useCaseFileName.lower
os.system('touch '+useCaseFileName+'.kt')

useCaseFileCode= basePackage+'.domain.usecases \nimport javax.inject.Inject \nimport '+ basePackageName+'.'+featureName+'.domain.repository.'+repositoryName +'\n\n class '+useCaseFileName+' @Inject constructor(private val '+lowerFeatureName+'Repository: '+repositoryName+'){ \n\n }'

with open(useCaseFileName+".kt", 'a') as file:
    file.write(useCaseFileCode)

os.system('mv '+useCaseFileName+'.kt usecases')
os.system('mv usecases domain')
os.system('mv domain '+featureName)


#Presentation için klasör ve viewmodel dosyasını oluşturur
os.system('mkdir presentation')
presentationFileName= featureName+'ViewModel'
os.system('touch '+presentationFileName+'.kt')
presentationFileCode= basePackage+'.presentation \nimport javax.inject.Inject\nimport com.hsmnzaydn.term_commands_clean.base.BaseInterfaces\nimport com.hsmnzaydn.term_commands_clean.base.BaseViewModel\nimport '+basePackageName+'.'+featureName+'.domain.usecases.'+useCaseFileName+' \n\n class '+presentationFileName+'<I : BaseInterfaces> @Inject constructor(private val '+lowerFeatureName+'UseCase: '+useCaseFileName+') : \n  BaseViewModel<I>(){\n\n}'

with open(presentationFileName+".kt", 'a') as file:
    file.write(presentationFileCode)

os.system('mv '+presentationFileName+'.kt presentation')
os.system('mv presentation '+featureName)


#Dagger 2 için module oluşturur
os.system('mkdir '+lowerFeatureName+'_module')
moduleFileName= featureName+'Module'
os.system('touch '+moduleFileName+'.kt')
moduleFileCode= packageName+'.di.modules.'+lowerFeatureName+' \n\nimport  com.google.gson.Gson\nimport dagger.Module\nimport dagger.Provides\nimport retrofit2.Retrofit\nimport javax.inject.Singleton\nimport '+basePackageName+'.'+featureName+'.data.repository.'+repositoryImpName+'\nimport '+basePackageName+'.'+featureName+'.domain.repository.'+repositoryName+'\n\n@Module\nclass '+featureName+'Module{ \n\n  @Provides\n @Singleton\n fun provide'+featureName+'Repository(retrofit:Retrofit, gson:Gson):'+featureName+'Repository{\n   return '+featureName+'RepositoryImpl(retrofit,gson)\n'+'}\n\n'+'}'

with open(moduleFileName+".kt", 'a') as file:
    file.write(moduleFileCode)

os.system('mv '+moduleFileName+'.kt '+lowerFeatureName+'_module')
os.system('mv '+lowerFeatureName+'_module di/modules')

os.system('git add '+featureName)
