package aplicacion;

import dominio.Telefono;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase ManejadorCSV proporciona métodos para la lectura y escritura de
 * objetos de la clase Telefono desde y hacia archivos CSV.
 */
public class ManejadorCSV {

    /**
     * Guarda una lista de teléfonos en un archivo CSV.
     *
     * @param telefonos   La lista de teléfonos a guardar.
     * @param rutaArchivo La ruta del archivo CSV donde se guardarán los teléfonos.
     * @throws IOException Si ocurre un error de entrada/salida durante la escritura.
     */
    public void guardarTelefonosCSV(List<Telefono> telefonos, String rutaArchivo) throws IOException {
        try (PrintWriter pw = new PrintWriter(new File(rutaArchivo))) {
            for (Telefono telefono : telefonos) {
                pw.println(telefono.toCSV());
            }
        }
    }

    /**
     * Carga una lista de teléfonos desde un archivo CSV.
     *
     * @param rutaArchivo La ruta del archivo CSV desde donde se cargarán los teléfonos.
     * @return La lista de teléfonos cargada desde el archivo.
     * @throws IOException Si ocurre un error de entrada/salida durante la lectura.
     */
    public List<Telefono> cargarTelefonosDesdeCSV(String rutaArchivo) throws IOException {
        List<Telefono> telefonos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                Telefono telefono = Telefono.fromCSV(line);
                telefonos.add(telefono);
            }
        }
        return telefonos;
    }
}