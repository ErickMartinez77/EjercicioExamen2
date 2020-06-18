package main.adapter.ejercicio.erick;

public class Cliente {
    public static void main (String [] args){
        AutoElectrico autoElectrico = new AutoElectrico();
        autoElectrico.setCantidadDeCarga(60);

        AutoAGasolina autoAGasolina = new AutoAGasolina();
        autoAGasolina.setCantidadGasolina(50);
        autoAGasolina.estadoo();

        AutoADiesel autoADiesel = new AutoADiesel();
        autoADiesel.setCantidadDiesel(30);
        autoADiesel.estadoo();

        AutoAGasolinaEspecial autoAGasolinaEspecial = new AutoAGasolinaEspecial();
        autoAGasolinaEspecial.setCantidadGasolinaEspecial(40);
        autoAGasolinaEspecial.estadoo();



        AdaptadorAutoElectrico adaptadorAutoElectrico = new AdaptadorAutoElectrico(autoElectrico);

        System.out.println("Auto a gasolina, Cantidad de gasolina: "+autoAGasolina.getCantidadGasolina());
        System.out.println("Auto a gasolina, Estado combustible: "+autoAGasolina.estadoo());

        System.out.println("Auto a Diesel, Cantidad de diesel: "+autoADiesel.getCantidadDiesel());
        System.out.println("Auto a Diesel, Estado combustible: "+autoADiesel.estadoo());

        System.out.println("Auto a gasolina especial, Cantidad de gasolina: "+autoAGasolinaEspecial.getCantidadGasolinaEspecial());
        System.out.println("Auto a gasolina especial, Estado combustible: "+autoAGasolinaEspecial.estadoo());

        System.out.println("Auto electrico, Cantidad de carga: "+adaptadorAutoElectrico.llenar());
        System.out.println("Auto electrico, Estado electricidad: "+adaptadorAutoElectrico.estadoo());
    }

}
