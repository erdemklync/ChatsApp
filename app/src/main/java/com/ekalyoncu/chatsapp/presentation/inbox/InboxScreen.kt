package com.ekalyoncu.chatsapp.presentation.inbox

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ekalyoncu.chatsapp.domain.repository.fakeInboxRepository
import com.ekalyoncu.chatsapp.presentation.components.InboxItem
import com.ekalyoncu.chatsapp.R

@Composable
fun InboxScreen(){
    Scaffold() {
        LazyColumn(){
            item { 
                Spacer(modifier = Modifier.height(4.dp))
            }
            items(fakeInboxRepository){ inboxItem ->
                InboxItem(
                    item = inboxItem
                )
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {

                        }
                        .padding(
                            horizontal = 24.dp,
                            vertical = 16.dp
                        ),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ui_archive),
                        contentDescription = null
                    )
                    Text(
                        text = "Arşivlenmiş Mesajlar",
                        style = TextStyle(
                            fontWeight = FontWeight.Medium
                        )
                    )
                    Text(
                        text = "2"
                    )
                }
            }
        }
    }
}