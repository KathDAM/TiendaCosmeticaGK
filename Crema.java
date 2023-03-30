//GK(Giuliana y Catherine)
public class Crema{
     
    //ATRIBUTOS
    private String nombre;
    private int cant;
    private double precio;

    //CONSTRUCTOR VACIO
    public Crema() {
        
    }

    //CONSTRUCTOR
    public Crema(String nombre, int cant, double precio ) {
        this.nombre = nombre;
        this.cant = cant;
        this.precio = precio;
    }

    //GETTERS 
    public String getNombre() {
        return nombre;
    }
    public int getCant() {
        return cant;
    }

    public double getPrecio() {
        return precio;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //METODOS

    //MOSTRAR CREMA
    public void muestracrema() {
        System.out.println();
        System.out.println("Nombre crema: " + getNombre());
        System.out.println("Cantidad crema: " + getCant());
        System.out.println("Precio crema: " + getPrecio()); 
    }
}


