
package controllers;
import models.ModelClientes;
import views.ViewClientes;
/**
 *
 * @author ninte
 */
public class ControllerClientes {
    private ModelClientes mClientes;
    private ViewClientes vClientes;
    
public ControllerClientes(Object models[], Object views[], Object controllers[]){
        this.mClientes = (ModelClientes)models[1];
        this.vClientes = (ViewClientes)views[1];
        initView();
    }
    public void initView(){
        Agregar();
        mClientes.ConsultarClientes();
        mClientes.MoverPrimero();
        mClientes.AsignarCliente();
        getValor();
        vClientes.jtf_id_cliente.setEnabled(false);
    }
    public void Agregar(){
        vClientes.jb_anterior.addActionListener(e->jbtn_anterior_Click());
        vClientes.jb_eliminar.addActionListener(e->jbtn_eliminar_Click());
        vClientes.jb_guardar.addActionListener(e->jbtn_guardar_Click());
        vClientes.jb_modificar.addActionListener(e->jbtn_modificar_Click());
        vClientes.jb_nuevo.addActionListener(e->jbtn_nuevo_Click());
        vClientes.jb_primero.addActionListener(e->jbtn_primero_Click());
        vClientes.jb_siguiente.addActionListener(e->jbtn_siguiente_Click());
        vClientes.jb_ultimo.addActionListener(e->jbtn_ultimo_Click());
    }
    public void getValor(){
        vClientes.jtf_id_cliente.setText(mClientes.getIdCliente());
        vClientes.jtf_nombre.setText(mClientes.getNombreCliente());
        vClientes.jtf_ciudad.setText(mClientes.getCiudad());
        vClientes.jtf_estado.setText(mClientes.getEstado());
        vClientes.jtf_telefono.setText(mClientes.getTelefono());
        vClientes.jtf_whatsapp.setText(mClientes.getWhatsapp());
    }
    public void setValor(){
        mClientes.setIdCliente((vClientes.jtf_id_cliente.getText()));
        mClientes.setNombreCliente((vClientes.jtf_nombre.getText()));
        mClientes.setCiudad((vClientes.jtf_ciudad.getText()));
        mClientes.setEstado((vClientes.jtf_estado.getText()));
        mClientes.setTelefono((vClientes.jtf_telefono.getText()));
        mClientes.setWhatsapp((vClientes.jtf_whatsapp.getText()));
    }
    public void Nuevo_Cliente(){
        vClientes.jtf_id_cliente.setText("");
        vClientes.jtf_nombre.setText("");
        vClientes.jtf_ciudad.setText("");
        vClientes.jtf_estado.setText("");
        vClientes.jtf_telefono.setText("");
        vClientes.jtf_whatsapp.setText("");
    }
    public void jbtn_anterior_Click(){
        mClientes.MoverAnterior();
        getValor();
    }
    public void jbtn_eliminar_Click(){
        setValor();
        mClientes.EliminarCliente();
    }
    public void jbtn_guardar_Click(){
        setValor();
        mClientes.ModificarCliente();
    }
    public void jbtn_modificar_Click(){
        setValor();
        mClientes.ModificarCliente();
    }
    public void jbtn_nuevo_Click(){
        Nuevo_Cliente();
        mClientes.ConsultarClientes();
    }
    public void jbtn_primero_Click(){
        mClientes.MoverPrimero();
        getValor();
    }
    public void jbtn_siguiente_Click(){
        mClientes.MoverSiguiente();
        getValor();
    }
    public void jbtn_ultimo_Click(){
        mClientes.MoverUltimo();
        getValor();
    }
}