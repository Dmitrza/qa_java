package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;

    public LionParameterizedTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getLionSex() {
        return new Object[][] {
                {"Самец"},
                {"Самка"},
                {"Кто-то"},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception{
        Lion lion = new Lion(sex); //добавить параметризацию
        if (sex.equals("Самец")) {
            assertTrue(lion.doesHaveMane());
        } else if(sex.equals("Самка")) {
            assertFalse(lion.doesHaveMane());
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
}
