package com.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void shouldGetNextGeneration() {
        Game game = new Game("1, 1\n1, 0\n1, 2");

        assertEquals("0, 1\n1, 1\n2, 1\n", game.getNextGeneration());
    }
}