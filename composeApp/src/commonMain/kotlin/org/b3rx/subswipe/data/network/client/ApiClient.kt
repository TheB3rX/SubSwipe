package org.b3rx.subswipe.data.network.client

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

object ApiClient {
//    private const val BASE_URL = "https://www.googleapis.com/youtube/v3"
    private const val BASE_URL = "https://superheroapi.com/api/"

    val client = HttpClient {
        install(ContentNegotiation) {
            json(json = Json { ignoreUnknownKeys = true}, contentType = ContentType.Any)
        }
    }
}