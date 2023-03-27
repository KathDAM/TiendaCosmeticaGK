//GK(Giuliana y Catherine)
public class TiendaCosmetica {

    public static void main(String[]args) {

        private Usuario[] usuario;
        usuario = new Usuario[100];

        //Bucle para pasar por los apartados del menu
        int opciones=0;

        do {
            opciones = menu();
            programa(opciones);
            System.out.println("");
        } while (opciones !=8);  
            
    }
}

