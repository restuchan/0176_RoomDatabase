package com.chan.myapplication

import android.app.Application
import com.chan.myapplication.repositori.ContainerApp
import com.chan.myapplication.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}