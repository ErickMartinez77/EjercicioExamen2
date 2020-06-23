package main.practica5.adapter;

public class AdaptadorTelevisores implements IEmpresa{
    private Televisores adaptee;

    public AdaptadorTelevisores(Televisores adaptee){
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
