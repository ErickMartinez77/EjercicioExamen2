package main.practica4.ejercicio2;

public class Originator {
    private VersionadorGitHub gitHub;

    public VersionadorGitHub getGitHub() {
        return gitHub;
    }

    public void setGitHub(VersionadorGitHub gitHub) {
        this.gitHub = gitHub;
    }

    public Memento createVersion(){
        return new Memento(this.gitHub);
    }

    public void restoreVersion(Memento m){
        this.gitHub = m.getGitHub();
        this.gitHub.showData();
    }
}
