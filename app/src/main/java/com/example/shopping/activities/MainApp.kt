package com.example.shopping.activities

import android.app.Application
import com.example.shopping.db.MainDataBase

class MainApp: Application() {
    val database by lazy { MainDataBase.getDataBase(this) }
}