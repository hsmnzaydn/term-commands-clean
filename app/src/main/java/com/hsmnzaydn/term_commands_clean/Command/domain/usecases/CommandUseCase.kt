package com.hsmnzaydn.term_commands_clean.Category.domain.usecases

import com.hsmnzaydn.term_commands_clean.Command.domain.mapper.toCommandCellItem
import com.hsmnzaydn.term_commands_clean.Category.domain.repository.CommandRepository
import com.hsmnzaydn.term_commands_clean.Command.data.entities.CommandResponseModel
import com.hsmnzaydn.term_commands_clean.base.BaseResponseCallBack
import com.hsmnzaydn.term_commands_clean.remote.ServiceCallback
import com.hsmnzaydn.term_commands_clean.ui.command.model.CommandRecylerViewItem
import javax.inject.Inject

class CommandUseCase @Inject constructor(private val commandRepository: CommandRepository) {


    fun getCommandList(categoryId:String,callBack: BaseResponseCallBack<List<CommandRecylerViewItem.CommandCellItem>>){

        commandRepository.getCommandList(categoryId,object:ServiceCallback<List<CommandResponseModel>>{
            override fun onSuccess(response: List<CommandResponseModel>?) {
                callBack.onSuccess(response?.let { it.mapIndexed { index, commandResponseModel ->  commandResponseModel.toCommandCellItem(index)} })
            }


            override fun onError(errorCode: Int, errorMessage: String) {
                callBack.onError(errorCode,errorMessage)
            }

        })
    }

}