package main.practica5.adapter;

public class Refrigeradores {
    int costo;
    int tiempoGarantia;

    public int costo(){
        return this.costo;
    }
    public int garantia(){
        return this.tiempoGarantia;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(int tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }
}
