package gateway

import dependencies.authhandler.BasicAuthHandler
import dependencies.database.SomeDatabase
import org.kodein.di.DI
import org.kodein.di.instance
import javax.naming.AuthenticationException

class NonIndependentGateway(di: DI) : SomeGateway {
    private val db: SomeDatabase by di.instance("Mongo")
    private val authHandler: BasicAuthHandler by di.instance()

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
