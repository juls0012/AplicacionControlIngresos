/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlingresos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author usuario
 */
public class ConexionDB {
    
    String strConexionDB = "jdbc:sqlite:/home/usuario/Documents/movimiento";
    Connection conn = null;
    
    
    private static ConexionDB singleton;
    
    public static ConexionDB getInstance(){
        if(singleton ==  null){
            singleton = new ConexionDB();
        }
        return singleton;
    }
    
    private ConexionDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn =  DriverManager.getConnection(strConexionDB);
            
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("Errores de conexion" + e);
        }
    }
    
    public boolean ejecutarSentencia(String sentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(sentenciaSQL);
             pstm.execute();
            return true;
            
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public ResultSet consultarRegistros(String sentenciaSQL){
        try {
           PreparedStatement pstm = conn.prepareStatement(sentenciaSQL); 
           ResultSet respuesta = pstm.executeQuery();
           return respuesta;
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } 
    }
    
}
