package com.hsmnzaydn.term_commands_clean.ui.category.model

import com.hsmnzaydn.term_commands_clean.base.RecyclerItem
import com.hsmnzaydn.term_commands_clean.Category.domain.entities.Category
import com.hsmnzaydn.term_commands_clean.ui.category.adapter.CategoryViewHolder

sealed class CategoryRecylerViewItem(override val layoutId: Int) : RecyclerItem {

    data class CategoryCellItem constructor(
        var category:Category
    ):CategoryRecylerViewItem(CategoryViewHolder.LAYOUT_ID)

}