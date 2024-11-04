package com.paul.foodorderapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.paul.foodorderapp.MainActivity
import com.paul.foodorderapp.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private val binding:ActivityStartBinding by  lazy {
        ActivityStartBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.nextBtn.setOnClickListener(){
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }


    }
}