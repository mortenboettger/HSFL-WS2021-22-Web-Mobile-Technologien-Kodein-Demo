package dependencies.database

import model.User

interface SomeDatabase {
    fun getUserByName(username: String): User
}