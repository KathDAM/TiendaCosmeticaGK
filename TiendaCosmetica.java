//GK(Giuliana y Catherine)

//SCANNER
import java.util.Scanner;

public class TiendaCosmetica {

    //ATRIBUTOS
    private static Usuario usuarioactual = null; //usuario vacio
    private static Scanner lector = new Scanner(System.in);
    private static int maxusuarios = 100;
    private static Usuario[] usuarios = new Usuario[maxusuarios];
    private static Crema[] stockcremas = new Crema[5];
    private static int cont = 0;


    //MÉTODOS

    //INICIAR TODO
    public void iniciar(){
        //BUCLE PARA PASAR POR LOS APARTADOS DEL MENU
        cremastock(); //ALCANCE PARA CREAR CREMAS POR SI LAS USAS
        while(true){ 
            if (usuarioactual==null) { //SI NO HAY USUARIO O NO SE HA INICIADO SESION
                menuprincipal();
                switchmenuprincipal(pedirrango());
            }
            if(usuarioactual!=null){ //LO CONTRARIO
                menu();
                programa(pedirrango());
            }
        }    
    }

    //STOCK CREMAS (CREAMOS OBJETOS CREMA)
    private void cremastock () {
        //STOCK CREMAS
        Crema uno = new Crema("Iluminador", 100, 11.50 );
        stockcremas[0] = uno;

        Crema dos = new Crema("Hidrante", 125, 16 );
        stockcremas[1] = dos;

        Crema tres = new Crema("BB cream", 50, 25 );
        stockcremas[2] = tres;

        Crema cuatro = new Crema("Solar", 100, 14.90 );
        stockcremas[3] = cuatro;

        Crema cinco = new Crema("Bruma", 45, 15 );
        stockcremas[4] = cinco;
    }

    //MENÚS

    //PEDIMOS RANGO
    public int pedirrango() { 

        int valor;
        System.out.println();
        System.out.print("Elige una opcion: ");
        valor = lector.nextInt();

        return valor;    
    }

    //MOSTRAR MENÚS

    //MENÚ PRINCIPAL
    private void menuprincipal(){
        System.out.println();
        System.out.println("1- Iniciar sesion."); 
        System.out.println("2- Registro nuevo usuario.");
        System.out.println("3- Salir.");

    }

    //MENÚ USUARIO   
    private void menu(){
        System.out.println();
        System.out.println("1- Mostrar Productos."); 
        System.out.println("2- Agregar Producto.");
        System.out.println("3- Ver Cesta.");
        System.out.println("4- Eliminar Producto.");
        System.out.println("5- Eliminar Usuario.");
        System.out.println("6- Pagar.");
        System.out.println("7- Cerrar sesión.");
    }

    //SWITCHES

    //SWITCH MENÚ PRINCIPAL
    private void switchmenuprincipal(int opciones){
        switch(opciones){
            case 1: //INICIAR SESION
                iniciarsesion();
                break;
            case 2://REGISTRAR USUARIO
                añadirusuario(crearusuario());
                break;
            case 3: //SALIR
                System.out.println();
                System.out.println("Gracias por la visita, hasta la próxima");
                System.exit(0);
                break;
        }
    }

    //SWITCH MENÚ USUARIO  
    private void programa(int opciones) {    
        switch(opciones){
        case 1:  //MOSTRAR PRODUCTOS
            mostrarProductos();
            break;

        case 2:  //AGREGAR PRODUCTO
            agregarProducto();
            break;

        case 3:  //VER CESTA
            verCesta();
            break;

        case 4: //ELIMINAR PRODUCTO 
            eliminarProducto();
            break;
            
        case 5:  //ELIMINAR CUENTA
            eliminarCuenta();
            break;

        case 6:  //PAGAR MONTO
            pagarMonto();
            break;

        case 7: //CERRAR SESION
            usuarioactual = null;
            break;
        
        default:
            System.out.println("Opción invalida");
        }
    }

    //METODOS

    //----------------------------------------------------------------

    //CREAR USUARIO
    private Usuario crearusuario() {
        Usuario actualusuario = new Usuario();
        //PEDIMOS NOMBRE AL USUARIO AL USUARIO Y COMPROBAMOS QUE NO EXISTA YA
        do {
            actualusuario.setNombre(PedirNombre());
            if (nombreRepetido(actualusuario.getNombre())) {
                System.out.println();
                System.out.println("Usuario ya registrado");
            }
        } while (nombreRepetido(actualusuario.getNombre()));

        actualusuario.setDireccion(PedirDireccion());
        actualusuario.setTelefono(PedirTelefono());
        actualusuario.setCartera(PedirCartera());
        return actualusuario;  

    }

    //----------------------------------------------------------------

    //LLAMAMOS A LOS METODOS DE FONDO PARA QUE FUNCIONE, SE PUEDE IR DE UN LADO A OTRO
    //PEDIR NOMBRE
    public String PedirNombre(){ //PIDE NOMBRE AL CLIENTE
        lector.nextLine();
        System.out.println();
        System.out.print("Dime tu nombre: ");
        String valor = lector.nextLine();
    
        return valor;
    }

