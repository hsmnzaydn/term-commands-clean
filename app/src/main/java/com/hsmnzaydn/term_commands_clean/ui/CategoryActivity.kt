package com.hsmnzaydn.term_commands_clean.ui

import android.os.Bundle
import androidx.lifecycle.Observer
import com.hsmnzaydn.term_commands_clean.Category.presentation.CategoryViewModel
import com.hsmnzaydn.term_commands_clean.R
import com.hsmnzaydn.term_commands_clean.base.BaseActivity
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces
import com.hsmnzaydn.term_commands_clean.databinding.ActivityCategoryBinding
import com.hsmnzaydn.term_commands_clean.ui.category.adapter.CategoryRecylerViewAdapter
import com.hsmnzaydn.term_commands_clean.ui.category.model.CategoryRecylerViewItem
import com.hsmnzaydn.term_commands_clean.utils.vertical
import kotlinx.android.synthetic.main.activity_category.*

@Suppress("UNREACHABLE_CODE")
class CategoryActivity : BaseActivity<ActivityCategoryBinding, CategoryViewModel<BaseInterfaces>>()  {

    override fun layoutRes(): Int  = R.layout.activity_category

    override fun model()= CategoryViewModel::class.java

    val categoryRecylerViewAdapter by lazy { CategoryRecylerViewAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getCategories()

        categoryRecylerViewAdapter.vertical(
            recyclerView = activity_category_recylerView,
            animation = false
        )

        viewModel.categoryListLiveData.observe(this, Observer<List<CategoryRecylerViewItem.CategoryCellItem>> {
            categoryRecylerViewAdapter.submitList(it)

        })

    }
}
