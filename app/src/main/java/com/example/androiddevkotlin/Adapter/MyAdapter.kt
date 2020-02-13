package com.example.androiddevkotlin.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androiddevkotlin.*
import com.example.androiddevkotlin.model.Animal
import kotlinx.android.synthetic.main.single_cardview.view.*
import java.lang.Appendable

class MyAdapter(var list: List<Animal>, var context: Context) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.single_cardview, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameText.text = list[position].name
        holder.ageText.text = list[position].age.toString()
        Glide.with(context).load(list[position].imageURL).into(holder.image)
        holder.nameText.setOnClickListener {
            //Toast.makeText(context,list[position].name,Toast.LENGTH_SHORT).show()
            context.showToast(holder.nameText.text.toString())
            var intent= Intent(context,Main2Activity::class.java).apply {
                putExtra(AppConstant.position,position)
            }
            context.startActivity(intent)


        }
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameText: TextView = itemView.name
        var ageText = itemView.animal_age
        var image = itemView.image
        var cardview = itemView.mylayout


    }

}