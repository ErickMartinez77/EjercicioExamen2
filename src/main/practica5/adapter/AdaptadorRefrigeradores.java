package main.practica5.adapter;

public class AdaptadorRefrigeradores implements IEmpresa{
    private Refrigeradores adaptee;

    public AdaptadorRefrigeradores(Refrigeradores adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public int precio() {
        return adaptee.costo;
    }

    @Override
    public int tiempoDeVida() {
        return adaptee.garantia();
    }
}
