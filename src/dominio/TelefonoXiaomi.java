package dominio;

import java.io.Serializable;

/**
 * Clase que representa un teléfono de la marca Xiaomi.
 * Hereda de la clase abstracta Telefono y implementa la interfaz Serializable.
 */
public class TelefonoXiaomi extends Telefono implements Serializable {

/**
     * Constructor para la clase TelefonoXiaomi.
     *
     * @param peso     El peso del teléfono.
     * @param pantalla El tamaño de la pantalla del teléfono.
     * @param bateria  La capacidad de la batería del teléfono.
     * @param camara   La resolución de la cámara del teléfono.
     * @param memoria  La capacidad de almacenamiento del teléfono.
     * @param precio   El precio del teléfono.
     * @param marca    La marca del teléfono.
     * @param modelo   El modelo del teléfono.
     */
    public TelefonoXiaomi(double peso, double pantalla, int bateria, int camara, int memoria, double precio, String marca, String modelo) {
        super(peso, pantalla, bateria, camara, memoria, precio, marca, modelo);
    }

/**
     * Convierte el objeto TelefonoXiaomi a una cadena en formato CSV.
     *
     * @return Una cadena en formato CSV que representa el teléfono.
     */
    @Override
    public String toCSV() {
        return "Xiamoi," + super.toCSV();
    }

/**
     * Genera una representación en cadena del objeto TelefonoXiaomi.
     *
     * @return Una cadena que representa el teléfono Xiaomi.
     */
    @Override
    public String toString() {
        return "Xiamoi{" +
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
     * Crea un objeto TelefonoXiaomi a partir de una cadena en formato CSV.
     *
     * @param csvLine La cadena en formato CSV que contiene la información del teléfono.
     * @return Un objeto TelefonoXiaomi creado a partir de la cadena CSV.
     */
    public static Telefono fromCSV(String csvLine) {
        String[] values = csvLine.split(",");
        return new TelefonoXiaomi(
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