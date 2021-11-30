/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.conexion;
import Modelo.cliente;
import Modelo.usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Osvaldo
 */
public class DAO {

    private usuario u;
    private cliente c;

    public DAO(cliente c) {
        this.c = c;
    }

    public cliente getC() {
        return c;
    }

    public void setC(cliente c) {
        this.c = c;
    }

    public DAO(usuario u) {
        this.u = u;
    }

    public usuario getU() {
        return u;
    }

    public void setU(usuario u) {
        this.u = u;
    }

    public void consultaUser() {

        ResultSet rs = conexion.consultaUser(u);

        u = null;

        try {
            if (rs.next()) {
                do {
                    u = new usuario(rs.getString(1), rs.getString(2));
                } while (rs.next());
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void userName() {
        ResultSet rs = conexion.consultaUserName(u);

        u = null;

        try {
            if (rs.next()) {
                do {
                    u = new usuario(rs.getString(1), "Prueba");
                } while (rs.next());
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public boolean altaUser() {
        return conexion.altaUser(u);
    }

    public boolean altaCliente() {
        return conexion.altaCliente(c);
    }

    public boolean bajaCliente() {
        return conexion.bajaCliente(c);
    }

    public boolean modifiCliente() {
        return conexion.modificacionCliente(c);
    }
}
