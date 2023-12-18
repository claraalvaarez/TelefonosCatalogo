package aplicacion;

import presentacion.InterfazUsuario;
import dominio.*;

import java.io.IOException;
import java.util.List;

/**
 * Clase principal que inicia la aplicación del catálogo de teléfonos.
 */

public class Main {

     /**
     * Punto de entrada principal de la aplicación.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Crear el gestor de teléfonos y el manejador CSV
        GestorTelefonos gestorTelefonos = new GestorTelefonos();
        ManejadorCSV manejadorCSV = new ManejadorCSV();

        // Ruta del archivo CSV donde se almacenan los teléfonos
        String rutaArchivo = "../telefonos.csv";

        // Cargar teléfonos existentes desde el archivo CSV
        try {
            List<Telefono> telefonosCargadas = manejadorCSV.cargarTelefonosDesdeCSV(rutaArchivo);
            for (Telefono telefono : telefonosCargadas) {
                gestorTelefonos.agregarTelefono(telefono);
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar los telefonos desde el archivo CSV.");
        }

        // Crear la interfaz de usuario y mostrar el menú
        InterfazUsuario interfazUsuario = new InterfazUsuario(gestorTelefonos);
        interfazUsuario.mostrarMenu();

        // Guardar los teléfonos en el archivo CSV al salir
        try {
            
            manejadorCSV.guardarTelefonosCSV(gestorTelefonos.obtenerTelefonos(), rutaArchivo);
        } catch (IOException e) {
            System.out.println("No se pudo guardar los telefonos en el archivo CSV.");
        }
    }
}