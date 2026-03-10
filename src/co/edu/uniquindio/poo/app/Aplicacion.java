package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Bicicleta;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.OrdenServicio;
import co.edu.uniquindio.poo.model.Taller;

import javax.swing.*;
import java.time.LocalDate;

public class Aplicacion {
    static void main(String [] args){
        String nombre= JOptionPane.showInputDialog("ingrese el nombre del taller");
        String direccion= JOptionPane.showInputDialog("ingrese la direccion del taller");

        Taller taller= new Taller(nombre, direccion);
        Taller taller2= new Taller(nombre, direccion);
        Taller taller1= new Taller(nombre, direccion);

        Bicicleta bici= new Bicicleta("aa","asdf","rojo");

        taller1.crearOrden(bici,"frenos dañados");







        int resultado2= taller2.obtenerCantidadBicicletas();


        String Aux= taller.getNombre();
        String Aux2= taller.getDireccion();

        String nombreCliente= JOptionPane.showInputDialog
                ("ingrese el nombre del cliente");
        String identificacionCliente= JOptionPane.showInputDialog
                ("ingrese la identificacion del cliente");





        String resultado= taller.registrarCliente
                (nombreCliente, identificacionCliente,
                        "calle 1", LocalDate.of(2000, 8, 18), "344444",
                        3);



        JOptionPane.showMessageDialog(null, "el nombre del taller es: "+ Aux);
        JOptionPane.showMessageDialog(null,"y la direccion es: "+ Aux2);

        mostrarMensaje(resultado, resultado2);
        bici.mostrarOrdenes();


    }
    public static void mostrarMensaje(String mensaje, int resultado2){

       System.out.println(mensaje);
       System.out.println(resultado2);
    }




}
