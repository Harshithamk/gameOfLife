package com.model;

import java.util.HashSet;
import java.util.Set;

public class Board {
    private Set<Coordinate> aliveCells;
    private Set<Coordinate> cellsGettingAffectedInNextGeneration;


    Board(Set<Coordinate> aliveCells) {
        this.aliveCells = aliveCells;
        cellsGettingAffectedInNextGeneration = new HashSet<>();
        this.getCellsGettingAffected();
    }

    private void getCellsGettingAffected() {
        for (Coordinate coordinate : aliveCells) {
            cellsGettingAffectedInNextGeneration.addAll(coordinate.getNeighbours());
        }
        for (Coordinate coordinate : aliveCells) {
            cellsGettingAffectedInNextGeneration.remove(coordinate);
        }
    }


    private int getNeighbourAliveCount(Coordinate coordinate) {
        int count = 0;
        Set<Coordinate> neighbours = coordinate.getNeighbours();
        for (Coordinate neighbour : neighbours) {
            if (aliveCells.contains(neighbour))
                count++;
        }
        return count;
    }

    String getNextGeneration() {
        Set<Coordinate> nextGeneration = new HashSet<>();
        int neighboursCount;

        for (Coordinate coordinate : aliveCells) {
            neighboursCount = getNeighbourAliveCount(coordinate);
            if (neighboursCount == 2 || neighboursCount == 3) {
                nextGeneration.add(coordinate);
            }

        }
        for (Coordinate coordinate : cellsGettingAffectedInNextGeneration) {
            neighboursCount = getNeighbourAliveCount(coordinate);
            if (neighboursCount == 3) {
                nextGeneration.add(coordinate);
            }
        }
        aliveCells = nextGeneration;
        return this.toString();
    }

    @Override
    public String toString() {
        StringBuilder liveCells = new StringBuilder();
        for (Coordinate coordinate : aliveCells) {
            liveCells.append(coordinate);

        }
        return liveCells.toString();
    }
}
