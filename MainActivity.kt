package com.estudo.calccut

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        fun divisao(a: Float, b: Float): Float {
            val resultado = a / b
            return resultado
        }

        fun multiplicar(a: Int, b: Int): Int {

            val resultado = a * b

            return resultado
        }

        btn_calcular.setOnClickListener {

            //get data
            val mbl = txt_mbl.text.toString().toFloat()
            val mbt = txt_mbt.text.toString().toFloat()
            val pl = txt_pl.text.toString().toFloat()
            val pt = txt_pt.text.toString().toFloat()
            //start event
            val plr = divisao(mbl, pl).toInt()
            val ptr = divisao(mbt, pt).toInt()
            val pqf = multiplicar(plr, ptr)
            //output date
            txt_total.setText("$pqf")


        }

        btn_clear.setOnClickListener {
            txt_mbl.text.clear()
            txt_mbt.text.clear()
            txt_pl.text.clear()
            txt_pt.text.clear()
        }

    }
}