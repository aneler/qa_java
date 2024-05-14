package com.example.test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import com.example.Feline;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();

        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");

        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithCountTest() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}
