package com.paul.foodapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.paul.foodorderapp.R
import com.paul.foodorderapp.UxDesignModel

class UxDesignAdapter(private val myContext:Context):RecyclerView.Adapter<UxDesignAdapter.MyViewHolder>() {


    private var List: ArrayList<UxDesignModel> = ArrayList()

    fun setNewList(newList: ArrayList<UxDesignModel>) {
        List = newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.job_activity, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return List.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = List[position]
        holder.designTextView.text = currentItem.heading

    }

    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){


        val designTextView :TextView = itemView.findViewById(R.id.designTextView)



    }
}