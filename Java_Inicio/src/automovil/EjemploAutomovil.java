package automovil;

import java.util.Calendar;
import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args){
        Motor motorSubaru = new Motor(TipoMotor.BENCINA,2.0);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Motor motorMazda = new Motor(TipoMotor.DIESEL, 3.0);
        Automovil mazda = new Automovil("Mazda","BT-50", Color.ROJO, motorMazda);
        mazda.setEstanque(new Estanque(45));
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(TipoMotor.DIESEL, 4.0), new Estanque(50));

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(TipoMotor.BENCINA, 3.5), new Estanque(50));

        //Creando un auto con ruedas
        Rueda [] ruedas = new Rueda[4];
        for(int i = 0; i < ruedas.length; i++){
            ruedas[i] = new Rueda("Michelin", 21,227 );
        }
        Motor motorToyota = new Motor(TipoMotor.DIESEL, 2.0);
        Persona Roberto = new Persona("Lopez", "Roberto");
        Estanque estanqueToyota = new Estanque(50);
        Automovil Toyota = new Automovil("Toyota", "Corolla", Color.BLANCO, motorToyota, estanqueToyota, Roberto, ruedas);



        //--------------------------------------

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals? " + (nissan.equals(nissan2)));
        //System.out.println(subaru.verDetalle());
        //System.out.println(mazda.verDetalle());
        //System.out.println(nissan.verDetalle());
        System.out.println(Toyota.verDetalle());

        System.out.println("---------------------");

        System.out.println(auto.equals(fecha));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro; " + subaru.calcularConsumo(300,0.6f));

        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300,60));
        System.out.println("Kilometros por litro " + nissan2.calcularConsumo(300,60));
    }
}
