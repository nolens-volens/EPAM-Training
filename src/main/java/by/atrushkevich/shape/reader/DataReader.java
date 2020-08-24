package by.atrushkevich.shape.reader;


import by.atrushkevich.shape.exception.ProjectException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;


public class DataReader {

    private static final Logger logger = LogManager.getLogger();

    public List<String> readData(String filePath) {
        List<String> lines = null;
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            lines = bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            logger.log(Level.ERROR, "File reading error", e);
            try {
                throw new ProjectException("File reading error: " + filePath, e);
            } catch (ProjectException projectException) {
                projectException.printStackTrace();
            }
        }
        return lines;

    }
}