package com.hsmnzaydn.term_commands_clean.ui

import android.os.Bundle
import com.hsmnzaydn.term_commands_clean.Category.presentation.CategoryViewModel
import com.hsmnzaydn.term_commands_clean.R
import com.hsmnzaydn.term_commands_clean.base.BaseActivity
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces
import com.hsmnzaydn.term_commands_clean.databinding.ActivityCategoryBinding

@Suppress("UNREACHABLE_CODE")
class CategoryActivity : BaseActivity<ActivityCategoryBinding, CategoryViewModel<BaseInterfaces>>()  {

    override fun layoutRes(): Int  = R.layout.activity_category

    override fun model()= CategoryViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getCategories()
    }
}
