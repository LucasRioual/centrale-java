package org.example;

public class Ours implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}