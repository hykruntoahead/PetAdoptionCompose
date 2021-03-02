package com.example.androiddevchallenge.homepage

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.androiddevchallenge.data.Adoption
import com.example.androiddevchallenge.data.getAdoptionList
import kotlinx.coroutines.delay

class AdoptionsViewModel : ViewModel() {
    val adoptions: LiveData<List<Adoption>> = liveData {
        val adoptions = loadAdoptions()
        emit(adoptions)
    }

    private suspend fun loadAdoptions(): List<Adoption> {
        delay(1500)
        return getAdoptionList()
    }
}
