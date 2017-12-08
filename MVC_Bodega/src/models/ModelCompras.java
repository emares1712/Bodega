/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ninte
 */
public class ModelCompras{
    private Connection sql_connection;
    private Statement sql_st;
    private PreparedStatement sql_ps;
    private ResultSet sql_rs;
    private String sql;
    private ModelPrincipal modelPrincipal;
    private String idCompra;
    private String nombreCliente;
    private String estado;
    private String ciudad;
    private String telefono;
    private String whatsapp;
    
    public ModelCompras(ModelPrincipal modelPrincipal){
        this.modelPrincipal = modelPrincipal;
    }
    private void Connect(){
        try{
            sql_connection = DriverManager.getConnection("jdbc:mysql://localhost/bodega","root","1234");
            sql_st = sql_connection.createStatement();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error 101: No hay conexión con la base de datos: " + e);
        }
    }
    public void ConsultarClientes(){
        try{
            Connect();
            sql = "SELECT * FROM Clientes ORDER BY ClienteID ASC";
            sql_rs = sql_st.executeQuery(sql);
            sql_rs.first();
            //sql_connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error 102: Consulta tabla Personas: " + e);
        }
    }
    public void AsignarCliente(){
        try{
            idCompra = sql_rs.getString("ClienteID");
            nombreCliente = sql_rs.getString("Nombre_Cliente");
            ciudad = sql_rs.getString("Ciudad");
            estado = sql_rs.getString("Estado");
            telefono = sql_rs.getString("Telefono");
            whatsapp = sql_rs.getString("Whatsapp");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error 103: Asignado de valores del cliente: " + e);
        }
    }
    public void InsertarCliente(){
        try{
            Connect();
            sql = "Insert into Clientes (ClienteID, Nombre_Cliente, Ciudad, Estado, Telefono, Whatsapp)Values (?,?,?,?,?,?);";
            sql_ps = sql_connection.prepareStatement(sql);
            sql_ps.setString(1, nombreCliente);
            sql_ps.setString(2, ciudad);
            sql_ps.setString(3, estado);
            sql_ps.setString(4, telefono);
            sql_ps.setString(5, whatsapp);
            sql_ps.executeUpdate();
            sql_connection.close();
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error 104: Insertando nuevo cliente: " + e);
        }
    }
    public void ModificarCliente(){
        try{
            Connect();
            sql = "Update Clientes Set Nombre_Cliente = (?), Ciudad (?), Estado (?), Telefono (?), Whatsapp (?) Where ClienteID = (?);";
            sql_ps = sql_connection.prepareStatement(sql);
           sql_ps.setString(1, nombreCliente);
           sql_ps.setString(2, ciudad);
           sql_ps.setString(3, estado);
           sql_ps.setString(4, telefono);
           sql_ps.setString(5, whatsapp);
           sql_ps.setInt(6, Integer.parseInt(idCompra));
           sql_ps.executeUpdate();
           sql_connection.close();
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error 105: Modificar Cliente: " + e);
        }
    }

    public void EliminarCliente(){
        try{
            Connect();
            sql = "DELETE FROM Cliente Where ClienteID = (?);";
            sql_ps.setInt(1, Integer.parseInt(idCompra));
            sql_ps.executeUpdate();
            sql_connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error 106: Eliminar Cliente: " + e);
        }
    }
    
    public String getIdCliente() {
        return idCompra;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getEstado() {
        return estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setIdCliente(String idCliente) {
        this.idCompra = idCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
}
