package excepciones;

/**
 * Excepcion lanzada cuando se intenta usar un cliente que no existe.
 * @author Mario Laso
 * @version 1.0
 */
public class ClienteNoEncontradoException extends Exception {
    /**
     * Metodo que construye la excepcion con un mensaje personalizado
     */
    public ClienteNoEncontradoException() {
        super("Error: No se ha encontrado el cliente.");
    }
}
