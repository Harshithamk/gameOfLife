package com.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void shouldInitializeBoardWithGivenCellState() {
        Coordinate coordinate = new Coordinate(1, 1);
        Coordinate coordinate1 = new Coordinate(1, 2);
        Coordinate coordinate2 = new Coordinate(2, 1);
        Coordinate coordinate3 = new Coordinate(2, 2);

        Board board = new Board(new HashSet<>(Arrays.asList(coordinate, coordinate1, coordinate2, coordinate3)));

        assertEquals("2,1\n1,1\n2,2\n1,2\n", board.toString());
    }

    @Test
    public void shouldGetNextGeneration() {
        Coordinate coordinate = new Coordinate(1, 1);
        Coordinate coordinate1 = new Coordinate(1, 0);
        Coordinate coordinate2 = new Coordinate(1, 2);

        Board board = new Board(new HashSet<>(Arrays.asList(coordinate, coordinate1, coordinate2)));

        assertEquals("2,1\n1,1\n0,1\n", board.getNextGeneration());
    }

    @Test
    public void shouldCheckForBlinkerPattern() {
        Coordinate coordinate = new Coordinate(2, 1);
        Coordinate coordinate1 = new Coordinate(1, 1);
        Coordinate coordinate2 = new Coordinate(0, 1);

        Board board = new Board(new HashSet<>(Arrays.asList(coordinate, coordinate1, coordinate2)));

        assertEquals("1,0\n1,1\n1,2\n", board.getNextGeneration());
    }

    @Test
    public void shouldCheckForStillPattern() {
        Coordinate coordinate = new Coordinate(1, 1);
        Coordinate coordinate1 = new Coordinate(1, 2);
        Coordinate coordinate2 = new Coordinate(2, 1);
        Coordinate coordinate3 = new Coordinate(2, 2);

        Board board = new Board(new HashSet<>(Arrays.asList(coordinate, coordinate1, coordinate2,coordinate3)));

        assertEquals("2,1\n1,1\n2,2\n1,2\n", board.getNextGeneration());
    }



    @Test
    public void getBoardStatus() {
        Coordinate coordinate = new Coordinate(1, 1);
        Coordinate coordinate1 = new Coordinate(1, 3);
        Coordinate coordinate2 = new Coordinate(2, 1);

        Board board = new Board(new HashSet<>(Arrays.asList(coordinate, coordinate1, coordinate2)));


        assertEquals("2,1\n1,1\n1,3\n", board.toString());
    }


//
//    @Test
//    public void getAnotherBoardStatus() {
//        Coordinate coordinate = new Coordinate(1, 1);
//        Coordinate coordinate1 = new Coordinate(2, 3);
//
//        Board board = new Board(4, 4, Arrays.asList(coordinate, coordinate1));
//
//        assertEquals("1, 1\n2, 3\n", board.toString());
//    }
//
//    @Test
//    public void get1AsNeighborsAliveCount() {
//        Coordinate coordinate = new Coordinate(2, 2);
//        Coordinate coordinate1 = new Coordinate(2, 3);
//
//        Board board = new Board(4, 4, Arrays.asList(coordinate, coordinate1));
//
//        Cell cell1 = new Cell(new Coordinate(2, 2), Status.ALIVE);
//
//
//        assertEquals(1, board.neighboursAliveCount(cell1));
//    }
//
//    @Test
//    public void get2AsNeighborsAliveCount() {
//        Coordinate coordinate = new Coordinate(2, 2);
//        Coordinate coordinate1 = new Coordinate(2, 3);
//        Coordinate coordinate2 = new Coordinate(2, 1);
//
//        Cell cell1 = new Cell(new Coordinate(2, 2), Status.ALIVE);
//
//
//        Board board = new Board(4, 4, Arrays.asList(coordinate, coordinate1, coordinate2));
//
//        assertEquals(2, board.neighboursAliveCount(cell1));
//    }
//
//
//    @Test
//    public void get3AsNeighborsAliveCount() {
//        Coordinate coordinate = new Coordinate(1, 1);
//        Coordinate coordinate1 = new Coordinate(1, 2);
//        Coordinate coordinate2 = new Coordinate(2, 1);
//        Coordinate coordinate3 = new Coordinate(2, 2);
//
//        Cell cell = new Cell(new Coordinate(2, 2), Status.ALIVE);
//
//
//        Board board = new Board(4, 4, Arrays.asList(coordinate, coordinate1, coordinate2, coordinate3));
//
//        assertEquals(3, board.neighboursAliveCount(cell));
//    }
//
//    @Test
//    public void get1AsNeighborsAliveCountOfCell() {
//        Coordinate coordinate = new Coordinate(1, 1);
//        Coordinate coordinate1 = new Coordinate(1, 0);
//        Coordinate coordinate2 = new Coordinate(1, 2);
//
//        Board board = new Board(new HashSet<>(Arrays.asList(coordinate, coordinate1,coordinate2)));
//
//        assertEquals(2, board.getNeighbourAliveCount(coordinate));
//    }


}