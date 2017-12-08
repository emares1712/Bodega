/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.*;
import views.*;
import controllers.*;
/**
 *
 * @author ninte
 */
public class Main {
    public void main(String ej[]){
        ModelPrincipal mPrincipal = new ModelPrincipal();
        ModelClientes mClientes = new ModelClientes();
        
        ViewPrincipal vPrincipal = new ViewPrincipal();
        ViewClientes vClientes = new ViewClientes();
        
        Object models[] = new Object[9];
        Object views[] = new Object[9];
        Object controllers = new Object [9];
        
        models[0] = mPrincipal;
        models[1] = mClientes;
        
        views[0] = vPrincipal;
        views[1] = vClientes;
        
        ControllerPrincipal cPrincipal = new ControllerPrincipal(models, views, controllers);
        controllers[0] = cPrincipal;
        ControllerClientes cClientes = new ControllerClientes(models, views, controllers);
        controllers[1] = cClientes;
    }
}
