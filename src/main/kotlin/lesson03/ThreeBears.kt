package lesson03

fun gearForDistance(distance: Double): String{
    val gear = when  {
        distance <= 3 -> "Full-Sized Tent"
        distance < 10 -> "Backpacking Tent"
        distance == 0.0 -> "Pop-up Car Tent"
        else -> "Hammocks"
    }

    return gear
}

fun main(){
    println(gearForDistance(25.0))
    println(gearForDistance(1.5))
    println(gearForDistance(7.2))
    println(gearForDistance(0.0))

    println("${weightForGear("Full-Sized Tent")}")
    println("${weightForGear("Backpacking Tent")}")
    println("${weightForGear("Hammocks")}")
    println("${weightForGear("Pop-up Car Tent")}")

    println("${weightForGear("Tarp")}")

    println(shouldBringPoles(0.25))
    println(shouldBringPoles(5.7))
    println(shouldBringPoles(5.0))
}

fun weightForGear(gear: String): Double{
    val weigth = when (gear){
        "Full-Sized Tent" -> 16.0
        "Backpacking Tent" -> 6.0
        "Pop-up Car Tent" -> 3500.0
        "Hammocks", "Tarp" -> 2.0
        else -> 0.0
    }

    return weigth
}

fun shouldBringPoles(distance: Double): Boolean {
    if (distance > 5.0) return true else return false
}