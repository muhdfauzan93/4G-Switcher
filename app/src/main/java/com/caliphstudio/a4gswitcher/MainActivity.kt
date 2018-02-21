package com.caliphstudio.a4gswitcher

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            try {
                val intent = Intent("android.intent.action.MAIN")
                intent.setClassName("com.android.settings","com.android.settings.RadioInfo")
                startActivity(intent)
                finish()
            }catch (ex:Exception){
                notSupport()
            }


    }

    private fun notSupport(){
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("ERROR")
        alertDialog.setMessage("This app is incompatible with your Android Device")
        alertDialog.setPositiveButton("OK", {dialogInterface, i ->
            dialogInterface.cancel()
            System.exit(0)
        })
        alertDialog.show()

    }
}
