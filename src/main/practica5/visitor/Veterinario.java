package main.practica5.visitor;

public class Veterinario implements IVisitor {
    @Override
    public double visit(Perro perro) {
        if (perro.isEnfermedad1()){
            perro.enfermedad();
            System.out.println("Se le recetara la cura 1");
        } else {
            System.out.println("****************************");
            System.out.println("Este perro tiene la enfermedad 2");
            System.out.println("Se le recetara la cura 2");
        }
        return 0;
    }

    @Override
    public double visit(Gato gato) {
        if (gato.isEnfermedad1()){
            gato.enfermedad();
            System.out.println("Se le recetara la cura 1");
        } else {
            System.out.println("****************************");
            System.out.println("Este gato tiene la enfermedad 2");
            System.out.println("Se le recetara la cura 2");
        }
        return 0;
    }

    @Override
    public double visit(Caballo caballo) {
        if (caballo.isEnfermedad1()){
            caballo.enfermedad();
            System.out.println("Se le recetara la cura 1");
        } else {
            System.out.println("****************************");
            System.out.println("Este caballo tiene la enfermedad 2");
            System.out.println("Se le recetara la cura 2");
        }
        return 0;
    }
}
