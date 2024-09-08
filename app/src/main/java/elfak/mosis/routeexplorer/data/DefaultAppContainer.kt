package elfak.mosis.routeexplorer.data

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import elfak.mosis.routeexplorer.data.repository.UserRepository

//mozda bi ovda trebao interfejs da se koristi
class DefaultAppContainer(context: Context) {

    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    private val storage: FirebaseStorage = FirebaseStorage.getInstance()

    init {
        createNotificationChannel(context)
    }


    private fun createNotificationChannel(context: android.content.Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "location"
            val channelName = "Location"
            val importance = NotificationManager.IMPORTANCE_LOW

            val notificationChannel = NotificationChannel(channelId, channelName, importance)
            val notificationManager: NotificationManager =
                // Ako ovo koristis u Application, radice i bez context. jer je implicitno prisutan (this.getSystemService) ali ti to ne vidis
                context.getSystemService(android.content.Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(notificationChannel)
        }

    }

    val userRepository: UserRepository by lazy {
        UserRepository(auth, firestore, storage)
    }
}