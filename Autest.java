public class Autest {
    public static void main (String[] args){
        System.out.println("Tenemos los siguientes Autos\n\n");
        Auto compactos = new Auto();
        Auto carreras = new Auto();
        Auto combertibles = new Auto();

        compactos.puertas = 2;
        compactos.noPlaca = "TGYU567-8567FTY";
        compactos.velocidad = 90;
        compactos.faros = true;
        compactos.marca = "Ford";
        compactos.color = "Negro";

        compactos.caracteristicas("Ford FIGO");

        carreras.puertas = 2;
        carreras.noPlaca = "OFHISU89-7Y23E23";
        carreras.velocidad = 152;
        carreras.faros = false;
        carreras.marca = "Mercedez Benz";
        carreras.color = "Rojo";

        carreras.caracteristicas("300 SL (M.1952)");

        combertibles.puertas = 4;
        combertibles.noPlaca = "FHGBNIF-FGYH78F";
        combertibles.velocidad = 100;
        combertibles.faros = true;
        combertibles.marca = "Toyota";
        combertibles.color = "Rosa";

        combertibles.caracteristicas("Mr2 Spyder");
        combertibles.direccion(15, 45);
        combertibles.ubicacion("Narnia");
    }    
}
