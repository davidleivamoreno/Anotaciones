package EJERCICIOEMPLEADOYEMPRESA;

import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Repeatable(EmpleadosAnot.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmpleadoAnot {
    String nombre() default "VOID";

    String apellidos();

    String dni();

    String telefono();
    String direccion();
    String clase();
    int codigoTaller() default -1;
    int codigoDespacho() default -1;

}
