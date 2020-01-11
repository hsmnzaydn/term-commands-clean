package com.hsmnzaydn.term_commands_clean.Category.domain.mapper

import com.hsmnzaydn.term_commands_clean.Category.domain.entities.Category
import com.hsmnzaydn.term_commands_clean.ui.category.model.CategoryRecylerViewItem
import net.serkanozaydin.hsmnzaydn.data.entity.CategoryResponseModel


fun CategoryResponseModel.toCategory() = Category(
    id = this.id.let { it },
    title = this.title.let { it }
)

fun CategoryResponseModel.toCategoryCellItem(position:Int) = CategoryRecylerViewItem.CategoryCellItem(
    category = this.toCategory()?.let { it },
    position = position
)