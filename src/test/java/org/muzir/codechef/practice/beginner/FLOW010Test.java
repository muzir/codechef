package org.muzir.codechef.practice.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FLOW010Test {

    @Test
    public void test() {
        assertEquals("Destroyer", FLOW010.writeShip("d"));
        assertEquals("Destroyer", FLOW010.writeShip("D"));
        assertEquals("Cruiser", FLOW010.writeShip("c"));
        assertEquals("Cruiser", FLOW010.writeShip("C"));
        assertEquals("Frigate", FLOW010.writeShip("f"));
        assertEquals("Frigate", FLOW010.writeShip("F"));
        assertEquals("BattleShip", FLOW010.writeShip("b"));
        assertEquals("BattleShip", FLOW010.writeShip("B"));
    }
}
