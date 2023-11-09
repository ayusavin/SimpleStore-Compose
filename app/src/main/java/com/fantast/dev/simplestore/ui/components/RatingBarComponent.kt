package com.fantast.dev.simplestore.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.fantast.dev.simplestore.R

private data class _StarsInfo(val image: ImageVector, val tint: Color)

@Composable
fun RatingBarComponent(
    modifier: Modifier = Modifier,
    currentRating: Float,
    maxRating: Int,
    color: Color = Color(0xFFF4D144),
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        val star = Icons.Filled.Star
        val halfStar = ImageVector.vectorResource(R.drawable.star_half)

        1.rangeTo(maxRating).map{
            val isFullStar = it < currentRating
            val isEmptyStar = !isFullStar && (it - currentRating) > 1
            _StarsInfo(
                image = if (isFullStar || isEmptyStar) star else halfStar,
                tint = if (isFullStar) color else Color.Unspecified
            )
        }.forEach {
            Icon(
                imageVector = it.image,
                "",
                tint = it.tint
            )
        }

    }
}