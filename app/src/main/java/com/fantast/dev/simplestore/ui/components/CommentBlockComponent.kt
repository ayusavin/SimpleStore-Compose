package com.fantast.dev.simplestore.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fantast.dev.simplestore.models.ItemComment
import com.fantast.dev.simplestore.ui.theme.Theme

@Composable
fun CommentBlockComponent(comments: Iterable<ItemComment>) {
    comments.forEachIndexed { index, it ->
        if (index != 0) {
            Divider(
                color = Theme.BgColors.divider,
                thickness = 1.dp,
                modifier = Modifier.padding(
                    top = 12.dp,
                    bottom = 24.dp,
                    start = 38.dp,
                    end = 38.dp,
                ),
            )
        }
        CommentComponent(
            comment = it,
            modifier = Modifier.padding(
                start = 24.dp,
                end = 24.dp,
                bottom = 16.dp
            )
        )
    }
}