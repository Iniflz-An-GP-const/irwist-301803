package sklove.irwist.info

import android.app.Application
import sklove.irwist.info.di.dataModule
import sklove.irwist.info.di.dispatcherModule
import sklove.irwist.info.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class SORTOApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@SORTOApplication)
            modules(appModules)
        }
    }
}