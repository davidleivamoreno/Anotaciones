package EJERCICIOEMPLEADOYEMPRESA;

public class Directivo extends Empleado{
    private Integer codigodespacho;
    public Directivo(String nombre, String apellidos,Integer codigodespacho) {
        super(nombre, apellidos);
        this.codigodespacho=codigodespacho;
    }
}
