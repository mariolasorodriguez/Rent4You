package excepciones;

/**
 * Excepcion lanzada cuando se intenta eliminar o modificar un vehiculo o cliente que tiene un contrato activo.
 * @author Mario Laso
 * @version 1.0
 */
public class ContratoActivoException extends Exception {
    /**
     * Metodo que construye la excepcion con un mensaje personalizado
     */
    public ContratoActivoException() {
        super("Error: El contrato esta activo aun.");
    }
}
