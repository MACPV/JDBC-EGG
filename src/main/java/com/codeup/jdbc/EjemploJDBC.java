package com.codeup.jdbc;

import java.sql.*;

public class EjemploJDBC {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jardineria?serverTimezone=UTC";
        String username = "root";
        String password = "21Magnus07**";
        Connection connection = DriverManager.getConnection(url, username, password);
        getPedidosPorEstado(connection, "Entregado");
    }

    public static void nombreCliente(Connection connection) {
        String slq = "SELECT * FROM cliente.java ";
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(slq);

            while (resultSet.next()) {
                String codigo = resultSet.getString("codigo_cliente");
                String nombre = resultSet.getString("nombre_cliente");
                String telefono = resultSet.getString("telefono");
                System.out.println(
                        codigo + " | " +
                                nombre + " | " +
                                telefono);
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void buscarClientePorCodigo(Connection connection, String codigo) {
        String slq = "SELECT * FROM cliente.java WHERE codigo_cliente = " + codigo;
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(slq);

            while (resultSet.next()) {
                String codigoCliente = resultSet.getString("codigo_cliente");
                String nombre = resultSet.getString("nombre_cliente");
                String telefono = resultSet.getString("telefono");
                System.out.println(
                        codigoCliente + " | " +
                                nombre + " | " +
                                telefono);
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void buscarClientesPorEmpleado(Connection connection, String codigoEmpleado) {
        String slq = "select c.codigo_cliente, c.nombre_cliente, e.nombre       " +
                "  from cliente.java as c     " +
                "    inner join empleado as e on c.codigo_empleado_rep_ventas = e.codigo_empleado " +
                "where e.codigo_empleado = ?";

        try (PreparedStatement statement = connection.prepareStatement(slq)) {
            statement.setString(1, codigoEmpleado);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String codigoCliente = resultSet.getString("codigo_cliente");
                    String nombre = resultSet.getString("nombre_cliente");
                    String nombreEmpleado = resultSet.getString("nombre");
                    System.out.println(codigoCliente + " | " + nombre + " | " + nombreEmpleado);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getProductosParaReponer(Connection connection, String puntoReposicion) {
        String slq = "select codigo_producto, nombre, cantidad_en_stock from producto where cantidad_en_stock <=" + puntoReposicion + " order by cantidad_en_stock desc ";

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(slq);


            while (resultSet.next()) {
                String codigoProducto = resultSet.getString("codigo_producto");
                String nombre = resultSet.getString("nombre");
                String cantidadEnStock = resultSet.getString("cantidad_en_stock");
                System.out.println(codigoProducto + " | " + nombre + " | " + cantidadEnStock);
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getProductosGama(Connection connection, String gama) {
        String slq = "select codigo_producto, nombre, gama from producto where gama = " + gama;

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(slq);


            while (resultSet.next()) {
                String codigoProducto = resultSet.getString("codigo_producto");
                String nombre = resultSet.getString("nombre");
                String gamaProducti = resultSet.getString("gama");
                System.out.println(codigoProducto + " | " + nombre + " | " + gamaProducti);
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getPedidosPorCliente(Connection connection, String codCliente) {
        String slq = "select p.codigo_pedido, p.estado, c.nombre_cliente from pedido as p inner join cliente.java as c on p.codigo_cliente = c.codigo_cliente where c.codigo_cliente = ?";

        try (PreparedStatement statement = connection.prepareStatement(slq)) {
            statement.setString(1, codCliente);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String codigoPedido = resultSet.getString("codigo_pedido");
                    String estado = resultSet.getString("estado");
                    String nombreCliente = resultSet.getString("nombre_cliente");
                    System.out.println(codigoPedido + " | " + estado + " | " + nombreCliente);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void getPedidosPorEstado(Connection connection, String estado) {
        String sql = " select p.codigo_pedido, p.estado, c.nombre_cliente " +
                "from pedido as p " +
                "inner join cliente.java as c on p.codigo_cliente = c.codigo_cliente " +
                " where p.estado = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, estado);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String codPedido = resultSet.getString("codigo_pedido");
                    String estadoPedido = resultSet.getString("estado");
                    String nombre_cliente = resultSet.getString("nombre_cliente");
                    System.out.println(codPedido + " | " + estadoPedido + " | " + nombre_cliente);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
