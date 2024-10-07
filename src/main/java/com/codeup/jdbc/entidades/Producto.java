package com.codeup.jdbc.entidades;

public class Producto {
    private String codigoProducto;
    private String nombre;
    private String gama;
    private String dimensiones;
    private String proveedor;
    private String descripcion;
    private int cantidadEnStock;
    private float precioVenta;
    private float precioProveedor;

    public Producto(String codigoProducto, String nombre, String gama, String dimensiones, String proveedor, String descripcion, int cantidadEnStock, float precioVenta, float precioProveedor) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.gama = gama;
        this.dimensiones = dimensiones;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.cantidadEnStock = cantidadEnStock;
        this.precioVenta = precioVenta;
        this.precioProveedor = precioProveedor;
    }

    public Producto(String nombre, String gama, String dimensiones, String proveedor, String descripcion, int cantidadEnStock, float precioVenta, float precioProveedor) {
        this.nombre = nombre;
        this.gama = gama;
        this.dimensiones = dimensiones;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.cantidadEnStock = cantidadEnStock;
        this.precioVenta = precioVenta;
        this.precioProveedor = precioProveedor;
    }

    public Producto() {
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getPrecioProveedor() {
        return precioProveedor;
    }

    public void setPrecioProveedor(float precioProveedor) {
        this.precioProveedor = precioProveedor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigoProducto='" + codigoProducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", gama='" + gama + '\'' +
                ", dimensiones='" + dimensiones + '\'' +
                ", proveedor='" + proveedor + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidadEnStock=" + cantidadEnStock +
                ", precioVenta=" + precioVenta +
                ", precioProveedor=" + precioProveedor +
                '}';
    }
}
