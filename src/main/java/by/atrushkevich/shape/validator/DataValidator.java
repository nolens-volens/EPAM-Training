package by.atrushkevich.shape.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DataValidator {

    static final Logger logger = LogManager.getLogger();
    List<String> validatedList = new ArrayList<>();
    static final String REGULAR_EXPRESSION = "^(\\s?\\d+\\.?(\\d*[\\s,]*)?){4}$";

    public List<String> listValidator(List<String> lines) {
        for (String s : lines) {
            if (s.equals(REGULAR_EXPRESSION)) {
                validatedList.add(s.trim());
            }
        }
        return validatedList;
    }

    public List<String> getValidatedList() {
        return validatedList;
    }

}
