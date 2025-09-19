/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.DAO;

import com.minegocio.model.DetalleVenta;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author POS
 */
public interface VentaDAO {
    
    public boolean grabarVenta(String cliente, Timestamp fechaVenta, List<DetalleVenta> detalles);
    
    
}
