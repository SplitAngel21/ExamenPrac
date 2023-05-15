package polimorfismo;

/**
 *
 * @author angel
 */
public class empleado extends persona {

    private String idEmpleado;
    private String puesto;
    private String fechaIngreso;
    private String sueldo;

    public empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int curp, String telefono, String calleNo, String colonia, String ciudad, String pais, String idEmpleado, String puesto, String fechaIngreso, String sueldo) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais);
    }
    

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
   
    @Override
    public void mostrarDatos() {
        System.out.println("Datos empleado: \n Nombre: "+getNombre()+" "+getApellidoPaterno()+" "+getApellidoMaterno()+" ID Empleado: "+getIdEmpleado()+" Puesto: "+getPuesto()+" Fecha de ingreso:  "+getFechaIngreso()+" Sueldo: "+getSueldo()+" CURP: "+ getCurp()+" Telefono: "+getTelefono()+" Calle: "+getCalleNo()+" Colonia: "+getColonia()+" Ciudad: "+getCiudad()+" Pais:  "+getPais());
    }
}
