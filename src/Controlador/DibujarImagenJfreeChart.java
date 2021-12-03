/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.conexion;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author antonio
 */
public class DibujarImagenJfreeChart {

    private static DibujarImagenJfreeChart instancia;

    public static DibujarImagenJfreeChart getInstancia() {
        if (instancia == null) {
            instancia = new DibujarImagenJfreeChart();
        }
        return instancia;
    }

    private conexion c = new conexion();
    public Connection cn = c.getConexion();
    
    public String consulta="";
    
    
    public void mostrarProducto() throws SQLException, IOException{
        
        consulta="Select * from client";
       
        Statement statement=cn.createStatement();
        ResultSet rs=statement.executeQuery(consulta);
       
        DefaultPieDataset dataset=new DefaultPieDataset();
        while(rs.next()){
            dataset.setValue(rs.getString("clientNO"), Integer.parseInt(rs.getString("maxRent")));
        }
        
        //dibujamos el grafico
        
        JFreeChart chart= ChartFactory.createPieChart("Grafico de tipo hogar", dataset, true, true, false);
       
        //tamano para la imgen
        int ancho=560;
        int alto=380;
        File f=new File("src/Recursos/Grafico.png");
        ChartUtilities.saveChartAsPNG(f, chart, ancho, alto);
      
    }
    
}
