/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class Nota {
    
    public boolean GetRegistrarNota(String codigo_alumno,float nota1,float nota2,float nota3){
        
        boolean respuesta=false;
        try {
            JOptionPane.showMessageDialog(null,Conexion.obtener());
            Connection conex =Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getRegistrarNotas(?,?,?,?);");
            
            Consultar.setString(1,codigo_alumno);
            Consultar.setFloat(2, nota1);
            Consultar.setFloat(3, nota2);
            Consultar.setFloat(4, nota3);
            Consultar.executeUpdate();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"hola  "+e);} 
        try{
            Connection conex=Conexion.obtener();
            PreparedStatement Consultar =conex.prepareStatement("CALL  usp_getListaNotas();");
             ResultSet Resultado=Consultar.executeQuery();
            while (Resultado.next()) {                
                if(Resultado.getString("codAlum").equals(codigo_alumno)){
                    JOptionPane.showMessageDialog(null,"Persona ingresado");
                    respuesta=true;break;
                } 
            }
            Conexion.Cerrar(); 
        } catch (Exception e) {
            respuesta=false;
        }
        
        return respuesta;
    }
}
