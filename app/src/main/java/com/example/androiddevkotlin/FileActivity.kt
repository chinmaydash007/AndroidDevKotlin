package com.example.androiddevkotlin

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_file.*
import java.io.FileOutputStream

class FileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file)

        create_file.setOnClickListener {
            createfile()
        }

        var path: String = filesDir.absolutePath
        display_textview.text = path

    }

    private fun createfile() {
        var data: String = message_edittext.text.toString()
        var fileOutputStream: FileOutputStream =
            openFileOutput(AppConstant.fileName, Context.MODE_PRIVATE)
        fileOutputStream.write(data.toByteArray())
        fileOutputStream.flush()
        fileOutputStream.close()
        display_textview.text = "File Written"
    }
}
