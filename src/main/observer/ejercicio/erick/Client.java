package main.observer.ejercicio.erick;

public class Client {
    public static void main (String [] argsss){
        CanalYoutube youtube = new CanalYoutube();

        Suscriptor1 suscriptor1 = new Suscriptor1();
        Suscriptor2 suscriptor2 = new Suscriptor2();
        Suscriptor3 suscriptor3 = new Suscriptor3();
        Suscriptor4 suscriptor4 = new Suscriptor4();
        Suscriptor5 suscriptor5 = new Suscriptor5();

        youtube.attach(suscriptor1);
        youtube.attach(suscriptor2);
        youtube.attach(suscriptor3);
        youtube.attach(suscriptor4);
        youtube.attach(suscriptor5);

        youtube.add(new Videos("Broma","Prank","10 min","AnyCategory"));
        youtube.add(new Videos("Deporte","Rutina de brazos","15 min","Deporte"));
    }
}
