package by.atrushkevich.task2.reader;

import by.atrushkevich.shape.exception.ProjectException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {
    private static final String DATA_PATH = "src/main/resources/data/dataText.txt";

    public List<String> readData(String filePath) throws ProjectException {
        if (filePath == null || !Files.exists(Paths.get(filePath))) {
            filePath = DATA_PATH;
        }
        List<String> dataLines;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            dataLines = bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new ProjectException("Error while opening file: " + filePath, e);
        }
        return dataLines;
    }
}
