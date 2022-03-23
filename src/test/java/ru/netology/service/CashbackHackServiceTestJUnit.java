package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTestJUnit {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void test1() {
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals( expected,actual);
    }

   @Test
    public void testMore1000() {
        int amount = 10000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void testEquals1000() {
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }


}
