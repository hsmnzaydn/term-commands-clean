package com.hsmnzaydn.term_commands_clean.Category.domain.usecases

import com.hsmnzaydn.term_commands_clean.Category.domain.entities.Category
import com.hsmnzaydn.term_commands_clean.Category.domain.mapper.toCategory
import com.hsmnzaydn.term_commands_clean.Category.domain.mapper.toCategoryCellItem
import com.hsmnzaydn.term_commands_clean.Category.domain.repository.CategoryRepository
import com.hsmnzaydn.term_commands_clean.base.BaseResponseCallBack
import com.hsmnzaydn.term_commands_clean.remote.ServiceCallback
import com.hsmnzaydn.term_commands_clean.ui.category.model.CategoryRecylerViewItem
import net.serkanozaydin.hsmnzaydn.data.entity.CategoryResponseModel
import javax.inject.Inject

class CategoryUseCase @Inject constructor( private val categoryRepository: CategoryRepository) {


    fun getCategories(callback: BaseResponseCallBack<List<CategoryRecylerViewItem.CategoryCellItem>>){
        categoryRepository.getCategories(object: ServiceCallback<List<CategoryResponseModel>>{
            override fun onSuccess(response: List<CategoryResponseModel>?) {
                callback.onSuccess(response.let { it?.map { it.toCategoryCellItem() } })
            }

            override fun onError(errorCode: Int, errorMessage: String) {
                callback.onError(errorCode,errorMessage)
            }

        })
    }
}