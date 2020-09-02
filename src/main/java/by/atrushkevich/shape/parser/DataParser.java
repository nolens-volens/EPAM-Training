package by.atrushkevich.shape.parser;

import by.atrushkevich.shape.validator.DataValidator;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class DataParser {

    private static final String REGEX_DELIMITER = "\\s+";

    public List<Double[]> parseToDouble(List<String> dataLines) {
        return dataLines.stream()
                .filter(DataValidator::isValidatedLine)
                .map(this::parseToDoubles)
                .collect(toList());
    }

    private Double[] parseToDoubles(String line) {
        return Arrays.stream(line.trim().split(REGEX_DELIMITER))
                .map(Double::parseDouble)
                .toArray(Double[]::new);
    }

//    public List<Double[]> parseToDouble(List<String> dataLines) {
//        List<String> validatedLines = new ArrayList<>();
//        for (String line : dataLines) {
//            if (isValidatedLine(line)) {
//                validatedLines.add(line);
//            }
//        }
//
//        Double[] arrayDoubleDataPoints = new Double[8];
//        ArrayList<Double[]> listArrayDoubleDataPoints = new ArrayList<>();
//        String[] linesArray;
//        for (String line : validatedLines) {
//            for (int i = 0; i < validatedLines.size(); i++) {
//                linesArray = line.trim().split(REGEX_DELIMITER);
//                arrayDoubleDataPoints[i] = Double.parseDouble(String.valueOf(linesArray));
//                listArrayDoubleDataPoints.add(i, arrayDoubleDataPoints);
//            }
//        }
//        return listArrayDoubleDataPoints;
//    }
}

//    public List<String[]> parseToDouble(List<String> dataLines) {
//        List<String> validatedLines = new ArrayList<>();
//
//        for (String line : dataLines) {
//            if (isValidatedLine(line)) {
//                validatedLines.add(line);
//            }
//        }
//
//       List<String[]> listValidatedString = new ArrayList<>();
//        for (String line : validatedLines) {
//            listValidatedString.add(line.trim().split(REGEX_DELIMITER));
//        }
//        return listValidatedString;
//    }

