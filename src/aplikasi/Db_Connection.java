/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

/**
 *
 * @author DELL
 */
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db_Connection {
     private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String host = "jdbc:mysql://localhost/db_barang",
                   user = "root",
                   pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(host, user, pass);
        }catch(SQLException err){
            System.err.println("koneksi gagal "+err.getMessage());
        }
        return mysqlconfig;
    }
    
    public void getKoneksi(){
        try{
            String host = "jdbc:mysql://localhost/form_user",
                   user = "root",
                   pass = "";
            Connection conn = DriverManager.getConnection(host, user, pass);
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Koneksi Error");
        }
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}