package com.fantast.dev.simplestore.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fantast.dev.simplestore.ui.theme.Theme

@Composable
fun ScrollableChipsComponent(
    values: Iterable<String>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier = modifier
    ) {
        values.forEach {
            item {
                Chip(
                    content = it,
                    backgroundColor = Theme.BgColors.secondary,
                )
            }
        }
    }
}
