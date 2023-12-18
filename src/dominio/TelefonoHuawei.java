package dominio;

import java.io.Serializable;

/**
 * Clase que representa un teléfono de la marca Huawei.
 * Hereda de la clase abstracta Telefono.
 *
 * @see Telefono
 */
public class TelefonoHuawei extends Telefono implements Serializable {

    /**
     * Constructor que inicializa un objeto TelefonoHuawei con los atributos específicos de la marca Huawei.
     *
     * @param peso      El peso del teléfono.
     * @param pantalla  El tamaño de la pantalla del teléfono.
     * @param bateria   La capacidad de la batería del teléfono.
     * @param camara    La resolución de la cámara del teléfono.
     * @param memoria   La capacidad de almacenamiento del teléfono.
     * @param precio    El precio del teléfono.
     * @param marca     La marca del teléfono.
     * @param modelo    El modelo del teléfono.
     */
    public TelefonoHuawei(double peso, double pantalla, int bateria, int camara, int memoria, double precio, String marca, String modelo) {
        super(peso, pantalla, bateria, camara, memoria, precio, marca, modelo);
    }


    /**
     * Convierte la información del teléfono Huawei a una cadena en formato CSV.
     *
     * @return Cadena CSV representando el teléfono Huawei.
     */
    @Override
    public String toCSV() {
        return "Huawei," + super.toCSV();
    }


    /**
     * Devuelve una representación en cadena del objeto TelefonoHuawei.
     *
     * @return Cadena que representa el teléfono Huawei.
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
     * Crea un objeto TelefonoHuawei a partir de una cadena en formato CSV.
     *
     * @param csvLine Cadena CSV que contiene la información del teléfono Huawei.
     * @return Objeto TelefonoHuawei creado a partir de la cadena CSV.
     */
    public static Telefono fromCSV(String csvLine) {
        String[] values = csvLine.split(",");
        return new TelefonoHuawei(
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