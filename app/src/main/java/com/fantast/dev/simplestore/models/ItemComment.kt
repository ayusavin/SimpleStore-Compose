package com.fantast.dev.simplestore.models

import android.media.Image
import java.util.Date
import androidx.annotation.DrawableRes

data class ItemComment(
    val username: String,
    @DrawableRes val thumbnail: Int,
    val date: Date,
    val text: String
)