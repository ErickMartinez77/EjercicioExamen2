package main.practica5.visitor;

public interface IElemento {
    double accept(IVisitor visitor);
}
