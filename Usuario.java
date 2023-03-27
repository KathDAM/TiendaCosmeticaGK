import java.util.Scanner;

//GK(Giuliana y Catherine)
public class Usuario {
    Scanner lector = new Scanner(System.in);
    

    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private String telefono;
    private double cartera;
    private static Crema[] cremas;
    private static int numProd = 0; //CONTADOR DE PRODUCTOS EN CARRITO
    private static int maxProd = 50; //CANT MAXIMA PERMITIDA DE CREMAS POR USUARIO
    private static int max = 100; //CANT CUENTAS USUARIO

    //CONSTRUCTOR VACIO
    public Usuario() {
       
    }
    //CONSTRUCTOR
    public Usuario(String nombre, String direccion, String telefono, double cartera, int numProd, int maxProd) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cartera = cartera;
        cremas = new Crema[maxProd];
        this.numProd = numProd;
        this.maxProd = maxProd;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public double getCartera() {
        return cartera;
    }
    public int getNumProd() {
        return numProd;
    }
    public int getMaxProd() {
        return maxProd;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setCartera(double cartera) {
        this.cartera = cartera;
    }
    public void setNumProd(int numProd) {
        this.numProd = numProd;
    }
    public void setMaxProd(int maxProd) {
        this.maxProd = maxProd;
    }

    //METODOS

    //PEDIR NOMBRE
    public static String PedirNombre(){ //Pide un nombre al cliente
        Scanner lector = new Scanner(System.in);
        
        String valor;
        valor = lector.nextLine();
      
        return valor;  
        
    } 

    public static int PedirDato(){ //Pide un dato al cliente
        Scanner lector = new Scanner(System.in);
        
        int valor;
        valor = lector.nextInt();
       
        return valor;  
        
    } 
    
    //VERIFICA SI ESTA DUPLICADO EL NOMBRE EN EL ARRAY
    public static boolean nombreRepetido() {
        boolean repetido = false;
        for (int i = 0; i < max; i++) {
            if (usuario[i].toLowerCase().equals(usuario[nombre].toLowerCase())) {
                repetido = true;
            }
        }
        return repetido;
    }

    //REGISTRAR USUARIO
    public static void registrarusuario() {
        int cont= 0;
        if (cont< max) {  //Creamos cuenta nueva desde cero si hay hueco en nuestra matriz
            System.out.println("¿Cual sera el nombre de la nueva cuenta bancaria?: ");
                String nombre= PedirNombre();
                for (int i = 0; i < cont; i++) {
                    if (nombreRepetido()) {
                        System.out.println("Ya existe una cuenta con ese nombre.");
                        return;
                    }
                }
                usuario[cont] = nombre;
                
                cont++;
                System.out.println("Cuenta agregada correctamente.");

        } else {
            System.out.println("No es posible");
        }
        
    }
        
    //AGREGAR CREMA
    public static void agregarcrema(){
        //Control carrito lleno
        if (numProd < maxProd){
            System.out.println("Dime el nombre de la crema que deseas agregar al carrito?");
            //SCANNER STRING
            System.out.println("¿Cuantas cremas desea agregar al carrito?");
            //SCANNER INT
            int cantcremas = lector.nextInt;
            cremas[numProd] = new Crema(nombrecremas, cantcremas);
            numProd++;
        }
        else{
            System.out.println("No tienes mas espacio en el carrito");
        }
    }

    public static void eliminar() { //5.metodo para eliminar cuenta

        int cont;

        if(cont == 0){
            System.out.println("Disculpa,no hay cuentas de usuario disponibles");

        System.out.println("Selecciona la cuenta a eliminar");
            int borrar = PedirDato();
            if (cont==0){
                System.out.println("No existe la cuenta");
            
            }else if(borrar >= 0 && borrar < cont){ //Busca la cuenta y desplaza fila y columna para eliminarla
                System.out.println("Se ha borrado la cuenta de " + Usuario[borrar-1]);
                for (int i = borrar + 1; i < cont; i++){
                    Usuario[i-1] = nombre[i];
                }
                cont--;
                System.out.println("Cuenta eliminada");
            } 
            return;
        }
    }  
    
    //PAGAR MONTO TOTAL
    public static void pagarmonto(){
        System.out.println("Ingresar monto total: ");
        System.out.println("Dime numero de usuario: ");
        int num = S.nextInt();
                //CANT. DE DINERO A PAGAR
        System.out.println("¿Cuanto dinero debes abonar: " + num + " ?" );
        int moning = S.nextInt();
        Crema[num] = Crema[num] + moning;
    }

}
