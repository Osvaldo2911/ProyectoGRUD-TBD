/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.conexion;
import Modelo.usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Osvaldo
 */
public class DAO {
    
    private usuario u;
    public void consultaUser(){

        ResultSet rs = conexion.consultaUser(u);
        
        u = null;
        
	try {
		if(rs.next()) {
			do {
			    u = new usuario(rs.getString(1), rs.getString(2));
			}while(rs.next());
		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
