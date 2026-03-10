package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Bicicleta {
    private String marca;
    private String serial;
    private String color;

    private Taller ownedByTaller;
    private ArrayList<OrdenServicio> listaOrdenesServicios;
    private Cliente cliente;

    private Bicicleta(String marca, String serial, String color){
        this.marca= marca;
        this.serial= serial;
        this.color=color;
        this.listaOrdenesServicios=new ArrayList<>();
        this.ownedByTaller= ownedByTaller;
        this.cliente= cliente;
    }

    private String getMarca(){
        return marca;
    }
    private void setMarca(String marca){
        this.marca=marca;
    }
    String getSerial(){
        return serial;
    }
    private void setSerial(String serial){
        this.serial= serial;

    }
    private String getColor(){
        return color;

    }
    private void setColor(String color){
        this.color=color;
    }

    private ArrayList<OrdenServicio> getListaOrdenesServicios(){
        return listaOrdenesServicios;
    }
    private void setListaOrdenesServicios(ArrayList<OrdenServicio> listaOrdenesServicios){
        this.listaOrdenesServicios= listaOrdenesServicios;
    }
    private Taller getOwnedByTaller(){
        return ownedByTaller;
    }
    private void setOwnedByTaller(Taller ownedByTaller){
        this.ownedByTaller= ownedByTaller;
    }
    private Cliente getCliente(){
        return cliente;
    }
    private void setCliente(Cliente cliente){
        this.cliente= cliente;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", serial='" + serial + '\'' +
                ", color='" + color + '\'' +
                ", ownedByTaller=" + ownedByTaller +
                ", listaOrdenesServicios=" + listaOrdenesServicios +
                ", cliente=" + cliente +
                '}';
    }

    public boolean obtenerSerial() {
        boolean bandera= false;
        if(serial.startsWith("5")){
            bandera= true;
        }

        return bandera;
    }

    public boolean identificarFecha() {
        boolean bandera= false;
        for(OrdenServicio Aux: listaOrdenesServicios){
            if(Aux.identificarFecha()){
                bandera= true;
            }
        }
        return bandera;
    }
}
