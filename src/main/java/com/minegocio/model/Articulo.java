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
/*
 Articulo      |
+----------------+    
| int IDcodigo    |
| int codigo    |
| Marca marca   |
| Departamento departamento |
| Rubro rubro  |
| Familia familia |
| String descripcion |
| int stock   |
| double precioCosto |
| double margen |
| double precioVenta |
| Estado estado |
| Long codigoDeBarra |
+----------------+

*/
public class Articulo {
    private int codigo;
    private int marca;
    private int codDepartamento;
    private int codRubro;
    private int codFamilia;
    private String descripcion;
    private int stock;
    private double precioCosto;
    private double margen;
    private double precioVenta;
    private int estado;
    private Long codigoBarra;

    public Articulo(int codigo, int marca, int departamento, int rubro, int familia, String descipcion, int stock, double precioCosto, double margen, double precioVenta, int estado, Long codigoBarra) {
        this.codigo = codigo;
        this.marca = marca;
        this.codDepartamento = departamento;
        this.codRubro = rubro;
        this.codFamilia = familia;
        this.descripcion = descipcion;
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

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public int getCodRubro() {
        return codRubro;
    }

    public void setCodRubro(int codRubro) {
        this.codRubro = codRubro;
    }

    public int getCodFamilia() {
        return codFamilia;
    }

    public void setCodFamilia(int codFamilia) {
        this.codFamilia = codFamilia;
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getMargen() {
        return margen;
    }

    public void setMargen(double margen) {
        this.margen = margen;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Long getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(Long codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

   
    
    
    
    
    
}
