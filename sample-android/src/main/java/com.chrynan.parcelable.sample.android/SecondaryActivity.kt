package com.chrynan.parcelable.sample.android

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.chrynan.parcelable.android.getKotlinParcelable
import com.chrynan.parcelable.android.putExtra
import com.chrynan.parcelable.core.Parcelable
import com.chrynan.sample.R
import kotlinx.serialization.ExperimentalSerializationApi

@OptIn(ExperimentalSerializationApi::class)
class SecondaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        val model = intent?.extras?.getKotlinParcelable<Model>(KEY_MODEL)

        Log.d("Parcelable", "model = $model")
    }

    companion object {

        private const val KEY_MODEL = "model"

        fun newIntent(context: Context, model: Model) = Intent(context, SecondaryActivity::class.java).apply {
            putExtra(KEY_MODEL, model, Parcelable.Default)
        }
    }
}
