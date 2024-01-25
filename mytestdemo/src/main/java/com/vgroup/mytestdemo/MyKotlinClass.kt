package com.vgroup.mytestdemo

import android.content.Context
import android.widget.Toast

class MyKotlinClass {

    fun showToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}