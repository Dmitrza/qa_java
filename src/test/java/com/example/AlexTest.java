package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex("Самец");
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex("Самец");
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex("Самец");
        int expected = 0;
        assertEquals(expected, alex.getKittens());
    }

}
