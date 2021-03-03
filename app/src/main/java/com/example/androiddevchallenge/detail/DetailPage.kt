/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.detail

import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.getAdoptionDetails
import com.example.androiddevchallenge.image.DisplayRemoteImageByGlide
import java.util.ArrayList

@Composable
fun ShowDetailPage(activity: AppCompatActivity, title: String, detailNum: Int) {
    Scaffold(
        modifier = Modifier.semantics { testTag = "DetailPage" },
        topBar = {
            TopAppBar(
                title = { Text(text = title) },
                elevation = 8.dp,
                navigationIcon = {
                    IconButton(onClick = { activity.finish() }) {
                        Icon(Icons.Filled.ArrowBack, "back")
                    }
                }
            )
        },
        content = {
            val detail = getAdoptionDetails()[detailNum]
            val photos = detail.photos
            val list = ArrayList(photos)
            list.add(detail.detailIntro)
            DetailPageContent(ps = list)
        }
    )
}

@Composable
fun DetailPageContent(ps: MutableList<String>) {
    Column {
        Spacer(modifier = Modifier.height(8.dp))
        DetailPhotos(ps)
    }
}

@Composable
fun DetailPhotos(photos: MutableList<String>) {
    LazyColumn {
        items(photos) { photo ->
            if (photo.startsWith("http")) {
                DetailImage(
                    photo = photo,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                )
            } else {
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "宠物介绍", style = MaterialTheme.typography.h6)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = photo, style = MaterialTheme.typography.body2, color = Color.Gray)
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

@Composable
fun DetailImage(photo: String, modifier: Modifier = Modifier) {
    DisplayRemoteImageByGlide(
        imageUrl = photo,
        modifier = modifier
    )
}
