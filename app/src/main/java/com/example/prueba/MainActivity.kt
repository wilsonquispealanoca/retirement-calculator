package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //get reference txts
        val spn_type_sex = findViewById<Spinner>(R.id.spn_sex_type)
        val txt_edt_age = findViewById<EditText>(R.id.txt_edt_age)
        val txt_result = findViewById<TextView>(R.id.txt_result)

        //get reference button
        val btn_calc = findViewById<Button>(R.id.btn_calc)

        //event button
        btn_calc.setOnClickListener {
            var result = 0
            val sex = spn_type_sex.selectedItem.toString()
            val edt_txt = txt_edt_age.text.toString().toInt()

            if (sex == "Hombre") {
                result = 58 - edt_txt
            } else {
                result = 55 - edt_txt
            }
            txt_result.text = "$result para la jubilación"
        }
    }
}