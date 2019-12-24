package com.hsmnzaydn.term_commands_clean.Category.domain.repository

import com.hsmnzaydn.term_commands_clean.remote.ServiceCallback
import net.serkanozaydin.hsmnzaydn.data.entity.CategoryResponseModel

interface CategoryRepository {

    fun getCategories(serviceCallback: ServiceCallback<List<CategoryResponseModel>>)
}