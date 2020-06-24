package main.composite.erick;

abstract class Computadora {
    private String titulo;
    private int costo;

    public Computadora(String titulo){
        this.titulo =titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public abstract  int costoTotal();
    public abstract  void add(Computadora computadora);
    public abstract  void remove(Computadora computadora);

}
