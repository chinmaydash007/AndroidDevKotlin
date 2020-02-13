package com.example.androiddevkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.androiddevkotlin.model.suppliers
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(R.layout.activity_main2) {
    companion object{
        var TAG:String=Main2Activity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        intent?.let {
            var position:Int=intent.getIntExtra(AppConstant.position,0)
            Glide.with(this).load(suppliers.animals[position].imageURL).into(imageView)
            animal_name.text=suppliers.animals[position].name
            animal_age.text=suppliers.animals[position].age.toString()
        }

    }
}
