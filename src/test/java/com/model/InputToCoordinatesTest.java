package com.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class InputToCoordinatesTest {
    InputToCoordinates inputToCoordinates;

    @Test
    public void shouldReturnCoordinatesList() {
        Coordinate coordinate = new Coordinate(1, 1);
        Coordinate coordinate1 = new Coordinate(1, 3);
        Coordinate coordinate2 = new Coordinate(2, 1);
        List<Coordinate> expectedArray = Arrays.asList(coordinate, coordinate1, coordinate2);

        inputToCoordinates = new InputToCoordinates("1, 1\n1, 3\n2, 1\n");

        assertEquals(expectedArray, inputToCoordinates.splitAndCreateCoordinates());
    }
}