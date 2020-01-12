package com.hsmnzaydn.term_commands_clean.Category.data.repository

import com.basefy.burger_king.data.network.services.BaseServicesImp
import com.google.gson.Gson
import com.hsmnzaydn.term_commands_clean.Category.domain.repository.CategoryRepository
import com.hsmnzaydn.term_commands_clean.remote.ServiceCallback
import net.serkanozaydin.hsmnzaydn.data.entity.CategoryResponseModel
import retrofit2.Retrofit

class CategoryRepositoryImpl (
    retrofit: Retrofit,
    gson: Gson
):BaseServicesImp(retrofit, gson) , CategoryRepository
{
    override fun getCategories(serviceCallback: ServiceCallback<List<CategoryResponseModel>>) {
        getRequest(serviceCallback){
            getCategoryServices().getCategories()
        }
    }


}