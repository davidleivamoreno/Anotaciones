package EJERCICIOEMPLEADOYEMPRESA;
import EJERCICIOEMPLEADOYEMPRESA.Empleado;
import EJERCICIOEMPLEADOYEMPRESA.Empresa;
import EJERCICIOEMPLEADOYEMPRESA.UtilContexto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Esta clase contiene casos de prueba para la clase {@link Empresa} y su funcionalidad relacionada.
 */
public class EmpresaTest {

    /**
     * Prueba si un empleado se puede agregar correctamente a la empresa y si se puede recuperar correctamente.
     */
    @Test
    public void testAgregarEmpleado() {
        Empresa empresa = new Empresa();

        // Crea un nuevo empleado
        Empleado empleado = new Empleado("Harry", "Potter","9999s");

        // Agrega el empleado a la empresa
        assertTrue(empresa.add(empleado));

        // Verifica que el empleado se haya agregado correctamente
        assertTrue(empresa.getEmpleadosSet().contains(empleado));
    }

    /**
     * Prueba el método {@link UtilContexto#cargadorDeContexto(Empresa)} para asegurar que los empleados se carguen correctamente.
     */
    @Test
    public void testCargadorDeContexto() {
        Empresa empresa=new Empresa();
        UtilContexto.cargadorDeContexto(empresa);
        assertEquals(4, empresa.getEmpleadosSet().size());
    }
}

