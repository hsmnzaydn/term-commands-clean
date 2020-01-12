package com.hsmnzaydn.term_commands_clean.Category.domain.repository

import com.hsmnzaydn.term_commands_clean.Command.data.entities.CommandResponseModel
import com.hsmnzaydn.term_commands_clean.remote.ServiceCallback

interface CommandRepository {

    fun getCommandList(categoryId:String,serviceCallback: ServiceCallback<List<CommandResponseModel>>)
}