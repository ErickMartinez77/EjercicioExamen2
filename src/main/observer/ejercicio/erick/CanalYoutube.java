package main.observer.ejercicio.erick;


import java.util.ArrayList;

public class CanalYoutube implements ISubject {
    private ArrayList<IObserver> observers = new ArrayList<>();
    private ArrayList<Videos> videos = new ArrayList<>();

    public void add(Videos video) {
        this.videos.add(video);
        this.notifyObserver(video);
    }
    @Override
    public void attach(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deAttach(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver(Videos videos) {
            if(videos.getCategoria().equals("AnyCategory")){
                for (int j = 0; j < this.observers.size(); j++) {
                    this.observers.get(j).update(videos.getTiempo(),videos.getTipo(),videos.getTitulo());
                }
            }else if(videos.getCategoria()!="AnyCategory"){
                System.out.println("video nuevo");
            }
    }
}
