package com.example.myapplicationrv.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationrv.databinding.ActivityView2Binding

class ViewActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityView2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityView2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.setImageResource(intent.getIntExtra("image",0))
        binding.textView.setText(intent.getStringExtra("name"))

    }
}