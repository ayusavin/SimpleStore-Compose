package com.fantast.dev.simplestore.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.fantast.dev.simplestore.models.StoreItem
import com.fantast.dev.simplestore.ui.theme.Theme

@Composable
fun ItemHeaderComponent(
    item: StoreItem,
    modifier: Modifier = Modifier
) {

    HeaderFiller(
        painter = painterResource(item.backgroundImage),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier.padding(start = 24.dp, top = 274.dp)
        ) {
            Row {
                ItemLogo(img = item.icon, modifier = Modifier)
                Column(modifier = Modifier.padding(start = 12.dp, top = 34.dp)) {
                    Text(
                        text = item.name,
                        style = Theme.TextStyle.Bold_20,
                        color = Theme.TextColors.primary,
                    )
                    Row(modifier = Modifier.padding(top = 6.dp)) {
                        RatingBarComponent(
                            currentRating = item.rating.current,
                            modifier = Modifier
                                .height(14.dp)
                                .width(76.dp),
                            maxRating = item.rating.max
                        )
                        Text(
                            text = item.rating.votes.toString(),
                            style = Theme.TextStyle.Regular_12,
                            color = Theme.TextColors.primary_transparent,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
            }
        }
    }
}
