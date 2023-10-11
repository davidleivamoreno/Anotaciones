package EJERCICIOEMPLEADOYEMPRESA;

public class Main {
    public static void main(String[] args) {
        Empresa empresa=new Empresa();
        UtilContexto.cargadorDeContexto(empresa);
        for (Empleado empleado: empresa.getEmpleadosSet()){
            System.out.println(empleado);
        }
    }
}
