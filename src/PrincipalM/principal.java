/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrincipalM;
import Vistas.Login;
import Conexion.conexion;
/**
 *
 * @author osvaldo
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login prin = new Login();
        prin.setVisible(true);
       conexion.getConexion();
        
    }
    
}
