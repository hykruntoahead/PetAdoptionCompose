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
package com.example.androiddevchallenge.homepage

import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Adoption

@Composable
fun HomePage(activity: AppCompatActivity, color: Color, adoptionsLiveData: LiveData<List<Adoption>>) {
    Scaffold(
        modifier = Modifier.semantics { testTag = "HomePage" },
        topBar = {
            TopAppBar(
                title = { Text(text = LocalContext.current.getString(R.string.pet_adoptions)) },
                elevation = 8.dp
            )
        },
        content = {
            HomePageContent(activity, adoptionsLiveData)
        },
        backgroundColor = color
    )
}

@Composable
fun HomePageContent(activity: AppCompatActivity, adoptionsLiveData: LiveData<List<Adoption>>) {

    val adoptionList = adoptionsLiveData.observeAsState(initial = emptyList()).value
    if (adoptionList.isEmpty()) {
        LoadingProgressBar()
    } else {
        SyncAdoptionList(activity, adoptionList)
    }
}

@Composable
fun SyncAdoptionList(activity: AppCompatActivity, adoptionList: List<Adoption>) {
    LazyColumn {
        items(adoptionList) { adoption ->
            Card(
                shape = RoundedCornerShape(3.dp),
                backgroundColor = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                AdoptionCard(activity, adoption = adoption)
            }
        }
    }
}

@Composable
fun LoadingProgressBar() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally))
    }
}

// @Preview("Light Theme", widthDp = 360, heightDp = 640)
// @Composable
// fun LightPreview() {
//    MyTheme {
//        MyApp(viewModel.adoptions)
//    }
// }
//
// @Preview("Dark Theme", widthDp = 360, heightDp = 640)
// @Composable
// fun DarkPreview() {
//    MyTheme(darkTheme = true) {
//        MyApp(viewModel.adoptions)
//    }
// }
