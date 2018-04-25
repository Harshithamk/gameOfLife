package com.model;

import java.util.Set;

public class Game {
    private Board board;

    public Game(String initialStateString) {
        board = new Board(this.getCoordinatesFromInput(initialStateString));
    }


    private Set<Coordinate> getCoordinatesFromInput(String initialStateString) {
        return new InputToCoordinates(initialStateString).splitAndCreateCoordinates();
    }

    public String getNextGeneration() {
        return board.getNextGeneration();
    }
}
