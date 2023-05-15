package polimorfismo;

/**
 *
 * @author angel
 */

public class proveedor extends persona {

    private String fechaRegistro;
    private String idProveedor;

    public proveedor(String nombre, String apellidoPaterno, String apellidoMaterno, int curp, String telefono, String calleNo, String colonia, String ciudad, String pais, String idProveedor, String fechaRegistro) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais);
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }
    

    @Override
    public void mostrarDatos() {
        System.out.println("Datos empleado: \n Nombre: "+getNombre()+" "+getApellidoPaterno()+" "+getApellidoMaterno()+" ID Proveedor: "+getIdProveedor()+"Fecha de registro:  "+getFechaRegistro()+" CURP: "+ getCurp()+" Telefono: "+getTelefono()+" Calle: "+getCalleNo()+" Colonia: "+getColonia()+" Ciudad: "+getCiudad()+"Pais:  "+getPais());
    }
}
