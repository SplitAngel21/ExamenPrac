package polimorfismo;

/**
 *
 * @author angel
 */

public class cliente extends persona {

    private String idCliente;
    private String fechaRegistro;

    public cliente(String nombre, String apellidoPaterno, String apellidoMaterno, int curp, String telefono, String calleNo, String colonia, String ciudad, String pais, String idCliente, String fechaRegistro) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais);
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
    @Override
    public void mostrarDatos() {
        System.out.println("Datos empleado: \n Nombre: "+getNombre()+" "+getApellidoPaterno()+" "+getApellidoMaterno()+" ID Cliente: "+getIdCliente()+" Fecha de ingreso:  "+getFechaRegistro()+" Sueldo: "+" CURP: "+ getCurp()+" Telefono: "+getTelefono()+" Calle: "+getCalleNo()+" Colonia: "+getColonia()+" Ciudad: "+getCiudad()+" Pais:  "+getPais());
    }
}
