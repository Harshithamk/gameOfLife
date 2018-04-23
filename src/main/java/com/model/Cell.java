package com.model;

public class Cell {
    Coordinate coordinate;
    Status status;

    Cell(Coordinate coordinate, Status status) {
        this.coordinate = coordinate;
        this.status = status;
    }

    void setStatus(Status status){
        this.status = status;
    }

    boolean isAlive(){
        return this.status == Status.ALIVE;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "coordinate=" + coordinate +
                ", status=" + status +
                '}';
    }
}
