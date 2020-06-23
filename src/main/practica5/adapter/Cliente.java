package main.practica5.adapter;

public class Cliente {
    public static void main(String [] args){
        Celulares celulares = new Celulares();
        celulares.setPrecioCelulares(800);
        celulares.setTiempoVidaCelulares(5);

        Tablets tablets = new Tablets();
        tablets.setPrecioTablets(500);
        tablets.setTiempoVidaTablets(4);

        Computadoras computadoras = new Computadoras();
        computadoras.setPrecioComputadoras(1500);
        computadoras.setTiempoVidaComputadoras(8);


        Televisores televisores = new Televisores();
        televisores.setCosto(900);
        televisores.setTiempoGarantia(3);
        AdaptadorTelevisores adaptadorTelevisores = new AdaptadorTelevisores(televisores);

        Lavadoras lavadoras = new Lavadoras();
        lavadoras.setCosto(500);
        lavadoras.setTiempoGarantia(4);
        AdaptadorLavadoras adaptadorLavadoras = new AdaptadorLavadoras(lavadoras);

        Refrigeradores refrigeradores = new Refrigeradores();
        refrigeradores.setCosto(300);
        refrigeradores.setTiempoGarantia(6);
        AdaptadorRefrigeradores adaptadorRefrigeradores = new AdaptadorRefrigeradores(refrigeradores);

        System.out.println("El precio de los celulares es: "+celulares.getPrecioCelulares()+"$");
        System.out.println("El tiempo de vida de los celulares es: "+celulares.getTiempoVidaCelulares()+" años");

        System.out.println("**************************");
        System.out.println("El precio de las tables es: "+tablets.getPrecioTablets()+"$");
        System.out.println("El tiempo de vida de las tablets es: "+tablets.getTiempoVidaTablets()+" años");

        System.out.println("**************************");
        System.out.println("El precio de las computadoras es: "+computadoras.getPrecioComputadoras()+"$");
        System.out.println("El tiempo de vida de las computadoras es: "+computadoras.getTiempoVidaComputadoras()+" años");

        System.out.println("**************************");
        System.out.println("El precio de los televisores es: "+adaptadorTelevisores.precio()+"$");
        System.out.println("La garantia de los televisores es: "+adaptadorTelevisores.tiempoDeVida()+" años");

        System.out.println("**************************");
        System.out.println("El precio de las lavadoras es: "+adaptadorLavadoras.precio()+"$");
        System.out.println("La garantia de las lavadoras es: "+adaptadorLavadoras.tiempoDeVida()+" años");

        System.out.println("**************************");
        System.out.println("El precio de los refrigeradores es: "+adaptadorRefrigeradores.precio()+"$");
        System.out.println("La garantia de los refrigeradores es: "+adaptadorRefrigeradores.tiempoDeVida()+" años");


    }
}
