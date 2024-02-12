package org.example;

public class AnimalOperationVisitor implements AnimalVisitor {
    @Override
    public void visit(Lion lion) {
        System.out.println("Le lion rugit !");
    }

    @Override
    public void visit(Ours ours) {
        System.out.println("L'ours grogne !");
    }


}