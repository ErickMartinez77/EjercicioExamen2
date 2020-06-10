package main.practica4.ejercicio2;

public class Cliente {
    public static void main (String [] args){
        VersionadorGitHub gitHuba = new VersionadorGitHub("");

        Desarrollador desarrollador1 = new Desarrollador("Erick");
        Desarrollador desarrollador2 = new Desarrollador("Juan");
        Desarrollador desarrollador3 = new Desarrollador("Jorge");

        gitHuba.attach(desarrollador1);
        gitHuba.attach(desarrollador2);
        gitHuba.attach(desarrollador3);

        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        VersionadorGitHub gitHub;

        gitHub = new VersionadorGitHub("Cambios en base de datos");
        originator.setGitHub(gitHub);
        careTaker.addVersion(originator.createVersion(),"Commit 1");

        gitHub = new VersionadorGitHub("Cambios actualizados");
        originator.setGitHub(gitHub);
        careTaker.addVersion(originator.createVersion(),"Commit 2");

        gitHub = new VersionadorGitHub("Cambios plantillas");
        originator.setGitHub(gitHub);
        careTaker.addVersion(originator.createVersion(),"Commit 3");

        gitHub = new VersionadorGitHub("Cambios en base de datos");
        originator.setGitHub(gitHub);
        careTaker.addVersion(originator.createVersion(),"Commit 4");

        gitHub = new VersionadorGitHub("Cambios codigo");
        originator.setGitHub(gitHub);
        careTaker.addVersion(originator.createVersion(),"Commit 5");

        originator.restoreVersion(careTaker.getVersion("Commit 1"));

        gitHuba.deAttach(desarrollador1);
        gitHuba.deAttach(desarrollador2);
        gitHuba.deAttach(desarrollador3);


        Desarrollador desarrollador4 = new Desarrollador("Erick 2");
        Desarrollador desarrollador5 = new Desarrollador("Juan 2");
        Desarrollador desarrollador6 = new Desarrollador("Jorge 2");

        gitHuba.attach(desarrollador4);
        gitHuba.attach(desarrollador5);
        gitHuba.attach(desarrollador6);

        originator.restoreVersion(careTaker.getVersion("Commit 5"));


    }
}
