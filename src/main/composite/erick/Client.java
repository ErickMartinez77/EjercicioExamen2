package main.composite.erick;

public class Client {
    public static void main (String [] args){
        Item computadora1 = new Item("Computadora 1");
        Item computadora2 = new Item("Computadora 2");
        Item computadora3 = new Item("Computadora 3");

        computadora1.setCosto(100);
        computadora2.setCosto(100);
        computadora3.setCosto(100);

        CompositeComputadora computadoras =new CompositeComputadora("Computadoras");
        computadoras.add(computadora1);
        computadoras.add(computadora2);
        computadoras.add(computadora3);

        CompositeComputadora laboratorio =new CompositeComputadora("Laboratorio");
        laboratorio.add(computadora1);
        laboratorio.add(computadora2);
        laboratorio.add(computadora3);

        CompositeComputadora contenedor = new CompositeComputadora("Contenedor");
        contenedor.add(computadoras);
        contenedor.add(laboratorio);

        contenedor.costoTotal();
    }

}
