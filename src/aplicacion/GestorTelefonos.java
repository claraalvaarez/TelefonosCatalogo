package aplicacion;

import dominio.Telefono;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase GestorTelefonos se encarga de gestionar una lista de teléfonos.
 * Permite agregar, eliminar, modificar y obtener la lista de teléfonos.
 */

public class GestorTelefonos {
    private List<Telefono> telefonos;

    /**
     * Constructor de la clase GestorTelefonos. Inicializa la lista de teléfonos.
     */

    public GestorTelefonos() {
        this.telefonos = new ArrayList<>();
    }

/**
     * Agrega un teléfono a la lista.
     *
     * @param telefono El teléfono a agregar.
     */

    public void agregarTelefono(Telefono telefono) {
        telefonos.add(telefono);
    }

    /**
     * Elimina un teléfono de la lista.
     *
     * @param telefono El teléfono a eliminar.
     */

    public void eliminarTelefono(Telefono telefono) {
        telefonos.remove(telefono);
    }

    /**
     * Modifica un teléfono en la lista.
     *
     * @param indice   Índice del teléfono a modificar.
     * @param telefono El nuevo teléfono que reemplazará al existente.
     */

    public void modificarTelefono(int indice, Telefono telefono ) {
        if (indice >= 0 && indice < telefonos.size()) {
            telefonos.set(indice, telefono);
        }
    }

    /**
     * Obtiene una lista nueva que contiene todos los teléfonos actuales.
     *
     * @return Lista de teléfonos.
     */

    public List<Telefono> obtenerTelefonos() {
        return new ArrayList<>(telefonos);
    }
}