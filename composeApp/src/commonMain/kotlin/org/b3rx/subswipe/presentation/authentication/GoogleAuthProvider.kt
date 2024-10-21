package org.b3rx.subswipe.presentation.authentication

import androidx.compose.runtime.Composable
import org.b3rx.subswipe.domain.repository.GoogleAuthUiProvider

expect class GoogleAuthProvider {
    @Composable
    fun getUiProvider(): GoogleAuthUiProvider

    suspend fun signOut()
}