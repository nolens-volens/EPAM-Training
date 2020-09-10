package by.atrushkevich.task2.reader;

import by.atrushkevich.shape.exception.ProjectException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {
    private static final String DATA_PATH = "src/main/resources/data/dataText.txt";

    public List<String> readData(String DATA_PATH) throws ProjectException {

        List<String> dataLines;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(DATA_PATH))) {
            dataLines = bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new ProjectException("Error while opening file: " + DATA_PATH, e);
        }
        return dataLines;
    }
}
