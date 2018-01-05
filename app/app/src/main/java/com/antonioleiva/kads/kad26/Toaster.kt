package com.antonioleiva.kads.kad26

import android.content.Context
import android.widget.Toast

interface Toaster {
    val context: Context

    fun toast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}