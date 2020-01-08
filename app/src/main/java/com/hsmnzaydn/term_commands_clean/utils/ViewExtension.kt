package com.hsmnzaydn.term_commands_clean.utils

import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.*

@JvmOverloads
fun <A : RecyclerView.Adapter<*>> A.vertical(
    recyclerView: RecyclerView,
    layoutManager: RecyclerView.LayoutManager? = null,
    @DrawableRes separatorDrawable: Int? = null,
    animation: Boolean? = true,
    setHasStableId: Boolean? = true
): A {
    recyclerView.run {
        setHasStableIds(setHasStableId!!)
        this.layoutManager = layoutManager ?: LinearLayoutManager(context)
        adapter = this@vertical
        separatorDrawable?.let {
            addItemDecoration(
                DividerItemDecoration(context, DividerItemDecoration.VERTICAL).apply {
                    setDrawable(
                        ContextCompat.getDrawable(context, it)!!
                    )
                }
            )
        }

        animation.let { (itemAnimator as SimpleItemAnimator).supportsChangeAnimations }

    }
    return this
}

@JvmOverloads
fun <A : RecyclerView.Adapter<*>> A.horizantal(
    recyclerView: RecyclerView,
    layoutManager: RecyclerView.LayoutManager? = null,
    @DrawableRes separatorDrawable: Int? = null
): A {
    recyclerView.run {
        this.layoutManager =
            layoutManager ?: LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        adapter = this@horizantal
        separatorDrawable?.let {
            addItemDecoration(
                DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL).apply {
                    setDrawable(
                        ContextCompat.getDrawable(context, it)!!
                    )
                }
            )
        }
    }
    return this
}


@JvmOverloads
fun <A : RecyclerView.Adapter<*>> A.onInitGrid(
    recyclerView: RecyclerView,
    layoutManager: RecyclerView.LayoutManager? = null,
    column: Int? = 2,
    @DrawableRes separatorDrawable: Int? = null
): A {
    recyclerView.run {
        this.layoutManager = layoutManager ?: GridLayoutManager(context, column!!)
        adapter = this@onInitGrid
        separatorDrawable?.let {
            addItemDecoration(
                DividerItemDecoration(context, DividerItemDecoration.VERTICAL).apply {
                    setDrawable(
                        ContextCompat.getDrawable(context, it)!!
                    )
                }
            )
        }
    }
    return this
}