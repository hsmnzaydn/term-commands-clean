package com.hsmnzaydn.term_commands_clean.base

import androidx.lifecycle.ViewModel


abstract class BaseViewModel<CI : BaseInterfaces> : ViewModel() {

   open lateinit var view: BaseInterfaces

    fun onAttach(callback: CI) {
        this.view = callback
    }

}