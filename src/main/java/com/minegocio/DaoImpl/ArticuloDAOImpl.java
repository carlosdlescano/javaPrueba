/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minegocio.DaoImpl;

import com.minegocio.DAO.ArticuloDAO;
import com.minegocio.model.Articulo;
import com.minegocio.util.Conexion;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author POS
 */
public class ArticuloDAOImpl implements ArticuloDAO {

    private Connection con;

    /*public ArticuloDAOImpl(Connection con) {
        this.con = con;
    }*/
    @Override
    public boolean crearArticulo(Articulo art) {
        Connection con = null;
        CallableStatement stmt = null;
        boolean exito = false;

        try {
            con = Conexion.getConexion();
            stmt = con.prepareCall("{call spCrearArticulo(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");

            stmt.setInt(1, art.getCodigo());
            stmt.setInt(2, art.getMarca());
            stmt.setInt(3, art.getCodDepartamento());
            stmt.setInt(4, art.getCodRubro());
            stmt.setInt(5, art.getCodFamilia());
            stmt.setString(6, art.getDescripcion());
            stmt.setInt(7, art.getStock());
            stmt.setBigDecimal(8, BigDecimal.valueOf(art.getPrecioCosto()));
            stmt.setBigDecimal(9, BigDecimal.valueOf(art.getMargen()));
            stmt.setBigDecimal(10, BigDecimal.valueOf(art.getPrecioVenta()));
            stmt.setLong(11, art.getCodigoBarra());
            stmt.execute();
            exito = true;
        } catch (SQLException e) {
            System.out.println("Error al crear artículo: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar conexión: " + ex.getMessage());
            }
        }
        return exito;
    }

    @Override
    public boolean actualizarArticulo(Articulo art) {
        Connection con = null;
        CallableStatement stmt = null;
        boolean exito = false;

        try {
            con = Conexion.getConexion();
            stmt = con.prepareCall("{call spActualizarArticulo (?,?,?,?,?,?,?,?,?,?,?)}");
            stmt.setInt(1, art.getCodigo());
            stmt.setInt(2, art.getMarca());
            stmt.setInt(3, art.getCodDepartamento());
            stmt.setInt(4, art.getCodRubro());
            stmt.setInt(5,art.getCodFamilia());
            stmt.setString(6, art.getDescripcion());
            stmt.setInt(7, art.getStock());
            stmt.setDouble(8, art.getPrecioCosto());
            stmt.setDouble(9, art.getMargen());
            stmt.setDouble(10, art.getPrecioVenta());
            stmt.setLong(11, art.getCodigoBarra());
      
            int filasActualizadas = stmt.executeUpdate();
            System.out.println(" FILAS ACTUALIZADAS "+ filasActualizadas); //controlar !!
            return filasActualizadas > 0;

        } catch (SQLException e) {
            System.err.println("Error al actualizar artículo: " + e.getMessage());
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar conexión: " + ex.getMessage());
            }
        }

    }

    @Override
    public boolean eliminarArticulo(int codigo, int marca) { //logicamente
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /*@Override
    public ArrayList<Articulo> buscar(int codigo, int marca,String descripcion, String partDescripcion, int departamento, int rubro, int familia) {
        Connection con = null;
        CallableStatement stmt = null;
        ArrayList<Articulo> lista = new ArrayList<>();
        try {
            con = Conexion.getConexion();
            stmt = con.prepareCall("{call spBuscarArticuloFlexible(?, ?, ?, ?, ?, ?, ?)}");

            // Validamos que filtro ingresa
            stmt.setObject(1, codigo != 0 ? codigo : null, Types.INTEGER);
            stmt.setObject(2, marca != 0 ? marca : null, Types.INTEGER);
            stmt.setObject(3, descripcion != null ? descripcion : null, Types.VARCHAR);
            stmt.setObject(4, partDescripcion != null ? partDescripcion : null, Types.VARCHAR);
            stmt.setObject(5, departamento != 0 ? departamento : null, Types.INTEGER);
            stmt.setObject(6, rubro != 0 ? rubro : null, Types.INTEGER);
            stmt.setObject(7, familia != 0 ? familia : null, Types.INTEGER);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Articulo art = new Articulo();
                art.setCodigo(rs.getInt("codigo"));
                art.setMarca(rs.getInt("marca"));
                art.setDescripcion(rs.getString("descripcion"));
                art.setCodDepartamento(rs.getInt("departamento"));
                art.setCodRubro(rs.getInt("rubro"));
                art.setCodFamilia(rs.getInt("familia"));
                art.setStock(rs.getInt("stock"));
                art.setPrecioCosto(rs.getDouble("precioCosto"));
                art.setMargen(rs.getDouble("margen"));
                //art.setPrecioVenta(rs.get);
                
                
                // Agregá otros campos de la tabla
                lista.add(art);

            }
        }catch (SQLException e) {
        System.out.println("Error al crear artículo: " + e.getMessage());
    }finally {
        try {
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar conexión: " + ex.getMessage());
        }
    }
            return lista;
        }

        
     */
    @Override
    public ArrayList<Articulo> buscar(int codigo, int marca, String descripcion, int departamento, int rubro, int familia, long codigoBarra) {
        Connection con = null;
        CallableStatement stmt = null;
        ArrayList<Articulo> lista = new ArrayList<>();
        try {
            con = Conexion.getConexion();
            stmt = con.prepareCall("{call spBuscarArticuloFlexible(?, ?, ?, ?, ?, ?, ?)}");

            stmt.setObject(1, codigo != 0 ? codigo : null, Types.INTEGER);
            stmt.setObject(2, marca != 0 ? marca : null, Types.INTEGER);
            stmt.setObject(3, descripcion != null && !descripcion.isEmpty() ? descripcion : null, Types.VARCHAR);
            stmt.setObject(4, departamento != 0 ? departamento : null, Types.INTEGER);
            stmt.setObject(5, rubro != 0 ? rubro : null, Types.INTEGER);
            stmt.setObject(6, familia != 0 ? familia : null, Types.INTEGER);
            stmt.setObject(7, codigoBarra != 0 ? codigoBarra : null, Types.BIGINT);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Articulo art = new Articulo();
                art.setCodigo(rs.getInt("codigo"));
                art.setMarca(rs.getInt("marca"));
                art.setDescripcion(rs.getString("descripcion"));
                art.setCodDepartamento(rs.getInt("departamento"));
                art.setCodRubro(rs.getInt("rubro"));
                art.setCodFamilia(rs.getInt("familia"));
                art.setStock(rs.getInt("stock"));
                art.setPrecioCosto(rs.getDouble("precioCosto"));
                art.setMargen(rs.getDouble("margen"));
                art.setPrecioVenta(rs.getDouble("precioActual"));
                art.setCodigoBarra(rs.getLong("CodigoBarra"));

                lista.add(art);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar artículos: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar conexión: " + ex.getMessage());
            }
        }
        return lista;
    }

    @Override
    public List<Articulo> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
