package com.hsmnzaydn.term_commands_clean.Category.data.repository

import com.basefy.base_mvvm_libraries.network.BaseServiceCallback
import com.basefy.base_mvvm_libraries.network.BaseServicesImp
import com.google.gson.Gson
import com.hsmnzaydn.term_commands_clean.Category.data.api.CommandServices
import com.hsmnzaydn.term_commands_clean.Category.domain.repository.CommandRepository
import com.hsmnzaydn.term_commands_clean.Command.data.entities.CommandResponseModel
import retrofit2.Retrofit

class CommandRepositoryImpl (
   private val retrofit: Retrofit,
    gson: Gson
): BaseServicesImp(retrofit, gson) , CommandRepository
{
    override fun getCommandList(
        categoryId: String,
        serviceCallback: BaseServiceCallback<List<CommandResponseModel>>
    ) {
        getRequest(serviceCallback){
            retrofit.create(CommandServices::class.java).getCommandList(categoryId)
        }
    }




}