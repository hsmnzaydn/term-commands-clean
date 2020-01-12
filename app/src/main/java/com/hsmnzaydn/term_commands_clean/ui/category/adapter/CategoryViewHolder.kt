package com.hsmnzaydn.term_commands_clean.ui.category.adapter

import android.view.ViewGroup
import com.hsmnzaydn.term_commands_clean.R
import com.hsmnzaydn.term_commands_clean.ui.category.model.CategoryRecylerViewItem
import com.hsmnzaydn.term_commands_clean.base.BaseViewHolder
import com.hsmnzaydn.term_commands_clean.databinding.RowCategoryBinding
import com.hsmnzaydn.term_commands_clean.ui.category.interfaces.CategoryCallback

class CategoryViewHolder(
    parent: ViewGroup
    , private val categoryCallback: CategoryCallback
) : BaseViewHolder<CategoryRecylerViewItem.CategoryCellItem, RowCategoryBinding>(
    parent,
    LAYOUT_ID
) {

    override fun bind(
        item: CategoryRecylerViewItem.CategoryCellItem,
        databinding: RowCategoryBinding
    ) {
        databinding.data = item
        databinding.callback = categoryCallback
        databinding.executePendingBindings()

    }

    companion object {
        const val LAYOUT_ID = R.layout.row_category
    }

}