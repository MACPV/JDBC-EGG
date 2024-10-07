package com.codeup.jdbc.entidades;

import java.time.LocalDate;

public class Pedido {
    private int codigoPedido;
    private LocalDate fechaPedido;
    private LocalDate fechaEntrega;
    private LocalDate fechaEsperada;
    private String estado;
    private String cometario;
    private int codigoCliente;

    public Pedido() {
    }

    public Pedido(LocalDate fechaPedido, LocalDate fechaEntrega, LocalDate fechaEsperada, String estado, String cometario, int codigoCliente) {
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.fechaEsperada = fechaEsperada;
        this.estado = estado;
        this.cometario = cometario;
        this.codigoCliente = codigoCliente;
    }

    public Pedido(int codigoPedido, LocalDate fechaPedido, LocalDate fechaEntrega, LocalDate fechaEsperada, String estado, String cometario, int codigoCliente) {
        this.codigoPedido = codigoPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.fechaEsperada = fechaEsperada;
        this.estado = estado;
        this.cometario = cometario;
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalDate getFechaEsperada() {
        return fechaEsperada;
    }

    public void setFechaEsperada(LocalDate fechaEsperada) {
        this.fechaEsperada = fechaEsperada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCometario() {
        return cometario;
    }

    public void setCometario(String cometario) {
        this.cometario = cometario;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigoPedido=" + codigoPedido +
                ", fechaPedido=" + fechaPedido +
                ", fechaEntrega=" + fechaEntrega +
                ", fechaEsperada=" + fechaEsperada +
                ", estado='" + estado + '\'' +
                ", cometario='" + cometario + '\'' +
                ", codigoCliente=" + codigoCliente +
                '}';
    }
}
