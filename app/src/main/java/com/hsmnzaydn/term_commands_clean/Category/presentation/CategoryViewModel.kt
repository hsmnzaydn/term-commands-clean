package com.hsmnzaydn.term_commands_clean.Category.presentation

import com.hsmnzaydn.term_commands_clean.Category.domain.usecases.CategoryUseCase
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces
import com.hsmnzaydn.term_commands_clean.base.BaseViewModel
import javax.inject.Inject

class CategoryViewModel<I : BaseInterfaces> @Inject constructor(categoryUseCase: CategoryUseCase) :
    BaseViewModel<I>() {

    
    fun getCategories():String{
        interfaces.showMessage("aaa")
        return "aaa"
    }
}