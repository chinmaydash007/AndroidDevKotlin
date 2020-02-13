package com.example.androiddevkotlin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androiddevkotlin.Adapter.MyAdapter
import com.example.androiddevkotlin.model.suppliers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    companion object {
        var TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "MainActivity")
        var adapter = MyAdapter(suppliers.animals, this)
        var linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerview.layoutManager = linearLayoutManager
        recyclerview.adapter = adapter

        file_activity_button.setOnClickListener {
            var intent= Intent(this,FileActivity::class.java)
            startActivity(intent)
        }
    }
}
