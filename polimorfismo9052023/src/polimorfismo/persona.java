package polimorfismo;

/**
 * @author angel
 */
public class persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int curp;
    private String telefono;
    private String calleNo;
    private String colonia;
    private String ciudad;
    private String pais;

    public persona(String nombre, String apellidoPaterno, String apellidoMaterno, int curp, String telefono, String calleNo, String colonia, String ciudad, String pais) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.curp = curp;
        this.telefono = telefono;
        this.calleNo = calleNo;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.pais = pais;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public int getCurp() {
        return curp;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCalleNo() {
        return calleNo;
    }

    public String getColonia() {
        return colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }
    public void mostrarDatos(){
        
    }
    
}
