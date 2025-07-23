/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.minegocio.minegocio;

import com.minegocio.model.Articulo;
import com.minegocio.util.Conexion;
import com.minegocio.DAO.ArticuloDAO;
import com.minegocio.DaoImpl.ArticuloDAOImpl;
import java.sql.Connection;

/**
 *
 * @author POS
 */
public class MiNegocio {

    public static void main(String[] args) {
        //PRUEBA DE CONEXION
    Connection con = Conexion.getConexion();
    
    if (con != null) {
        System.out.println("Conexión exitosa!");
    } else {
        System.out.println("****Fallo la conexion.****");
    }

       // Crear el objeto Articulo en base de datos mediante Procedimiento almacenado
       
        Articulo nuevoArticulo = new Articulo();
        nuevoArticulo.setCodigo(203);
        nuevoArticulo.setMarca(1);
        nuevoArticulo.setCodDepartamento(2);
        nuevoArticulo.setCodRubro(2);
        nuevoArticulo.setCodFamilia(2);
        nuevoArticulo.setDescripcion("Teclado mecánico ");
        nuevoArticulo.setStock(100);
        nuevoArticulo.setPrecioCosto(3500.0);
        nuevoArticulo.setMargen(30.00);
        nuevoArticulo.setPrecioVenta(4550.00);
        nuevoArticulo.setEstado(1);
        nuevoArticulo.setCodigoBarra(987654321);

        // Usar el DAO para guardar el artículo
        ArticuloDAO dao = new ArticuloDAOImpl();
        boolean resultado = dao.crearArticulo(nuevoArticulo);

        // Mostrar resultado
        if (resultado) {
            System.out.println(" Artículo creado correctamente.");
        } else {
            System.out.println(" Error al crear el artículo.");
        }
        }

}
