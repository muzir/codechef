package org.muzir.interview.klarna;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmoothieTest {

    @Test
    public void throwIllegalArgumentException_IfOrderIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Smoothie.ingredients(null);
        });

    }

    @Test
    public void throwIllegalArgumentExceptionIfOrderIsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Smoothie.ingredients("");
        });
    }


    @Test
    public void classicSmoothie() {
        assertEquals("banana,honey,mango,peach,pineapple,strawberry",
                Smoothie.ingredients("Classic"));
    }

    @Test
    public void classicSmoothieAllergicToStrawberry() {
        assertEquals("banana,honey,mango,peach,pineapple",
                Smoothie.ingredients("Classic,-strawberry"));
    }

    @Test
    public void greenieSmoothieAllergicToGreenAppleAndLimeAndAvocadoAndAppleJuice() {
        assertEquals("ice,spinach",
                Smoothie.ingredients("Greenie,-green apple,-lime,-avocado,-apple juice"));
    }

    @Test
    public void throwIllegalArgumentException_IfOrderContainsAdditionalIngredients() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Smoothie.ingredients("Classic,chocolate");
        });
    }
}
