package modelo;

/**
 * Representa los estados en los que puede encontrarse un vehiculo.
 * @author Mario Laso
 * @version 1.0
 */
public enum EstadoVehiculo {
    /** El puede ser alquilado. */
    DISPONIBLE,

    /** El vehiculo se encuentra alquilado. */
    ALQUILADO,

    /** El vehiculo esta en el taller. */
    EN_MANTENIMIENTO,

    /** El vehiculo ya no esta en la flota. */
    BAJA
}
