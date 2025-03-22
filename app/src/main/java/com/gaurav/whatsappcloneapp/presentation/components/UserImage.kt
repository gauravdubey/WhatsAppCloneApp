package com.gaurav.whatsappcloneapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gaurav.whatsappcloneapp.R

@Composable
fun UserImage(userProfilePic: Int) {

    Image(
        modifier = Modifier.size(60.dp),
        painter = painterResource(userProfilePic),
        contentDescription = ""
    )
}

@Preview
@Composable
fun UserImagePreview() {
    UserImage(R.drawable.ic_user_pic)
}