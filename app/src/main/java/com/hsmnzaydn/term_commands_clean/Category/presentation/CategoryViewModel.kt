package com.hsmnzaydn.term_commands_clean.Category.presentation

import com.hsmnzaydn.term_commands_clean.Category.domain.entities.Category
import com.hsmnzaydn.term_commands_clean.DataManager
import com.hsmnzaydn.term_commands_clean.base.BaseViewModel
import com.hsmnzaydn.term_commands_clean.remote.BaseResponseCallBack

class CategoryViewModel(dataManager: DataManager) : BaseViewModel(dataManager) {

    
    fun getCategories(){
        getDataManager().getCategories(object: BaseResponseCallBack<List<Category>>() {
            override fun onSuccess(response: List<Category>?) {
                super.onSuccess(response)
            }
        })
    }
}