package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.example.test.databinding.ActivityMain2Binding
import com.example.test.databinding.ActivityMainBinding

class MainActivity2 : BaseActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun setLayout():
        ViewBinding = ActivityMain2Binding.inflate(layoutInflater) as ViewBinding

    override fun initView(binding: ViewBinding) {
        this.binding = binding as ActivityMain2Binding
        setContentView(binding.root)

        binding.button4.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }       }
}

