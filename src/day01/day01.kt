package day01

import readInput

fun main() {

    fun splitFileIntoElves(file: List<String>): List<Int> {
        val elves: MutableList<Int> = mutableListOf()
        var currentElf = 0
        for (line in file) {
            if (line == "") {
                elves.add(currentElf)
                currentElf = 0
            } else {
                currentElf += line.toInt()
            }
        }
        elves.add(currentElf)
        elves.sortDescending()
        return elves
    }

    fun part1(input: List<String>): Int {
        val elves: List<Int> = splitFileIntoElves(input)
        return elves[0]
    }

    fun part2(input: List<String>): Int {
        val elves: List<Int> = splitFileIntoElves(input)
        return elves.subList(0, 3).sum()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("day01", "_test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInput("day01")
    println("Part 1: ${part1(input)}")
    println("Part 2: ${part2(input)}")
}
