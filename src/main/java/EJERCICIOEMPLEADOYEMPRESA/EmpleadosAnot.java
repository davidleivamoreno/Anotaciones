package EJERCICIOEMPLEADOYEMPRESA;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EmpleadosAnot {
    /**
     * Devuelve un array de instancias de la anotación {@code @EmpleadoAnot}.
     *
     * Ejemplo de uso:
     * {@code
     * @EmpleadosAnot({
     *       @EmpleadoAnot(nombre = "John", apellidos = "Doe", dni = "123456789", telefono = "555-1234", direccion = "123 Main St", clase = "ClaseEmpleado", codigoTaller = 1, codigoDespacho = 101),
     *     @EmpleadoAnot(nombre = "Alice", apellidos = "Johnson", dni = "987654321", telefono = "555-5678", direccion = "456 Elm St", clase = "ClaseEmpleado", codigoTaller = 2, codigoDespacho = 102)
     * })
     * }
     *
     * @return Un array de instancias de la anotación {@code @EmpleadoAnot}.
     */
    EmpleadoAnot[] value();
}
