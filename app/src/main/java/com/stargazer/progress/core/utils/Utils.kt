package com.stargazer.progress.core.utils


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


fun Modifier.standartClickableCardStyle(onClickAction: ()->Unit): Modifier = composed{

    this
        .padding(8.dp)
        .clip(RoundedCornerShape(12.dp))
        .clickable( onClick =onClickAction )
}


fun NavController.doActionAndNavigate(
    action: () -> Unit,
    destination: () -> Unit
) {
    action()
    destination()
}