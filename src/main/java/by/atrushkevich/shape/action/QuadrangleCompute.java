package by.atrushkevich.shape.action;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuadrangleCompute {

    private static final Logger logger = LogManager.getLogger();

    public double areaCompute() {
        logger.log(Level.INFO, "The AREA of the quadrangle is computed");
        return 0.0;
    }

    public double perimeterCompute() {
        logger.log(Level.INFO, "The PERIMETER of the quadrangle is computed");
        return 0.0;
    }

    public boolean isConvex() {
        logger.log(Level.INFO, "Is the quadrangle convex");
        return false;
    }

    public boolean isQuadrangle() {
        logger.log(Level.INFO, "Do the points make up quadrangle");
        return false;
    }

    public boolean isSquare() {
        logger.log(Level.INFO, "Is the quadrangle a squares");
        return false;
    }

    public boolean isRhombus() {
        logger.log(Level.INFO, "Is the quadrangle a rhombus");
        return false;
    }

    public boolean isTrapeze() {
        logger.log(Level.INFO, "Is the quadrangle a trapeze");
        return false;
    }

}
