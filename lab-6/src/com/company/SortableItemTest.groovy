package com.company

class SortableItemTest extends groovy.util.GroovyTestCase {
    void testCountDigits() {
        int Number1 = 123;
        int Number2 = 345;
        int Number3 = 1;
        int result1 = SortableItem.sumDigits(Number1);
        assertEquals(6, result1);
        int result2 = SortableItem.sumDigits(Number2);
        assertEquals(12, result2);
        int result3 = SortableItem.sumDigits(Number3);
        assertEquals(1, result3);
    }
}
