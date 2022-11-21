package com.lib.uinotification

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

fun Context.showToast(@StringRes message:Int){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}