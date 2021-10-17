package gateway

import dependencies.authhandler.BasicAuthHandler
import dependencies.database.SomeDatabase
import model.AuthenticatedUser
import org.kodein.di.DI
import org.kodein.di.instance

class NonIndependentGateway(di: DI) : SomeGateway {
    private val db: SomeDatabase by di.instance("Mongo")
    private val authHandler: BasicAuthHandler by di.instance()

    override fun userLogin(username: String, password: String): AuthenticatedUser {
        return authHandler.authenticateUser(db.getUserByName(username), password)
    }
}
