package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        assertEquals(expected, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception{
        Lion lion= new Lion(feline);
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, lion.getFood());
    }

}
