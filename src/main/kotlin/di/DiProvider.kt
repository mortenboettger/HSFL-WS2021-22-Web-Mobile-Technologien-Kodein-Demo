package di

import dependencies.authhandler.BasicAuthHandler
import dependencies.authhandler.OAuthHandler
import dependencies.authhandler.SomeAuthHandler
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
        bindProvider<SomeAuthHandler>(tag = "basicAuth") { BasicAuthHandler() }
        bindProvider<SomeAuthHandler>(tag = "OAuth") { OAuthHandler() }
    }
}