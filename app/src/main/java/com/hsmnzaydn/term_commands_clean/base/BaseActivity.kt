package com.hsmnzaydn.term_commands_clean.base

import android.app.ProgressDialog
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.hsmnzaydn.term_commands_clean.utils.CommonUtils
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


abstract class BaseActivity<T : ViewDataBinding, VM : BaseViewModel<BaseInterfaces>> :
    DaggerAppCompatActivity(),
    BaseInterfaces {

    var progressDialog: ProgressDialog? = null

    @LayoutRes
    abstract fun layoutRes(): Int

    abstract fun model(): Any

    protected lateinit var binding: T
        private set

    protected lateinit var viewModel: VM
        private set

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutRes())

        viewModel =
            ViewModelProviders.of(
                this,
                viewModelFactory
            ).get((model() as Class<VM>)).also {
                it.onAttach(this)
            }

    }

    override fun showMessage(message: String) {
        Toast.makeText(this@BaseActivity, message, Toast.LENGTH_LONG).show()
    }

    override fun showLoading() {
        progressDialog = CommonUtils.showLoadingDialog(this@BaseActivity)

    }

    override fun hideLoading() {
        if (progressDialog != null) {
            if (progressDialog!!.isShowing) {
                progressDialog!!.dismiss()

            }
        }
    }

}