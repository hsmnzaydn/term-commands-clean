package com.hsmnzaydn.term_commands_clean.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.basefy.base_mvvm_libraries.di.ViewModelFactory
import com.hsmnzaydn.term_commands_clean.Category.presentation.CategoryViewModel
import com.hsmnzaydn.term_commands_clean.Command.presentation.CommandViewModel
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces
import com.hsmnzaydn.term_commands_clean.di.ViewModelKey
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
    internal abstract fun categoryViewModel(viewModel: CategoryViewModel<BaseInterfaces>): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CommandViewModel::class)
    internal abstract fun commandViewModel(viewModel: CommandViewModel<BaseInterfaces>): ViewModel
}