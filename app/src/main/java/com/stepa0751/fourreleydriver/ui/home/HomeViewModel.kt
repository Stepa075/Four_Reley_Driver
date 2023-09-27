package com.stepa0751.fourreleydriver.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class HomeViewModel : ViewModel(

){
    val message2: MutableLiveData<String>by lazy {
        MutableLiveData<String>()
    }
    val message: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}