import java.sql.Connection;
import java.sql.DriverManager;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BeBu
 */
public class login {
    public static void main(String args[]) {
        Connection conn=null;
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
            if(conn!=null) {
                System.out.println("Connected to database successfully!");
            }
        }
        catch(Exception e) {
                System.out.println("Not connected");
                    
            }
    }
}
