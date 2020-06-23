package main.practica5.visitor;

public class Gato implements IElemento {
    boolean enfermedad1;
    boolean enfermedad2=true;

    public boolean isEnfermedad1() {
        return enfermedad1;
    }

    public void setEnfermedad1(boolean enfermedad1) {
        this.enfermedad1 = enfermedad1;
    }

    public boolean isEnfermedad2() {
        return enfermedad2;
    }

    public void setEnfermedad2(boolean enfermedad2) {
        this.enfermedad2 = enfermedad2;
    }

    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }

    public void enfermedad(){
        System.out.println("****************************");
        System.out.println("Este gato tiene la enfermedad 2");
    }
}
