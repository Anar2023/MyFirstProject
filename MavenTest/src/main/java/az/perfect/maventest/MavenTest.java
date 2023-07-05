/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package az.perfect.maventest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class MavenTest {

    public static void main(String[] args) {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/course","Anar","1234");
            
            Statement st = (Statement) c.createStatement();
            ResultSet s = st.executeQuery("Select ename, sal from emp");
            while(s.next()){
                System.out.println(s.getString("ename") + " " + s.getInt("sal"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MavenTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
