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
        })
}
