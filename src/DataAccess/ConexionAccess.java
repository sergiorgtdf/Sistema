/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Sergio Olmedo
 */
public class ConexionAccess {
     private static Connection conn = null;

    //Constructor privado
    private ConexionAccess() {

        try {
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection("jdbc:ucanaccess://.\\DB\\Sistema.accdb");
            //conn = DriverManager.getConnection("jdbc:sqlite:D:\\Documentos de Windows\\Documents\\Mis Desarrollos\\Cajas_y_Fondos\\BD\\project123.sqlite");
            System.out.println("Conectado!");
        } catch ( SQLException e) {
            //Se.printStackTrace();
            System.out.println("Error al Conectar!");
        }

    }

    public static Connection getConnection() {
     
        if (conn == null) {
            new ConexionAccess();
        }
        return conn;

    }
    public static String EstadoConexion(){
        String msg ="";
        if (getConnection() ==null){
            msg = "Sin Conexion a la DB";
        }else{
            msg = "Hay Conexion a la DB";
        }
        
        
        
        
        return msg;
    }
    
}
