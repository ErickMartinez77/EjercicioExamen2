package main.decorator.ejercicio.erick;

import java.util.Random;

public class Promocion extends Decorator {

    private Cuenta componente;

    public Promocion(Cuenta componente) {
        super(componente);
        this.componente=componente;
    }

    public void ejecucionCode() {
        super.ejecucionCode();
        Random rnd = new Random();
        int numerorandom= rnd.nextInt(5- 1 + 1) + 1;
        System.out.println("Funcionalidad: Promoción");
        if(componente.getMonto()%2==0){
            componente.setMonto(2*componente.getMonto());
            System.out.println("Su cuenta ahora tiene: "+ componente.getMonto());
        }else{
            componente.setMonto(numerorandom*componente.getMonto());
            System.out.println("Su cuenta ahora tiene: "+ componente.getMonto());
        }
    }
}
