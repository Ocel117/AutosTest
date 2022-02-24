import java.util.Scanner;
public class Autest {
    public static void main (String[] args){
        System.out.println("Tenemos los siguientes Autos");
        Auto compactos = new Auto();
        Auto carreras = new Auto();
        Auto todoterreno = new Auto();
        Auto convertibles = new Auto();
        
    

        compactos.setPuertas(2);
        compactos.setLlantas(4);
        compactos.setPlaca("TGYU567-8567FTY");
        compactos.setVelocidad (180);
        compactos.setCilindros(4);
        compactos.setFaros(true);
        compactos.setMarca("Ford");
        compactos.setColor("Negro");
        
        compactos.caracteristicas("Ford FIGO");
        compactos.autoTipo("Compacto-Chico");
        compactos.ubicacion("Narnia");
        compactos.automatico(true);
        
        
        carreras.setPuertas(2);
        carreras.setLlantas(4);
        carreras.setPlaca("OFHISU89-7Y23E23");
        carreras.setVelocidad (300);
        carreras.setCilindros(6);
        carreras.setFaros(false);
        carreras.setMarca("Mercedez Benz");
        carreras.setColor("Rojo");
        
        carreras.caracteristicas("300 SL (M.1952)");
        carreras.ubicacion("Narnia");
        carreras.autoTipo("Deportivo");
        carreras.automatico(false);

        convertibles.setPuertas(4);
        convertibles.setLlantas(4);
        convertibles.setPlaca("FHGBNIF-FGYH78F");
        convertibles.setVelocidad (1800);
        convertibles.setCilindros(4);
        convertibles.setFaros(true);
        convertibles.setMarca("Toyota");
        convertibles.setColor("Rosa");
        
        convertibles.caracteristicas("Mr2 Spyder");
        convertibles.automatico(false);
        convertibles.ubicacion("Narnia");
        convertibles.autoTipo("Combertible");
        
        todoterreno.setPuertas(4);
        todoterreno.setLlantas(6);
        todoterreno.setPlaca("KNGBNLP-LGYO78F");
        todoterreno.setVelocidad (220);
        todoterreno.setCilindros(8);
        todoterreno.setFaros(true);
        todoterreno.setMarca("Mercedes Benz");
        todoterreno.setColor("amarillo");
       
        todoterreno.caracteristicas("Mansory");
        todoterreno.automatico(true);
        todoterreno.ubicacion("Narnia");
        todoterreno.autoTipo("Todoterreno");
    }    
}
