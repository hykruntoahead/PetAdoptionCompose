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
package com.example.androiddevchallenge.image

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun DisplayRemoteImageByGlide(imageUrl: String, modifier: Modifier) {
    GlideImage(
        imageModel = imageUrl,
        modifier = modifier,
        // shows a progress indicator when loading an image.
        loading = {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                LinearProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
        },
        // shows an error text message when request failed.
        failure = {
            Text(text = "image request failed.")
        }
    )
}
