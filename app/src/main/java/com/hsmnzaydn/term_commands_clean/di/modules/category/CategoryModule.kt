package com.hsmnzaydn.term_commands_clean.di.modules.category

import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.hsmnzaydn.term_commands_clean.Category.data.repository.CategoryRepositoryImpl
import com.hsmnzaydn.term_commands_clean.Category.domain.repository.CategoryRepository
import com.hsmnzaydn.term_commands_clean.Category.presentation.CategoryViewModel
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces
import com.tunc.mvvm_architecture.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class CategoryModule {

    @Provides
    @Singleton
    fun provideCategoryRepository(retrofit: Retrofit, gson: Gson): CategoryRepository {
        return CategoryRepositoryImpl(retrofit,gson)
    }


}