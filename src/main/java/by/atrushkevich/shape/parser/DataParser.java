package by.atrushkevich.shape.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static by.atrushkevich.shape.validator.DataValidator.isValidatedLine;

public class DataParser {

    private static final String REGEX_DELIMITER = "\\s+";

    public List<Double[]> parseToDouble(List<String> dataLines) {
        List<String> validatedLines = new ArrayList<>();
        for (String line : dataLines) {
            if (isValidatedLine(line)) {
                validatedLines.add(line);
            }
        }

        Double[] arrayDouble = new Double[8];
        ArrayList<Double[]> listDouble = new ArrayList<>();
        String[] linesArray;
        for (String line : validatedLines) {
            for (int i = 0; i < validatedLines.size(); i++) {
                linesArray = line.trim().split(REGEX_DELIMITER);
                arrayDouble[i] = Double.parseDouble(Arrays.toString(linesArray));
                listDouble.add(i, arrayDouble);
            }
        }
        return listDouble;
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
}

