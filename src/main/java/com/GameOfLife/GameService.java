package com.GameOfLife;

import com.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private Game game;


    public String getNextGeneration(String initialState) {
        game = new Game(initialState);
        return game.getNextGeneration();
    }
}
