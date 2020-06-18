package main.adapter.ejercicio.erick;

import java.util.Random;

public class AutoAGasolinaEspecial implements IEmpresa {
    int cantidadGasolinaEspecial;
    Random rndm = new Random();
    int estadoCombustible= rndm.nextInt(20 - 1 + 1) + 1;
    @Override
    public int llenar() {
        return this.cantidadGasolinaEspecial;
    }

    @Override
    public int estadoo() {
        return this.estadoCombustible;
    }

    public int getCantidadGasolinaEspecial() {
        return cantidadGasolinaEspecial;
    }

    public void setCantidadGasolinaEspecial(int cantidadGasolinaEspecial) {
        this.cantidadGasolinaEspecial = cantidadGasolinaEspecial;
    }
}
