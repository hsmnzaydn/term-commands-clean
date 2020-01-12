package com.hsmnzaydn.term_commands_clean.Category.data.repository

import com.hsmnzaydn.term_commands_clean.base.BaseServicesImp
import com.google.gson.Gson
import com.hsmnzaydn.term_commands_clean.Category.domain.repository.CommandRepository
import com.hsmnzaydn.term_commands_clean.Command.data.entities.CommandResponseModel
import com.hsmnzaydn.term_commands_clean.remote.ServiceCallback
import retrofit2.Retrofit

class CommandRepositoryImpl (
    retrofit: Retrofit,
    gson: Gson
): BaseServicesImp(retrofit, gson) , CommandRepository
{
    override fun getCommandList(
        categoryId: String,
        serviceCallback: ServiceCallback<List<CommandResponseModel>>
    ) {
        getRequest(serviceCallback){
            getCommandServices().getCommandList(categoryId)
        }
    }




}