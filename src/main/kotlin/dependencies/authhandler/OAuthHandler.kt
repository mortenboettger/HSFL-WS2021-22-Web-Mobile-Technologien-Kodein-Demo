package dependencies.authhandler

import model.AuthenticatedUser
import model.User

class OAuthHandler : SomeAuthHandler {
    override fun authenticateUser(dbUser: User, password: String): AuthenticatedUser {
        // some password check
        return AuthenticatedUser(dbUser.username, "OAuth")
    }
}