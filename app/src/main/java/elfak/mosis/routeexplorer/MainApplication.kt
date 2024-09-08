package elfak.mosis.routeexplorer

import android.app.Application
import elfak.mosis.routeexplorer.data.DefaultAppContainer

class MainApplication:Application() {
    //moze valjda interfejs za ovo
    lateinit var container: DefaultAppContainer

    override fun onCreate() {
        super.onCreate()

        container = DefaultAppContainer(this)
    }
}