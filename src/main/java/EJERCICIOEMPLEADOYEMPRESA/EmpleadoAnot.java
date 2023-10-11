package EJERCICIOEMPLEADOYEMPRESA;

import java.lang.annotation.*;
/**
 * La anotación @Retention se utiliza para especificar cuándo la anotación será retenida, es decir, hasta cuándo estará disponible durante la ejecución
 * del programa. @Retention(RetentionPolicy.RUNTIME) indica que la anotación @EmpleadoAnot estará disponible
 * durante la ejecución del programa, lo que significa que se puede acceder a esta anotación mediante reflexión en tiempo de ejecución.
 */
@Retention(RetentionPolicy.RUNTIME)
/**
 * Esta anotación se utiliza para marcar una clase como un empleado.
 * Contiene información básica sobre el empleado, como su nombre, apellidos, DNI, teléfono, dirección,
 * y detalles específicos del lugar de trabajo como el código del taller y el código del despacho.
 */

/**
 * especificar los tipos de elementos que pueden ser anotados con una anotación personalizada.
 * En este caso, @Target(ElementType.TYPE) indica que la anotación
 * @EmpleadoAnot solo puede ser aplicada a tipos (clases, interfaces, enumeraciones).
 */
@Target(ElementType.TYPE)
/**
 *  indica que la anotación @EmpleadoAnot puede ser repetida y que las instancias
 *  adicionales se almacenarán en un contenedor especificado por EmpleadosAnot.class.
 */
@Repeatable(EmpleadosAnot.class)

public @interface EmpleadoAnot {
    String nombre() default "VOID";

    String apellidos() default "VOID";

    String dni() default "VOID";



    String codigoDespacho() default "VOID";
}
