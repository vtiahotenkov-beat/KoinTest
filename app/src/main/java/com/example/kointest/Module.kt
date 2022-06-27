package com.example.kointest

import org.koin.dsl.module

val module = module {

    scope<MainActivity> {
        factory { MainActivityViewModel(printer = get()) }
        factory { Printer() }
    }
}
