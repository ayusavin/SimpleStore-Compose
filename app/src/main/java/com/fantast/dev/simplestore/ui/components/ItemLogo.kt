package com.fantast.dev.simplestore.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.fantast.dev.simplestore.ui.theme.Theme


@Composable
fun ItemLogo(@DrawableRes img: Int, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(88.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color = Theme.BgColors.logo_border)
    ) {
        Box(
            modifier = modifier
                .size(84.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(color = Theme.BgColors.logo_bg)
                .align(Alignment.Center)
        ) {
            Box(modifier = modifier.align(Alignment.Center)) {
                Image(
                    painter = painterResource(img),
                    contentDescription = "Logo",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.size(54.dp)
                )
            }
        }
    }
}
