package main.observer.ejercicio.erick;

public class Videos {
    private String tipo;
    private String titulo;
    private String tiempo;
    private String categoria;

    public Videos(String tipo, String titulo, String tiempo, String categoria) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.tiempo = tiempo;
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
