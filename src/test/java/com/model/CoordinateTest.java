package com.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.*;

public class CoordinateTest {

    @Test
    public void shouldGetNeighbouringCoordinates() {
        Coordinate coordinate = new Coordinate(1, 1);

        Set<Coordinate> expectedNeighbours = new HashSet<>(Arrays.asList(new Coordinate(2, 2),
                new Coordinate(1, 2),
                new Coordinate(0, 2),
                new Coordinate(0, 1),
                new Coordinate(0, 0),
                new Coordinate(1, 0),
                new Coordinate(2, 0),
                new Coordinate(2, 1)
        ));

        Assert.assertThat("Neighbours without order",
                expectedNeighbours, containsInAnyOrder(coordinate.getNeighbours().toArray()));

    }

}