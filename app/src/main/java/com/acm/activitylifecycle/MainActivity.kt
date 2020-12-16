package com.acm.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txtCount=findViewById<TextView>(R.id.txtCount)
        var btnCount=findViewById<Button>(R.id.btnCount)
        btnCount.setOnClickListener {
            var count:Int=txtCount.text.toString().toInt()
            count+=1
            txtCount.text=count.toString()
        }
        var txtvmCount=findViewById<TextView>(R.id.txtVmCount)
        var btnvmCount=findViewById<Button>(R.id.btnVmCount)
            //view model
        val viewmodel:CountViewModel=ViewModelProvider(this).get(CountViewModel::class.java)
        txtvmCount.text=viewmodel.getCount().toString()
        btnvmCount.setOnClickListener {
            viewmodel.setCount()
            txtvmCount.text=viewmodel.getCount().toString()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity_Lifecycle","OnStart.......")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity_Lifecycle","OnResume.......")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity_Lifecycle","OnPuse......")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity_Lifecycle","OnStop....")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity_Lifecycle","OnDestroy..........")
    }
}