//GK(Giuliana y Catherine)
//SCANNER
import java.util.Scanner;

public class Usuario {
    static Scanner lector = new Scanner(System.in);
    private static Usuario[] usuario = new Usuario[100];


    //ATRIBUTOS
    private String nombre; //N0MBRE USUARIO 
    private String direccion; //DIRECCION DEL USUARIO
    private String telefono; //TELEFONO DEL USUARIO
    private static Crema[] cremas; //ARRAY 
    private static int numProd = 0; //CONTADOR DE PRODUCTOS EN CARRITO
    private static int maxProd = 50; //CANT MAXIMA PERMITIDA DE CREMAS POR USUARIO
    private static int max = 100; //CANT CUENTAS USUARIO
    static int cont= 0;

    //CONSTRUCTOR VACIO
    public Usuario() {
       
    }

    //CONSTRUCTOR
    public Usuario(String nombre, String direccion, String telefono, double cartera, int numProd, int maxProd, int max) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        cremas = new Crema[maxProd];
        this.numProd = numProd;
        this.maxProd = maxProd;
        this.max = max;
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
    public int getNumProd() {
        return numProd;
    }
    public int getMaxProd() {
        return maxProd;
    }
    public static int getMax() {
        return max;
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
    public void setNumProd(int numProd) {
        this.numProd = numProd;
    }
    public void setMaxProd(int maxProd) {
        this.maxProd = maxProd;
    }
    public static void setMax(int max) {
        Usuario.max = max;
    
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
    public static int pedirrango(int min, int max) { 
        int valor;
        do {
            System.out.print(" Nº entre " + min + " y " + max + ": ");
            valor = lector.nextInt();
            if (valor < min || valor > max) {
                System.out.println("Nº no válido.");
            }
        } 
        while (valor < min || valor > max);
        lector.nextLine();
        return valor;     
    }
    //VERIFICA SI ESTA DUPLICADO EL NOMBRE EN EL ARRAY
    public static boolean nombreRepetido() {
        boolean repetido = false;
        for (int i = 0; i < max; i++) {
            if (usuario[i].nombre.toLowerCase().equals(usuario[cont].nombre.toLowerCase())) {
                repetido = true;
            }
        }
        return repetido;
    }

    //REGISTRAR USUARIO
    public static void registrarusuario() {
        if (cont< max) {  //Creamos cuenta nueva desde cero si hay hueco en nuestra matriz
            System.out.println("¿Cual sera el nombre de la nueva cuenta ?: ");
                String nombre= PedirNombre();
                for (int i = 0; i < cont; i++) {
                    if (nombreRepetido()) {
                        System.out.println("Ya existe una cuenta con ese nombre.");
                    }
                }       
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
            String nombrecremas = lector.nextLine();
            lector.nextLine();
            System.out.println("¿Cuantas cremas desea agregar al carrito?");
            //SCANNER INT
            int cantcremas = PedirDato();
            cremas[numProd] = new Crema(nombrecremas, cantcremas);
            numProd++;
        }
        else{
            System.out.println("No tienes mas espacio en el carrito");
        }
    }

    public static void eliminar() { //5.metodo para eliminar cuenta

        if(cont == 0){
            System.out.println("Disculpa,no hay cuentas de usuario disponibles");

        System.out.println("Selecciona la cuenta a eliminar");
            int borrar = PedirDato();
            if (cont==0){
                System.out.println("No existe la cuenta");
            
            }else if(borrar >= 0 && borrar < cont){ //Busca la cuenta y desplaza fila y columna para eliminarla
                System.out.println("Se ha borrado la cuenta de " + usuario[borrar-1]);
                for (int i = borrar-1; i < cont; i++){
                    usuario[i] = usuario[i+1];
                }
                cont--;
                System.out.println("Cuenta eliminada");
            } 
        }
    }  
    
    //PAGAR MONTO TOTAL
    public static void pagarmonto(){
        System.out.println("Ingresar monto total: ");
        System.out.println("Dime nombre de usuario: ");
        nombre = lector.nextInt();
                //CANT. DE DINERO A PAGAR
        System.out.println("¿Cuanto dinero debes abonar ?" );
        int moning = lector.nextInt();
      //fori crear acumulativo
    }
}
