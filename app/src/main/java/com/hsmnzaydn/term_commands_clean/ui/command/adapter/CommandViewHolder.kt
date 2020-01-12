package com.hsmnzaydn.term_commands_clean.ui.command.adapter

import android.view.ViewGroup
import com.basefy.base_mvvm_libraries.ui.adapter.BaseViewHolder
import com.hsmnzaydn.term_commands_clean.R
import com.hsmnzaydn.term_commands_clean.databinding.RowCommandBinding
import com.hsmnzaydn.term_commands_clean.ui.command.model.CommandRecylerViewItem

class CommandViewHolder(parent: ViewGroup) : BaseViewHolder<CommandRecylerViewItem.CommandCellItem, RowCommandBinding>(parent, LAYOUT_ID) {

    override fun bind(item: CommandRecylerViewItem.CommandCellItem, databinding: RowCommandBinding) {
        databinding.data = item



        databinding.executePendingBindings()

    }

    companion object {
        const val LAYOUT_ID = R.layout.row_command
    }

}