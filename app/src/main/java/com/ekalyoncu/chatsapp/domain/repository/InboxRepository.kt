package com.ekalyoncu.chatsapp.domain.repository

import com.ekalyoncu.chatsapp.R
import com.ekalyoncu.chatsapp.domain.model.InboxItem
import com.ekalyoncu.chatsapp.domain.model.Status

val fakeInboxRepository = listOf(
    InboxItem(
        image = R.drawable.image_1,
        from = "Murat B.",
        lastMessage = "Cumartesiye ayarladım, bir planın var mı?",
        timeStamp = "19:00",
        status = Status.Received
        ),
    InboxItem(
        image = R.drawable.image_2,
        from = "Pelin A.",
        lastMessage = "Sabah toplantıda biraz mutsuz gördüm seni, bir sorun yok umarım?",
        timeStamp = "15:30",
        status = Status.Received
    ),
    InboxItem(
        image = R.drawable.image_3,
        from = "Şef",
        lastMessage = "Maili gönderiyorum acil bir bakabilir misin",
        timeStamp = "03:21",
        status = Status.Received
    ),
    InboxItem(
        image = R.drawable.image_4,
        from = "Emre (Üst Komşu)",
        lastMessage = "Emre Bey, rica etsem televizyonun sesini kısar mısınız? İşten yeni döndüm biraz yorgunum.",
        timeStamp = "Dün",
        status = Status.Read
    ),
    InboxItem(
        image = R.drawable.image_5,
        from = "Yıldırım",
        lastMessage = "Yazın sana verdiğim kitabı yarın sabah getirebilir misin?",
        timeStamp = "13.11.2021",
        status = Status.Delivered
    ),
    InboxItem(
        image = R.drawable.image_6,
        from = "Cemre N.",
        lastMessage = "Müsait olunca bana döner misin?",
        timeStamp = "11.11.2021",
        status = Status.Sent
    ),
)