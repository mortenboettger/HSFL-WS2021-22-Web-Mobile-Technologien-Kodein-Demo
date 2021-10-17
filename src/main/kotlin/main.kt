import controller.LoginController

fun main() {
    val loginController = LoginController()

    println("Independent")
    loginController.loginIndependent()

    println("Non-independent")
    loginController.loginNonIndependent()
}