    //PEDIR DIRECCION
    public String PedirDireccion(){ //PIDE DIRECCION AL CLIENTE
        System.out.println();
        System.out.print("Dime tu dirección: ");
        String valor = lector.nextLine();
    
        return valor;
    }

    //PEDIR TELÉFONO
    public String PedirTelefono(){ //PIDE TELEFONO AL CLIENTE
        System.out.println();
        System.out.print("Dime tu telefono: ");
        String valor = lector.nextLine();
    
        return valor;
    }

    //PEDIR CARTERA
    public double PedirCartera(){ //PIDE CANT DE DINERO PARA LA CARTERA
        System.out.println();
        System.out.print("¿Cuanta cantidad de dinero tienes?: ");
        Double valor = lector.nextDouble();
    
        return valor;
    }

    //----------------------------------------------------------------

    //VERIFICA SI UN USUARIO YA EXISTE
    private boolean nombreRepetido(String nombre) {
        for (int i = 0; i < cont; i++) {
            if (usuarios[i].getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    //----------------------------------------------------------------

    //INICIAR SESION
    //Este método sirve para que un usuario que se haya registrado previamente inicie sesión
    private void iniciarsesion() {
        //Comprobamos si no hay usuarios registrados
        if (usuarios[0] == null) {
            System.out.println();
            System.out.println("No hay usuarios registrados.");
            return;
        }
        String nombre = PedirNombre();
        for (int i = 0; i < cont; i++) {
            if (usuarios[i].getNombre().equals(nombre)) {
                usuarioactual = usuarios[i];
            }
        }

    }

    //REGISTRARSE
    //Este método crea un usuario y lo añade al array de usuarios de esta clase
    private void añadirusuario(Usuario añadir) {
        //Comprobamos si hay espacio para más usuarios
        if (usuarios[usuarios.length - 1] != null) {
            System.out.println();
            System.out.println("No se pueden registrar más usuarios.");
            return;
        }
        usuarios[cont] = añadir;
        cont++;
    }

    //----------------------------------------------------------------

    //1 MOSTRAR PRODUCTOS
    //Muestra los productos disponibles en nuestra tienda (los que hemos creado manualmente en stockcremas)
    private void mostrarProductos() {
        for (int i = 0; i < stockcremas.length; i++) {
            System.out.print(i + 1);
            stockcremas[i].muestracrema();
        }
    }

    //2 AGREGAR PRODUCTO
    //Agregamos un producto elegido por el usuario a su cesta
    private void agregarProducto() {
        //Comprobamos si la cesta está completa
        if (usuarioactual.getNumProd() == usuarioactual.getMaxProd()) {
            System.out.println();
            System.out.println("Tienes la cesta llena.");
            return;
        }
        mostrarProductos();
        System.out.println();
        System.out.print("Escoge el producto que deseas comprar: ");
        int posicion = lector.nextInt() - 1;

        usuarioactual.agregarCrema(stockcremas[posicion]);
    }

    //3 VER CESTA 
    //Imprimimos la cesta actual del usuario
    private void verCesta() {
        //Comprobamos si la cesta está vacía
        if (usuarioactual.getNumProd() == 0) {
            System.out.println();
            System.out.println("Tu cesta está vacía.");
            return;
        }
        System.out.println();
        System.out.println("Esta es tu cesta actual: ");
        usuarioactual.verCesta();
    }

    //4 ELIMINAR PRODUCTO 
    //Eliminamos un producto de la cesta del usuario, elegido por él
    private void eliminarProducto() {
        //Comprobamos si la cesta está vacía
        if (usuarioactual.getNumProd() == 0) {
            System.out.println();
            System.out.println("Tu cesta está vacía.");
            return;
        }
        usuarioactual.verCesta();
        System.out.println();
        System.out.print("Escoge el producto que deseas eliminar: ");
        int posicion = lector.nextInt() - 1;

        usuarioactual.eliminarCrema(posicion);
    }

    //5 ELIMINAR CUENTA
    //El usuario decide dejar de ser cliente 
    private void eliminarCuenta() {
        System.out.println();
        System.out.println("Gracias por haber sido cliente nuestro. Esperamos que vuelvas.");
        for (int i = 0; i < cont; i++) {
            if (usuarios[i] == usuarioactual) {
                usuarios[i] = null;
            }
        }
    }

    //6 PAGAR MONTO 
    //El usuario procede a pagar los productos que ha elegido y tiene en la cesta
    private void pagarMonto() {
        //Comprobamos si la cesta está vacía
        if (usuarioactual.getNumProd() == 0) {
            System.out.println();
            System.out.println("Tu cesta está vacía.");
            return;
        }
        System.out.println("Precio total:  " +  usuarioactual.getPrecioCesta());
        //Comprobamos si el usuario tiene dinero suficiente en la cartera para pagar
        if (usuarioactual.getCartera() >= usuarioactual.getPrecioCesta()) {
            System.out.println();
            System.out.println("Gracias por la compra!");
            usuarioactual.setCartera(usuarioactual.getCartera() - usuarioactual.getPrecioCesta());
            //Vaciamos la cesta del usuario actual
            for (int index = 0; index < 2; index++) {
                usuarioactual.eliminarCrema(0);
            }
        } else {
            System.out.println();
            System.out.println("Lamentablemente, no tienes suficiente dinero en la cartera.");
        }

    }

}
