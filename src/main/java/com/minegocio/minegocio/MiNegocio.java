/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.minegocio.minegocio;

import com.minegocio.model.Articulo;
import com.minegocio.util.Conexion;
import com.minegocio.DAO.ArticuloDAO;
import com.minegocio.DaoImpl.ArticuloDAOImpl;
import java.sql.Connection;
import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;


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
/*
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
        nuevoArticulo.setCodigoBarra(779801600436L);

        // Usar el DAO para guardar el artículo
        ArticuloDAO dao = new ArticuloDAOImpl();
        boolean resultado = dao.crearArticulo(nuevoArticulo);

        // Mostrar resultado
        if (resultado) {
            System.out.println(" Artículo creado correctamente.");
        } else {
            System.out.println(" Error al crear el artículo.");
        }
        
    *//*
    // Buscar articulo
        int codigo = 0;
        int marca = 0;
        String descripcion = "tec"; // Cambiá esto según lo que quieras buscar
        int departamento = 0;
        int rubro = 0;
        int familia = 0;
        long codigoBarra = 0;
        
        ArticuloDAO dao = new ArticuloDAOImpl();

        // Ejecutar búsqueda
        ArrayList<Articulo> resultados = dao.buscar(codigo, marca, descripcion, departamento, rubro, familia, codigoBarra);

        // Mostrar resultados
        if (resultados.isEmpty()) {
            System.out.println("No se encontraron artículos.");
        } else {
            for (Articulo art : resultados) {
                System.out.println("Código: " + art.getCodigo());
                System.out.println("Marca: " + art.getMarca());
                System.out.println("Descripción: " + art.getDescripcion());
                System.out.println("Departamento: " + art.getCodDepartamento());
                System.out.println("Rubro: " + art.getCodRubro());
                System.out.println("Familia: " + art.getCodFamilia());
                System.out.println("Stock: " + art.getStock());
                System.out.println("Precio Costo: " + art.getPrecioCosto());
                System.out.println("Margen: " + art.getMargen());
                System.out.println("Precio Venta: " + art.getPrecioVenta());
                System.out.println("Código de Barra: " + art.getCodigoBarra());
                System.out.println("-----------------------------");
            }
        }

        */
    
    // Crear el artículo con los datos actualizados
        Articulo art = new Articulo();
        art.setCodigo(203); // Código del artículo que ya existe
        art.setMarca(1);
        art.setCodDepartamento(2);
        art.setCodRubro(2);
        art.setCodFamilia(1);
        art.setDescripcion("Mouse inalámbrico actualizado");
        art.setStock(150);
        art.setPrecioCosto(3000);
        art.setMargen(25);
        art.setPrecioVenta(3800);
        art.setCodigoBarra(779801600436L);

        // Crear instancia del DAO
        ArticuloDAO dao = new ArticuloDAOImpl();

        // Ejecutar el método
        boolean actualizado = dao.actualizarArticulo(art);

        // Mostrar resultado
        if (actualizado) {
            System.out.println("✅ Artículo actualizado correctamente.");
        } else {
            System.out.println(actualizado);
            System.out.println("❌ No se pudo actualizar el artículo.");
        }

    }


    

}
