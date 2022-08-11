package com.external.lbmwithservice

import android.content.BroadcastReceiver
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        Log.e(ContentValues.TAG,"Receiver invoked")

        Toast.makeText(context, "Received by local bm - ${android.os.Process.myUid()}", Toast.LENGTH_SHORT).show()

    }
}