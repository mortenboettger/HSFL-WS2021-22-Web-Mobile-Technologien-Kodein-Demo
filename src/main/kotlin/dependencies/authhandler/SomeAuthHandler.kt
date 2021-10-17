package dependencies.authhandler

import model.AuthenticatedUser
import model.User

interface SomeAuthHandler {
    fun authenticateUser(dbUser: User, password: String): AuthenticatedUser
}