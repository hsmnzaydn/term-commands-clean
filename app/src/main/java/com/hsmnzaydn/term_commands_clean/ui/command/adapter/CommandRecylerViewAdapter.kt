package com.hsmnzaydn.term_commands_clean.ui.command.adapter

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.hsmnzaydn.term_commands_clean.base.RecyclerItem
import com.hsmnzaydn.term_commands_clean.base.BaseRecyclerAdapter
import com.hsmnzaydn.term_commands_clean.base.BaseViewHolder
import com.hsmnzaydn.term_commands_clean.ui.category.adapter.CategoryViewHolder

class CommandRecylerViewAdapter  : BaseRecyclerAdapter<RecyclerItem, BaseViewHolder<RecyclerItem, ViewDataBinding>>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
            CommandViewHolder.LAYOUT_ID -> CommandViewHolder(parent)
            else -> CommandViewHolder(parent)
        } as BaseViewHolder<RecyclerItem, ViewDataBinding>


}