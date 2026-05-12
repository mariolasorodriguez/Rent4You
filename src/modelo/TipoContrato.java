package modelo;

/**
 * Define las tipos de contrato para los clientes.
 * @author Mario Laso
 * @version 1.0
 */
public enum TipoContrato {
    /** Contrato de duracion corta (Dias o semanas). */
    CORTO_PLAZO,

    /** Contrato de larga duracion (Meses o años). */
    LARGO_PLAZO,

    /** Contrato sin permanencia, a lo que necesite el cliente. */
    FLEXIBLE
}
