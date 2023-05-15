package polimorfismo;

/**
 *
 * @author angel
 */
import java.util.ArrayList;

public class lista {

    private ArrayList<empleado> listaEmpleado;
    private ArrayList<proveedor> listaProveedor;
    private ArrayList<cliente> listaCliente;
    private ArrayList<pedido> listaPedido;
    private ArrayList<factura> listaFactura;

    public lista() {
        listaEmpleado = new ArrayList<empleado>();
        listaProveedor = new ArrayList<proveedor>();
        listaCliente = new ArrayList<cliente>();
        listaPedido = new ArrayList<pedido>();
        listaFactura = new ArrayList<factura>();
    }

    //Metodo para llenar el arreglo
    public void addEmpleado(empleado empleado) {
        listaEmpleado.add(empleado);
    }
    public void addProveedor(proveedor proveedor) {
        listaProveedor.add(proveedor);
    }
    public void addCliente(empleado empleado) {
        listaEmpleado.add(empleado);
    }
    public void addPedido(pedido pedido) {
        listaPedido.add(pedido);
    }
    public void addFactura(factura factura) {
        listaFactura.add(factura);
    }

    //Metodo para listar el arreglo
    public void listarEmpleado() {
        System.out.println("Mostrar datos de la lista de empleados: ");
        for (empleado tmp : listaEmpleado) {
            tmp.mostrarDatos();
        }
    }
    public void listarProveedor() {
        System.out.println("Mostrar datos de la lista de proveedores: ");
        for (proveedor tmp : listaProveedor) {
            tmp.mostrarDatos();
        }
    }
    public void listarCliente() {
        System.out.println("Mostrar datos de la lista de clientes: ");
        for (cliente tmp : listaCliente) {
            tmp.mostrarDatos();
        }
    }
    public void listarPedido() {
        System.out.println("Mostrar datos de la lista de pedidos: ");
        for (pedido tmp : listaPedido) {
            tmp.mostrarDatos();
        }
    }
    public void listarFactura() {
        System.out.println("Mostrar datos de la lista de facturas: ");
        for (factura tmp : listaFactura) {
            tmp.mostrarDatos();
        }
    }
}
