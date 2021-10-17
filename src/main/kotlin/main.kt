import di.DiProvider
import gateway.IndependentGateway
import gateway.NonIndependentGateway
import org.kodein.di.instance
import org.kodein.di.newInstance

fun main() {

    val di = DiProvider().di
    val independentGateway by di.newInstance { IndependentGateway(instance(tag = "Sql"), instance()) }
    val nonIndependentGateway = NonIndependentGateway(di)

    val user1 = independentGateway.userLogin("test", "test")
    val user2 = nonIndependentGateway.userLogin("abc", "abc")

    println(user1.someOtherProperty)
    println(user2.someOtherProperty)
}
