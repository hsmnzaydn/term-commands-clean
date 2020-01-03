package com.hsmnzaydn.term_commands_clean.di.modules.use_cases.category

import com.google.gson.Gson
import com.hsmnzaydn.term_commands_clean.Category.data.repository.CategoryRepositoryImpl
import com.hsmnzaydn.term_commands_clean.Category.domain.repository.CategoryRepository
import com.hsmnzaydn.term_commands_clean.Category.domain.usecases.CategoryUseCase
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class CategoryModule {

    @Provides
    @Singleton
    fun provideCategoryRepository(retrofit: Retrofit,
                                  gson: Gson):CategoryRepository = CategoryRepositoryImpl(retrofit, gson)

    @Provides
    @Singleton
    fun provideCategoryUseCase(categoryRepository: CategoryRepository) = CategoryUseCase(categoryRepository)

}