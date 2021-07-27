package com.example.bdjobscodingtest.doodleLtd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bdjobscodingtest.R
import kotlinx.android.synthetic.main.activity_landing.*

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        next_btn.setOnClickListener(View.OnClickListener {

            startActivity(Intent(this, ExpendedRecyclerviewActivity::class.java))
            this.finish()
        })

    }
}