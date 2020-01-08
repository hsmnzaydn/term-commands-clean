package com.hsmnzaydn.term_commands_clean.base

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class BaseRecyclerAdapter<M : RecyclerItem, VH : BaseViewHolder<M, ViewDataBinding>> :
    ListAdapter<M, VH>(DiffCallback<M>()) {

    override fun getItemViewType(position: Int) = getItem(position).layoutId
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bindItem(getItem(position))
    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH
    override fun getItemId(position: Int) = getItem(position).hashCode().toLong()


    protected class DiffCallback<M : RecyclerItem> : DiffUtil.ItemCallback<M>() {
        override fun areItemsTheSame(oldItem: M, newItem: M) = oldItem.hashCode() == newItem.hashCode()
        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: M, newItem: M) = oldItem == newItem
    }
}
