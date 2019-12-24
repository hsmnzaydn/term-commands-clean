package com.hsmnzaydn.term_commands_clean.Category.data.api

import io.reactivex.Flowable
import io.reactivex.Observable
import net.serkanozaydin.hsmnzaydn.data.entity.CategoryResponseModel
import retrofit2.http.GET

interface CategoryServices {

    @GET("categories")
    fun getCategories():Observable<List<CategoryResponseModel>>
}