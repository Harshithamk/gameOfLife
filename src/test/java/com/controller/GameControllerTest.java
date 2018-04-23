package com.controller;

import com.service.GameService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameControllerTest {
    @Mock
    private GameService gameService;

    private GameController gameController;

    @Before
    public void setUp() throws Exception {
        gameController = new GameController(gameService);
    }

    @Test
    public void shouldReturnNextGeneration() {
        when(gameService.getNextGeneration("1, 1\n1, 0\n1, 2")).thenReturn("0, 1\n1, 1\n2, 1\n");

        assertEquals("0, 1\n1, 1\n2, 1\n", gameController.getNextGeneration("1, 1\n1, 0\n1, 2"));

    }
}