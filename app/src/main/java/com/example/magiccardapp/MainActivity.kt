package com.example.magiccardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.example.magiccardapp.databinding.ActivityMainBinding
import com.example.magiccardapp.retrofit.RetrofitInstance
import retrofit2.HttpException
import java.io.IOException

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 27:05 Make the GET request
        // Check to make sure all the request are able and safe to be made
        lifecycleScope.launchWhenCreated {
            val response = try {
                RetrofitInstance.api.getCardInfo()
            } catch (e: IOException){
                Log.d(TAG, "IOException, you might not have internet connection")
                return@launchWhenCreated
            } catch (e: HttpException){
                Log.d(TAG, "HttpException, unexpected response")
                return@launchWhenCreated
            }
        }

    }



    val retrofitData = RetrofitInstance.api.getCardInfo()


}