package com.hsmnzaydn.term_commands_clean.di.modules

import com.hsmnzaydn.term_commands_clean.di.scopes.ActivityScope
import com.hsmnzaydn.term_commands_clean.ui.CategoryActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityInjectorModules {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun mainScreenActivityActivityInjector(): CategoryActivity
}