package main.practica5.adapter;

public class Computadoras implements IEmpresa {
    int precioComputadoras;
    int tiempoVidaComputadoras;
    @Override
    public int precio() {
        return this.precioComputadoras;
    }

    @Override
    public int tiempoDeVida() {
        return this.tiempoVidaComputadoras;
    }

    public int getPrecioComputadoras() {
        return precioComputadoras;
    }

    public void setPrecioComputadoras(int precioComputadoras) {
        this.precioComputadoras = precioComputadoras;
    }

    public int getTiempoVidaComputadoras() {
        return tiempoVidaComputadoras;
    }

    public void setTiempoVidaComputadoras(int tiempoVidaComputadoras) {
        this.tiempoVidaComputadoras = tiempoVidaComputadoras;
    }
}
