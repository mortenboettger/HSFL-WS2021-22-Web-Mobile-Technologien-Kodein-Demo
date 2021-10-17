package controller

import di.DiProvider
import gateway.IndependentGateway
import gateway.NonIndependentGateway
import org.kodein.di.instance
import org.kodein.di.newInstance

class LoginController {
    private val di = DiProvider().di

    fun loginIndependent() {
        val gateway by di.newInstance { IndependentGateway(instance(tag = "Sql"), instance(tag = "basicAuth")) }
        gateway.userLogin("test", "test")
    }

    fun loginNonIndependent() {
        val gateway = NonIndependentGateway(di)
        gateway.userLogin("abc", "abc")
    }
}