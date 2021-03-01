package com.example.androiddevchallenge.homepage



import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.LiveData
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Adoption
import com.example.androiddevchallenge.image.DisplayRemoteImageByGlide

private const val TAG = "HomePage"
@Composable
fun HomePage(color: Color,adoptionsLiveData: LiveData<List<Adoption>>) {
    Scaffold(
        modifier = Modifier.semantics { testTag = "HomePage" },
        topBar = {
            TopAppBar(
                title = { Text(text = LocalContext.current.getString(R.string.pet_adoptions)) },
                elevation = 8.dp,
            )
        },
        content = {
            HomePageContent(adoptionsLiveData)
        },
    )
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomePageContent(adoptionsLiveData: LiveData<List<Adoption>>) {

    val adoptionList = adoptionsLiveData.observeAsState(initial = emptyList()).value
    Log.d(TAG, "HomePageContent: adoptionList=$adoptionList")
    if (adoptionList.isEmpty()){
        LoadingProgressBar()
    }else{
        LoadingAdoptionList(adoptionList)
    }
}

@ExperimentalMaterialApi
@Composable
fun LoadingAdoptionList(adoptionList: List<Adoption>) {
    LazyColumn{
        items(items = adoptionList,itemContent = {
            adoption ->
            Card(shape = RoundedCornerShape(3.dp),
            backgroundColor = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)) {
                ListItem(text = {
                    Text(
                        text = adoption.title,
                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold)
                    )
                },secondaryText = {
                    Text(
                        text = "author: ${adoption.author}",
                        style = TextStyle(
                            fontFamily = FontFamily.Serif, fontSize = 15.sp,
                            fontWeight = FontWeight.Light, color = Color.DarkGray
                        )
                    )
                }, icon = {
                    adoption.pictureUrl?.let { imageUrl ->
                        // Look at the implementation of this composable in ImageActivity to learn
                        // more about its implementation. It uses Picasso to load the imageUrl passed
                        // to it.
                        DisplayRemoteImageByGlide(
                            imageUrl = imageUrl,
                            modifier = Modifier
                                .width(60.dp)
                                .height(60.dp)
                        )
                    }
                }
                )
            }
        })
    }
}

@Composable
fun LoadingProgressBar() {
    Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
        CircularProgressIndicator(modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally))
    }
}
