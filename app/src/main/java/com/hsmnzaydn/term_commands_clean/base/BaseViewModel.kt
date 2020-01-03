package com.hsmnzaydn.term_commands_clean.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<CI : BaseInterfaces> : ViewModel() {

    lateinit var interfaces: BaseInterfaces

    fun onAttach(callback: CI) {
        this.interfaces = callback
    }

}