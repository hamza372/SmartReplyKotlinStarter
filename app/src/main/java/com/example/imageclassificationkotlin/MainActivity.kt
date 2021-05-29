package com.example.imageclassificationkotlin

import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.mlkit.nl.smartreply.SmartReply
import com.google.mlkit.nl.smartreply.SmartReplyGenerator
import com.google.mlkit.nl.smartreply.SmartReplySuggestionResult
import com.google.mlkit.nl.smartreply.TextMessage
import com.google.mlkit.vision.barcode.Barcode
import com.google.mlkit.vision.common.InputImage
import java.io.IOException
import java.util.*

class MainActivity : AppCompatActivity() {
    var resultTv: TextView? = null
    var senderBtn: Button? = null
    var receivedBtn:android.widget.Button? = null
    var senderEd: EditText? = null
    var receiverEd:EditText? = null
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        resultTv = findViewById(R.id.textView)
        senderBtn = findViewById(R.id.button)
        receivedBtn = findViewById(R.id.button2)
        senderEd = findViewById(R.id.editTextTextPersonName)
        receiverEd = findViewById(R.id.editTextTextPersonName2)



        senderBtn?.setOnClickListener(View.OnClickListener {
            resultTv?.text = ""
            senderEd?.setText("")
        })

        receivedBtn?.setOnClickListener(View.OnClickListener {
            resultTv?.text = ""
            receiverEd?.setText("")

        })

        // Load Smart reply model

    }

    override fun onDestroy() {
        super.onDestroy()
    }
}