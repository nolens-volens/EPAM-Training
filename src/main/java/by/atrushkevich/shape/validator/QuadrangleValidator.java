package by.atrushkevich.shape.validator;

import by.atrushkevich.shape.entity.Quadrangle;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuadrangleValidator {

    static final Logger logger = LogManager.getLogger();

    public boolean isConvex(Quadrangle quadrangle) {
        logger.log(Level.INFO, "Is the quadrangle convex");
        return false;
    }

    public boolean isQuadrangle(Quadrangle quadrangle) {
        logger.log(Level.INFO, "Do the points make up quadrangle");
        return false;
    }

    public boolean isSquare(Quadrangle quadrangle) {
        logger.log(Level.INFO, "Is the quadrangle a squares");
        return false;
    }

    public boolean isRhombus(Quadrangle quadrangle) {
        logger.log(Level.INFO, "Is the quadrangle a rhombus");
        return false;
    }

    public boolean isTrapeze(Quadrangle quadrangle) {
        logger.log(Level.INFO, "Is the quadrangle a trapeze");
        return false;
    }
}
