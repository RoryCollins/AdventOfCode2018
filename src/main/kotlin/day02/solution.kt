package day02

import java.io.File

val lines = File("src/main/kotlin/day02/input.txt")
    .readLines()

fun containsNRepeatedLetter(n: Int, s: String) : Int{
    return if (s.toSet().any { letter -> s.count { it == letter } == n }) 1
        else 0
}

fun wordCorrelation(s1: String, s2: String): String{
    return s1.indices.filter { s1[it] == s2[it]}.joinToString()
}

fun main(){
    val repetitionPairs = lines
        .map{ containsNRepeatedLetter(2, it) to containsNRepeatedLetter(2, it) }

    val indices = lines.indices
    for (i in indices){
         (i .. indices.last).max{ wordCorrelation(lines[i], lines[it]).length }
    }
    println("Part One: ${repetitionPairs.sumOf { it.first } * repetitionPairs.sumOf { it.second }}")
    println("Part Two: ${lines.maxBy { line -> line.maxBy { wordCorrelation(it, ).length } }}")

}