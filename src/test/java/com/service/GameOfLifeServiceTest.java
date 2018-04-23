package com.service;

import com.model.Game;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GameOfLifeServiceTest {

    @Mock
    private Game game;

    private GameService gameService;

    @Before
    public void setUp() throws Exception {
        gameService = new GameService();
    }

    @Ignore
    @Test
    public void shouldGetNextGeneration() {
        when(game.getNextGeneration()).thenReturn("0, 1\n1, 1\n2, 1\n");

        assertEquals("0, 1\n1, 1\n2, 1\n", gameService.getNextGeneration("1, 1\n1, 0\n1, 2"));
    }
}