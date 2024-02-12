package org.example;

public interface AnimalVisitor {
    void visit(Lion lion);
    void visit(Ours ours);
}
