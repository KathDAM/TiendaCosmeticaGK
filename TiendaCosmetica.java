public class TiendaCosmetica {

public static void main(String[]args) {

    Crema c1 = new Crema();
    System.out.println("Skincare comprada" + getCant() + getPrecio() );

    //Bucle para pasar por los apartados del menu
    int opciones=0;

    do {
        opciones = menu();
        programa(opciones);
        System.out.println("");
    } while (opciones !=8);  
         
}
}

