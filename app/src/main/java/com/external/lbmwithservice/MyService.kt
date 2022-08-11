package com.external.lbmwithservice

import android.app.Service
import android.content.ContentValues.TAG
import android.content.Intent
import android.content.IntentFilter
import android.os.IBinder
import android.util.Log
import androidx.localbroadcastmanager.content.LocalBroadcastManager

class MyService : Service() {
    private lateinit var Localbm : LocalBroadcastManager

    override fun onBind(intent: Intent): IBinder? {
      return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Localbm = LocalBroadcastManager.getInstance(applicationContext)
        val intentFilter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)

        Localbm.registerReceiver(MyReceiver(), intentFilter,)
        Log.e(TAG,"Service started")

       // Localbm.sendBroadcast(Intent("ACTION_AIRPLANE"))
    return START_STICKY
    }

}