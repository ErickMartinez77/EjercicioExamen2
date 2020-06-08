package main.practicaN3.ejercicio4;

public class Cliente {
    public static void main (String [] args){
        Ejercito ejercito = new Ejercito();

        ejercito.criteriaHandler(new Persona("Entrevistas"));
        ejercito.criteriaHandler(new Persona("Disciplina"));
        ejercito.criteriaHandler(new Persona("Desbloqueos"));
        ejercito.criteriaHandler(new Persona("Manifestaciones"));
        ejercito.criteriaHandler(new Persona("Limpiezas"));
    }
}
