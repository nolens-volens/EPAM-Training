package by.atrushkevich.shape.main;

import by.atrushkevich.shape.reader.DataReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        dataReader.readData("src\\main\\resources\\data\\parameters.txt");
        logger.log(Level.INFO, "The file was read successfully");

    }
}
