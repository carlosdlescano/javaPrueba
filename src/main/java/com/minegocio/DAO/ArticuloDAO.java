/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.DAO;

import com.minegocio.model.Articulo;
import java.util.List;

/**
 *
 * @author POS
 */
public interface ArticuloDAO {
    public boolean crearArticulo(Articulo art);
    public boolean actualizarArticulo (Articulo art);
    public boolean eliminarArticulo(int codigo, int marca);
    public Articulo buscar(int codigo, int marca);
    public List<Articulo> listarTodos();
        
    
}


