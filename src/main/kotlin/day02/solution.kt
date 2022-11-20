package day02

import java.io.File

val lines = File("src/main/kotlin/day02/input.txt")
    .readLines()
    .map{ containsNRepeatedLetter(3, it) to containsNRepeatedLetter(2, it) }

fun containsNRepeatedLetter(n: Int, s: String) : Int{
    return if (s.toSet().any { letter -> s.count { it == letter } == n }) 1
        else 0
}

fun main(){
    lines.map { println(it) }
    println("Part One: ${lines.sumOf { it.first } * lines.sumOf { it.second }}")
}