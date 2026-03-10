package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Repuesto {
   private String nombre;
   private double costo;
   private int cantidad;

   private Taller ownedByTaller;
   private ArrayList<OrdenServicio> listaOrdenesServicios;

    public Repuesto(String nombre, double costo, int cantidad, Taller ownedByTaller) {
        this.nombre = nombre;
        this.costo = costo;
        this.cantidad = cantidad;
        this.ownedByTaller= ownedByTaller;
        this.listaOrdenesServicios=new ArrayList<>();

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

    public Taller getOwnedByTaller() {
        return ownedByTaller;
    }

    public void setOwnedByTaller(Taller ownedByTaller) {
        this.ownedByTaller = ownedByTaller;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<OrdenServicio> getListaOrdenesServicios() {
        return listaOrdenesServicios;
    }

    public void setListaOrdenesServicios(ArrayList<OrdenServicio> listaOrdenesServicios) {
        this.listaOrdenesServicios = listaOrdenesServicios;
    }

    @Override
    public String toString() {
        return "Repuesto{" +
                "nombre='" + nombre + '\'' +
                ", costo=" + costo +
                ", cantidad=" + cantidad +
                ", ownedByTaller=" + ownedByTaller +
                ", listaOrdenesServicios=" + listaOrdenesServicios +
                '}';
    }
}
