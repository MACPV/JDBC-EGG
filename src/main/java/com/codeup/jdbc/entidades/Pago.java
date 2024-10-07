package com.codeup.jdbc.entidades;

import java.time.LocalDate;

public class Pago {
    private int codigoCliente;
    private String formaPago;
    private String idTransaccion;
    private LocalDate fechaPago;
    private float total;

    public Pago(int codigoCliente, String formaPago, String idTransaccion, LocalDate fechaPago, float total) {
        this.codigoCliente = codigoCliente;
        this.formaPago = formaPago;
        this.idTransaccion = idTransaccion;
        this.fechaPago = fechaPago;
        this.total = total;
    }

    public Pago(String formaPago, String idTransaccion, LocalDate fechaPago, float total) {
        this.formaPago = formaPago;
        this.idTransaccion = idTransaccion;
        this.fechaPago = fechaPago;
        this.total = total;
    }

    public Pago() {
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "codigoCliente=" + codigoCliente +
                ", formaPago='" + formaPago + '\'' +
                ", idTransaccion='" + idTransaccion + '\'' +
                ", fechaPago=" + fechaPago +
                ", total=" + total +
                '}';
    }
}
