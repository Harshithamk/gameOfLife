package com.model;

import java.util.List;

public class Game {
    private Board board;

    public Game(String initialStateString) {
        board = new Board(5, 5, this.getCoordinatesFromInput(initialStateString));
    }


    private List<Coordinate> getCoordinatesFromInput(String initialStateString){
        return new InputToCoordinates(initialStateString).splitAndCreateCoordinates();
    }

    public String getNextGeneration(){
        return board.getNextGeneration();
    }
}
