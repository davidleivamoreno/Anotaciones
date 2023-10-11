package EJERCICIOEMPLEADOYEMPRESA;


/**
 * Constructor de un empleado que tiene de atributos nombre y apellido.
 */
public class Empleado {
    //Variables
    private String nombre;
    private String apellidos;
    private String dni;

    /**
     *
     * @param nombre
     * @param apellidos
     */

    public Empleado(String nombre, String apellidos,String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni=dni;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *
     * @return "Empleado{" +
     *                 "nombre='" + nombre + '\'' +
     *                 ", apellidos='" + apellidos + '\'' +
     *                 '}'
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
