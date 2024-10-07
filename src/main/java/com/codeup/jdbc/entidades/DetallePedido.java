package com.codeup.jdbc.entidades;

public class DetallePedido {
    private int codigo_pedido;
    private String codigo_producto;
    private int cantidad;
    private float precioUnidad;
    private  int numeroLinea;

    public DetallePedido(int codigo_pedido, String codigo_producto, int cantidad, float precioUnidad, int numeroLinea) {
        this.codigo_pedido = codigo_pedido;
        this.codigo_producto = codigo_producto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.numeroLinea = numeroLinea;
    }

    public DetallePedido(String codigo_producto, int cantidad, float precioUnidad, int numeroLinea) {
        this.codigo_producto = codigo_producto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.numeroLinea = numeroLinea;
    }

    public DetallePedido() {
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "codigo_pedido=" + codigo_pedido +
                ", codigo_producto='" + codigo_producto + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnidad=" + precioUnidad +
                ", numeroLinea=" + numeroLinea +
                '}';
    }
}
