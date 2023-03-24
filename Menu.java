//GK(Giuliana y Catherine)
public class Menu {
     
    static int cont = 0;
    static int max = 100;
    static int menu = 0;
    static int mascara, sombra, deliniador; //ojos
    static int base,iluminador; //rostro
    static int labial, gloss; //boca
    static int hidra, exfo, limpieza; //skincare
    static double pagos;
    static String[] cuenta = new String [max];
    static int[] cesta = new int[50]; 

    static boolean busca = false;

    //Creamos el menu
    public static int menu(){

            System.out.println("I.Registro nuevo usuario"); 
            System.out.println("II.Ojos");
            System.out.println("III.Boca");
            System.out.println("IV.Rostro");
            System.out.println("V.Skincare");
            System.out.println("VI.Cesta");
            System.out.println("VII.Salir");

            int opciones = PedirDatoEnRango(1,7);
        
            return opciones;
        
    }
    public static void programa(int opciones) {    
        switch(opciones){
        case 1:  //Ver cuentas
                registro();
                break;

        case 2:  //Ingresar dinero
               ojos();
                break;

        case 3:  //Retirar dinero
                boca();
                break;
            
        case 4:  //Agregar cuenta
                rostro();
                break;

        case 5:  //Eliminar cuenta
                skincare ();
                break;
            
        case 6:  //Buscar cuenta
               cesta();
                break;

        default: System.out.println("Salir"); //Salir

        }
    }
        //Metodos

        public static void registro() {
        System.out.println("Ver cuentas"); ////1.metodo para Ver cuentas
                if(cont == 0){
                    System.out.println("Disculpa,no hay cuentas disponibles");
                }
                for(int i=0; i < cont; i++){
                    System.out.println(i +"." + cuenta[i]+ " Saldo: " + saldo[i]);//muestra cuentas  
                }
                return;
        }  

        public static void ojos() {
                ////2.metodo para Ingresar dinero
                if(cont == 0){
                    System.out.println("Disculpa,no hay cuentas disponibles");
                }else{
                    System.out.println("Selecciona la cuenta a ingresar: " );
                    int cuent = PedirDato(); //pregunta al usuario por cuenta y saldo
                   
                    System.out.println("Selecciona el saldo a ingresar en " + cuent);
                    int dinero = PedirDato();
                    if (dinero<=0) {
                        System.out.println("Saldo invalido");
                    } else {
                        saldo[cuent] += dinero;  //a la cuenta selecccionada añade el saldo ingresado
                    }
                } System.out.println("Su saldo actual es de " + saldo[cuent]);// muestra saldo actual
                return;
        }  

        public static void boca() {
            ////3.metodo para Retirar dinero
            if (cont==0) { //pregunta al usuario por cuenta y saldo
                System.out.println("Cuenta inexistente, seleccione otra cuenta");
            }
            else{
            System.out.println("Selecciona la cuenta a retirar: ");
                cuent = PedirDato();
                    //CANT. DE DINERO  A RETIRAR
            System.out.println( "Selecciona el saldo a retirar: "+ cuent + " ?" );
                dinero = PedirDato();
                saldo[cuent] -= dinero;//a la cuenta selecccionada retira el saldo indicado
                System.out.println("Su saldo actual es de " + saldo[cuent]);// muestra saldo actual
            }
            return;
        }
        
        public static boolean nombreRepetido() {
            boolean repetido = false;
            for (int i = 0; i < max; i++) {
                if (cuenta[i].toLowerCase().equals(cuenta[cuent].toLowerCase())) {
                    repetido = true;
                }
            }
            return repetido;
        }
        public static void rostro() {
            ////4.metodo para Agregar cuenta
            if (cont< max) {  //Creamos cuenta nueva desde cero si hay hueco en nuestra matriz
                System.out.println("¿Cual sera el nombre de la nueva cuenta bancaria?: ");
                    String nombre= PedirNombre();
                    for (int i = 0; i < cont; i++) {
                        if (nombreRepetido()) {
                            System.out.println("Ya existe una cuenta con ese nombre.");
                            return;
                        }
                    }
                    cuenta[cont] = nombre;
                    
                System.out.println("¿Cuanto saldo añadiras a la nueva cuenta bancaria?: ");
                    dinero = PedirDato();
                    saldo[cont] = dinero;
                    
                    cont++;
                    System.out.println("Cuenta agregada correctamente.");
            } else {
                System.out.println("No es posible");
            }
            
        }

        public static void skincare() { //5.metodo para eliminar cuenta

            if(cont == 0){
                System.out.println("Disculpa,no hay cuentas disponibles");

            System.out.println("Selecciona la cuenta a eliminar");
                int borrar = PedirDato();
                if (cont==0){
                    System.out.println("No existe la cuenta");
                
                }else if(borrar >= 0 && borrar < cont){ //Busca la cuenta y desplaza fila y columna para eliminación
                    System.out.println("Se ha borrado la cuenta de " + cuenta[borrar-1]);
                    for (int i = borrar + 1; i < cont; i++){
                        cuenta[i-1] = cuenta[i];
                        saldo[i-1] = saldo[i];
                    }
                    cont--;
                    System.out.println("Cuenta eliminada");
                } 
                return;
        }
    }
        public static void buscar() { //6.metodo para buscar cuenta
           
            String busca; 
             
            if (cuenta[0].isEmpty()) {
                System.out.println("No hay cuentas.");
            } 
            if (!cuenta[0].isEmpty()) {
                System.out.println();
                busca = PedirNombre();

            System.out.println("Dime el usuario: ");
                String usuario = PedirNombre(); //Pide al usuario  el nombre cuenta a mostrar
                  
                    for(int i=0; i < cont; i++){
                        if (cuenta[i].toLowerCase().contains(usuario.toLowerCase())) {
                            System.out.println(i + "Nombre: " + cuenta[i]);
                            System.out.println();
                            cont++; 
                        }
                        if(cont == 0){
                            System.out.println("No se han encontrado cuentas");
                        }
                    } 
                    return;
                }
        }

        public static void cesta() { ////7.metodo para mostrar las cuentas en negativo

            if(cont == 0){
                System.out.println("Disculpa,no hay cuentas disponibles");

                for(int i = 0; i < cont; i++){
                    if (saldo[i]<0) {
                        System.out.println("Cuentas en saldo en negativo: " + cuenta[i] + " : " + saldo[i]);  
                    }
                    else{
                        System.out.println("Ninguna cuenta en negativo");
                    } 
                }
                return;
            }
        }

        public static int PedirDato(){ //Pide un dato al cliente
            Scanner lector = new Scanner(System.in);
            
            int valor;
            valor = lector.nextInt();
           
            return valor;  
            
        } 

        public static String PedirNombre(){ //Pide un nombre al cliente
            Scanner lector = new Scanner(System.in);
            
            String valor;
            valor = lector.nextLine();
          
            return valor;  
            
        } 

        public static int PedirDatoEnRango(int min, int max) {
            //Pide los rangos del menu 1-8
            int valor;
    
            do {
                System.out.print("Selecione la opcion deseada: ");
                valor = PedirDato();
                if (valor < min || valor > max) {
                    System.out.println("AVISO: Valor incorrecto.");
                }
            } while (valor < min || valor > max);
    
            //lector.close();
                
            return valor;
        }       
}


