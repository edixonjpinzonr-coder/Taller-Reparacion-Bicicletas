package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Taller {
    private String nombre;
    private String direccion;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Bicicleta> listaBicicletas;
    private ArrayList<Mecanico> listaMecanicos;
    private ArrayList<Repuesto> listaRepuestos;
    private ArrayList<OrdenServicio> listaOrdenesServicios;

    public Taller(String nombre, String direccion){
        this.nombre= nombre;
        this.direccion= direccion;

        listaClientes= new ArrayList<>();
        listaBicicletas= new ArrayList<>();
        listaMecanicos= new ArrayList<>();
        listaRepuestos= new ArrayList<>();
        listaOrdenesServicios= new ArrayList<>();

    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
    public String getDireccion(){
        return direccion;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes){
        this.listaClientes= listaClientes;

    }
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Mecanico> getListaMecanicos() {
        return listaMecanicos;
    }

    public void setListaMecanicos(ArrayList<Mecanico> listaMecanicos) {
        this.listaMecanicos = listaMecanicos;
    }

    public ArrayList<OrdenServicio> getListaOrdenesServicios() {
        return listaOrdenesServicios;
    }

    public void setListaOrdenesServicios(ArrayList<OrdenServicio> listaOrdenesServicios) {
        this.listaOrdenesServicios = listaOrdenesServicios;
    }

    public ArrayList<Bicicleta> getListaBicicletas(){
        return listaBicicletas;
    }
    public void setListaBicicletas(ArrayList<Bicicleta> listaBicicletas){
        this.listaBicicletas= listaBicicletas;
    }

    public ArrayList<Repuesto> getListaRepuestos() {
        return listaRepuestos;
    }

    public void setListaRepuestos(ArrayList<Repuesto> listaRepuestos) {
        this.listaRepuestos = listaRepuestos;
    }

    @Override
    public String toString() {
        return "Taller{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listaClientes=" + listaClientes +
                ", listaBicicletas=" + listaBicicletas +
                ", listaMecanicos=" + listaMecanicos +
                ", listaRepuestos=" + listaRepuestos +
                ", listaOrdenesServicios=" + listaOrdenesServicios +
                '}';
    }
    public String registrarCliente(String nombre,String identificacion , String direccion, LocalDate fechaNacimiento,
                                   String telefono, int numeroBicicletas) {
        String resultado = "";

        Cliente clienteEncontrado= buscarCliente (identificacion);
        if(clienteEncontrado != null){
            resultado= "el cliente ya existe";
        }else{
            Cliente cliente= new Cliente(nombre, identificacion, direccion,
                    fechaNacimiento, telefono,numeroBicicletas, this);
            listaClientes.add(cliente);
            resultado= "el cliente ya ha sido registrado";
        }


        return resultado;

    }

    public Cliente buscarCliente(String identificacion){
        Cliente clienteAux= null;
        for(Cliente Aux: listaClientes){
            if(Aux.getIdentificacion().equals(identificacion)){
                return clienteAux;
            }
        }


        return clienteAux;
    }

    public String actualizarCliente(String nombre,String identificacion , String direccion, LocalDate fechaNacimiento,
                                    String telefono, int numeroBicicletas) {
        String resultado = "";

        Cliente clienteEncontrado= buscarCliente (nombre);
        if(clienteEncontrado == null){
            resultado= "el cliente no existe";
        }else{
            clienteEncontrado.setNombre(nombre);
            clienteEncontrado.setIdentificacion(identificacion);

            listaClientes.add(clienteEncontrado);
            resultado= "el cliente ya ha sido registrado";
        }


        return resultado;

    }

    public int obtenerCantidadBicicletas(){
        int cantidad= 0;

        for(Bicicleta bici: listaBicicletas){
            if(bici.obtenerSerial()&& bici.identificarFecha()){
                cantidad++;
            }
        }

        return cantidad;
    }

    public void bincularBicicletaCliente(Cliente cliente, Bicicleta bicicleta){
        cliente.asignarBicicleta(bicicleta);
    }
    public void crearOrden(Bicicleta bici, String descripcion){
        OrdenServicio orden= new OrdenServicio(descripcion, LocalDate.now(),EstadoOrden.RECIBIDA);
        bici.agregarOrden(orden);

    }

    public String asignarMecanico(){
        String resultado= "";
        for(Mecanico Aux: listaMecanicos){
            if(Aux!= null){

            }

        }




        return resultado;
    }

}
