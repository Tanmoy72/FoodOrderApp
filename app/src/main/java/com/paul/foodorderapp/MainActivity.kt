package com.paul.foodorderapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.paul.foodapp.UxDesignAdapter

class MainActivity : AppCompatActivity() {
    private  var newList: ArrayList<UxDesignModel> = arrayListOf(UxDesignModel("Ux Design"),UxDesignModel("Account"))
    private lateinit var uxDesignAdapter: UxDesignAdapter
    private lateinit var tagFoodRecycle: RecyclerView
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


            implementUxDesignTagRecycleyerview()
        }
    private fun implementUxDesignTagRecycleyerview(){
        tagFoodRecycle.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            uxDesignAdapter = UxDesignAdapter(this@MainActivity)
            adapter = uxDesignAdapter
            uxDesignAdapter.setNewList(newList)
            implementUxDesignTagRecycleyerview()
        }
    }
}