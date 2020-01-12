package com.hsmnzaydn.term_commands_clean.Command.domain.mapper

import com.hsmnzaydn.term_commands_clean.Category.domain.entities.Command
import com.hsmnzaydn.term_commands_clean.Command.data.entities.CommandResponseModel
import com.hsmnzaydn.term_commands_clean.ui.command.model.CommandRecylerViewItem


fun CommandResponseModel.toCommand() = Command(
    id = this.id.let { it },
    title = this.text?.let { it },
    description=this.detail?.let { it }
)


fun CommandResponseModel.toCommandCellItem(position:Int) = CommandRecylerViewItem.CommandCellItem(
    command = this.toCommand(),
    position = position
)
