package com.example.woorkmanegar

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.util.*

class LocationWorker(
    context: Context,
    workerParameters: WorkerParameters
) : Worker(context, workerParameters) {
    override fun doWork(): Result {

       // for (i in 1..30) {
           // println(Date())
           // Thread.sleep(1000)
       // }
        return Result.success()
    }
}