package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void getKittensWithoutArgumentTest() {
        Feline feline = new Feline();
        feline.getKittens(1);
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithArgumentTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens(1));
    }

}
