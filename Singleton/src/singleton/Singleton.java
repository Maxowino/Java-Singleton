/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

import com.sun.jdi.connect.spi.Connection;



/**
 *
 * @author 147119 Maxwell James Owino
 */
public class Singleton {
    public static void main(String[] args) {
        Connection conn1 = (Connection) singletonconnect.getInstance().getConnection();
        Connection conn2 = (Connection) singletonconnect.getInstance().getConnection();
        System.out.println(conn1 == conn2); 
    }
}
