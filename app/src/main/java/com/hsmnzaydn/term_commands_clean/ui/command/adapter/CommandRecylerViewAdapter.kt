package com.hsmnzaydn.term_commands_clean.ui.command.adapter

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.basefy.base_mvvm_libraries.ui.adapter.BaseRecyclerAdapter
import com.basefy.base_mvvm_libraries.ui.adapter.BaseViewHolder
import com.basefy.base_mvvm_libraries.ui.adapter.RecyclerItem

class CommandRecylerViewAdapter: BaseRecyclerAdapter<RecyclerItem, BaseViewHolder<RecyclerItem, ViewDataBinding>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
            CommandViewHolder.LAYOUT_ID -> CommandViewHolder(parent)
            else -> CommandViewHolder(parent)
        } as BaseViewHolder<RecyclerItem, ViewDataBinding>


}