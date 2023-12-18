package aplicacion;

import presentacion.InterfazUsuario;
import dominio.*;

import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        GestorTelefonos gestorTelefonos = new GestorTelefonos();

        ManejadorCSV manejadorCSV = new ManejadorCSV();

        
        String rutaArchivo = "../telefonos.csv";
        try {
            List<Telefono> telefonosCargadas = manejadorCSV.cargarTelefonosDesdeCSV(rutaArchivo);
            for (Telefono telefono : telefonosCargadas) {
                gestorTelefonos.agregarTelefono(telefono);
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar los telefonos desde el archivo CSV.");
        }

        
        InterfazUsuario interfazUsuario = new InterfazUsuario(gestorTelefonos);
        interfazUsuario.mostrarMenu();

        try {
            
            manejadorCSV.guardarTelefonosCSV(gestorTelefonos.obtenerTelefonos(), rutaArchivo);
        } catch (IOException e) {
            System.out.println("No se pudo guardar los telefonos en el archivo CSV.");
        }
    }
}