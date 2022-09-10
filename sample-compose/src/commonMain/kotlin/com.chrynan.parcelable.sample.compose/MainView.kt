package com.chrynan.parcelable.sample.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.chrynan.parcelable.compose.rememberSavable
import com.chrynan.parcelable.core.Parcel
import com.chrynan.parcelable.core.encodeToParcel
import com.chrynan.parcelable.sample.core.ExpectedModel
import com.chrynan.parcelable.sample.core.Model
import com.chrynan.parcelable.sample.core.SerializerUtils
import kotlinx.serialization.ExperimentalSerializationApi

@Composable
@OptIn(ExperimentalSerializationApi::class)
fun MainView() {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val parcel = remember { Parcel() }
        val model = rememberSavable(
            parcelable = SerializerUtils.parcelable,
            serializer = Model.serializer()
        ) { ExpectedModel.model }

        val parceledModel = mutableStateOf<Model?>(null)

        if (maxWidth > maxHeight && maxWidth > 1000.dp) {
            // Display horizontally - Note: matchParentSize() isn't working on JsonText for some reason on desktop
            val jsonColumnWidth = ((maxWidth - 200.dp) / 2)
            val jsonColumnHeight = (maxHeight - 20.dp)

            Row(
                modifier = Modifier.matchParentSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier.size(width = jsonColumnWidth, height = jsonColumnHeight)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Original Model",
                        style = MaterialTheme.typography.subtitle1,
                        color = ColorPalette.foreground
                    )

                    Box(
                        modifier = Modifier.fillMaxSize()
                            .scrollable(state = rememberScrollState(), orientation = Orientation.Vertical)
                            .padding(top = 10.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(ColorPalette.currentLine)
                    ) {
                        SelectionContainer {
                            JsonText(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .size( // FIXME: Match, Wrap, and Scroll is not working
                                        width = jsonColumnWidth - 20.dp,
                                        height = jsonColumnHeight - 20.dp
                                    ),
                                value = model,
                                serializer = Model.serializer(),
                                json = SerializerUtils.json
                            )
                        }
                    }
                }

                Button(
                    modifier = Modifier.padding(20.dp),
                    onClick = {
                        SerializerUtils.parcelable.encodeToParcel(parcel, Model.serializer(), model)
                        parceledModel.value = SerializerUtils.parcelable.decodeFromParcel(parcel, Model.serializer())
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = ColorPalette.purple,
                        contentColor = ColorPalette.foreground
                    ),
                    shape = RoundedCornerShape(50)
                ) {
                    Text(
                        text = "Parcelize"
                    )
                }

                Column(
                    modifier = Modifier.size(width = jsonColumnWidth, height = jsonColumnHeight)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Parceled Model",
                        style = MaterialTheme.typography.subtitle1,
                        color = ColorPalette.foreground
                    )

                    Box(
                        modifier = Modifier.fillMaxSize()
                            .scrollable(state = rememberScrollState(), orientation = Orientation.Vertical)
                            .padding(top = 10.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(ColorPalette.currentLine)
                    ) {
                        SelectionContainer {
                            parceledModel.value?.let {
                                JsonText(
                                    modifier = Modifier
                                        .padding(10.dp)
                                        .size( // FIXME: Match, Wrap, and Scroll is not working
                                            width = jsonColumnWidth - 20.dp,
                                            height = jsonColumnHeight - 20.dp
                                        ),
                                    value = it,
                                    serializer = Model.serializer(),
                                    json = SerializerUtils.json
                                )
                            }
                        }
                    }
                }
            }
        } else {
            // Display vertically - Note: matchParentSize() isn't working on JsonText for some reason on desktop
            val jsonColumnWidth = (maxWidth - 20.dp)
            val jsonColumnHeight = 1000.dp

            // TODO: Implement vertical content
        }
    }
}
