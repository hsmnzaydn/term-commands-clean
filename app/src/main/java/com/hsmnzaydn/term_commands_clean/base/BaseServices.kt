package com.basefy.burger_king.data.network.services


import com.hsmnzaydn.term_commands_clean.Category.data.api.CategoryServices
import com.hsmnzaydn.term_commands_clean.Category.data.api.CommandServices

interface BaseServices {
    fun getCategoryServices(): CategoryServices
    fun getCommandServices(): CommandServices


}