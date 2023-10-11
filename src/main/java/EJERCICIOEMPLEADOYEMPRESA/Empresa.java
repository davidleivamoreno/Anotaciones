package EJERCICIOEMPLEADOYEMPRESA;

import java.util.HashSet;
import java.util.Set;

//@EmpleadosAnot({@EmpleadoAnot(
//        nombre="Diego",
//        apellidos = "Lopez",
//        dni="64364365413W",
//        telefono="+34 42874384",
//        direccion = "Avd Mexico",
//        clase="",
//        codigoDespacho="136843434"
//)
//})

@EmpleadoAnot(
        nombre="Diego",
        apellidos = "Lopez",
        dni="64364365413W",
        telefono="+34 42874384",
        direccion = "Avd Mexico",
        clase="",
        codigoDespacho=136843434
)
@EmpleadoAnot(
        nombre="Otro",
        apellidos = "Lopez",
        dni="64364365413W",
        telefono="+34 42874384",
        direccion = "Avd Mexico",
        clase="",
        codigoDespacho=136843434
)
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
}
