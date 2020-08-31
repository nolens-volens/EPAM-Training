package by.atrushkevich.shape.creator;

import by.atrushkevich.shape.entity.Point;

import java.util.ArrayList;
import java.util.List;

public class PointCreator {

    public List<Point> createPoint(List<Double> coordinatesForPointsList) {
        List<Point> pointsForQuadrangle = new ArrayList<>();
        Point point;
        for (int i = 1; i < coordinatesForPointsList.size(); i = i + 2) {
            //point = new Point(IdGenerator.generateId(), coordinatesForPointsList.get(i - 1), coordinatesForPointsList.get(i));
           // pointsForQuadrangle.add(point);
        }
        return pointsForQuadrangle;
    }
}
