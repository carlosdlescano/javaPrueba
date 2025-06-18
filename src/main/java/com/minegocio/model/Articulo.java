/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.model;

import java.math.BigDecimal;

/**
 *
 * @author POS
 */
public class Articulo {
    private int codigo;
    private int marca;
    private String descipcion;
    private int stock;
    private BigDecimal precioCosto;
    private BigDecimal margen;
    private BigDecimal precioVenta;
    private int estado;
    private int codigoBarra;

    public Articulo(int codigo, int marca, String descipcion, int stock, BigDecimal precioCosto, BigDecimal margen, BigDecimal precioVenta, int estado, int codigoBarra) {
        this.codigo = codigo;
        this.marca = marca;
        this.descipcion = descipcion;
        this.stock = stock;
        this.precioCosto = precioCosto;
        this.margen = margen;
        this.precioVenta = precioVenta;
        this.estado = estado;
        this.codigoBarra = codigoBarra;
    }

    public Articulo() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(BigDecimal precioCosto) {
        this.precioCosto = precioCosto;
    }

    public BigDecimal getMargen() {
        return margen;
    }

    public void setMargen(BigDecimal margen) {
        this.margen = margen;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    
    
    
    
    
}
