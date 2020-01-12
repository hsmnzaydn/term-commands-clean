package com.hsmnzaydn.term_commands_clean.di.modules.category

import com.google.gson.Gson
import com.hsmnzaydn.term_commands_clean.Category.data.repository.CategoryRepositoryImpl
import com.hsmnzaydn.term_commands_clean.Category.data.repository.CommandRepositoryImpl
import com.hsmnzaydn.term_commands_clean.Category.domain.repository.CategoryRepository
import dagger.Module
import dagger.Provides
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