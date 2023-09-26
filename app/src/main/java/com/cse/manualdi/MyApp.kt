package com.cse.manualdi

import android.app.Application
import com.cse.manualdi.Di.ObjContainer

class MyApp : Application() {

    val container = ObjContainer()
}