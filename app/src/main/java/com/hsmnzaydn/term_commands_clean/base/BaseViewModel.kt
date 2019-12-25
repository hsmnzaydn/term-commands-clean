package com.hsmnzaydn.term_commands_clean.base

import androidx.lifecycle.ViewModel
import com.hsmnzaydn.term_commands_clean.DataManager

public abstract class BaseViewModel(private val dataManager: DataManager):ViewModel() {


    fun getDataManager():DataManager{
        return dataManager;
    }



}