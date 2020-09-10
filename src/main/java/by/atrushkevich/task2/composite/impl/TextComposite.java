package by.atrushkevich.task2.composite.impl;

import by.atrushkevich.task2.composite.TextComponent;
import by.atrushkevich.task2.composite.TypeTextComponent;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    private static final String SPACE_REGEX = " ";
    private static final String PARAGRAPH_REGEX = "";

    private List<TextComponent> components;
    private TypeTextComponent nameTextComponent;


    public TextComposite(TypeTextComponent typeOfTextComponent) {
        this.nameTextComponent = typeOfTextComponent;
        this.components = new ArrayList<>();
    }


    @Override
    public TextComponent getChild(int index) {
        return components.get(index);
    }

    @Override
    public TypeTextComponent getComponentType() {
        return nameTextComponent;
    }

    @Override
    public void add(TextComponent textComponent) {
        components.add(textComponent);
    }

    @Override
    public void remove(TextComponent textComponent) {
        components.remove(textComponent);
    }

    @Override
    public List<TextComponent> getComponents() {
        return components;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        TextComposite textComposite = (TextComposite) o;
        return this.components.equals(textComposite.components);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        final int prime = 31;
        hash = prime * hash + this.components.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (TextComponent component : components) {
            if (TypeTextComponent.PARAGRAPH.equals(component.getComponentType())) {
                sb.append(PARAGRAPH_REGEX);
            }
            if (TypeTextComponent.WORD.equals(component.getComponentType())) {
                sb.append(SPACE_REGEX);
            }

            sb.append(component.toString().trim());
        }
        return sb.toString();
    }
}
