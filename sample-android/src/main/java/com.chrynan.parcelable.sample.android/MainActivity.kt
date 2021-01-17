package com.chrynan.parcelable.sample.android

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.chrynan.sample.R

class MainActivity : AppCompatActivity() {

    private val modelExpectedTextView by lazy { findViewById<TextView>(R.id.mainModelExpectedTextView) }
    private val modelExpectedJsonTextView by lazy { findViewById<TextView>(R.id.mainModelExpectedJsonTextView) }
    private val parcelizeButton by lazy { findViewById<Button>(R.id.mainParcelizeButton) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        modelExpectedTextView.text = ExpectedModel.model.toString()
        modelExpectedJsonTextView.setJsonText(Model.serializer(), ExpectedModel.model)

        parcelizeButton.setOnClickListener {
            // The serialization magic happens in the newIntent() function
            startActivity(SecondaryActivity.newIntent(this, ExpectedModel.model))
        }
    }
}
