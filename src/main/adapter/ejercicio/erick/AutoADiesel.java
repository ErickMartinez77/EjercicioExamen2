package main.adapter.ejercicio.erick;

import java.util.Random;

public class AutoADiesel implements IEmpresa {
    int cantidadDiesel;
    Random rndm = new Random();
    int estadoCombustible= rndm.nextInt(20 - 1 + 1) + 1;
    @Override
    public int llenar() {
        return this.cantidadDiesel;
    }

    @Override
    public int estadoo() {
        return this.estadoCombustible;
    }

    public int getCantidadDiesel() {
        return cantidadDiesel;
    }

    public void setCantidadDiesel(int cantidadDiesel) {
        this.cantidadDiesel = cantidadDiesel;
    }
}
