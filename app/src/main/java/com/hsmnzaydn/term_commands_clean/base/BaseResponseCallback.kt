package com.hsmnzaydn.term_commands_clean.base
import com.basefy.base_mvvm_libraries.network.BaseServiceCallback
import com.basefy.base_mvvm_libraries.ui.activity.BaseResponseCallBack


abstract class BaseResponseCallBack<R> constructor(
    private val baseInterfaces: BaseInterfaces
) : BaseServiceCallback<R>, BaseResponseCallBack<R>(baseInterfaces) {

}