package main.practica5.adapter;

public class Celulares implements IEmpresa {
    int precioCelulares;
    int tiempoVidaCelulares;
    @Override
    public int precio() {
        return this.precioCelulares;
    }

    @Override
    public int tiempoDeVida() {
        return this.tiempoVidaCelulares;
    }

    public int getPrecioCelulares() {
        return precioCelulares;
    }

    public void setPrecioCelulares(int precioCelulares) {
        this.precioCelulares = precioCelulares;
    }

    public int getTiempoVidaCelulares() {
        return tiempoVidaCelulares;
    }

    public void setTiempoVidaCelulares(int tiempoVidaCelulares) {
        this.tiempoVidaCelulares = tiempoVidaCelulares;
    }
}
