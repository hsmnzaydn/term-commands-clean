package com.hsmnzaydn.term_commands_clean.Command.presentation

import androidx.lifecycle.MutableLiveData
import com.hsmnzaydn.term_commands_clean.Category.domain.usecases.CommandUseCase
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces
import com.hsmnzaydn.term_commands_clean.base.BaseResponseCallBack
import com.hsmnzaydn.term_commands_clean.base.BaseViewModel
import com.hsmnzaydn.term_commands_clean.ui.command.model.CommandRecylerViewItem
import javax.inject.Inject

class CommandViewModel<I : BaseInterfaces> @Inject constructor(private val commandUseCase: CommandUseCase) :
    BaseViewModel<I>() {

    val commandListLiveData = MutableLiveData<List<CommandRecylerViewItem.CommandCellItem>>()


    fun getCommandOfCategories(categoryId:String){
        view.showLoading()

        commandUseCase.getCommandList(categoryId,object:BaseResponseCallBack<List<CommandRecylerViewItem.CommandCellItem>>(view){
            override fun onSuccess(response: List<CommandRecylerViewItem.CommandCellItem>?) {
                super.onSuccess(response)
                commandListLiveData.value = response

            }
        })
    }

}


