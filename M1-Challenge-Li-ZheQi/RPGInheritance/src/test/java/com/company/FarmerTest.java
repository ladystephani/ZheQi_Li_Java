package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
    @Test
    public void shouldAttackAndDecreaseOtherPlayerHealth() {
        //arrange
        Farmer farmer1 = new Farmer("John",false, false);
        Farmer farmer2 = new Farmer("Johnson",false, false);

        farmer1.attack(farmer2);
        int expectedHealth = 99;
        assertEquals(expectedHealth, farmer2.getHealth());
    }
}