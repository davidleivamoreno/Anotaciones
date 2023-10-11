package EJERCICIOEMPLEADOYEMPRESA;

import java.util.HashSet;
import java.util.Set;



@EmpleadoAnot(nombre="Hermione",apellidos = "Granger",dni="64364365413W",codigoDespacho="136843434")
@EmpleadoAnot(nombre = "Harry", apellidos = "Potter", dni = "123456789", codigoDespacho = "101")
@EmpleadoAnot(nombre = "Ron", apellidos = "Weasly", dni = "987654321",  codigoDespacho = "102")
@EmpleadoAnot(nombre="Luna",apellidos = "Lovegood",dni="64364365413W",codigoDespacho="136843435")

/**
 * Crea un set de Empleados e introduce cada uno de ellos
 */
public class Empresa {
    private Set<Empleado> empleadoSet=new HashSet<>();
    public Empresa(){

    }

    public Set<Empleado> getEmpleadosSet() {

        return this.empleadoSet;
    }
    public boolean add(Empleado empleado){
        return empleadoSet.add(empleado);
    }

    public Set<Empleado> getEmpleadoSet() {
        return empleadoSet;
    }

    public void setEmpleadoSet(Set<Empleado> empleadoSet) {
        this.empleadoSet = empleadoSet;
    }
}
