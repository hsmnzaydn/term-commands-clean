package com.basefy.burger_king.di.modules

import TermApplication
import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(app: TermApplication): Application = app

    @Provides
    @Singleton
    fun provideApplicationContext(app: TermApplication): Context = app.applicationContext

}