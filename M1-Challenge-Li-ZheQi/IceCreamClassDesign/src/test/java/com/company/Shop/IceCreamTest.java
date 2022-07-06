package com.company.Shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    IceCream iceCream;

    @Before
    public void SetUp() {iceCream = new IceCream();}

    @Test
    public void shouldCalculateTotal() {
        assertEquals(10, iceCream.calculateTotal(2), 0.01);
    }

    @Test
    public void shouldReturnOrderPlacedString() {
        assertEquals("A new order of ice cream has been placed and is being prepared for flavor: vanilla", iceCream.orderPlaced("vanilla"));
    }

    @Test
    public void shouldReturnServedString() {
        assertEquals("The latest order is ready to be picked up for flavor: vanilla", iceCream.served("vanilla"));
    }

}