package by.atrushkevich.shape.reader;

import by.atrushkevich.shape.exception.ProjectException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class DataReader {

    static final Logger logger = LogManager.getLogger();

    public List<String> readData(String filePath) throws ProjectException {
        if (filePath == null) {
            throw new ProjectException("No data to read.");
        }
        List<String> dataLines;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            dataLines = bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new ProjectException("File reading ERROR.", e);
        }
        logger.log(Level.INFO, "The file was read successfully.");
        return dataLines;
    }

    public void readText(Paths path){

    }


    public List<String> creation(Path filePath) throws IOException {
        return Files.lines(Paths.get(String.valueOf(filePath)))
                .collect(Collectors.toList());
    }
}