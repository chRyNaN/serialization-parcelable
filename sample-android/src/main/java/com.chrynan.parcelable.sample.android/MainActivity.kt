package com.chrynan.parcelable.sample.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chrynan.sample.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = Model(
            char = 'C',
            string = "String",
            boolean = false,
            byte = 1,
            short = 2,
            integer = -500,
            long = 500000L,
            float = 10f,
            double = 10.5647,
            nullableString = null,
            integerList = emptyList()
        )

        startActivity(SecondaryActivity.newIntent(this, model))
    }
}
