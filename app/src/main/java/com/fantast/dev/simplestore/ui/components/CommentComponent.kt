package com.fantast.dev.simplestore.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.fantast.dev.simplestore.models.ItemComment
import com.fantast.dev.simplestore.ui.theme.Theme
import java.text.SimpleDateFormat
import java.util.Locale

private val fmt = SimpleDateFormat("MMMM dd, yyyy", Locale.US)

@Composable
fun CommentComponent(comment: ItemComment, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(36.dp)
            ) {
                Image(
                    painter = painterResource(comment.thumbnail),
                    contentDescription = "Thumbnail",
                    contentScale = ContentScale.Crop,
                )
            }
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(
                    text = comment.username,
                    style = Theme.TextStyle.Regular_16,
                    color = Theme.TextColors.primary,
                )
                Text(
                    text = fmt.format(comment.date),
                    style = Theme.TextStyle.Regular_12_19,
                    color = Theme.TextColors.message,
                    modifier = Modifier.padding(
                        top = 16.dp
                    )
                )
            }
        }
        Text(
            text = "\"${comment.text}\"",
            style = Theme.TextStyle.Regular_16,
            color = Theme.TextColors.primary,
        )
    }
}