package org.b3rx.subswipe.domain.repository

import org.b3rx.subswipe.domain.model.GoogleAccount

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect class GoogleAuthUiProvider {
    suspend fun signIn(): GoogleAccount?
}