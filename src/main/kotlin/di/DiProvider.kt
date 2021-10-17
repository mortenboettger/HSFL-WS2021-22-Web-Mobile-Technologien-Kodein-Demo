package di

import dependencies.authhandler.BasicAuthHandler
import dependencies.database.MongoDatabase
import dependencies.database.SomeDatabase
import dependencies.database.SqlDatabase
import org.kodein.di.DI
import org.kodein.di.bindProvider
import org.kodein.di.bindSingleton

class DiProvider {
    val di = DI {
        bindSingleton<SomeDatabase>(tag = "Sql") { SqlDatabase() }
        bindSingleton<SomeDatabase>(tag = "Mongo") { MongoDatabase() }
        bindProvider { BasicAuthHandler() }
    }
}
