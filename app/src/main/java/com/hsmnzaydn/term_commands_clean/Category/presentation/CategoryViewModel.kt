package com.hsmnzaydn.term_commands_clean.Category.presentation

import androidx.lifecycle.MutableLiveData
import com.hsmnzaydn.term_commands_clean.Category.domain.entities.Category
import com.hsmnzaydn.term_commands_clean.Category.domain.usecases.CategoryUseCase
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces
import com.hsmnzaydn.term_commands_clean.base.BaseResponseCallBack
import com.hsmnzaydn.term_commands_clean.base.BaseViewModel
import com.hsmnzaydn.term_commands_clean.ui.category.model.CategoryRecylerViewItem
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList
import kotlin.concurrent.schedule

class CategoryViewModel<I : BaseInterfaces> @Inject constructor(private val categoryUseCase: CategoryUseCase) :
    BaseViewModel<I>() {

    val categoryListLiveData = MutableLiveData<List<CategoryRecylerViewItem.CategoryCellItem>>()


    fun getCategories(){
        categoryUseCase.getCategories(object :BaseResponseCallBack<List<CategoryRecylerViewItem.CategoryCellItem>>(interfaces){
            override fun onSuccess(response: List<CategoryRecylerViewItem.CategoryCellItem>?) {
                categoryListLiveData.value = response
                Timer("SettingUp", false).schedule(5000) {

                   var categories = response as ArrayList<CategoryRecylerViewItem.CategoryCellItem>
                    categories.add(CategoryRecylerViewItem.CategoryCellItem(Category("","aaaaaaa")))
                    categoryListLiveData.postValue(categories)
                }
                super.onSuccess(response)
            }
        })
    }
}