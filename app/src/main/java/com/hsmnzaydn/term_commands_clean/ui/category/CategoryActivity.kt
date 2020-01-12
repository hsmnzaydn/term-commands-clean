package com.hsmnzaydn.term_commands_clean.ui.category

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.basefy.base_mvvm_libraries.utility.vertical
import com.hsmnzaydn.term_commands_clean.Category.presentation.CategoryViewModel
import com.hsmnzaydn.term_commands_clean.R
import com.hsmnzaydn.term_commands_clean.base.BaseActivity
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces
import com.hsmnzaydn.term_commands_clean.databinding.ActivityCategoryBinding
import com.hsmnzaydn.term_commands_clean.ui.category.adapter.CategoryRecylerViewAdapter
import com.hsmnzaydn.term_commands_clean.ui.category.interfaces.CategoryCallback
import com.hsmnzaydn.term_commands_clean.ui.category.model.CategoryRecylerViewItem
import com.hsmnzaydn.term_commands_clean.ui.command.CommandActivity
import kotlinx.android.synthetic.main.activity_category.*

@Suppress("UNREACHABLE_CODE")
class CategoryActivity : BaseActivity<ActivityCategoryBinding, CategoryViewModel<BaseInterfaces>>(),
    CategoryCallback {


    override fun layoutRes(): Int = R.layout.activity_category

    override fun model() = CategoryViewModel::class.java

    val categoryRecylerViewAdapter by lazy { CategoryRecylerViewAdapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.getCategories()


        categoryRecylerViewAdapter.vertical(
            recyclerView = activity_category_recylerView,
            animation = false
        )

        viewModel.categoryListLiveData.observe(
            this,
            Observer<List<CategoryRecylerViewItem.CategoryCellItem>> {
                categoryRecylerViewAdapter.submitList(it)
            })

    }

    override fun onClickCategory(categoryId: String) {
       startActivity(CommandActivity.getCommandIntent(this,categoryId))
    }
}
