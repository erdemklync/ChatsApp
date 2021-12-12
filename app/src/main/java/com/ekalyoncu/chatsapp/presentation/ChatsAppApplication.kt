package com.ekalyoncu.chatsapp.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ekalyoncu.chatsapp.presentation.inbox.InboxScreen
import com.ekalyoncu.chatsapp.presentation.theme.ChatsAppTheme
import com.ekalyoncu.chatsapp.presentation.theme.Typography
import com.ekalyoncu.chatsapp.R
import com.ekalyoncu.chatsapp.presentation.components.HomeTabs
import com.ekalyoncu.chatsapp.presentation.components.tabs
import com.ekalyoncu.chatsapp.presentation.theme.primary

@Preview()
@Composable
fun ChatsAppApplication() {
    ChatsAppTheme {
        Scaffold(
            topBar = {
                Column {
                    TopAppBar(
                        backgroundColor = MaterialTheme.colors.background,
                        elevation = 0.dp
                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(
                                    start = 16.dp
                                ),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Text(
                                text = "ChatsApp",
                                style = Typography.h6
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ui_search),
                                        contentDescription = null,
                                        tint = primary
                                    )
                                }
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ui_more),
                                        contentDescription = null,
                                        tint = primary
                                    )
                                }
                            }

                        }
                    }
                    HomeTabs(tabs = tabs)
                }
            },

            floatingActionButton = {
                FloatingActionButton(
                    modifier = Modifier
                        .padding(24.dp),
                    shape = RoundedCornerShape(12.dp),
                    backgroundColor = primary,
                    onClick = { /*TODO*/ }
                ){
                    Icon(
                        painter = painterResource(
                            id = R.drawable.ui_chats
                        ),
                        contentDescription = null
                    )
                }
            }
        ){
            InboxScreen()
        }
    }
}