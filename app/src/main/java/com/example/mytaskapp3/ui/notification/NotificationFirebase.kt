package com.example.mytaskapp3.ui.notification

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class NotificationFirebase:FirebaseMessagingService() {
    override fun onMessageReceived(message: RemoteMessage) {
        Log.e("bema", "onMessageReceived: "+message.notification?.title )
        Log.e("bema", "onMessageReceived: "+message.notification?.body )
        super.onMessageReceived(message)
    }

}