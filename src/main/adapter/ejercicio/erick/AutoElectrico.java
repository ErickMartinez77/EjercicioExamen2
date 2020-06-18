package main.adapter.ejercicio.erick;

import java.util.Random;

public class AutoElectrico {
    int cantidadDeCarga;
    Random rndm = new Random();
    int estadoElectricidad= rndm.nextInt(20 - 1 + 1) + 1;


    public int cargarBateria(){
        return this.cantidadDeCarga;
    }

    public int estadoElectricidad(){
        return this.estadoElectricidad;
    }

    public int getCantidadDeCarga() {
        return cantidadDeCarga;
    }

    public void setCantidadDeCarga(int cantidadDeCarga) {
        this.cantidadDeCarga = cantidadDeCarga;
    }
}
