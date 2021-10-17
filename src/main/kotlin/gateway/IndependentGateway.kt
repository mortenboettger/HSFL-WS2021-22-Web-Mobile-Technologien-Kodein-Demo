package gateway

import dependencies.authhandler.BasicAuthHandler
import dependencies.database.SomeDatabase
import model.AuthenticatedUser

class IndependentGateway(
    private val db: SomeDatabase,
    private val authHandler: BasicAuthHandler
) : SomeGateway {
    override fun userLogin(username: String, password: String): AuthenticatedUser {
        return authHandler.authenticateUser(db.getUserByName(username), password)
    }
}
