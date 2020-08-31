package by.atrushkevich.shape.creator;

import java.util.List;

public interface ShapeFactory<Z, T> {
    Z createShape(List<T> data);
}
