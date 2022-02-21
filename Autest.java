import java.util.Scanner;
public class Autest {
    public static void main (String[] args){
        System.out.println("Tenemos los siguientes Autos");
        Auto compactos = new Auto();
        Auto carreras = new Auto();
        Auto todoterreno = new Auto();
        Auto combertibles = new Auto();
        
    

        compactos.puertas = 2;
        compactos.llantas = 4;
        compactos.noPlaca = "TGYU567-8567FTY";
        compactos.velocidad = 180;
        compactos.cilindros = 4;
        compactos.faros = true;
        compactos.marca = "Ford";
        compactos.color = "Negro";
        
        compactos.caracteristicas("Ford FIGO");
        carreras.autoTipo("Compacto-Chico");
        carreras.ubicacion("Narnia");
        carreras.automatico(true);
        
        
        carreras.puertas = 2;
        carreras.llantas = 4;
        carreras.noPlaca = "OFHISU89-7Y23E23";
        carreras.velocidad = 300;
        carreras.cilindros = 6;
        carreras.faros = false;
        carreras.marca = "Mercedez Benz";
        carreras.color = "Rojo";
        
        carreras.caracteristicas("300 SL (M.1952)");
        carreras.ubicacion("Narnia");
        carreras.autoTipo("Deportivo");
        carreras.automatico(false);

        combertibles.puertas = 4;
        combertibles.llantas = 4;
        combertibles.noPlaca = "FHGBNIF-FGYH78F";
        combertibles.velocidad = 180;
        combertibles.cilindros = 4;
        combertibles.faros = true;
        combertibles.marca = "Toyota";
        combertibles.color = "Rosa";
        
        combertibles.caracteristicas("Mr2 Spyder");
        carreras.automatico(false);
        combertibles.ubicacion("Narnia");
        combertibles.autoTipo("Combertible");
        
        todoterreno.puertas = 4;
        todoterreno.llantas = 6;
        todoterreno.noPlaca = "KNGBNLP-LGYO78F";
        todoterreno.velocidad = 220;
        todoterreno.cilindros = 8;
        todoterreno.faros = true;
        todoterreno.marca = "Mercedes Benz";
        todoterreno.color = "amarillo";
       
        todoterreno.caracteristicas("Mansory");
        carreras.automatico(true);
        todoterreno.ubicacion("Narnia");
        todoterreno.autoTipo("Todoterreno");
    }    
}
