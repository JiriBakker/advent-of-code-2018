package v2019

import v2019.days.day01.day01a
import v2019.days.day01.day01b
import v2019.days.day02.day02a
import v2019.days.day02.day02b
import v2019.days.day03.day03a
import v2019.days.day03.day03b
import v2019.days.day04.day04a
import v2019.days.day04.day04b
import v2019.days.day05.day05a
import v2019.days.day05.day05b
import v2019.days.day06.day06a
import v2019.days.day06.day06b
import v2019.days.day07.day07a
import v2019.days.day07.day07b
import v2019.days.day08.day08a
import v2019.days.day08.day08b
import v2019.days.day09.day09a
import v2019.days.day09.day09b
import v2019.days.day10.day10a
import v2019.days.day10.day10b
import v2019.days.day11.day11a
import v2019.days.day11.day11b
import v2019.days.day12.day12a
import v2019.days.day12.day12b
import v2019.days.day13.day13a
import v2019.days.day13.day13b
import v2019.days.day14.day14a
import v2019.days.day14.day14b
import v2019.days.day15.day15a
import v2019.days.day15.day15b
import v2019.extra.infiA
import v2019.extra.infiB
import v2019.util.readInputLine
import v2019.util.readInputLines
import kotlin.system.measureTimeMillis

private fun time(func: () -> Unit) {
    val millis = measureTimeMillis { func() }
    println(" (took $millis ms)")
}

fun main() {
    time { print("InfiA: " + infiA(readInputLines("infi"))) }
    time { print("InfiB: " + infiB(readInputLines("infi"))) }
    time { print("Day01a: " + day01a(readInputLines("day01"))) }
    time { print("Day01b: " + day01b(readInputLines("day01"))) }
    time { print("Day02a: " + day02a(readInputLine("day02"))) }
    time { print("Day02b: " + day02b(readInputLine("day02"))) }
    time { print("Day03a: " + day03a(readInputLines("day03"))) }
    time { print("Day03b: " + day03b(readInputLines("day03"))) }
    time { print("Day04a: " + day04a(readInputLine("day04"))) }
    time { print("Day04b: " + day04b(readInputLine("day04"))) }
    time { print("Day05a: " + day05a(readInputLine("day05"))) }
    time { print("Day05b: " + day05b(readInputLine("day05"))) }
    time { print("Day06a: " + day06a(readInputLines("day06"))) }
    time { print("Day06b: " + day06b(readInputLines("day06"))) }
    time { print("Day07a: " + day07a(readInputLine("day07"))) }
    time { print("Day07b: " + day07b(readInputLine("day07"))) }
    time { print("Day08a: " + day08a(readInputLine("day08"))) }
    time { print("Day08b:\n" + day08b(readInputLine("day08"))) }
    time { print("Day09a: " + day09a(readInputLine("day09"))) }
    time { print("Day09b: " + day09b(readInputLine("day09"))) }
    time { print("Day10a: " + day10a(readInputLines("day10"))) }
    time { print("Day10b: " + day10b(readInputLines("day10"))) }
    time { print("Day11a: " + day11a(readInputLine("day11"))) }
    time { print("Day11b:\n" + day11b(readInputLine("day11"))) }
    time { print("Day12a: " + day12a(readInputLines("day12"))) }
    time { print("Day12b: " + day12b(readInputLines("day12"))) }
    time { print("Day13a: " + day13a(readInputLine("day13"))) }
    time { print("Day13b: " + day13b(readInputLine("day13"))) }
    time { print("Day14a: " + day14a(readInputLines("day14"))) }
    time { print("Day14b: " + day14b(readInputLines("day14"))) }
    time { print("Day15a: " + day15a(readInputLine("day15"))) }
    time { print("Day15b: " + day15b(readInputLine("day15"))) }
}
