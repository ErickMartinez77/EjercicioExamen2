package main.practicaN3.ejercicio2;


public class Client {
    public static void main (String [] args){
        Segip segip = new Segip();
        segip.criteriaHandler(new Persona(true,true,true));
        segip.criteriaHandler(new Persona(true,false,true));
        segip.criteriaHandler(new Persona(false,true,true));
        segip.criteriaHandler(new Persona(true,false, false));
    }
}
