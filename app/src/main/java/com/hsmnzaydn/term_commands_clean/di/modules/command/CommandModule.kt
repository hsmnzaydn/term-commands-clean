package com.hsmnzaydn.term_commands_clean.di.modules.command

import com.google.gson.Gson
import com.hsmnzaydn.term_commands_clean.Category.data.repository.CommandRepositoryImpl
import com.hsmnzaydn.term_commands_clean.Category.domain.repository.CommandRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class CommandModule {

    @Provides
    @Singleton
    fun provideCommandRepository(retrofit: Retrofit, gson: Gson): CommandRepository {
        return CommandRepositoryImpl(retrofit,gson)
    }


}