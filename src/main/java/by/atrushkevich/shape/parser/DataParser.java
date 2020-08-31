package by.atrushkevich.shape.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static by.atrushkevich.shape.validator.DataValidator.isValidatedLine;

public class DataParser {

    private static final String REGEX_DELIMITER = "\\s+";

    public List<String> parseToDouble(List<String> dataLines) {
        List<String> validatedLines = new ArrayList<>();
        for (String line : dataLines) {
            String[] linesArray = line.split(REGEX_DELIMITER);
            List<String> linesList = Arrays.asList(linesArray);
            for (String string : linesList) {
                if (isValidatedLine(string)) {
                    validatedLines.add(string);
                }
            }
        }
        return validatedLines;
    }
}
