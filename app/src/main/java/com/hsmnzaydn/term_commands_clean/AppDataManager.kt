package com.hsmnzaydn.term_commands_clean

import com.hsmnzaydn.term_commands_clean.Category.domain.entities.Category
import com.hsmnzaydn.term_commands_clean.Category.domain.usecases.CategoryUseCase
import com.hsmnzaydn.term_commands_clean.remote.BaseResponseCallBack

class AppDataManager constructor(
    private val categoryUseCase: CategoryUseCase
):DataManager {

    override fun getCategories(callback: BaseResponseCallBack<List<Category>>) {
        categoryUseCase.getCategories(callback)
    }




}