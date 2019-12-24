package com.hsmnzaydn.term_commands_clean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.hsmnzaydn.term_commands_clean.Category.data.repository.CategoryRepositoryImpl
import com.hsmnzaydn.term_commands_clean.remote.ServiceCallback
import com.hsmnzaydn.term_commands_clean.remote.TermCommandServiceFactory
import net.serkanozaydin.hsmnzaydn.data.entity.CategoryResponseModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CategoryRepositoryImpl(TermCommandServiceFactory.makeGithubTrendingService(TermCommandServiceFactory.makeOkHttpClient(TermCommandServiceFactory.makeLoggingInterceptor(true))),
            Gson()
        ).getCategories(object: ServiceCallback<List<CategoryResponseModel>>{
            override fun onSuccess(response: List<CategoryResponseModel>?) {
                Log.d("veri","veri")
            }

            override fun onError(errorCode: Int, errorMessage: String) {
                Log.d("veri","veri")

            }
        })
    }
}
