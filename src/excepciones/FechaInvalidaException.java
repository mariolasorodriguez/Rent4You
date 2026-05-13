package excepciones;

/**
 * Excepcion lanzada cuando se intenta colocar una fecha que no es valida
 * @author Mario Laso
 * @version 1.0
 */
public class FechaInvalidaException extends RuntimeException {
    /**
     * Metodo que construye la excepcion con un mensaje personalizado
     */
    public FechaInvalidaException() {
        super("Error: La fecha no es valida.");
    }
}
