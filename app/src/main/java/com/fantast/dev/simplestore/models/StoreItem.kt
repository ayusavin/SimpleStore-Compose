package com.fantast.dev.simplestore.models

import android.graphics.drawable.Drawable
import android.media.Image
import android.media.Rating
import androidx.annotation.DrawableRes

data class StoreItem(
    @DrawableRes val backgroundImage: Int,
    @DrawableRes val icon: Int,
    val description: String,
    val pictures: Iterable<Int>,
    val rating: ItemRating,
    val comments: Iterable<ItemComment>,
    val tags: Iterable<String>,
    val name: String
)