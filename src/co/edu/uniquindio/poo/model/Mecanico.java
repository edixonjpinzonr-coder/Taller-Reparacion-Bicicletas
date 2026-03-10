package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Mecanico {
    private String nombre;
    private String salario;
    private String telefono;
    private String identificacion;

    private Taller ownedByTaller;
    private ArrayList<OrdenServicio> listaOrdenesServicios;

    private Mecanico(String nombre,String salario, String telefono, String identificacion){
        this.identificacion= identificacion;
        this.nombre= nombre;
        this.salario= salario;
        this.telefono= telefono;
        this.ownedByTaller= ownedByTaller;
        this.listaOrdenesServicios= new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Taller getOwnedByTaller() {
        return ownedByTaller;
    }

    public void setOwnedByTaller(Taller ownedByTaller) {
        this.ownedByTaller = ownedByTaller;
    }

    public ArrayList<OrdenServicio> getListaOrdenesServicios() {
        return listaOrdenesServicios;
    }

    public void setListaOrdenesServicios(ArrayList<OrdenServicio> listaOrdenesServicios) {
        this.listaOrdenesServicios = listaOrdenesServicios;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", salario='" + salario + '\'' +
                ", telefono='" + telefono + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", ownedByTaller=" + ownedByTaller +
                ", listaOrdenesServicios=" + listaOrdenesServicios +
                '}';
    }
}
