package com.acm.activitylifecycle

import androidx.lifecycle.ViewModel

class CountViewModel :ViewModel(){
    private var count:Int=0
    fun getCount():Int=count //return int count
    fun setCount(){
        count+=1
    }
}