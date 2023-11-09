package com.fantast.dev.simplestore.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fantast.dev.simplestore.R
import com.fantast.dev.simplestore.models.ItemComment
import com.fantast.dev.simplestore.models.StoreItem
import com.fantast.dev.simplestore.ui.theme.Theme
import java.text.SimpleDateFormat
import java.util.Locale
import com.fantast.dev.simplestore.models.ItemRating

@Composable
fun MainScreen() {
    val dateFormatter = SimpleDateFormat("yyyy.MM.dd", Locale.US)

    MaterialTheme {
        Surface(
            modifier=Modifier.fillMaxSize(),
            color= Theme.BgColors.primary
        ) {
            ItemScreen(
                StoreItem(
                    R.drawable.dota_header,
                    R.drawable.dota_logo,
                    "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                    listOf(
                        R.drawable.carousel_image_1,
                        R.drawable.carousel_image_2
                    ),
                    ItemRating(
                        5,
                        4.9f,
                        "70M"
                    ),
                    listOf(
                        ItemComment(
                            "Auguste Conte",
                            R.drawable.thumbnail_auguste_conte,
                            dateFormatter.parse("2019.02.14"),
                            "Once you start to learn its secrets, there's a wild and exciting variety of play here that's unmatched, even by its peers."
                        ),
                        ItemComment(
                            "Jang Marcelino",
                            R.drawable.thumbnail_jang_marcelino,
                            dateFormatter.parse("2019.02.14"),
                            "Once you start to learn its secrets, there's a wild and exciting variety of play here that's unmatched, even by its peers."
                        )
                ),
                    listOf(
                        "moba", "multiplayer", "strategy", "free to play", "pvp"
                    ),
                    "DoTA 2"
                )
            )
        }
    }
}