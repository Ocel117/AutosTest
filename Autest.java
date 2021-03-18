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

        compactos.Caracteristicas();

    }    
}
