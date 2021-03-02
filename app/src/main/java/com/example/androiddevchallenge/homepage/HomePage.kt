package com.example.androiddevchallenge.homepage


import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
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
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Adoption

private const val TAG = "HomePage"

@Composable
fun HomePage(color: Color, adoptionsLiveData: LiveData<List<Adoption>>) {
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
        backgroundColor = color
    )
}


@Composable
fun HomePageContent(adoptionsLiveData: LiveData<List<Adoption>>) {

    val adoptionList = adoptionsLiveData.observeAsState(initial = emptyList()).value
    Log.d(TAG, "HomePageContent: adoptionList=$adoptionList")
    if (adoptionList.isEmpty()) {
        LoadingProgressBar()
    } else {
        SyncAdoptionList(adoptionList)
    }
}

@Composable
fun SyncAdoptionList(adoptionList: List<Adoption>){
    LazyColumn {
        items(adoptionList){
                adoption ->
            Card(
                shape = RoundedCornerShape(3.dp),
                backgroundColor = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
               AdoptionCard(adoption = adoption)
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


//@Preview("Light Theme", widthDp = 360, heightDp = 640)
//@Composable
//fun LightPreview() {
//    MyTheme {
//        MyApp(viewModel.adoptions)
//    }
//}
//
//@Preview("Dark Theme", widthDp = 360, heightDp = 640)
//@Composable
//fun DarkPreview() {
//    MyTheme(darkTheme = true) {
//        MyApp(viewModel.adoptions)
//    }
//}
