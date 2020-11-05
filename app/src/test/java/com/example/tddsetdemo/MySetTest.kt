package com.example.tddsetdemo

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MySetTest {
    @Test
    fun firstTest() {
        val mySet = MySet()
        val actualValue = mySet.add("something")
        assertTrue(actualValue)
    }

    @Test
    fun testContains() {
        val mySet = MySet()
        mySet.add("test")
        val actualValue = mySet.contains("test")
        assertTrue(actualValue)
    }

    @Test
    fun testClear() {
        val mySet = MySet()
        mySet.add("test2")
        mySet.clear()
        val actualValue = mySet.contains("test2")
        assertFalse(actualValue)
    }

    @Test
    fun testSize() {
        val mySet = MySet()
        mySet.add("tst")
        mySet.add("tst2")
        val actualVal = mySet.size
        assertEquals(2,actualVal)
    }

    @Test
    fun testAddAll() {
        val mySet = MySet()
        mySet.add("jioji2")
        var actualValue = mySet.addAll(arrayOf("jioji", "jioji3"))
        assertTrue(actualValue)
    }

    @Test
    fun testIsEmpty() {
        val mySet = MySet()
        var actualValue = mySet.isEmpty()
        assertTrue(actualValue)
    }
    @Test
    fun testIsEmptyFail() {
        val mySet = MySet()
        mySet.add("some test")
        var actualValue = mySet.isEmpty()
        assertFalse(actualValue)
    }

    @Test
    fun testRemove() {
        val mySet = MySet()
        mySet.add("some test")
        val actualValue = mySet.remove("some test")
        assertTrue(actualValue)
    }

    @Test
    fun testRemove2() {

    }

}