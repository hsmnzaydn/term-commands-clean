package com.hsmnzaydn.term_commands_clean.Category.domain.usecases

import com.basefy.base_mvvm_libraries.network.BaseServiceCallback
import com.hsmnzaydn.term_commands_clean.Category.domain.mapper.toCategoryCellItem
import com.hsmnzaydn.term_commands_clean.Category.domain.repository.CategoryRepository
import com.hsmnzaydn.term_commands_clean.base.BaseResponseCallBack
import com.hsmnzaydn.term_commands_clean.ui.category.model.CategoryRecylerViewItem
import net.serkanozaydin.hsmnzaydn.data.entity.CategoryResponseModel
import javax.inject.Inject

class CategoryUseCase @Inject constructor(private val categoryRepository: CategoryRepository) {


    fun getCategories(callback: BaseResponseCallBack<List<CategoryRecylerViewItem.CategoryCellItem>>) {
        categoryRepository.getCategories(object : BaseServiceCallback<List<CategoryResponseModel>> {
            override fun onSuccess(response: List<CategoryResponseModel>?) {
                callback.onSuccess(response.let {
                    it?.mapIndexed { index, categoryResponseModel ->
                        categoryResponseModel.toCategoryCellItem(
                            index
                        )
                    }
                })
            }

            override fun onError(errorCode: Int, errorMessage: String) {
                callback.onError(errorCode, errorMessage)
            }

        })
    }
}