package com.hsmnzaydn.term_commands_clean.ui.command.model

import com.basefy.base_mvvm_libraries.ui.adapter.RecyclerItem
import com.hsmnzaydn.term_commands_clean.Category.domain.entities.Command
import com.hsmnzaydn.term_commands_clean.ui.category.adapter.CategoryViewHolder

sealed class CommandRecylerViewItem(override val layoutId: Int) : RecyclerItem {

    data class CommandCellItem constructor(
        var command: Command,
        var position:Int,
        var type:String? = CommandCellItem::class.java.simpleName
    ) : CommandRecylerViewItem(CategoryViewHolder.LAYOUT_ID)

}

