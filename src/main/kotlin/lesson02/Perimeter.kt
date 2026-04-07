package lesson02

fun perimeter(width: Int, length: Int = width): Int = 2 * width + 2 * length

fun main(){
    val p1 = perimeter(5,3)
    val p2 = perimeter(8,4)
    val p3 = perimeter(2,7)

    printPerimeter(p1)
    printPerimeter(p2)
    printPerimeter(p3)

    val ps1 = perimeter(2)
    val ps2 = perimeter(5)
    val ps3 = perimeter(7)

    printPerimeter(ps1)
    printPerimeter(ps2)
    printPerimeter(ps3)
}

fun printPerimeter(perimeter: Int){
    println("The perimeter is $perimeter")
}