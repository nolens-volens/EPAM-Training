package by.atrushkevich.shape.main;

import by.atrushkevich.shape.reader.DataReader;
import by.atrushkevich.shape.validator.DataValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.regex.Pattern;


public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        DataValidator dataValidator = new DataValidator();
        System.out.println(dataValidator.listValidator
                (dataReader.readData("src\\main\\resources\\data\\parameters.txt")));

        List<String> list = dataValidator.listValidator
                (dataReader.readData("src\\main\\resources\\data\\parameters.txt"));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
