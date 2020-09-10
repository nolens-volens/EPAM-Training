package by.atrushkevich.task2.composite.impl;

import by.atrushkevich.task2.composite.TextComponent;
import by.atrushkevich.task2.composite.TypeOfTextComponent;


public class Symbol implements TextComponent {

    enum SymbolType {
        PUNCTUATION_MARK, LETTER;
    }

    private final TypeOfTextComponent textComponent = TypeOfTextComponent.SYMBOL;

    private char element;
    private SymbolType symbolType;

    public Symbol(char element, SymbolType symbolType) {
        this.element = element;
        this.symbolType = symbolType;

    }

    @Override
    public TypeOfTextComponent getComponentType() {
        return TypeOfTextComponent.SYMBOL;
    }

    @Override
    public void add(TextComponent component) {
        throw new UnsupportedOperationException("Method is not supported");
    }

    @Override
    public void remove(TextComponent component) {
        throw new UnsupportedOperationException("Method is not supported");
    }

    @Override
    public TextComponent getChild(int index) {
        throw new UnsupportedOperationException("Method is not supported");
    }

    @Override
    public String toString() {
        return Character.toString(element);
    }
}
