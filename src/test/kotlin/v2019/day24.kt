package v2019

import org.junit.Assert.assertEquals
import org.junit.Test
import v2019.days.day24.day24a
import v2019.days.day24.day24b
import v2019.util.readInputLines

class Day24aTests {
    @Test fun testExampleInput1() {
        assertEquals(0, day24a(listOf("")))
    }

    @Test fun testActualInput() {
        assertEquals(0, day24a(readInputLines("day24")))
    }
}

class Day24bTests {
    @Test fun testExampleInput1() {
        assertEquals(0, day24b(listOf("")))
    }

    @Test fun testActualInput() {
        assertEquals(0, day24b(readInputLines("day24")))
    }
}