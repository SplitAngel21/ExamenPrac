package polimorfismo;

/**
 *
 * @author angel
 */

public class factura {

    private String fechaFactura;
    private String folioFactura;
    private String idCliente;

    public factura(String fechaFactura, String folioFactura, String idCliente) {
        this.fechaFactura = fechaFactura;
        this.folioFactura = folioFactura;
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }
    

    public String getFechaFactura() {
        return fechaFactura;
    }

    public String getFolioFactura() {
        return folioFactura;
    }
    
    public void mostrarDatos() {
        System.out.println("Informacion de factura: \n"+getFolioFactura()+" Fecha:"+getFechaFactura()+" Proveedor: "+getIdCliente());    
    }
}
