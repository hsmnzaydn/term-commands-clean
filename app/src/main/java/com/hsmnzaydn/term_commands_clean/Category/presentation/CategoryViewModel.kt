package com.hsmnzaydn.term_commands_clean.Category.presentation

import com.hsmnzaydn.term_commands_clean.Category.domain.entities.Category
import com.hsmnzaydn.term_commands_clean.Category.domain.usecases.CategoryUseCase
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces
import com.hsmnzaydn.term_commands_clean.base.BaseResponseCallBack
import com.hsmnzaydn.term_commands_clean.base.BaseViewModel
import javax.inject.Inject

class CategoryViewModel<I : BaseInterfaces> @Inject constructor(private val categoryUseCase: CategoryUseCase) :
    BaseViewModel<I>() {



    fun getCategories(){
        categoryUseCase.getCategories(object :BaseResponseCallBack<List<Category>>(interfaces){
            override fun onSuccess(response: List<Category>?) {
                super.onSuccess(response)
            }
        })
    }
}