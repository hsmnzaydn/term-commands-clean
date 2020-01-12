package com.hsmnzaydn.term_commands_clean.ui.command

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import com.basefy.base_mvvm_libraries.utility.vertical
import com.hsmnzaydn.term_commands_clean.Command.presentation.CommandViewModel
import com.hsmnzaydn.term_commands_clean.R
import com.hsmnzaydn.term_commands_clean.base.BaseActivity
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces
import com.hsmnzaydn.term_commands_clean.databinding.ActivityCommandBinding
import com.hsmnzaydn.term_commands_clean.ui.command.adapter.CommandRecylerViewAdapter
import com.hsmnzaydn.term_commands_clean.ui.command.model.CommandRecylerViewItem
import com.hsmnzaydn.term_commands_clean.utils.BundleConstant
import kotlinx.android.synthetic.main.activity_command.*

class CommandActivity : BaseActivity<ActivityCommandBinding, CommandViewModel<BaseInterfaces>>()  {

    override fun layoutRes(): Int  = R.layout.activity_command

    override fun model()= CommandViewModel::class.java

    private val commandRecylerViewAdapter by lazy { CommandRecylerViewAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        viewModel.getCommandOfCategories(intent.getStringExtra(BundleConstant.CATEGORY_ID_BUNDLE))


        commandRecylerViewAdapter.vertical(
            recyclerView = activity_command_recylerView,
            animation = false
        )

        viewModel.commandListLiveData.observe(this, Observer<List<CommandRecylerViewItem.CommandCellItem>> {
            commandRecylerViewAdapter.submitList(it)
        })

    }


    companion object{
        fun getCommandIntent(activity:Activity,categoryId:String): Intent {
            return Intent(activity,CommandActivity::class.java).putExtra(BundleConstant.CATEGORY_ID_BUNDLE,categoryId)
        }
    }
}
