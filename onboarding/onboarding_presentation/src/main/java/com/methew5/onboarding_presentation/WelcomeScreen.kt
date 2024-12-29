package com.methew5.onboarding_presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.methew5.design_system.components.PrimaryButton
import com.methew5.design_system.theme.LocalSpacings

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    val spacings = LocalSpacings.current
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(spacings.medium),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .wrapContentHeight(Alignment.Bottom),
            text = stringResource(R.string.welcome_title),
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.height(spacings.medium))
        Text(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .wrapContentHeight(Alignment.Top),
            text = stringResource(R.string.welcome_message),
            textAlign = TextAlign.Center,
        )
        PrimaryButton(
            text = stringResource(R.string.welcome_next_button_title),
//            modifier = Modifier
            onClick = {

            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun WelcomeScreenPreview() {
    WelcomeScreen()
}