package lesson05

// Round 1
val dogs = listOf("Boots", "Danny", "Rover", "Fido", "Mrs. Wagglytails")

// Round 2
data class Dog(var name: String, var age: Int, var breed: String)

// Round 3
fun String.toUsername() = this.lowercase()

fun String.isValidUsername(): Boolean = !this.contains(" ")

fun main(){

    // Round 1
    dogs
        .map { name -> name/*.lowercase()*/.toUsername()}
        .filter { username -> /*!*/username/*.contains(" ")*/.isValidUsername()}
        .forEach { username -> println(username)}

    // Round 2
    val boots = Dog("Boots", 3, "Great Dame")
    val danny = boots.copy(name = "Danny")

    println(boots)
    println(danny)
}