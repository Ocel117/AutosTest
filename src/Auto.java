public class Auto{
    public  int puertas;
    public String noPlaca;
    public float velocidad;
    public boolean faros;
    public String marca;
    public String color;

    public void Direccion(int derecha, int izquierda){
        System.out.println("Lado derecho: "+derecha+"\nLado izquierdo: "+izquierda);
    } 
    public void Freno(boolean chino){
        System.out.println("El freno esta activo? " + chino);
    }
    String X = "Algo";
    public void Caracteristicas(){
        
        if (faros == true){
            X = "encendido";
        }
        else{
            X = "apagado";
        }
        System.out.println("No. de puertas: " + puertas);
        System.out.println("No. de placa: " + noPlaca);
        System.out.println("Km/h: " + velocidad);
        System.out.println("Faros: " + X);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
    }
    public void Ubicacion(String lugar){
        System.out.println("Usted esta perdido en: " + lugar);
    }

}