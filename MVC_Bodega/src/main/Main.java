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
    public static void main(String ej[]){
        ModelPrincipal mPrincipal = new ModelPrincipal();
        ModelClientes mClientes = new ModelClientes();
        ModelEmpleados mEmpleados = new ModelEmpleados();
        ModelProductos mProductos = new ModelProductos();
        ModelProveedores mProveedores = new ModelProveedores();
        
        ViewPrincipal vPrincipal = new ViewPrincipal();
        ViewClientes vClientes = new ViewClientes();
        ViewEmpleados vEmpleados = new ViewEmpleados();
        ViewProductos vProductos = new ViewProductos();
        ViewProveedores vProveedores = new ViewProveedores();
        
        Object models[] = new Object[9];
        Object views[] = new Object[9];
        Object controllers[] = new Object [9];
        
        models[0] = mPrincipal;
        models[1] = mClientes;
        models[2] = mEmpleados;
        models[3] = mProductos;
        models[4] = mProveedores;
        
        views[0] = vPrincipal;
        views[1] = vClientes;
        views[2] = vEmpleados;
        views[3] = vProductos;
        views[4] = vProveedores;
        
        ControllerPrincipal cPrincipal = new ControllerPrincipal(models, views, controllers);
        controllers[0] = cPrincipal;
        ControllerClientes cClientes = new ControllerClientes(models, views, controllers);
        controllers[1] = cClientes;
        ControllerEmpleados cEmpleados = new ControllerEmpleados(models, views, controllers);
        controllers[2] = cEmpleados;
        ControllerProductos cProductos = new ControllerProductos(models, views, controllers);
        controllers[3] = cProductos;
        ControllerProveedores cProveedores = new ControllerProveedores(models, views, controllers);
        controllers[4] = cProveedores;
    }
}
