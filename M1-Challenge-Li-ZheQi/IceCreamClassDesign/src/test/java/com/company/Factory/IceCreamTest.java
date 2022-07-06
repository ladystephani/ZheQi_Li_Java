package com.company.Factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    IceCream iceCream;
    @Before

    public void SetUp() {iceCream = new IceCream();}

    @Test
    public void shouldReturnCreation() {
        assertEquals("An ice cream has been created on the stream line for flavor: vanilla in size 12oz", iceCream.creation("vanilla"));

        assertEquals("An ice cream has been created on the stream line for flavor: chocolate in size 8oz", iceCream.creation("chocolate"));
    }

    @Test
    public void sendToPack() {
        assertEquals("Ice cream has been sent to the packing department", iceCream.sendToPack());
    }

    @Test
    public void checkPacked() {
//        assertEquals("Not packed yet.", iceCream.checkPacked());

//        iceCream.packed=true;
        assertEquals("Ice cream has been packed", iceCream.packed());
    }
}