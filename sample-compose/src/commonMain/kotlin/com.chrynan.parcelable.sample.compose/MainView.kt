package com.chrynan.parcelable.sample.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp
import com.chrynan.parcelable.compose.rememberSavable
import com.chrynan.parcelable.sample.core.ExpectedModel
import com.chrynan.parcelable.sample.core.Model
import com.chrynan.parcelable.sample.core.SerializerUtils
import kotlinx.serialization.ExperimentalSerializationApi

@Composable
@OptIn(ExperimentalSerializationApi::class)
fun MainView() {
    MaterialTheme {
        val model = rememberSavable(
            parcelable = SerializerUtils.parcelable,
            serializer = Model.serializer()
        ) { ExpectedModel.model }

        val jsonText = SerializerUtils.json.encodeToString(serializer = Model.serializer(), value = model)

        Column(modifier = Modifier) {
            Text(
                modifier = Modifier,
                text = "Perform a screen orientation change to test if the model saved and restored correctly.",
                style = MaterialTheme.typography.subtitle1
            )

            Text(
                modifier = Modifier.padding(top = 10.dp)
                    .background(MaterialTheme.colors.surface),
                text = jsonText,
                style = MaterialTheme.typography.body1
            )
        }
    }
}
