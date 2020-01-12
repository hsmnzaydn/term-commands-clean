package com.hsmnzaydn.term_commands_clean.utils

import android.app.Activity
import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.hsmnzaydn.term_commands_clean.R


class CommonUtils {


    companion object {
        fun showLoadingDialog(context: Context): ProgressDialog {
            var progressDialog: ProgressDialog = ProgressDialog(context)
            if (!(context as Activity).isFinishing) {
                progressDialog.show()
            }
            if (progressDialog.window != null) {
                progressDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            }
            progressDialog.setContentView(R.layout.progress_dialog)
            progressDialog.setCancelable(false)
            progressDialog.setCanceledOnTouchOutside(false)
            return progressDialog
        }
    }





}
