package excepciones;

/**
 * Excepcion lanzada cuando se intenta usar un vehiculo que no existe.
 * @author Mario Laso
 * @version 1.0
 */
public class VehiculoNoEncontradoException extends Exception {
    /**
     * Metodo que construye la excepcion con un mensaje personalizado
     */
    public VehiculoNoEncontradoException() {
        super("Error: No se ha encontrado el vehiculo.");
    }
}
