package lesson04

class Rectangle(val width: Int, val length: Int = width){
    // fun perimeter() = 2 * width + 2 * length
    // fun area() = width * length
    val perimeter = 2 * width + 2 * length
    val area = width * length
    }

fun main(){
    // Round 1
    val a = Rectangle(5,3)
    val b = Rectangle(8,4)
    val c = Rectangle(2,7)

    println(a.perimeter/*()*/)
    println(b.perimeter/*()*/)
    println(c.perimeter/*()*/)

    // Round 2
    val d = Rectangle(2)
    val e = Rectangle(5)
    val f = Rectangle(7)

    // Round 3
    println(d.perimeter/*()*/)
    println(e.perimeter/*()*/)
    println(f.perimeter/*()*/)

    println(a.area/*()*/)

    // Round 4
    //a.length = 12

    //println(a.area/*()*/)
}