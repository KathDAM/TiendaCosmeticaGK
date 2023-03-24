public class Usuario {
    

    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private String telefono;
    private double cartera;
    private Crema[] cremas

    //CONSTRUCTOR VACIO
    public Usuario() {
       
    }
    //CONSTRUCTOR
    public Usuario() {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cartera = cartera;
        cremas = new Crema[20];
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
}
