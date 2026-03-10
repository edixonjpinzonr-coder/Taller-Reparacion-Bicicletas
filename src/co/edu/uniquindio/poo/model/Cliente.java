package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String identificacion;
    private String direccion;
    private LocalDate fechaNacimiento;
    private String telefono;
    private int numeroBicicletas;

    private Taller ownedByTaller;
    private ArrayList<Bicicleta> listaBicicletas;
    private ArrayList<OrdenServicio> listaOrdenesServicios;


    public Cliente(String identificacion,String nombre, String direccion,
                   LocalDate fechaNacimiento,String telefono,
                   int numeroBicicletas, Taller ownedByTaller) {

        this.identificacion= identificacion;
        this.nombre = nombre;
        this.fechaNacimiento= fechaNacimiento;
        this.telefono= telefono;
        this.direccion= direccion;
        this.numeroBicicletas=numeroBicicletas;
        this.listaBicicletas= new ArrayList<>();
        this. listaOrdenesServicios = new ArrayList<>();
        this.ownedByTaller= ownedByTaller;
    }


    public String getIdentificacion(){
        return identificacion;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion= identificacion;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento= fechaNacimiento;
    }

    public ArrayList<Bicicleta> getListaBicicletas(){
        return listaBicicletas;
    }
    public void setListaBicicletas(ArrayList<Bicicleta> listaBicicletas){
        this.listaBicicletas= listaBicicletas;
    }

    public ArrayList<OrdenServicio> getListaOrdenesServicios() {
        return listaOrdenesServicios;
    }

    public void setListaOrdenesServicios(ArrayList<OrdenServicio> listaOrdenesServicios) {
        this.listaOrdenesServicios = listaOrdenesServicios;
    }

    public Taller getOwnedByTaller() {
        return ownedByTaller;
    }

    public void setOwnedByTaller(Taller ownedByTaller) {
        this.ownedByTaller = ownedByTaller;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumeroBicicletas() {
        return numeroBicicletas;
    }

    public void setNumeroBicicletas(int numeroBicicletas) {
        this.numeroBicicletas = numeroBicicletas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", telefono='" + telefono + '\'' +
                ", numeroBicicletas=" + numeroBicicletas +
                ", ownedByTaller=" + ownedByTaller +
                ", listaBicicletas=" + listaBicicletas +
                ", listaOrdenesServicios=" + listaOrdenesServicios +
                '}';
    }
}
