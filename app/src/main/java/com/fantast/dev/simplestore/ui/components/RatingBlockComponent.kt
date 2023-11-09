package com.fantast.dev.simplestore.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fantast.dev.simplestore.ui.theme.Theme

@Composable
fun RatingBlockComponent (
    rating: Float,
    maxRating: Int,
    reviewsCount: String,
    modifier: Modifier,
) {
    Row(modifier = modifier) {
        Text(
            text = rating.toString(),
            style = Theme.TextStyle.Bold_48,
            color = Theme.TextColors.primary,
        )
        Column(
            modifier = Modifier.padding(
                top = 17.dp,
                bottom = 7.dp,
                start = 16.dp,
            )
        ) {
            RatingBarComponent(
                currentRating = rating,
                modifier = Modifier
                    .height(12.dp)
                    .width(76.dp),
                maxRating = maxRating
            )
            Text(
                text = "$reviewsCount Reviews",
                style = Theme.TextStyle.Regular_12,
                color = Theme.TextColors.message,
            )
        }
    }
}