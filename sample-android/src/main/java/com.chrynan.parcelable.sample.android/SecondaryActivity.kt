package com.chrynan.parcelable.sample.android

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.chrynan.parcelable.core.getParcelable
import com.chrynan.parcelable.core.putExtra
import com.chrynan.sample.R
import kotlinx.serialization.ExperimentalSerializationApi

@OptIn(ExperimentalSerializationApi::class)
class SecondaryActivity : AppCompatActivity() {

    private val modelExpectedTextView by lazy { findViewById<TextView>(R.id.modelExpectedTextView) }
    private val modelExpectedJsonTextView by lazy { findViewById<TextView>(R.id.modelExpectedJsonTextView) }
    private val modelRetrievedTextView by lazy { findViewById<TextView>(R.id.modelRetrievedTextView) }
    private val modelRetrievedJsonTextView by lazy { findViewById<TextView>(R.id.modelRetrievedJsonTextView) }
    private val resultTextView by lazy { findViewById<TextView>(R.id.resultTextView) }

    private val resultSuccessText by lazy { getString(R.string.result_success) }
    private val resultErrorText by lazy { getString(R.string.result_error) }

    private val resultSuccessTextColor by lazy { getColor(R.color.blue) }
    private val resultErrorTextColor by lazy { getColor(R.color.textColorError) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        // Retrieves the model with the special serialization getParcelable() function
        val model = intent?.extras?.getParcelable<Model>(KEY_MODEL, SerializerUtils.parcelable)

        modelExpectedTextView.text = ExpectedModel.model.toString()
        modelExpectedJsonTextView.setJsonText(Model.serializer(), ExpectedModel.model)

        modelRetrievedTextView.text = model.toString()
        modelRetrievedJsonTextView.setJsonText(Model.serializer(), model)

        if (model == ExpectedModel.model) {
            resultTextView.text = resultSuccessText
            resultTextView.setTextColor(resultSuccessTextColor)
        } else {
            resultTextView.text = resultErrorText
            resultTextView.setTextColor(resultErrorTextColor)
        }
    }

    companion object {

        private const val KEY_MODEL = "model"

        fun newIntent(context: Context, model: Model) =
            Intent(context, SecondaryActivity::class.java).apply {
                // This is the special serialization putExtra() function
                putExtra(KEY_MODEL, model, SerializerUtils.parcelable)
            }
    }
}
