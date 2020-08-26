package by.atrushkevich.shape.reader;

import by.atrushkevich.shape.exception.ProjectException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class DataReader {

    static final Logger logger = LogManager.getLogger();

    public List<String> readData(String filePath) throws ProjectException {
        if (filePath == null) {
            throw new ProjectException("No data to read.");
        }
        List<String> lines = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            lines = bufferedReader.lines()
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new ProjectException("File reading ERROR.", e);
        }
        logger.log(Level.INFO, "The file was read successfully.");
        return lines;
    }
}