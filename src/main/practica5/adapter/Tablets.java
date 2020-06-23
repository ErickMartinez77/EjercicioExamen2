package main.practica5.adapter;

public class Tablets implements IEmpresa {
    int precioTablets;
    int tiempoVidaTablets;
    @Override
    public int precio() {
        return this.precioTablets;
    }

    @Override
    public int tiempoDeVida() {
        return this.tiempoVidaTablets;
    }

    public int getPrecioTablets() {
        return precioTablets;
    }

    public void setPrecioTablets(int precioTablets) {
        this.precioTablets = precioTablets;
    }

    public int getTiempoVidaTablets() {
        return tiempoVidaTablets;
    }

    public void setTiempoVidaTablets(int tiempoVidaTablets) {
        this.tiempoVidaTablets = tiempoVidaTablets;
    }
}
