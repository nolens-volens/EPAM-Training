package by.atrushkevich.shape.creator.factory;

import by.atrushkevich.shape.creator.ShapeFactory;
import by.atrushkevich.shape.entity.Point;
import by.atrushkevich.shape.generator.IdGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PointCreator implements ShapeFactory<List<Point>, Double> {

    public List<Point> create(List<Double> coordinatesForPointsList) {
        List<Point> pointsForQuadrangle = new ArrayList<>();
        Point point;
        for (int i = 1; i < coordinatesForPointsList.size(); i = i + 2) {
            //point = new Point(IdGenerator.generateId(), coordinatesForPointsList.get(i - 1), coordinatesForPointsList.get(i));
           // pointsForQuadrangle.add(point);
        }
        return pointsForQuadrangle;
    }
}
