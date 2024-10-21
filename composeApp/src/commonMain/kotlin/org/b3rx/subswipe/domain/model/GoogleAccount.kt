package org.b3rx.subswipe.domain.model

data class GoogleAccount(
    val token: String,
    val displayName: String,
    val profileImageUrl: String,
)
