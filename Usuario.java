//GK(Giuliana y Catherine)
public class Usuario {
    

    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private String telefono;
    private double cartera;
    private Crema[] cremas;

    //CONSTRUCTOR VACIO
    public Usuario() {
       
    }
    //CONSTRUCTOR
    public Usuario(String nombre, String direccion, String telefono, double cartera ) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cartera = cartera;
        cremas = new Crema[50];
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

    //METODOS

    //PEDIR NOMBRE
    public static String PedirNombre(){ //Pide un nombre al cliente
        Scanner lector = new Scanner(System.in);
        
        String valor;
        valor = lector.nextLine();
      
        return valor;  
        
    } 
    
    //VERIFICA SI ESTA DUPLICADO EL NOMBRE EN EL ARRAY
    public static boolean nombreRepetido() {
        boolean repetido = false;
        for (int i = 0; i < max; i++) {
            if (Usuario[i].toLowerCase().equals(Usuario[cuent].toLowerCase())) {
                repetido = true;
            }
        }
        return repetido;
    }

    //REGISTRAR USUARIO
    public static void registrarusuario() {
        cont= 0;
        if (cont< max) {  //Creamos cuenta nueva desde cero si hay hueco en nuestra matriz
            System.out.println("¿Cual sera el nombre de la nueva cuenta bancaria?: ");
                String nombre= PedirNombre();
                for (int i = 0; i < cont; i++) {
                    if (nombreRepetido()) {
                        System.out.println("Ya existe una cuenta con ese nombre.");
                        return;
                    }
                }
                Usuario[cont] = nombre;
                
                cont++;
                System.out.println("Cuenta agregada correctamente.");

        } else {
            System.out.println("No es posible");
        }
        
    }

    //AGREGAR CREMA
    public static void agregarcrema(){
        System.out.println("¿Cuantas cremas desea agregar al carrito?");
        int cantcremas= S.nextInt;
        for (int i = 0; i < Crema.lenght; i++) {
            for (int j = 0; j < cantcremas; j++) {
                Crema[]
            }
        }
        
    }

    public static void eliminar() { //5.metodo para eliminar cuenta

        if(cont == 0){
            System.out.println("Disculpa,no hay cuentas disponibles");

        System.out.println("Selecciona la cuenta a eliminar");
            int borrar = PedirDato();
            if (cont==0){
                System.out.println("No existe la cuenta");
            
            }else if(borrar >= 0 && borrar < cont){ //Busca la cuenta y desplaza fila y columna para eliminarla
                System.out.println("Se ha borrado la cuenta de " + Usuario[borrar-1]);
                for (int i = borrar + 1; i < cont; i++){
                    Usuario[i-1] = cuenta[i];
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
