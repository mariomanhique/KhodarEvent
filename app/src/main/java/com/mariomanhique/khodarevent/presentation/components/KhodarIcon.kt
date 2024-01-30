package com.mariomanhique.khodarevent.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mariomanhique.khodarevent.ui.theme.KhodarEventTheme

@Composable
fun KhodarIcon(){
    Row {
        Text(text = "Kho", color = Color.Green)
        Text(text = "Event")
    }
}

@Preview(widthDp = 350, showBackground = true)
@Composable
fun KhoIconPreview(){
    KhodarEventTheme {
        KhodarIcon()
    }
}