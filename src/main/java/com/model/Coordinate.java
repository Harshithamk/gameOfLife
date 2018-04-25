package com.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Coordinate {
    private int x;
    private int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Set<Coordinate> getNeighbours() {
        Set<Coordinate> neighbours = new HashSet<Coordinate>();
        neighbours.add(new Coordinate(x + 1, y + 1));
        neighbours.add(new Coordinate(x + 1, y));
        neighbours.add(new Coordinate(x + 1, y - 1));
        neighbours.add(new Coordinate(x, y + 1));
        neighbours.add(new Coordinate(x, y - 1));
        neighbours.add(new Coordinate(x - 1, y + 1));
        neighbours.add(new Coordinate(x - 1, y));
        neighbours.add(new Coordinate(x - 1, y - 1));

        return neighbours;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return x + "," + y + "\n";
    }

}
