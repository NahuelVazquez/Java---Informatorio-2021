package Ejercicio6;


public class Empleado {
    
    private String nombre;
    private String apellido;
    private int DNI;
    private int horas;
    private Float valor;

    public Empleado(String nombre, String apellido, int DNI, int horas, Float valor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.horas = horas;
        this.valor = valor;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    public String toString() {
        return "empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", horas=" + horas + ", valor=" + valor + '}';
    }
    
}

