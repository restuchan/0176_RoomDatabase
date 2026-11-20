package com.chan.myapplication.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.chan.myapplication.repositori.RepositoriSiswa

class EditViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa): ViewModel(){

    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetailSiswa.itemIdArg])
}
