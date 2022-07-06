package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Address shippingAddress;
    Address billingAddress;
    Customer customer;

    @Before
    public void SetUp() {
        shippingAddress = new Address("Main St.", "n/a", "New York", "NY", 20511);
        billingAddress = new Address("Broadway", "n/a", "Seattle", "WA", 20511);
        customer = new Customer("Johnson", "Rock", "john@example.com", 12345678, billingAddress, shippingAddress, true);
    }


    @Test
    public void shouldGetBillingAddressInfo() {
        assertEquals("Broadway", customer.getBillingAddress().getStreet1());
        assertEquals("n/a", customer.getBillingAddress().getStreet2());
        assertEquals("Seattle", customer.getBillingAddress().getCity());
        assertEquals("WA", customer.getBillingAddress().getState());
        assertEquals(20511, customer.getBillingAddress().getZipcode());
    }
    @Test
    public void shouldGetShippingAddressInfo() {
        assertEquals("Main St.", customer.getShippingAddress().getStreet1());
        assertEquals("n/a", customer.getShippingAddress().getStreet2());
        assertEquals("New York", customer.getShippingAddress().getCity());
        assertEquals("NY", customer.getShippingAddress().getState());
        assertEquals(20511, customer.getShippingAddress().getZipcode());
    }

    @Test
    public void shouldReturnBooleanOfRewardsMemberOrNot() {
        assertEquals(true, customer.isRewardsMember());
    }

//    @Test
//    public void shouldGetFirstName() {
//        assertEquals("Johnson", customer.getFirstName());
//    }
//
//    @Test
//    public void shouldGetLastName() {
//        assertEquals("Rock", customer.getLastName());
//    }
//
//    @Test
//    public void shouldGetEmail() {
//        assertEquals("john@example.com", customer.getEmailAddress());
//    }
//
//    @Test
//    public void shouldGetPhoneNumber() {
//        assertEquals(12345678, customer.getPhoneNumber());
//    }

}