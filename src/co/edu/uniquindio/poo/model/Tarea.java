package co.edu.uniquindio.poo.model;

public class Tarea {
    private String nombre;
    private double costo;
    private String codigo;

    private OrdenServicio ownedByOrdenServicio;

    public Tarea(String nombre, double costo, String codigo, OrdenServicio ownedByOrdenServicio) {
        this.nombre = nombre;
        this.costo = costo;
        this.codigo = codigo;
        this.ownedByOrdenServicio = ownedByOrdenServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public OrdenServicio getOwnedByOrdenServicio() {
        return ownedByOrdenServicio;
    }

    public void setOwnedByOrdenServicio(OrdenServicio ownedByOrdenServicio) {
        this.ownedByOrdenServicio = ownedByOrdenServicio;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", costo=" + costo +
                ", codigo='" + codigo + '\'' +
                ", ownedByOrdenServicio=" + ownedByOrdenServicio +
                '}';
    }

}

