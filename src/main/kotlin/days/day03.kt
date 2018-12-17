package days.day03

import forEachCombinationPair

private class Fabric(private val minX: Int, maxX: Int, private val minY: Int, maxY: Int) {
    private val inches: Array<Array<Int>> = Array(maxX - minX + 1) { Array(maxY - minY + 1) { 0 } }

    var overlapCount = 0
        private set

    fun applyClaim(claim: Claim) {
        for (x in claim.x1 until claim.x2) {
            for (y in claim.y1 until claim.y2) {
                val xNormalized = x - minX
                val yNormalized = y - minY

                val curValue = inches[xNormalized][yNormalized]
                if (curValue == 1) {
                    overlapCount++
                }
                inches[xNormalized][yNormalized]++
            }
        }
    }
}

private class Claim private constructor(val id: Int, val x1: Int, val y1: Int, width: Int, height: Int) {
    val x2 = x1 + width
    val y2 = y1 + height

    companion object {
        fun parse(claimLine: String): Claim {
            val atIndex = claimLine.indexOf('@')
            val colonIndex = claimLine.indexOf(':')

            val id = claimLine.substring(1, atIndex).trim().toInt()
            val (x, y) = claimLine.substring(atIndex + 1, colonIndex).split(',').map { it.trim().toInt() }
            val (width, height) = claimLine.substring(colonIndex + 1).split('x').map { it.trim().toInt() }
            return Claim(id, x, y, width, height)
        }
    }

    fun overlapsWith(other: Claim): Boolean {
        val xOverlap = Math.max(0, Math.min(this.x2, other.x2) - Math.max(this.x1, other.x1))
        val yOverlap = Math.max(0, Math.min(this.y2, other.y2) - Math.max(this.y1, other.y1))
        return xOverlap != 0 && yOverlap != 0
    }
}

private fun getGridBounds(claims: List<Claim>): List<Int> {
    val minX = claims.map { it.x1 }.min()!!
    val maxX = claims.map { it.x2 }.max()!!
    val minY = claims.map { it.y1 }.min()!!
    val maxY = claims.map { it.y2 }.max()!!

    return listOf(minX, maxX, minY, maxY)
}

fun day03a(claimLines: List<String>): Int {
    val claims = claimLines.map { Claim.parse(it) }
    val (minX, maxX, minY, maxY) = getGridBounds(claims)
    val fabric = Fabric(minX, maxX, minY, maxY)

    claims.forEach { fabric.applyClaim(it) }

    return fabric.overlapCount
}

fun day03b(claimLines: List<String>): Int? {
    val claims = claimLines.map { Claim.parse(it) }

    val idsWithoutOverlap: MutableSet<Int> = claims.map { it.id }.toMutableSet()

    claims.forEachCombinationPair {
        if (it.first.overlapsWith(it.second)) {
            idsWithoutOverlap.remove(it.first.id)
            idsWithoutOverlap.remove(it.second.id)
        }
    }

    return idsWithoutOverlap.singleOrNull()
}