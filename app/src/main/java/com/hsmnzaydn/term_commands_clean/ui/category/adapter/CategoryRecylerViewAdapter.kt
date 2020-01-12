package com.hsmnzaydn.term_commands_clean.ui.category.adapter

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.hsmnzaydn.term_commands_clean.base.RecyclerItem
import com.hsmnzaydn.term_commands_clean.base.BaseRecyclerAdapter
import com.hsmnzaydn.term_commands_clean.base.BaseViewHolder
import com.hsmnzaydn.term_commands_clean.ui.category.interfaces.CategoryCallback
import com.hsmnzaydn.term_commands_clean.ui.category.model.CategoryRecylerViewItem

class CategoryRecylerViewAdapter constructor(private val categoryCallback: CategoryCallback) : BaseRecyclerAdapter<RecyclerItem, BaseViewHolder<RecyclerItem, ViewDataBinding>>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
            CategoryViewHolder.LAYOUT_ID -> CategoryViewHolder(parent,categoryCallback)
            else -> CategoryViewHolder(parent,categoryCallback)
        } as BaseViewHolder<RecyclerItem, ViewDataBinding>


}