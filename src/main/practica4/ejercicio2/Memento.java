package main.practica4.ejercicio2;

public class Memento {
    private VersionadorGitHub gitHub;

    public Memento (VersionadorGitHub stateSaved){
        this.gitHub = stateSaved;
    }

    public VersionadorGitHub getGitHub() {
        return gitHub;
    }

    public void setGitHub(VersionadorGitHub gitHub) {
        this.gitHub = gitHub;
    }
}
