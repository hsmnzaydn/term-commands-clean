package com.hsmnzaydn.term_commands_clean.remote


abstract class BaseResponseCallBack<R> constructor(
) : ServiceCallback<R> {

    override fun onSuccess(response: R?) {
    }

    override fun onError(errorCode: Int, errorMessage: String) {

    }
}