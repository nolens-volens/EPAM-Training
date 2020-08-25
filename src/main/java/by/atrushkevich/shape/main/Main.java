package by.atrushkevich.shape.main;

import by.atrushkevich.shape.entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        Point point1 = new Point(2, 5);
        Point point2 = new Point(7, 3);
        Comparator<Point> comparator = (o1, o2) -> (int) (o1.getPointId() - o2.getPointId());
        //TODO
        Comparator.comparing(Point::getPointId).thenComparing(Point::getCoordinateX);
        logger.log(Level.INFO, "hell world");


    }
}
