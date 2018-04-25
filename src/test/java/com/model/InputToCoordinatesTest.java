package com.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class InputToCoordinatesTest {
    InputToCoordinates inputToCoordinates;

    @Test
    public void shouldReturn3Coordinates() {

        inputToCoordinates = new InputToCoordinates("1,3\n1,1\n2,1\n");
        Set<Coordinate> expectedCoordinates = inputToCoordinates.splitAndCreateCoordinates();


        assertEquals(expectedCoordinates.size(), 3);
    }
    @Test
    public void shouldReturnCoordinatesList() {

        inputToCoordinates = new InputToCoordinates("1,3\n1,1\n2,1\n");
        Coordinate coordinate = new Coordinate(1, 3);

        Set<Coordinate> expectedCoordinates = inputToCoordinates.splitAndCreateCoordinates();


        assertTrue(expectedCoordinates.contains(coordinate));
    }



}