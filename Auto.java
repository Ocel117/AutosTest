public class Auto{
    
    // Atributos
    public  int puertas;
    public String noPlaca;
    public float velocidad;
    public int cilindros;
    public String marca;
    public String color;
    public int llantas;
    public boolean faros;

    // Metodos
    public void direccion(int derecha, int izquierda){
        System.out.println("Lado derecho: "+derecha+"\nLado izquierdo: "+izquierda+"\n");
    } 
    public void freno(boolean chino){
        System.out.println("El freno esta activo? " + chino+"\n");
    }
    String X = "Algo";
    public void caracteristicas(String auto){       //Metodo para impresion de atributos incluyendo tipo de Auto
        
        if (faros == true){             // >>>Integracion de condicional para
            X = "encendido";                  // saber si lo faros estan encendidos
        }                                     // o apagados
        else{
            X = "apagado";
        }
        System.out.println("\n\n\n");
        System.out.println("El auto es: " + auto);
        System.out.println("\n");
        System.out.println("No. de puertas: " + puertas);
        System.out.println("No. de llantas: " + llantas);
        System.out.println("No. de placa: " + noPlaca);
        System.out.println("Km/h: " + velocidad);
        System.out.println("Faros: " + X);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("No. de cilindros: " + cilindros);
        System.out.println("\n");
    }
        //La ubicacion es para burlarse de la persona que esta perdida y dejarla a su suerte
    public void ubicacion(String lugar){
        System.out.println("Usted esta perdido en: " + lugar+"\n");
    }
        //Tipo de auto ejemplo: deportivo, todoterreno, etc.
    plublic void autoTipo(String tipo){
        System.out.println("Ël auto es: " + tipo + "\n");
    }
    
}
