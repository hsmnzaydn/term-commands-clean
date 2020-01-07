package com.hsmnzaydn.term_commands_clean.di.modules

import android.app.Application
import android.content.Context
import com.hsmnzaydn.term_commands_clean.TermApplication
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    abstract fun provideContext(application: TermApplication): Context
}
