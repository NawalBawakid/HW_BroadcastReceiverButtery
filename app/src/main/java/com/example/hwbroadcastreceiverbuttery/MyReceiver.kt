package com.example.hwbroadcastreceiverbuttery

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.widget.AppCompatTextView

class MyReceiver(val textView: AppCompatTextView) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val batteryPercent = intent?.getIntExtra("level", 0)
        //textView.text = if (batteryPercent >= 0) batteryPercent.toString() else ""

        textView.text = if (batteryPercent > 50 && batteryPercent < 90) "Normal Battary"
        else if (batteryPercent < 50) "Low Battary" else "Charged"

    }
}