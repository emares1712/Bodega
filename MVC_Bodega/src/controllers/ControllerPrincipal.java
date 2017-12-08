/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelPrincipal;
import views.*;
/**
 *
 * @author ninte
 */
public class ControllerPrincipal {
    private ModelPrincipal mPrincipal;
    private ViewPrincipal vPrincipal;
    private ViewClientes vClientes;
    private ViewEmpleados vEmpleados;
    private ViewProductos vProductos;
    private ViewProveedores vProveedores;
    private ViewCompras vCompras;
    private ViewVentas vVentas;
    private ViewDetalleVentas vDetalleVentas;
    private ViewDetalleCompras vDetalleCompras;
    
    public ControllerPrincipal(Object models[], Object views[], Object controllers[]){
        this.mPrincipal = (ModelPrincipal)models[0];
        this.vPrincipal = (ViewPrincipal)views[0];
        this.vClientes = (ViewClientes)views[1];
        this.vEmpleados = (ViewEmpleados)views[2];
        this.vProductos = (ViewProductos)views[3];
        this.vProveedores = (ViewProveedores)views[4];
        this.vCompras = (ViewCompras)views[5];
        this.vVentas = (ViewVentas)views[6];
        this.vDetalleCompras = (ViewDetalleCompras)views[7];
        this.vDetalleVentas = (ViewDetalleVentas)views[8];
        initView();
    }
    public void initView(){
        vPrincipal.setTitle("Bodega J & B");
        vPrincipal.setLocationRelativeTo(null);
        vPrincipal.setVisible(true);
        Agregar_Menu();
    }
    public void Agregar_Menu(){
        vPrincipal.jmi_clientes.addActionListener(e->jmi_clientes_click());
        vPrincipal.jmi_empleados.addActionListener(e->jmi_empleados_click());
        vPrincipal.jmi_productos.addActionListener(e->jmi_productos_click());
        vPrincipal.jmi_proveedores.addActionListener(e->jmi_proveedores_click());
        vPrincipal.jmi_compras.addActionListener(e->jmi_compras_click());
        vPrincipal.jmi_ventas.addActionListener(e->jmi_ventas_click());
        vPrincipal.jmi_detalleCompras.addActionListener(e->jmi_detalleCompras_click());
        vPrincipal.jmi_detalleVentas.addActionListener(e->jmi_detalleVentas_click());
    }
    public void jmi_clientes_click(){
        vPrincipal.setContentPane(vClientes);
        vPrincipal.revalidate();
        vPrincipal.repaint();
    }
    public void jmi_empleados_click(){
        vPrincipal.setContentPane(vEmpleados);
        vPrincipal.revalidate();
        vPrincipal.repaint();
    }
    public void jmi_productos_click(){
        vPrincipal.setContentPane(vProductos);
        vPrincipal.revalidate();
        vPrincipal.repaint();
    }
    public void jmi_proveedores_click(){
        vPrincipal.setContentPane(vProveedores);
        vPrincipal.revalidate();
        vPrincipal.repaint();
    }
    public void jmi_compras_click(){
        vPrincipal.setContentPane(vCompras);
        vPrincipal.revalidate();
        vPrincipal.repaint();
    }
    public void jmi_ventas_click(){
        vPrincipal.setContentPane(vVentas);
        vPrincipal.revalidate();
        vPrincipal.repaint();
    }
    public void jmi_detalleCompras_click(){
        vPrincipal.setContentPane(vCompras);
        vPrincipal.revalidate();
        vPrincipal.repaint();
    }
    public void jmi_detalleVentas_click(){
        vPrincipal.setContentPane(vVentas);
        vPrincipal.revalidate();
        vPrincipal.repaint();
    }
}
