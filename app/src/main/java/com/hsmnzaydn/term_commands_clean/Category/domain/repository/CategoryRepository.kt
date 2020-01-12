package com.hsmnzaydn.term_commands_clean.Category.domain.repository

import com.basefy.base_mvvm_libraries.network.BaseServiceCallback
import net.serkanozaydin.hsmnzaydn.data.entity.CategoryResponseModel

interface CategoryRepository {

    fun getCategories(serviceCallback: BaseServiceCallback<List<CategoryResponseModel>>)
}