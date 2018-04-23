package com.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {

    @Test
    public void shouldSetStateOfCellToDead() {
        Cell cell = new Cell(new Coordinate(1,1),Status.ALIVE);

        cell.setStatus(Status.DEAD);

        assertFalse( cell.isAlive());
    }

    @Test
    public void shouldSetStateOfCellToAlive() {
        Cell cell = new Cell(new Coordinate(1,1),Status.DEAD);

        cell.setStatus(Status.ALIVE);

        assertTrue(cell.isAlive());
    }

    @Test
    public void returnTrueForAliveCell() {
        Cell cell = new Cell(new Coordinate(1,1),Status.ALIVE);

        assertTrue(cell.isAlive());

    }
    @Test
    public void returnFalseForAliveCell() {
        Cell cell = new Cell(new Coordinate(1,1),Status.DEAD);

        assertFalse(cell.isAlive());

    }

}