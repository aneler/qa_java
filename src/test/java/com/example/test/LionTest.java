package com.example.test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import com.example.Feline;
import com.example.Lion;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline felineMock;

    @Test
    public void getKittensTest() {
        try {
            Lion lion = new Lion("Самец", felineMock);
            when(felineMock.getKittens()).thenReturn(3);
            int kittensCount = lion.getKittens();
            assertEquals(3, kittensCount);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        when(felineMock.getFood("Хищник")).thenReturn(Arrays.asList("антилопа", "кабан"));
        List<String> foodList = lion.getFood();
        assertEquals(Arrays.asList("антилопа", "кабан"), foodList);
    }
}
