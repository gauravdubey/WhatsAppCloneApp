package com.gaurav.whatsappcloneapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gaurav.whatsappcloneapp.R

@Composable
fun AppBarComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(MaterialTheme.colorScheme.primary)
            .padding(top = 16.dp, start = 16.dp, end = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(R.string.whatsapp_title),
            style = TextStyle(
                color = MaterialTheme.colorScheme.tertiary,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold

            )
        )
        Spacer(modifier = Modifier.weight(1f))
        IconComponent(R.drawable.ic_camera)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponent(R.drawable.ic_search)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponent(R.drawable.ic_menu)
    }
}


@Composable
fun IconComponent(resId: Int) {
    Icon(
        painter = painterResource(resId),
        contentDescription = "",
        tint = MaterialTheme.colorScheme.tertiary
    )
}

@Preview()
@Composable
fun AppBarComponentPreview() {
    AppBarComponent()
}