/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author leb1-4
 */
public class koneksi {
    Connection konek;
    Statement st;
    ResultSet rs;
    
      public koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpus_digital","root","");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //method ambil data
    public ResultSet ambilData(String sql){
        try {
            st = konek.createStatement();
            rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
          return null;
        }
    }
    public  boolean rubahData(String sql){
        try {
            st = konek.createStatement();
            st.executeUpdate(sql);
            return  true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        return false;
        }
    }
}
