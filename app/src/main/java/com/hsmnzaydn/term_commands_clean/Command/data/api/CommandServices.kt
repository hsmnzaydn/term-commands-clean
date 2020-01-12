package com.hsmnzaydn.term_commands_clean.Category.data.api

import com.hsmnzaydn.term_commands_clean.Command.data.entities.CommandResponseModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface CommandServices {

    @GET("categories/{categoryId}/commands")
    fun getCommandList(@Path("categoryId") categoryId: String): Observable<List<CommandResponseModel>>

}