package by.atrushkevich.task2.composite;

import java.util.List;

public interface TextComponent {

    void add(TextComponent textComponent);

    void remove(TextComponent component);

    TextComponent getChild(int index);

    TypeTextComponent getComponentType();

    List<TextComponent> getComponents();

    String toString();
}
