package com.hsmnzaydn.term_commands_clean.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hsmnzaydn.term_commands_clean.Category.presentation.CategoryViewModel
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces
import com.tunc.mvvm_architecture.di.ViewModelFactory
import com.tunc.mvvm_architecture.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CategoryViewModel::class)
    internal abstract fun mainScreenViewModel(viewModel: CategoryViewModel<BaseInterfaces>): ViewModel

}