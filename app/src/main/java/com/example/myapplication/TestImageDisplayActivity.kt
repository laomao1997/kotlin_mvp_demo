package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TestImageDisplayActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_display)
    }

    override fun onResume() {
        super.onResume()
        val imageDisplayView = findViewById<ImageDisplayView>(R.id.image_display_view)
        Toast.makeText(this, imageDisplayView.width, Toast.LENGTH_SHORT).show()
//        imageDisplayView.setFirstImage()
    }


}