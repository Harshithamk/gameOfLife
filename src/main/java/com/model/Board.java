package com.model;

import java.util.List;

public class Board {
    private Cell[][] grid;
    private int row;
    private int column;

    Board(int row, int column, List<Coordinate> coordinates) {
        this.row = row;
        this.column = column;
        this.grid = new Cell[this.row][this.column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (Coordinate coordinate : coordinates) {
                    if (coordinate.x == i && coordinate.y == j) {
                        grid[i][j] = new Cell(new Coordinate(i, j), Status.ALIVE);
                    }
                }
                if (grid[i][j] == null) {
                    grid[i][j] = new Cell(new Coordinate(i, j), Status.DEAD);

                }
            }
        }

    }


    String getNextGeneration() {
        Cell[][] nextGenerationGrid = new Cell[this.row][this.column];

        for (int row = 0; row < this.row; row++) {
            for (int column = 0; column < this.column; column++) {
                int neighboursCount = neighboursAliveCount(grid[row][column]);
                if (neighboursCount < 2) {
                    nextGenerationGrid[row][column] = new Cell(new Coordinate(row, column), Status.DEAD);
                } else if (neighboursCount > 3) {
                    nextGenerationGrid[row][column] = new Cell(new Coordinate(row, column), Status.DEAD);
                } else if (neighboursCount == 3) {
                    nextGenerationGrid[row][column] = new Cell(new Coordinate(row, column), Status.ALIVE);
                } else { //==2
                    nextGenerationGrid[row][column] = new Cell(new Coordinate(row, column), this.grid[row][column].status);
                }

            }
        }

        this.grid = nextGenerationGrid;
        return this.toString();
    }


    int neighboursAliveCount(Cell cell) {
        int count = 0;

        if (cell.coordinate.x < (this.row - 1)) {
            if (this.grid[cell.coordinate.x + 1][cell.coordinate.y].status == Status.ALIVE)
                count++;
            if (cell.coordinate.y < (this.column - 1)) {
                if (this.grid[cell.coordinate.x + 1][cell.coordinate.y + 1].status == Status.ALIVE)
                    count++;
            }
            if (cell.coordinate.y > 0) {
                if (this.grid[cell.coordinate.x + 1][cell.coordinate.y - 1].status == Status.ALIVE)
                    count++;
            }
        }

        if (cell.coordinate.y < (this.column - 1)) {
            if (this.grid[cell.coordinate.x][cell.coordinate.y + 1].status == Status.ALIVE)
                count++;
        }
        if (cell.coordinate.y > 0) {
            if (this.grid[cell.coordinate.x][cell.coordinate.y - 1].status == Status.ALIVE)
                count++;
        }

        if (cell.coordinate.x > 0) {
            if (this.grid[cell.coordinate.x - 1][cell.coordinate.y].status == Status.ALIVE)
                count++;

            if (cell.coordinate.y < (this.column - 1)) {
                if (this.grid[cell.coordinate.x - 1][cell.coordinate.y + 1].status == Status.ALIVE)
                    count++;
            }
            if (cell.coordinate.y > 0) {
                if (this.grid[cell.coordinate.x - 1][cell.coordinate.y - 1].status == Status.ALIVE)
                    count++;
            }

        }


//        if(this.grid[cell.coordinate.x+1][cell.coordinate.y].status == Status.ALIVE)
//            count++;
//
//        if(this.grid[cell.coordinate.x+1][cell.coordinate.y+1].status == Status.ALIVE)
//            count++;
//        if(this.grid[cell.coordinate.x+1][cell.coordinate.y-1].status == Status.ALIVE)
//            count++;
//
//
//        if(this.grid[cell.coordinate.x][cell.coordinate.y+1].status == Status.ALIVE)
//            count++;
//        if(this.grid[cell.coordinate.x][cell.coordinate.y-1].status == Status.ALIVE)
//            count++;
//
//        if(this.grid[cell.coordinate.x-1][cell.coordinate.y+1].status == Status.ALIVE)
//            count++;
//        if(this.grid[cell.coordinate.x-1][cell.coordinate.y].status == Status.ALIVE)
//            count++;
//        if(this.grid[cell.coordinate.x-1][cell.coordinate.y-1].status == Status.ALIVE)
//            count++;

        return count;
    }


    @Override
    public String toString() {
        StringBuilder boardState = new StringBuilder();
        for (int row = 0; row < this.row; row++) {
            for (int column = 0; column < this.column; column++) {
                if (this.grid[row][column].status == Status.ALIVE) {
                    boardState.append(row).append(", ").append(column).append("\n");
                }
            }
        }
        return boardState.toString();
    }
}
