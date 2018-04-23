package com.model;

import java.util.ArrayList;
import java.util.List;

class InputToCoordinates {
    private String originalString;

    InputToCoordinates(String originalString) {
        this.originalString = originalString;
    }


    List<Coordinate> splitAndCreateCoordinates(){
        List<Coordinate> coordinates = new ArrayList<>();
        String[] splitByNewLine = originalString.split("\\n");
        for (String aSplitByNewLine : splitByNewLine) {
            String[] coordinateArray = aSplitByNewLine.replaceAll("\\s", "").split(",");
            Coordinate coordinate = new Coordinate(Integer.parseInt(coordinateArray[0]), Integer.parseInt(coordinateArray[1]));
            coordinates.add(coordinate);
        }
        return coordinates;
    }
}
