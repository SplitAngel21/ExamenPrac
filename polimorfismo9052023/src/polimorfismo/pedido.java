package polimorfismo;

/**
 *
 * @author angel
 */

public class pedido{

    private String fechaPedido;
    private String folioPedido;
    private String idProveedor;

    public pedido(String fechaPedido, String folioPedido, String idProveedor) {
        this.fechaPedido = fechaPedido;
        this.folioPedido = folioPedido;
        this.idProveedor = idProveedor;
    }
            
    public String getFechaPedido() {
        return fechaPedido;
    }
    public String getFolioPedido() {
        return folioPedido;
    }

    public String getIdProveedor() {
        return idProveedor;
    }
    

    public void mostrarDatos() {
        System.out.println("Informacion de pedido: \n"+getFolioPedido()+" Fecha:"+getFechaPedido()+" Proveedor: "+getIdProveedor());    
    }
}
