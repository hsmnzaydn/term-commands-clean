package com.hsmnzaydn.term_commands_clean.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

@Suppress("UNCHECKED_CAST")
abstract class BaseViewHolder<M : RecyclerItem, V : ViewDataBinding> :
    RecyclerView.ViewHolder, LayoutContainer {

    constructor(itemView: View) : super(itemView)

    constructor(parent: ViewGroup, @LayoutRes layoutId: Int) : this(
        LayoutInflater.from(parent.context).inflate(
            layoutId,
            parent,
            false
        )
    )

    override val containerView: View?
        get() = this.itemView

    abstract fun bind(item: M, databinding: V)

    internal fun bindItem(item: M) {
        bind(item, DataBindingUtil.bind(itemView)!!)
    }


}