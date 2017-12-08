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
    
    public ControllerPrincipal(Object models[], Object views[], Object controllers[]){
        this.mPrincipal = (ModelPrincipal)models[0];
        this.vPrincipal = (ViewPrincipal)views[0];
        this.vClientes = (ViewClientes)views[1];
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
    }
    public void jmi_clientes_click(){
        vPrincipal.setContentPane(vClientes);
        vPrincipal.revalidate();
        vPrincipal.repaint();
    }
}
