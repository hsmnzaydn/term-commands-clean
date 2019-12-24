package com.hsmnzaydn.term_commands_clean.remote

interface ServiceCallback<T> {

    fun onSuccess(response:T?)
    fun onError(errorCode:Int,errorMessage:String)
}