package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrdenServicio {
    private String codigo;
    private String descirpcion;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private double costo;

    private EstadoOrden estadoOrden;
    private ArrayList<Tarea> listaTareas;
    private ArrayList<Mecanico> listaMecanicos;
    private Cliente cliente;
    private Bicicleta bicicleta;
    private ArrayList<Repuesto> listaRepuestos;
    private Taller ownedByTaller;
    private Mecanico mecanico;

    public OrdenServicio(String codigo, LocalDate fechaIngreso,
                         EstadoOrden estadoOrden, Taller ownedByTaller) {
        this.codigo = codigo;
        this.descirpcion = descirpcion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.costo = costo;
        this.listaTareas = listaTareas;
        this.estadoOrden = estadoOrden;
        this.listaMecanicos = listaMecanicos;
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.listaRepuestos = listaRepuestos;
        this.ownedByTaller = ownedByTaller;
        this.mecanico= mecanico;
    }
    public Mecanico getMecanico(){ return mecanico;}

    public void setMecanico(Mecanico mecanico){ this.mecanico= mecanico;}

    public EstadoOrden getEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(EstadoOrden estadoOrden) {
        this.estadoOrden = estadoOrden;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescirpcion() {
        return descirpcion;
    }

    public void setDescirpcion(String descirpcion) {
        this.descirpcion = descirpcion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public ArrayList<Mecanico> getListaMecanicos() {
        return listaMecanicos;
    }

    public void setListaMecanicos(ArrayList<Mecanico> listaMecanicos) {
        this.listaMecanicos = listaMecanicos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public ArrayList<Repuesto> getListaRepuestos() {
        return listaRepuestos;
    }

    public void setListaRepuestos(ArrayList<Repuesto> listaRepuestos) {
        this.listaRepuestos = listaRepuestos;
    }

    public Taller getOwnedByTaller() {
        return ownedByTaller;
    }

    public void setOwnedByTaller(Taller ownedByTaller) {
        this.ownedByTaller = ownedByTaller;
    }

    @Override
    public String toString() {
        return "OrdenServicio{" +
                "codigo='" + codigo + '\'' +
                ", descirpcion='" + descirpcion + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                ", costo=" + costo +
                ", estadoOrden=" + estadoOrden +
                ", listaTareas=" + listaTareas +
                ", listaMecanicos=" + listaMecanicos +
                ", cliente=" + cliente +
                ", bicicleta=" + bicicleta +
                ", listaRepuestos=" + listaRepuestos +
                ", ownedByTaller=" + ownedByTaller +
                '}';
    }

    public boolean identificarFecha(){
        boolean bandera= false;
        if(fechaIngreso.equals(LocalDate.of(2026,3,3))){
            bandera=true;
        }



        return bandera;
    }

    public void asignarMecanico(Mecanico mecanico){
        this.mecanico=mecanico;
    }

    public void agregarTarea(Tarea tarea){
        listaTareas.add(tarea);
    }

    public void agregarRepuesto(Repuesto repuesto){
        listaRepuestos.add(repuesto);
    }

}
