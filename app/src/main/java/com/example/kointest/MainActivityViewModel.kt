package com.example.kointest

import androidx.lifecycle.ViewModel

class MainActivityViewModel(
    private val printer: Printer,
) : ViewModel() {

    init {
        printer.print("ViewModel >>> initialized")
    }

    fun handleActivityCreated() {
        printer.print("ViewModel >>> activity creation handled")
    }
}
