package gateway

import dependencies.authhandler.BasicAuthHandler
import dependencies.database.SomeDatabase
import javax.naming.AuthenticationException

class IndependentGateway(
    private val db: SomeDatabase,
    private val authHandler: BasicAuthHandler
) : SomeGateway {
    override fun userLogin(username: String, password: String): Boolean {
        return try {
            println(authHandler.authenticateUser(db.getUserByName(username), password).someOtherProperty)
            true
        } catch (e: AuthenticationException) {
            println(e.message)
            false
        }
    }
}
