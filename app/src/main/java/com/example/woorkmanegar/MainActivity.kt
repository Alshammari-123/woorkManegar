package com.example.woorkmanegar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.*
import com.example.woorkmanegar.databinding.ActivityMainBinding
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)


        var worker = PeriodicWorkRequestBuilder<LocationWorker>(10,TimeUnit.SECONDS).build()

       // binding.textView.setOnClickListener{

           // var work= OneTimeWorkRequestBuilder<LocationWorker>()
           // var date = Data.Builder()
             //   .putInt("loop",25)
       // work.setInputData(date.build())

       // }
      // binding.button.setOnClickListener {

        //    var work= OneTimeWorkRequestBuilder<LocationWorker>()
          //  var data=Data.Builder()
            //    .putInt("loop",25)
            //work.setInputData(data.build())

            var w=WorkManager.getInstance(this)
        binding.button.setOnClickListener {

            w.enqueue(worker)

        }



        }






    }
