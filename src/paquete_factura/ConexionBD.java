/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_factura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author satur
 */
public class ConexionBD {
    
    private String NF;
    private Connection miConexion;
    private Statement miStatement;
    private ResultSet miRS;
    public ConexionBD(){
        try{
        //1. Crear Conexión
        Class.forName("com.mysql.jdbc.Driver");
         miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/factura","root","");
         miStatement = miConexion.createStatement();
            System.out.println("Conexionn Establecida");
    }
    catch(Exception e){
        System.out.println("No Conecta");
        e.printStackTrace();   
    }
    }
    
    public void Actualizar(){
        try{
        String insSQL ="UPDATE mitabla SET NumeroFactura=NumeroFactura+1 WHERE Codigo='1'";
        miStatement.executeUpdate(insSQL);
        System.out.println("Datos actualizados correctamente");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }    
    }
    
    public String getNF(){
        String NF="";    
        try{
            miRS = miStatement.executeQuery("SELECT * FROM mitabla");
            
            while(miRS.next()){
                NF =miRS.getString("NumeroFactura");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo obtener el # de factura");
        }
        
     return "0"+NF;   
    }
    
    public void Modificar(){
        
        String aux = JOptionPane.showInputDialog("Ingrese numero de inicio de factura");
        int auxInt = Integer.parseInt(aux);
        try{
        String insSQL2 ="UPDATE mitabla SET NumeroFactura=? WHERE Codigo='1'";    
        PreparedStatement sentencia = miConexion.prepareStatement(insSQL2);
        sentencia.setInt(1, auxInt);
        sentencia.executeUpdate();
        System.out.println("Datos actualizados correctamente");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }    
    }

}
