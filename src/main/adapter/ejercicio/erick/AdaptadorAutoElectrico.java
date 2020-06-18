package main.adapter.ejercicio.erick;

public class AdaptadorAutoElectrico implements IEmpresa {
    private AutoElectrico adaptee;

    public AdaptadorAutoElectrico(AutoElectrico adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public int llenar() {
        return adaptee.cargarBateria();
    }

    @Override
    public int estadoo() {
        return adaptee.estadoElectricidad();
    }
}
