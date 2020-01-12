package com.hsmnzaydn.term_commands_clean.Category.domain.repository

import com.basefy.base_mvvm_libraries.network.BaseServiceCallback
import com.hsmnzaydn.term_commands_clean.Command.data.entities.CommandResponseModel

interface CommandRepository {

    fun getCommandList(categoryId:String,serviceCallback: BaseServiceCallback<List<CommandResponseModel>>)
}