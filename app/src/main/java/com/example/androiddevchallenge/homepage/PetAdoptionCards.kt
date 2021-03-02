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

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Adoption
import com.example.androiddevchallenge.image.DisplayRemoteImageByGlide

@Composable
fun PetTitle(pet: Adoption) {
    Text(pet.title, style = MaterialTheme.typography.h6)
}

@Composable
fun PetAuthor(pet: Adoption) {
    Text(pet.author, style = MaterialTheme.typography.subtitle2, color = Color.Gray)
}

@Composable
fun PetDesc(pet: Adoption) {
    Text(text = pet.desc, style = MaterialTheme.typography.body2, maxLines = 3, overflow = TextOverflow.Ellipsis)
}

@Composable
fun PetImage(pet: Adoption, modifier: Modifier = Modifier) {
    pet.pictureUrl?.let {
        DisplayRemoteImageByGlide(
            imageUrl = it,
            modifier = modifier
        )
    }
}

@Composable
fun AdoptionCard(adoption: Adoption) {
    Row(
        Modifier
            .padding(8.dp)
    ) {
        PetImage(
            pet = adoption,
            modifier = Modifier
                .width(100.dp)
                .height(80.dp)
                .padding(end = 16.dp)
        )

        Column(Modifier.weight(1f)) {
            PetTitle(pet = adoption)
            PetAuthor(pet = adoption)
            PetDesc(pet = adoption)
        }
    }
}
