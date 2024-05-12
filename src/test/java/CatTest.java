package com.example;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline mockFeline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(mockFeline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(mockFeline);
        List<String> foodList = Arrays.asList("мясо1", "мясо2");
        when(mockFeline.eatMeat()).thenReturn(foodList);
        List<String> resultFoodList = cat.getFood();
        assertEquals(foodList, resultFoodList);
    }
}
