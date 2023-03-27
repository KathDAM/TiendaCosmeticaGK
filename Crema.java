//GK(Giuliana y Catherine)
public class Crema{
     
    //ATRIBUTOS
    private String nombre;
    private int cant;
    private String descripcion;
    private double precio;

    //CONSTRUCTOR VACIO
    public Crema() {
        
    }

    //CONSRUCTOR
    public Crema(int cant, String nombre) {
        this.cant = cant;
        this.nombre = nombre;
    }

    //GETTERS 
    public String getNombre() {
        return nombre;
    }
    public int getCant() {
        return cant;
    }
    public String getDescripcion() {
        return descripcion;
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
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}


