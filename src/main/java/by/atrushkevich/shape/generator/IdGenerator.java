package by.atrushkevich.shape.generator;

public class IdGenerator {

    private static int id;

    private IdGenerator() {
    }

    public static int generateId() {
        return ++id;
    }
}
