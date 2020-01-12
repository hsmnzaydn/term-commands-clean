package com.hsmnzaydn.term_commands_clean.di.modules

import com.basefy.base_mvvm_libraries.di.scopes.ActivityScope
import com.hsmnzaydn.term_commands_clean.ui.category.CategoryActivity
import com.hsmnzaydn.term_commands_clean.ui.command.CommandActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityInjectorModules {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun categoryActivityInjector(): CategoryActivity


    @ActivityScope
    @ContributesAndroidInjector
    abstract fun commandActivityInjector(): CommandActivity
}