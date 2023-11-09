package com.fantast.dev.simplestore.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.fantast.dev.simplestore.R

internal val FontFamily = FontFamily(
    Font(
        R.font.sk_modernist_regular_font
    ),
    Font(
        R.font.sk_modernist_mono_font,
        weight = androidx.compose.ui.text.font.FontWeight.Companion.Medium
    ),
    Font(
        R.font.sk_modernist_bold_font,
        weight = androidx.compose.ui.text.font.FontWeight.Companion.Bold
    ),
)
