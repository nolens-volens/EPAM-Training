package by.atrushkevich.shape.validator;

import java.util.regex.Pattern;

public class DataValidator {

    static final String REGULAR_EXPRESSION = "([\\s]*\\d+(\\.\\d+)?(?:\\s*,?\\s*|\\s+)){7}(\\d+(\\.\\d+)?[\\s]*)";

    private DataValidator() {
    }

    public static boolean isValidatedLine(String s) {
        return Pattern.matches(REGULAR_EXPRESSION, s);
    }
}

