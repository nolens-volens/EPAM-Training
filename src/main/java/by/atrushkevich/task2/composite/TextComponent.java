package by.atrushkevich.task2.composite;

public interface TextComponent {

    void add(TextComponent textComponent);

    void remove(TextComponent component);

    TextComponent getChild(int index);

    TypeOfTextComponent getComponentType();

}
