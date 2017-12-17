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
        ModelLogin mLogin = new ModelLogin(mPrincipal);
        ModelClientes mClientes = new ModelClientes();
        ModelEmpleados mEmpleados = new ModelEmpleados();
        ModelProductos mProductos = new ModelProductos();
        ModelProveedores mProveedores = new ModelProveedores();
        
        ViewLogin vLogin = new ViewLogin();
        ViewPrincipal vPrincipal = new ViewPrincipal();
        ViewClientes vClientes = new ViewClientes();
        ViewEmpleados vEmpleados = new ViewEmpleados();
        ViewProductos vProductos = new ViewProductos();
        ViewProveedores vProveedores = new ViewProveedores();
        
        Object models[] = new Object[10];
        Object views[] = new Object[10];
        Object controllers[] = new Object [10];
        
        models[0] = mPrincipal;
        models[1] = mLogin;
        models[2] = mClientes;
        models[3] = mEmpleados; // Aquí estabas asignando dos veces el arreglo de models en su posición 4 en lugar de la posición 3. 
        //Tenías escrito esto models[4] = mEmpleados.
        models[4] = mProductos;
        models[5] = mProveedores;
        
        views[0] = vPrincipal;
        views[1] = vLogin;
        views[2] = vClientes;
        views[3] = vEmpleados;
        views[4] = vProductos;
        views[5] = vProveedores;
        
        ControllerPrincipal cPrincipal = new ControllerPrincipal(models, views, controllers);
        controllers[0] = cPrincipal;
        ControllerLogin cLogin = new ControllerLogin(models, views, controllers);
        controllers[1] = cLogin;
        ControllerClientes cClientes = new ControllerClientes(models, views, controllers);
        controllers[2] = cClientes;
        ControllerEmpleados cEmpleados = new ControllerEmpleados(models, views, controllers);
        controllers[3] = cEmpleados;
        ControllerProductos cProductos = new ControllerProductos(models, views, controllers);
        controllers[4] = cProductos;
        ControllerProveedores cProveedores = new ControllerProveedores(models, views, controllers);
        controllers[5] = cProveedores;
    }
}
