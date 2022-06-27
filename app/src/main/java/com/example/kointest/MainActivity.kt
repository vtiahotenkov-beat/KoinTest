package com.example.kointest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.activityScope
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.scope.Scope

class MainActivity : AppCompatActivity(), AndroidScopeComponent {

    private val viewModel: MainActivityViewModel by viewModel()
    override val scope: Scope by activityScope()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.handleActivityCreated()
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.close()
    }
}
