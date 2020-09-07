package by.atrushkevich.task2.composite.impl;

import by.atrushkevich.task2.composite.TextComponent;
import by.atrushkevich.task2.composite.TypeOfTextComponent;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    private List<TextComponent> elements;
    private TypeOfTextComponent nameTextElement;


    public TextComposite(TypeOfTextComponent typeOfTextComponent) {
        this.nameTextElement = typeOfTextComponent;
        this.elements = new ArrayList<>();

    }

    @Override
    public TextComponent getChild(int index) {
        return elements.get(index);
    }

    @Override
    public TypeOfTextComponent getComponentType() {
        return nameTextElement;
    }

    @Override
    public void add(TextComponent textComponent) {
        elements.add(textComponent);
    }

    @Override
    public void remove(TextComponent textComponent) {
        elements.remove(textComponent);

    }


}