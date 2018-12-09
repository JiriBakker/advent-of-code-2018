package days.day05

import java.util.stream.Collectors

private fun computeReactedPolymerLength(polymerChars: List<Char>): Int {
    val units = polymerChars.toMutableList()

    var index = 0
    while (index < units.size - 1) {
        val firstChar = units[index]
        val secondChar = units[index + 1]
        if (firstChar.isLowerCase() != secondChar.isLowerCase() && firstChar.equals(secondChar, true)) {
            units.removeAt(index + 1)
            units.removeAt(index)
            index = Math.max(index - 1, 0)
        } else {
            index++
        }
    }

    return units.size
}

fun day05a(polymer: String): Int {
    return computeReactedPolymerLength(polymer.toList())
}

fun day05b(polymer: String): Int {
    val alphabet = 'a'..'z'

    val polymerChars = polymer.toList()

    return alphabet
        .toList()
        .parallelStream()
        .map { letter ->
            val polymerWithoutLetter = polymerChars.filter { char -> char.toLowerCase() != letter }
            computeReactedPolymerLength(polymerWithoutLetter)
        }
        .collect(Collectors.toList())
        .min()!!
}