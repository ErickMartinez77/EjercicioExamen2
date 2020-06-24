package main.composite.erick;

public class Item extends Computadora {


    public Item(String titulo) {
        super(titulo);
    }

    @Override
    public int costoTotal() {
        System.out.println("Componente : ["+getTitulo()+"] Costo Total : [" + getCosto()+"]");
        return this.getCosto();
    }

    @Override
    public void add(Computadora computadora) {
        System.out.println("");
    }

    @Override
    public void remove(Computadora computadora) {
        System.out.println("");
    }

}
