package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
    //arrange
    Constable constable1;
    Constable constable2;

    @Before
    public void SetUp() {
        constable1 = new Constable("John","NYC");
        constable2 = new Constable("Johnson","NYC");
    }
    @Test
    public void shouldAttackAndDecreaseOtherPlayerHealth() {

        constable2.attack(constable1);
        int expectedHealth = 95;
        assertEquals(expectedHealth, constable1.getHealth());
    }

    @Test
    public void shouldArrestOtherPlayer() {

        constable2.arrest(constable1);

        assertEquals(true, constable1.arrested);
    }
}