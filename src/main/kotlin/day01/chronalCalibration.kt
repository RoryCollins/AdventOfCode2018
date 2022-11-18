package day01

import java.io.File

val numbers = File("src/main/kotlin/day01/input.txt")
    .readLines()
    .map { it.toInt() }

fun solve(): Int{
    val frequencies = mutableSetOf<Int>()
    var index = 0
    var frequency: Int = 0

    while (true) {
        for(next in numbers){
            frequency += next
            if(!frequencies.add(frequency)) return frequency
        }
    }
}

fun main() {
    println("Part One: ${numbers.sum()}")
    println("Part Two: ${solve()}")
}