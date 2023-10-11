package EJERCICIOEMPLEADOYEMPRESA;

import java.lang.annotation.*;


public abstract class Operario extends Empleado {
    private Integer codigoTaller;

    public Operario(String nombre, String apellidos,Integer codigoTaller) {
        super(nombre, apellidos);
        this.codigoTaller=codigoTaller;
    }
}
