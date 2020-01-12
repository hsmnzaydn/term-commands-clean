package com.hsmnzaydn.term_commands_clean.ui.category.adapter

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.basefy.base_mvvm_libraries.ui.adapter.BaseRecyclerAdapter
import com.basefy.base_mvvm_libraries.ui.adapter.BaseViewHolder
import com.basefy.base_mvvm_libraries.ui.adapter.RecyclerItem
import com.hsmnzaydn.term_commands_clean.ui.category.interfaces.CategoryCallback

class CategoryRecylerViewAdapter constructor(private val categoryCallback: CategoryCallback) : BaseRecyclerAdapter<RecyclerItem, BaseViewHolder<RecyclerItem, ViewDataBinding>>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
            CategoryViewHolder.LAYOUT_ID -> CategoryViewHolder(parent,categoryCallback)
            else -> CategoryViewHolder(parent,categoryCallback)
        } as BaseViewHolder<RecyclerItem, ViewDataBinding>


}