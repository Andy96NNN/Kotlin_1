package com.andy.appejemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.andy.appejemplo1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        //setContentView(R.layout.activity_main)


        //var etHeroe = findViewById<EditText>(R.id.etNameHeroe)
        //var btnSend = findViewById<Button>(R.id.btnSend)
        var heroe:String

        viewBinding.btnSend.setOnClickListener {
            heroe = getString(R.string.notif, viewBinding.etNameHeroe.text.toString())
//            Toast.makeText(this, "You send $heroe",Toast.LENGTH_LONG).show()
            Snackbar.make(it, heroe, Snackbar.LENGTH_LONG).show()
        }

    }


}