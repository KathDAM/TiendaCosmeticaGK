//GK(Giuliana y Catherine)
public class Cosmetica {
  
    public static void main(String[]args) {
        //Bucle para pasar por los apartados del menu
        int opciones=0;
    
        do {
            opciones = menu();
            programa(opciones);
            System.out.println("");
        } while (opciones !=8);  
    }



    
    
}
