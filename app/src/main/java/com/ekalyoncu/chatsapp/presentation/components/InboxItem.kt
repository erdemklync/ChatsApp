package com.ekalyoncu.chatsapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ekalyoncu.chatsapp.domain.model.InboxItem
import com.ekalyoncu.chatsapp.domain.model.Status
import com.ekalyoncu.chatsapp.presentation.theme.Blue
import com.ekalyoncu.chatsapp.R

@Composable
fun InboxItem(
    item: InboxItem
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable() {

            }
            .background(MaterialTheme.colors.background)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape),
                //.border(1.dp, primary, CircleShape),
            painter = painterResource(
                id = item.image
            ),
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = item.from,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                )
                Text(
                    text = item.timeStamp,
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp
                    )
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        end = 8.dp
                    ),
                verticalAlignment = Alignment.Bottom
            ) {
                if (item.status != Status.Received){
                    Icon(
                        modifier = Modifier
                            .width(20.dp),
                        painter = painterResource(
                            id = if (item.status == Status.Sent) R.drawable.ui_tick else R.drawable.ui_double_tick
                        ),
                        contentDescription = null,
                        tint = if (item.status == Status.Read) Blue else Color.Gray
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                }

                Text(
                    text = item.lastMessage,
                    overflow = TextOverflow.Ellipsis,
                    softWrap = false,
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        color = MaterialTheme.colors.onSurface.copy(alpha = 0.6f)
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun InboxItemPreview(){
    InboxItem(
        InboxItem(
            image = R.drawable.image_1,
            from = "Deneme",
            lastMessage = "Merhaba, bu bir mesajdır.",
            timeStamp = "19.23",
            status = Status.Read
        )
    )
}
