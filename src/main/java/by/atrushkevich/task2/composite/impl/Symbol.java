package by.atrushkevich.task2.composite.impl;

import by.atrushkevich.task2.composite.TextComponent;
import by.atrushkevich.task2.composite.TypeTextComponent;

import java.util.List;


public class Symbol implements TextComponent {

    public enum SymbolType {
        PUNCTUATION_MARK, LETTER
    }

    private final TypeTextComponent textComponent = TypeTextComponent.SYMBOL;

    private char element;
    private SymbolType symbolType;

    public Symbol(char element, SymbolType symbolType) {
        this.element = element;
        this.symbolType = symbolType;

    }

    @Override
    public TypeTextComponent getComponentType() {
        return TypeTextComponent.SYMBOL;
    }

    @Override
    public List<TextComponent> getComponents() {
        throw new UnsupportedOperationException("Method is not supported");
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
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        Symbol symbol = (Symbol) o;
        return this.symbolType.equals(symbol.symbolType);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        final int prime = 31;
        hash =(prime * hash + this.symbolType.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return Character.toString(element);
    }
}
