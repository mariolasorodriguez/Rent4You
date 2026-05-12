package excepciones;

/**
 * Excepcion lanzada cuando se intenta hacer algo con un vehiculo que ya
 * está siendo usado.
 * @author Mario Laso
 * @version 1.0
 */
public class VehiculoNoDisponibleException extends Exception {
    /**
     * Metodo que construye la excepcion con un mensaje personalizado
     */
    public VehiculoNoDisponibleException() {
        super("Error: El vehiculo no está disponible.");
    }
}
