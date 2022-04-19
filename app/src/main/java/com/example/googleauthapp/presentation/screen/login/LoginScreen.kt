package com.example.googleauthapp.presentation.screen.login

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.googleauthapp.domain.model.MessageBarState

@Composable
fun LoginScreen(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            LoginTopBar()
        },
        content = {
            LoginContent(
                signedInState = false,
                messageBarState = MessageBarState(),
                onButtonClicked = {}
            )
        }
    )
}