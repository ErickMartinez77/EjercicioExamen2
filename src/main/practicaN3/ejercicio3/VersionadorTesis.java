package main.practicaN3.ejercicio3;

public class VersionadorTesis {
    private String titulo;
    private String state;

    public VersionadorTesis (String titulo, String state){
        this.titulo = titulo;
        this.state = state;
    }

    public void showData(){
        System.out.println("name : "+this.titulo);
        System.out.println("state : "+this.state);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
