//GK(Giuliana y Catherine)
//SCANNER
import java.sql.Array;
import java.util.Scanner;

public class Usuario {

    //ATRIBUTOS
    private String nombre; //N0MBRE USUARIO 
    private String direccion; //DIRECCION DEL USUARIO
    private String telefono; //TELEFONO DEL USUARIO
    private int maxProd = 50; //CANT MAXIMA PERMITIDA DE CREMAS POR USUARIO
    private Crema[] cesta = new Crema[maxProd]; //ARRAY 
    private int numProd = 0; //CONTADOR DE PRODUCTOS EN CARRITO
    private double cartera;
    private double precioCesta = 0;

    //CONSTRUCTOR USUARIO VACIO
    public Usuario() {
       
    }

    //CONSTRUCTOR
    public Usuario(String nombre, String direccion, String telefono, double cartera, int maxProd) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.maxProd = maxProd;
        this.cartera = cartera;
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
    public int getNumProd() {
        return numProd;
    }
    public double getCartera() {
        return cartera;
    }
    public double getPrecioCesta() {
        return precioCesta;
    }
    public int getMaxProd() {
        return maxProd;
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
    public void setMaxProd(int maxProd) {
        this.maxProd = maxProd;
    }
    public void setCartera(double cartera) {
        this.cartera = cartera;
    }
    public void setPrecioCesta(double precioCesta) {
        this.precioCesta = precioCesta;
    }
  
    //MÉTODOS

    //AGREGAR CREMA
    public void agregarCrema(Crema crema){
        cesta[numProd] = crema;
        numProd++;
        precioCesta += crema.getPrecio();
    }

    //ELIMINAR CREMA
    public void eliminarCrema(int posicion) {
        precioCesta -= cesta[posicion].getPrecio();
        cesta[posicion] = null;
        for (int i = posicion; i < numProd; i++) {
            cesta[i] = cesta[i + 1];
        }
        numProd--;
    }

    //VER CESTA
    public Crema[] verCesta(){
        for (int i = 0; i < numProd; i++) {
            System.out.println(i + 1);
            cesta[i].muestracrema();
        }
        return cesta;
    }

}
