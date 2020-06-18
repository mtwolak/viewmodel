package com.example.viewmodel.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val testData: MutableLiveData<String> by lazy {
        MutableLiveData<String>("initTestData")
    }

    fun getTestData(): LiveData<String> {
        return testData
    }

}