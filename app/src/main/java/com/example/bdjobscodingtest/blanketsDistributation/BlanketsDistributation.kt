package com.example.bdjobscodingtest.blanketsDistributation

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.bdjobscodingtest.R
import kotlinx.android.synthetic.main.activity_blankets_distributation.*
/**
 * Created by MD ISMAIL HOSSAIN SEPON on 04-Jul-21.
 * ismailhossainsepon@gmail.com
 */
class BlanketsDistributation : AppCompatActivity() {

    val list = ArrayList<Int>()
    var arrayAdapter: ArrayAdapter<*>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blankets_distributation)


        calculate()

    }



    fun calculate() {
        var a: Int
        var b: Int
        var s: Int
        var n: Int
        var ngo: Int =0
        b = 1
        a = b
        n = 1


      //  list.add(a)

        while (a <= 89) {
            println(a)
            Log.e("blanket", ""+a)
            list.add(a)

            s = a + b
            a = b
            b = s
            n++
            ngo++


        }

        arrayAdapter = ArrayAdapter(this,
            R.layout.item, list)
        list_view.adapter = arrayAdapter
        result.text = "They Can help total ;   "+ ngo+"   NGO"
        Log.e("NGO blanket", ""+ngo)

    }
}