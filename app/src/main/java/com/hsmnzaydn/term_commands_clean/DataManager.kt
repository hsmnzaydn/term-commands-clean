package com.hsmnzaydn.term_commands_clean

import com.hsmnzaydn.term_commands_clean.Category.domain.entities.Category
import com.hsmnzaydn.term_commands_clean.remote.BaseResponseCallBack

interface DataManager {

    fun getCategories(callback:BaseResponseCallBack<List<Category>>)

}