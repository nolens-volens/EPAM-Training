package by.atrushkevich.shape.action;


import by.atrushkevich.shape.entity.Quadrangle;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuadrangleCompute {

   static final Logger logger = LogManager.getLogger();

    public double areaCompute(Quadrangle quadrangle) {
        logger.log(Level.INFO, "The AREA of the quadrangle is computed");
        return 0.0;
    }

    public double perimeterCompute(Quadrangle quadrangle) {
        logger.log(Level.INFO, "The PERIMETER of the quadrangle is computed");
        return 0.0;
    }
}
