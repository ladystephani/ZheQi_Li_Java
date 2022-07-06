package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    @Test
    public void shouldAttackAndDecreaseOtherPlayerHealth() {
        //arrange
        Warrior warrior1 = new Warrior("John");
        Warrior w2 = new Warrior("Johnson");

        w2.attack(warrior1);
        int expectedHealth = 90;
        assertEquals(expectedHealth, warrior1.getHealth());
    }
}