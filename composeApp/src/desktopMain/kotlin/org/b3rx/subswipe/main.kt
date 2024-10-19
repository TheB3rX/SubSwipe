package org.b3rx.subswipe

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "SubSwipe",
    ) {
        App()
    }
}