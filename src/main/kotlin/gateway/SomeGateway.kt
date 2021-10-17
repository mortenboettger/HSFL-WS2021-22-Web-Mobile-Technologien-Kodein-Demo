package gateway

interface SomeGateway {
    fun userLogin(username: String, password: String): Boolean
}