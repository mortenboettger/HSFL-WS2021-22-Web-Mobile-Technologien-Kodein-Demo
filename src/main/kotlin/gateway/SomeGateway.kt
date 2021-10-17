package gateway

import model.AuthenticatedUser

interface SomeGateway {
    fun userLogin(username: String, password: String): AuthenticatedUser
}
