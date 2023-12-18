package dominio;

import java.io.Serializable;


/**
 * Clase que representa un teléfono de la marca Apple.
 * Extiende la clase abstracta Telefono e implementa la interfaz Serializable.
 */
public class TelefonoApple extends Telefono implements Serializable {

    /**
     * Constructor de la clase TelefonoApple.
     *
     * @param peso     Peso del teléfono.
     * @param pantalla Tamaño de la pantalla del teléfono.
     * @param bateria  Capacidad de la batería del teléfono.
     * @param camara   Resolución de la cámara del teléfono.
     * @param memoria  Capacidad de almacenamiento del teléfono.
     * @param precio   Precio del teléfono.
     * @param marca    Marca del teléfono.
     * @param modelo   Modelo del teléfono.
     */

    public TelefonoApple(double peso, double pantalla, int bateria, int camara, int memoria, double precio, String marca, String modelo) {
        super(peso, pantalla, bateria, camara, memoria, precio, marca, modelo);
    }

    /**
     * Convierte el objeto TelefonoApple a una cadena en formato CSV.
     *
     * @return Cadena en formato CSV que representa el teléfono.
     */
    @Override
    public String toCSV() {
        return "Apple," + super.toCSV();
    }


    /**
     * Convierte el objeto TelefonoApple a una cadena de texto.
     *
     * @return Cadena de texto que representa el teléfono Apple.
     */
    @Override
    public String toString() {
        return "Apple{" +
                "=" + getPeso() +
                ", peso=" + getPantalla() +
                ", pantalla=" + getBateria() +
                ", Bateria=" + getCamara() +
                ", defensa=" + getMemoria() +
                ", regate=" + getPrecio() +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                '}';
    }


    /**
     * Crea un objeto TelefonoApple a partir de una cadena en formato CSV.
     *
     * @param csvLine Cadena en formato CSV que representa el teléfono.
     * @return Objeto TelefonoApple creado a partir de la cadena CSV.
     */
    public static Telefono fromCSV(String csvLine) {
        String[] values = csvLine.split(",");
        return new TelefonoApple(
                Double.parseDouble(values[1]),
                Double.parseDouble(values[2]),
                Integer.parseInt(values[3]),
                Integer.parseInt(values[4]),
                Integer.parseInt(values[5]),
                Double.parseDouble(values[6]),
                values[7],
                values[8]
        );
    }
}