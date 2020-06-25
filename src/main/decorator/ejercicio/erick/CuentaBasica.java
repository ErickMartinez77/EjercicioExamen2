package main.decorator.ejercicio.erick;

public class CuentaBasica implements Cuenta {

    private int monto;
    private String propietario;

    public CuentaBasica(int monto, String propietario) {
        this.monto = monto;
        this.propietario = propietario;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public void ejecucionCode() {
        System.out.println("INFO> La cuenta basica esta a nombre de : "+propietario +" y cuenta con un total de "+monto +" Bs.");
    }

}
