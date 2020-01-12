package com.hsmnzaydn.term_commands_clean.Command.data.entities


import com.google.gson.annotations.SerializedName

data class CommandResponseModel(
    @SerializedName("category")
    val category: String,
    @SerializedName("detail")
    val detail: String,
    @SerializedName("_id")
    val id: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("__v")
    val v: Int
)