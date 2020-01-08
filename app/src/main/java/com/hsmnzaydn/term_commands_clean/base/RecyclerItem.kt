package com.hsmnzaydn.term_commands_clean.base

import androidx.annotation.LayoutRes
import java.io.Serializable

interface RecyclerItem : Serializable {

    @get:LayoutRes
    val layoutId: Int
}