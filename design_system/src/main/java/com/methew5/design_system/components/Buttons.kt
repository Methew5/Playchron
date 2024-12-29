package com.methew5.design_system.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.methew5.design_system.theme.LocalSpacings

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    textStyle: TextStyle = MaterialTheme.typography.titleSmall
) {
    val spacings = LocalSpacings.current

    Button(
        modifier = modifier,
        enabled = enabled,
        onClick = onClick,
        shape = MaterialTheme.shapes.large,
//        colors = ButtonColors(
//
//        )
    ) {
        Text(
            text = text,
            style = textStyle,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.padding(spacings.small)
        )
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    PrimaryButton(
        text = "Some text",
        onClick = {},
    )
}