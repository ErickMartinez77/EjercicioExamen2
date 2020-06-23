package main.practica5.adapter;

public class AdaptadorLavadoras implements IEmpresa{
    private Lavadoras adaptee;

    public AdaptadorLavadoras(Lavadoras adaptee){
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
