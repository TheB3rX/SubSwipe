package org.b3rx.subswipe.presentation.authentication

import androidx.compose.runtime.Composable
import org.b3rx.subswipe.domain.repository.GoogleAuthUiProvider

actual class GoogleAuthProvider {
    @Composable
    actual fun getUiProvider(): GoogleAuthUiProvider = GoogleAuthUiProvider()


    @OptIn(ExperimentalForeignApi::class)
    actual suspend fun signOut() {
        GIDSignIn.sharedInstance.signOut()
    }
}