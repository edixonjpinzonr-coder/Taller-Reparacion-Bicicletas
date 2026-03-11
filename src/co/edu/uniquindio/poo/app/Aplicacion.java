package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

import javax.swing.*;
import java.time.LocalDate;

public class Aplicacion {
    static void main(String [] args){
        String nombre= JOptionPane.showInputDialog("ingrese el nombre del taller");
        String direccion= JOptionPane.showInputDialog("ingrese la direccion del taller");

        Taller taller= new Taller(nombre, direccion);

        String nombreCliente= JOptionPane.showInputDialog("ingrese el nombre del cliente");
        String identificacionCliente= JOptionPane.showInputDialog("ingrese la identificacion del cliente");

        String resultado= taller.registrarCliente
                (nombreCliente, identificacionCliente,
                        "calle 1",
                        LocalDate.of(2000, 8, 18), "344444",
                        3);


        Bicicleta bici= new Bicicleta("","","");

        taller.crearOrden(bici,"frenos dañados");

        int resultado2= taller.obtenerCantidadBicicletas();
        OrdenServicio orden = taller.crearOrden(bici,"frenos dañados");

        Mecanico mecanico= new Mecanico("juan", "30000", "12347", "12345");
        orden.asignarMecanico(mecanico);





        String Aux= taller.getNombre();
        String Aux2= taller.getDireccion();

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
