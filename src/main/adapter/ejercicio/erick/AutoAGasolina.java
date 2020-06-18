package main.adapter.ejercicio.erick;

import java.util.Random;

public class AutoAGasolina implements IEmpresa {
    int cantidadGasolina;
    Random rndm = new Random();
    int estadoCombustible= rndm.nextInt(20 - 1 + 1) + 1;

    @Override
    public int llenar() {
        return this.cantidadGasolina;
    }

    @Override
    public int estadoo() {
        return this.estadoCombustible;
    }

    public int getCantidadGasolina() {
        return cantidadGasolina;
    }

    public void setCantidadGasolina(int cantidadGasolina) {
        this.cantidadGasolina = cantidadGasolina;
    }
}
