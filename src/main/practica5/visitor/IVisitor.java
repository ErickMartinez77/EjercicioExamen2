package main.practica5.visitor;

public interface IVisitor {
    double visit(Perro perro);
    double visit(Gato gato);
    double visit(Caballo caballo);
}
