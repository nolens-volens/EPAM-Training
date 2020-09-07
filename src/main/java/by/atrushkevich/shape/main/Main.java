package by.atrushkevich.shape.main;

import by.atrushkevich.shape.exception.ProjectException;
import by.atrushkevich.shape.parser.DataParser;
import by.atrushkevich.shape.reader.DataReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;


public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws ProjectException, IOException {




        DataReader dataReader = new DataReader();
        DataParser dataParser = new DataParser();
        logger.log(Level.INFO, "bla bal");

        List<String> list = dataReader.creation(Paths.get("src/main/resources/data/parameters.txt"));

        for (String s : list) {
            System.out.println(s);
        }

        List<Double[]> list1 = dataParser.parseToDoubleArraysList(list);


        for (Double[] d : list1) {
            System.out.println("");
            for (Double a : d) {
                System.out.print(a + " ");
            }

        }

    }
}
