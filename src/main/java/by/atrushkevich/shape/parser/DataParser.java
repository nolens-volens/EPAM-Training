package by.atrushkevich.shape.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataParser {

    private static final String REGEX_DELIMITER = "\\s+";

    public List<Double> parseToDouble(List<String> validatedList) {
        List<Double> coordinatesForPointsList = new ArrayList<>();
        List<String> strings;
        for (String coordinatesOfPoints : validatedList) {
            strings = Arrays.asList(coordinatesOfPoints.split(REGEX_DELIMITER));
            for (String string : strings) {
                coordinatesForPointsList.add
                        (Double.parseDouble(string.replace(",", ".")));
            }
        }
        return coordinatesForPointsList;
    }
}
