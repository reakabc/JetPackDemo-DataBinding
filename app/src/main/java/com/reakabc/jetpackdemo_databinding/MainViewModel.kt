package com.reakabc.jetpackdemo_databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val quoteLiveData = MutableLiveData("what you give it is what you get")

    fun updateQuote(){
        quoteLiveData.value = "You''ll see it when you believe it"
    }

}