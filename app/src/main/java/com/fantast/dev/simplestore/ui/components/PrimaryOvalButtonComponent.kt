package com.fantast.dev.simplestore.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.fantast.dev.simplestore.ui.theme.Theme

@Composable
fun PrimaryOvalButtonComponent(
    text: String, onClick: () -> Unit, modifier: Modifier
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 0.dp, hoveredElevation = 20.dp
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Theme.ButtonColors.install_container,
            contentColor = Theme.TextColors.button
        ),
        modifier = modifier
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            style = Theme.TextStyle.Bold_20,
            modifier = Modifier.padding(
                top = 8.dp,
                bottom = 8.dp,
            )
        )
    }
}
