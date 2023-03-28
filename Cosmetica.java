//GK(Giuliana y Catherine)
public class Cosmetica {
  
//main
//Creamos un  metodo que llama a tiendacosmetica
//ATRIBUTOS
TiendaCosmetica GK = new TiendaCosmetica();

public static void main(String[]args) {


    //Bucle para pasar por los apartados del menu
    int opciones = 0;

    do {
        opciones = TiendaCosmetica.menu();
        TiendaCosmetica.programa(opciones);
        System.out.println("");
    } while (opciones !=6);  
   
}

/*TiendaCosmetica iniciar ();*/
    
}
