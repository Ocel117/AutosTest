public class Auto{
    
    // Atributos
    private int puertas;
    private String noPlaca;
    private float velocidad;
    private int cilindros;
    private String marca;
    private String color;                                                                                                                                                                              
    private boolean faros;
    private int llantas;

    public void setPuertas (int puer){
        this.puertas = puer;
    }
    public void getPuertas() {
        System.out.println(puertas);
    }
    public void setPlaca(String placa) {
        this.noPlaca = placa;
    }
    public String getPlaca() {  //Este metodo del atributo se comporta como getPuertas al tener una funcion de retorno
        return noPlaca;
    }
    public void setVelocidad(float vel) {
        this.velocidad = vel;
    }
    public float getVelocidad() {  
        return velocidad;
    }
    public void setCilindros(int cil) {
        this.cilindros = cil;
    }
    public float getCilindros() {  
        return cilindros;
    }
    public void setMarca(String marc) {
        this.marca = marc;
    }
    public String getMarca() {  
        return marca;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {  
        return color;
    }
    public void setFaros(boolean far) {
        this.faros = far;
    }
    public boolean getFaros() {  
        return faros;
    }
    public void setLlantas(int llan) {
        this.llantas = llan;
    }
    public int getLlantas() {  
        return llantas;
    }
    // Metodos
    public void automatico(boolean chino){
        String aut = "";
        if (chino == true){
            aut = "automatico";
        }
        else{
            aut = "estandar";
        }
        System.out.println("El auto es " + aut +"\n");
    }
    String X = "Algo";
    public void caracteristicas(String auto){       //Metodo para impresion de atributos incluyendo tipo de Auto
        
        if (faros == true){             // >>>Integracion de condicional para
            X = "encendido";                  // saber si lo faros estan encendidos
        }                                     // o apagados
        else{
            X = "apagado";
        }
        System.out.println("\n");
        System.out.println("El auto es: " + auto);
        System.out.println("\n");
        System.out.println("No. de puertas: " + puertas);
        System.out.println("No. de llantas: " + llantas);
        System.out.println("No. de placa: " + noPlaca);
        System.out.println("Vel max. (Km/h): " + velocidad);
        System.out.println("Faros: " + X);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("No. de cilindros: " + cilindros);
        System.out.println("");
    }
        //La ubicacion es para burlarse de la persona que esta perdida y dejarla a su suerte
    public void ubicacion(String lugar){
        System.out.println("Usted esta perdido en: " + lugar+"\n");
    }
        //Tipo de auto ejemplo: deportivo, todoterreno, etc.
    public void autoTipo(String tipo){
      
        System.out.println("Ël auto es " + tipo + "\n");
    }
    
}
