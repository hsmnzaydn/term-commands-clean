package com.hsmnzaydn.term_commands_clean.Category.domain.mapper

import com.hsmnzaydn.term_commands_clean.Category.domain.entities.Category
import net.serkanozaydin.hsmnzaydn.data.entity.CategoryResponseModel


fun CategoryResponseModel.toCategory() = Category(
    id = this.id.let { it },
    title = this.title.let { it }
)