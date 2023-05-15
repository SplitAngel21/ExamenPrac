package polimorfismo;

/**
 * @author angel
 */
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglos para almacenar los objetos
        ArrayList<empleado> listaEmpleados = new ArrayList<>();
        ArrayList<proveedor> listaProveedores = new ArrayList<>();
        ArrayList<cliente> listaClientes = new ArrayList<>();
        ArrayList<factura> listaFacturas = new ArrayList<>();
        ArrayList<pedido> listaPedidos = new ArrayList<>();

        // Instanciar 10 empleados
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido Paterno: ");
            String apellidoPaterno = scanner.nextLine();
            System.out.print("Apellido Materno: ");
            String apellidoMaterno = scanner.nextLine();
            System.out.print("CURP: ");
            int curp = Integer.parseInt(scanner.nextLine());
            System.out.print("Telefono: ");
            String telefono = scanner.nextLine();
            System.out.print("Calle y numero: ");
            String calleNo = scanner.nextLine();
            System.out.print("Colonia: ");
            String colonia = scanner.nextLine();
            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();
            System.out.print("Pais: ");
            String pais = scanner.nextLine();
            System.out.print("ID Empleado: ");
            String idEmpleado = scanner.nextLine();
            System.out.print("Puesto: ");
            String puesto = scanner.nextLine();
            System.out.print("Fecha de ingreso: ");
            String fechaIngreso = scanner.nextLine();
            System.out.print("Sueldo: ");
            String sueldo = scanner.nextLine();

            empleado empleado = new empleado(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais, idEmpleado, puesto, fechaIngreso, sueldo);
            empleado.setIdEmpleado(idEmpleado);
            empleado.setPuesto(puesto);
            empleado.setFechaIngreso(fechaIngreso);
            empleado.setSueldo(sueldo);
            listaEmpleados.add(empleado);

        }

        // Instanciar 10 proveedores
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese los datos del proveedor " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido Paterno: ");
            String apellidoPaterno = scanner.nextLine();
            System.out.print("Apellido Materno: ");
            String apellidoMaterno = scanner.nextLine();
            System.out.print("CURP: ");
            int curp = Integer.parseInt(scanner.nextLine());
            System.out.print("Telefono: ");
            String telefono = scanner.nextLine();
            System.out.print("Calle y numero: ");
            String calleNo = scanner.nextLine();
            System.out.print("Colonia: ");
            String colonia = scanner.nextLine();
            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();
            System.out.print("Pais: ");
            String pais = scanner.nextLine();
            System.out.print("ID Proveedor: ");
            String idProveedor = scanner.nextLine();
            System.out.print("Fecha de Registro: ");
            String fechaRegistro = scanner.nextLine();

            proveedor proveedor = new proveedor(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais, idProveedor, fechaRegistro);
            proveedor.setFechaRegistro(fechaRegistro);
            proveedor.setIdProveedor(idProveedor);
            listaProveedores.add(proveedor);
        }

        // Instanciar 10 clientes
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese los datos del cliente " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido Paterno: ");
            String apellidoPaterno = scanner.nextLine();
            System.out.print("Apellido Materno: ");
            String apellidoMaterno = scanner.nextLine();
            System.out.print("CURP: ");
            int curp = Integer.parseInt(scanner.nextLine());
            System.out.print("Telefono: ");
            String telefono = scanner.nextLine();
            System.out.print("Calle y numero: ");
            String calleNo = scanner.nextLine();
            System.out.print("Colonia: ");
            String colonia = scanner.nextLine();
            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();
            System.out.print("Pais: ");
            String pais = scanner.nextLine();
            System.out.print("ID Cliente: ");
            String idCliente = scanner.nextLine();
            System.out.print("Fecha de Registro: ");
            String fechaRegistro = scanner.nextLine();

            cliente cliente = new cliente(nombre, apellidoPaterno, apellidoMaterno, curp, telefono, calleNo, colonia, ciudad, pais, idCliente, fechaRegistro);
            cliente.setFechaRegistro(fechaRegistro);
            cliente.setIdCliente(idCliente);
            listaClientes.add(cliente);
        }

        // Instanciar 10 facturas
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese los datos de la factura " + (i + 1) + ":");
            System.out.print("Fecha de la factura (en formato dd/mm/aaaa): ");
            String fechaFactura = scanner.nextLine();
            System.out.print("Folio: ");
            String folio = scanner.nextLine();
            System.out.print("ID del cliente: ");
            String idCliente = scanner.nextLine();

            factura factura = new factura(fechaFactura, folio, idCliente);
            listaFacturas.add(factura);
        }

        // Instanciar 10 pedidos
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese los datos del pedido " + (i + 1) + ":");
            System.out.print("Fecha del pedido (en formato dd/mm/aaaa): ");
            String fechaPedido = scanner.nextLine();
            System.out.print("Folio: ");
            String folio = scanner.nextLine();
            System.out.print("ID del proveedor: ");
            String idProveedor = scanner.nextLine();

            pedido pedido = new pedido(fechaPedido, folio, idProveedor);
            listaPedidos.add(pedido);
        }

        // Imprimir la información almacenada en los arreglos
        // Empleados
        System.out.println("Información de los empleados:");
        for (empleado emp : listaEmpleados) {
            emp.mostrarDatos();
            System.out.println("--------------------");
        }

        // Proveedores
        System.out.println("Información de los proveedores:");
        for (proveedor prov : listaProveedores) {
            prov.mostrarDatos();
            System.out.println("--------------------");
        }

        // Clientes
        System.out.println("Información de los clientes:");
        for (cliente cli : listaClientes) {
            cli.mostrarDatos();
            System.out.println("--------------------");
        }

        // Facturas
        System.out.println("Información de las facturas:");
        for (factura fac : listaFacturas) {
            fac.mostrarDatos();
            System.out.println("--------------------");
        }

        // Pedidos
        System.out.println("Información de los pedidos:");
        for (pedido ped : listaPedidos) {
            ped.mostrarDatos();
            System.out.println("--------------------");
        }
    }

}
