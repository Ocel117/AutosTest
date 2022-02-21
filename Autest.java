import java.util.Scanner;
public class Autest {
    public static void main (String[] args){
        System.out.println("Tenemos los siguientes Autos\n");
        Auto compactos = new Auto();
        Auto carreras = new Auto();
        Auto todoterreno = new Auto();
        Auto combertibles = new Auto();
        
    

        compactos.puertas = 2;
        compactos.llantas = 4;
        compactos.noPlaca = "TGYU567-8567FTY";
        compactos.velocidad = 180;
        compactos.faros = true;
        compactos.marca = "Ford";
        compactos.color = "Negro";

        compactos.caracteristicas("Ford FIGO");

        carreras.puertas = 2;
        carreras.llantas = 4;
        carreras.noPlaca = "OFHISU89-7Y23E23";
        carreras.velocidad = 300;
        carreras.faros = false;
        carreras.marca = "Mercedez Benz";
        carreras.color = "Rojo";
        carreras.caracteristicas("300 SL (M.1952)");
        carreras.ubicacion("Narnia");
        carreras.autoTipo("Deportivo");

        combertibles.puertas = 4;
        combertibles.llantas = 4;
        combertibles.noPlaca = "FHGBNIF-FGYH78F";
        combertibles.velocidad = 180;
        combertibles.faros = true;
        combertibles.marca = "Toyota";
        combertibles.color = "Rosa";
        combertibles.caracteristicas("Mr2 Spyder");
        combertibles.ubicacion("Narnia");
        combertibles.autoTipo("Combertible");
        
        todoterreno.puertas = 4;
        todoterreno.llantas = 6;
        todoterreno.noPlaca = "KNGBNLP-LGYO78F";
        todoterreno.velocidad = 220;
        todoterreno.faros = true;
        todoterreno.marca = "Mercedes Benz";
        todoterreno.color = "amarillo";
        todoterreno.caracteristicas("Mansory");
        todoterreno.ubicacion("Narnia");
        todoterreno.autoTipo("Todoterreno");
    }    
}
