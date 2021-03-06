package v2015

import org.junit.Assert.assertEquals
import org.junit.Test
import v2015.days.day22.day22a
import v2015.days.day22.day22b
import util.readInputLines

class Day22aTests {
    @Test fun testActualInput() {
        assertEquals(1824, day22a(readInputLines("day22", 2015)))
    }
}

class Day22bTests {
    @Test fun testActualInput() {
        assertEquals(1937, day22b(readInputLines("day22", 2015)))
    }
}