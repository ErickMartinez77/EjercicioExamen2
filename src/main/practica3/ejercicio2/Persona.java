package main.practica3.ejercicio2;

public class Persona {

    boolean Certificado;
    boolean pagoAlBanco;
    boolean ficha;

    public Persona(boolean certificado, boolean pagoAlBanco, boolean ficha) {
        Certificado = certificado;
        this.pagoAlBanco = pagoAlBanco;
        this.ficha = ficha;
    }

    public boolean isCertificado() {
        return Certificado;
    }

    public void setCertificado(boolean certificado) {
        Certificado = certificado;
    }

    public boolean isPagoAlBanco() {
        return pagoAlBanco;
    }

    public void setPagoAlBanco(boolean pagoAlBanco) {
        this.pagoAlBanco = pagoAlBanco;
    }

    public boolean isFicha() {
        return ficha;
    }

    public void setFicha(boolean ficha) {
        this.ficha = ficha;
    }



}
