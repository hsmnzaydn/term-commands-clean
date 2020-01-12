package com.hsmnzaydn.term_commands_clean.Category.data.repository

import com.basefy.base_mvvm_libraries.network.BaseServiceCallback
import com.basefy.base_mvvm_libraries.network.BaseServicesImp
import com.google.gson.Gson
import com.hsmnzaydn.term_commands_clean.Category.data.api.CategoryServices
import com.hsmnzaydn.term_commands_clean.Category.domain.repository.CategoryRepository
import net.serkanozaydin.hsmnzaydn.data.entity.CategoryResponseModel
import retrofit2.Retrofit

class CategoryRepositoryImpl (
    private val retrofit: Retrofit,
    gson: Gson
): BaseServicesImp(retrofit, gson) , CategoryRepository
{
    override fun getCategories(serviceCallback: BaseServiceCallback<List<CategoryResponseModel>>) {
        getRequest(serviceCallback){
            retrofit.create(CategoryServices::class.java).getCategories()
        }
    }


}