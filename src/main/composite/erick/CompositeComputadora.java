package main.composite.erick;

import java.util.ArrayList;
import java.util.List;

public class CompositeComputadora extends Computadora {

    private List<Computadora> lista = new ArrayList<>();
    private int costoTotal =0;

    public CompositeComputadora(String titulo) {
        super(titulo);
    }


    @Override
    public int costoTotal() {

        for (Computadora computadora: lista) {
            costoTotal = costoTotal +computadora.costoTotal();
        }
        System.out.println("Componente : ["+getTitulo()+"] Costo Total : [" + costoTotal +"]");
        return costoTotal;
    }

    @Override
    public void add(Computadora computadora) {
        lista.add(computadora);

    }

    @Override
    public void remove(Computadora computadora) {
        lista.remove(computadora);
    }

}
