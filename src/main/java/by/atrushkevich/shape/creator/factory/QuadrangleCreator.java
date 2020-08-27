package by.atrushkevich.shape.creator.factory;

import by.atrushkevich.shape.creator.ShapeFactory;
import by.atrushkevich.shape.entity.Point;
import by.atrushkevich.shape.entity.Quadrangle;
import by.atrushkevich.shape.generator.IdGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class QuadrangleCreator implements ShapeFactory<Quadrangle, Point> {

    public Quadrangle create(List<Point> points) {
        return null;
    }
}
