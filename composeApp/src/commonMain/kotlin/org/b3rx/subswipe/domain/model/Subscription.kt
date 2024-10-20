package org.b3rx.subswipe.domain.model

data class Subscription (
    var subscriptionId: String,
    var channelTitle: String,
    var channelDescription: String,
    var channelId: String,
    var thumbnails: List<Thumbnail>,
)