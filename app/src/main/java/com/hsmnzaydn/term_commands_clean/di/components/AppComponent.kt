package com.hsmnzaydn.term_commands_clean.di.components

import com.hsmnzaydn.term_commands_clean.TermApplication
import com.hsmnzaydn.term_commands_clean.di.modules.ActivityInjectorModules
import com.hsmnzaydn.term_commands_clean.di.modules.AppModule
import com.hsmnzaydn.term_commands_clean.di.modules.NetworkModule
import com.hsmnzaydn.term_commands_clean.di.modules.ViewModule
import com.hsmnzaydn.term_commands_clean.di.modules.category.CategoryModule
import com.hsmnzaydn.term_commands_clean.di.modules.command.CommandModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityInjectorModules::class,
        AppModule::class,
        NetworkModule::class,
        ViewModule::class,
        CategoryModule::class,
        CommandModule::class
    ]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: TermApplication): Builder

        fun build(): AppComponent

    }

    fun inject(app: TermApplication)
}