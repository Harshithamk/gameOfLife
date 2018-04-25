package com.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class InputToCoordinates {
    private String originalString;

    InputToCoordinates(String originalString) {
        this.originalString = originalString;
    }


    Set<Coordinate> splitAndCreateCoordinates() {
        Set<Coordinate> coordinates = new HashSet<>();
        String[] splitByNewLine = originalString.split("\\n");
        for (String aSplitByNewLine : splitByNewLine) {
            String[] coordinateArray = aSplitByNewLine.replaceAll("\\s", "").split(",");
            Coordinate coordinate = new Coordinate(Integer.parseInt(coordinateArray[0]), Integer.parseInt(coordinateArray[1]));
            coordinates.add(coordinate);
        }
        return coordinates;
    }
}
