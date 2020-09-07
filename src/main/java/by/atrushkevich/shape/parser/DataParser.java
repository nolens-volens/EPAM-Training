package by.atrushkevich.shape.parser;

import by.atrushkevich.shape.validator.DataValidator;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class DataParser {

    private static final String REGEX_DELIMITER = "\\s+";

    public List<Double[]> parseToDoubleArraysList(List<String> dataLines) {
        return dataLines.stream()
                .filter(DataValidator::isValidatedLine)
                .map(this::parseToDoubleArray)
                .collect(toList());
    }

    private Double[] parseToDoubleArray(String line) {
        return Arrays.stream(line.trim().split(REGEX_DELIMITER))
                .map(Double::parseDouble)
                .toArray(Double[]::new);
    }
}


