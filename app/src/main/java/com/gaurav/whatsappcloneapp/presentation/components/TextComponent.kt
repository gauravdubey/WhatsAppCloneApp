package com.gaurav.whatsappcloneapp.presentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextComponent(
    value: String,
    fontSize: TextUnit,
    colorValue: Color,
    modifier: Modifier?,
    fontWeight: FontWeight? = FontWeight.Normal
) {
    if (modifier != null) {
        Text(
            modifier = modifier,
            text = value,
            style = TextStyle(
                fontSize = fontSize,
                fontWeight = fontWeight,
                color = colorValue
            )
        )
    } else {
        Text(
            text = value,
            style = TextStyle(
                fontSize = fontSize,
                fontWeight = fontWeight,
                color = colorValue
            )
        )
    }

}

@Preview
@Composable
fun TextComponentPreview() {
}