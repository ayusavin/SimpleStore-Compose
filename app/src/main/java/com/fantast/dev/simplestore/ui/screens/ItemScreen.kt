package com.fantast.dev.simplestore.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.fantast.dev.simplestore.R
import com.fantast.dev.simplestore.models.StoreItem
import com.fantast.dev.simplestore.ui.components.CommentBlockComponent
import com.fantast.dev.simplestore.ui.components.DrawableCarouselComponent
import com.fantast.dev.simplestore.ui.components.ItemHeaderComponent
import com.fantast.dev.simplestore.ui.components.PrimaryOvalButtonComponent
import com.fantast.dev.simplestore.ui.components.RatingBlockComponent
import com.fantast.dev.simplestore.ui.components.ScrollableChipsComponent
import com.fantast.dev.simplestore.ui.theme.Theme

@Composable
fun ItemScreen(item: StoreItem) {
    val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    LazyColumn(
        state = lazyListState,
        modifier = Modifier.fillMaxSize(),
    ) {
        item {
            ItemHeaderComponent(item = item)
        }

        item {
            ScrollableChipsComponent(
                values = item.tags.map{ it.uppercase() },
                modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
            )
            Text(
                text = item.description,
                style = Theme.TextStyle.Regular_12_19,
                color = Theme.TextColors.secondary,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 14.dp,
                    bottom = 14.dp,
                )
            )
        }

        item {
            DrawableCarouselComponent(
                drawables = item.pictures,
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
            )
        }

        item {
            Text(
                text = stringResource(R.string.review_ratings),
                style = Theme.TextStyle.Bold_16,
                color = Theme.TextColors.primary,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 20.dp,
                    bottom = 12.dp,
                )
            )
            RatingBlockComponent(
                rating = item.rating.current, reviewsCount = item.rating.votes.toString(), modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    bottom = 16.dp,
                ),
                maxRating = item.rating.max
            )
        }

        item {
            CommentBlockComponent(comments = item.comments)
        }

        item {
            PrimaryOvalButtonComponent(
                text = stringResource(R.string.install), onClick = {
                    Toast.makeText(context, "No, you don't", Toast.LENGTH_SHORT).show()
                }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 20.dp,
                        bottom = 40.dp,
                    )
            )
        }
    }
}
