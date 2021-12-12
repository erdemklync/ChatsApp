package com.ekalyoncu.chatsapp.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ekalyoncu.chatsapp.presentation.theme.primary
import com.ekalyoncu.chatsapp.R

sealed class Tab(var title: String) {
    object Inbox: Tab("SOHBETLER")
    object Status: Tab("DURUM")
    object Call: Tab("ARAMALAR" )
}

val tabs = listOf(
    Tab.Inbox,
    Tab.Status,
    Tab.Call
)

@Composable
fun HomeTabs(
    tabs: List<Tab>,
){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ){
        IconButton(
            onClick = { /*TODO*/ }
        ){
            Icon(
                painter = painterResource(id = R.drawable.ui_camera),
                contentDescription = null,
                tint = primary
            )
        }
        TabRow(
            selectedTabIndex = 0,
            backgroundColor = MaterialTheme.colors.background,
            contentColor = primary,
            divider = {}
        ){
            tabs.forEach { tabItem ->
                Tab(
                    selected = true,
                    onClick = { /*TODO*/ }
                ){
                    Text(
                        modifier = Modifier
                            .padding(12.dp),
                        text = tabItem.title,
                        style = TextStyle(
                            fontWeight = FontWeight.Bold
                        ),
                        letterSpacing = 0.15.sp
                    )
                }
            }
        }
    }
}