 package com.reakabc.jetpackdemo_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.reakabc.jetpackdemo_databinding.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.mainViewModel = mainViewModel
        binding.lifecycleOwner = this

        //manual handling of change in live data
        /*mainViewModel.quoteLiveData.observe(this, {
            binding.desc.text = it
        })*/

        //manual handling of onclick event
        //binding.btnNext.setOnClickListener{
        //    mainViewModel.updateQuote()
        //}

        //variable in layout file
        //val quote1 = Quote("Udo, udna hi hai to uchha udo", "ReaK AbC")
        //binding.quote = quote1

        //manually attaching data to layout
        //binding.name.text = "Data binding tutorial"
        //binding.desc.text = "Using data binding in project is really impressive"

    }
}