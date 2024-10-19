package org.b3rx.subswipe

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform