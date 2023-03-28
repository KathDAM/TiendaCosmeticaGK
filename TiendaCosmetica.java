//GK(Giuliana y Catherine)

//SCANNER
import java.util.Scanner;

public class TiendaCosmetica {

//MENUUSUARIO   
public static int menu(){

    System.out.println("1.Registro nuevo usuario"); 
    System.out.println("2.Cremas");
    System.out.println("3.Agregar a Cesta");
    System.out.println("4.Eliminar a Cesta");
    System.out.println("5.Pagar");
    System.out.println("6.Salir");


    int opciones = pedirrango(1,6);

    return opciones;
}

public static void programa(int opciones) {    
    switch(opciones){
    case 1:  //REGISTRAR USUARIO
        Usuario.registrarusuario();
        break;

    case 2:  //AGREGSR CREMA
        Usuario.cremas();
        break;

    case 3:  //PAGAR MONTO
        Usuario.agregarcrema();
        break;
        
    case 4:  //Agregar cuenta
        Usuario.eliminar();
        break;

    case 5:  //Eliminar cuenta
        Usuario.pagarmonto();
        break;

    default: System.out.println("Salir"); //Salir

    }
}
   public static int pedirrango(int min, int max) { 
        Scanner lector = new Scanner(System.in);
        
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

}
