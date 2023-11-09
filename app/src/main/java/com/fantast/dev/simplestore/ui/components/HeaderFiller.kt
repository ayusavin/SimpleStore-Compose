package com.fantast.dev.simplestore.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp


@Composable
fun HeaderFiller(
    painter: Painter,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Box(modifier = modifier) {
        Image(
            painter = painter,
            contentDescription = "Header filler image",
            modifier = Modifier
                .fillMaxWidth()
                .height(294.dp),
            contentScale = ContentScale.Crop,
        )
        content()
    }
}
