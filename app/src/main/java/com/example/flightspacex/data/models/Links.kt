package com.example.flightspacex.data.models

import java.io.Serializable

data class Links(val mission_patch:String ="",
                 val mission_patch_small: String="",
                 val reddit_campaign: String="",
                 val reddit_launch: String="",
                 val reddit_recovery: String="",
                 val reddit_media: String="",
                 val article_link: String="",
                 val presskit: String="",
                 val video_link: String="",
                 val youtube_id: String="",
                 val flickr_images: List<String> = listOf(),
                 val article: String="",
                 val wikipedia: String=""):Serializable