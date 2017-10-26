package edu.mira.aula.shared.notification

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.ContextWrapper
import android.graphics.Color
import android.os.Build

/**
 * Created by Shido on 03/10/2017.
 */
class NotificationUtils(base: Context): ContextWrapper(base) {

    lateinit var notificationManager: NotificationManager

    val UPDATE_CHANNEL_ID = "edu.mira.aula.UPDATE"
    val UPDATE_CHANNEL_NAME = "UPDATE CHANNEL"

    init {
        createChannels()
    }

   fun createChannels() {
       //Create Update Channel
       if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
           val androidChannel = NotificationChannel(UPDATE_CHANNEL_ID,
                   UPDATE_CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT)
           // Sets whether notifications posted to this channel should display notification lights
           androidChannel.enableLights(true)
           // Sets whether notification posted to this channel should vibrate.
           androidChannel.enableVibration(true)
           // Sets the notification light color for notifications posted to this channel
           androidChannel.lightColor = Color.GREEN
           androidChannel.description = "Mira Aula Updates"
           // Sets whether notifications posted to this channel appear on the lockscreen or not
           androidChannel.lockscreenVisibility = Notification.VISIBILITY_PRIVATE
           getManager().createNotificationChannel(androidChannel)
       }
   }

    private fun getManager(): NotificationManager {
        if (notificationManager == null) {
            notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        }
        return notificationManager
    }

    fun getUpdateChannelNotification(title: String, body: String): Notification.Builder{
        var notification: Notification.Builder
      /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notification = Notification.Builder(applicationContext, UPDATE_CHANNEL_ID)
                    .setContentTitle(title)
                    .setContentText(body)
                    .setAutoCancel(true)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setShowWhen(true)
                    .setLocalOnly(true)
        }else{
            notification = Notification.Builder(applicationContext)
                    .setContentTitle(title)
                    .setContentText(body)
                    .setAutoCancel(true)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setShowWhen(true)
                    .setLocalOnly(true)
        }
        return notification*/
    }



}