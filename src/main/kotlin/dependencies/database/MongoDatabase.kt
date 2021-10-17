package dependencies.database

import model.User

class MongoDatabase : SomeDatabase {
    override fun getUserByName(username: String): User {
        return User(username, this::class.java.name)
    }
}
