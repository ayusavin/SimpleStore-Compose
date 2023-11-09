package com.fantast.dev.simplestore.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun DrawableCarouselComponent(drawables: Iterable<Int>, contentPadding: PaddingValues) {
    LazyRow(
        contentPadding = contentPadding, horizontalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        drawables.forEach { preview ->
            item {
                Box(modifier = Modifier.size(240.dp, 128.dp)) {
                    Image(
                        painter = painterResource(preview),
                        contentDescription = "Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(12.dp))
                    )
                }
            }
        }
    }
}
