/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author ninte
 */
public class ViewVentas extends javax.swing.JPanel {

    /**
     * Creates new form ViewVentas
     */
    public ViewVentas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtf_fecha = new javax.swing.JTextField();
        jtf_precio = new javax.swing.JTextField();
        jtf_total = new javax.swing.JTextField();
        jl_total = new javax.swing.JLabel();
        jb_primero = new javax.swing.JButton();
        jb_anterior = new javax.swing.JButton();
        jb_siguiente = new javax.swing.JButton();
        jb_ultimo = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_nuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_detalle_venta = new javax.swing.JTable();
        jl_detalle = new javax.swing.JLabel();
        jtf_detalle = new javax.swing.JTextField();
        jl_buscar = new javax.swing.JLabel();
        jl_venta_id = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();
        jtf_venta = new javax.swing.JTextField();
        jl_cantidad = new javax.swing.JLabel();
        jtf_cantidad = new javax.swing.JTextField();
        jcb_idventa = new javax.swing.JComboBox<>();
        jl_fecha = new javax.swing.JLabel();
        jl_precio = new javax.swing.JLabel();

        jl_total.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jl_total.setText("Total");

        jb_primero.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_primero.setText("|<");

        jb_anterior.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_anterior.setText("<<");

        jb_siguiente.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_siguiente.setText(">>");

        jb_ultimo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_ultimo.setText(">|");

        jb_eliminar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_eliminar.setText("Eliminar");

        jb_guardar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_guardar.setText("Guardar");

        jb_modificar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_modificar.setText("Modificar");

        jb_nuevo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_nuevo.setText("Nuevo");

        jt_detalle_venta.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jt_detalle_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jt_detalle_venta);

        jl_detalle.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jl_detalle.setText("Detalle de venta");

        jl_buscar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jl_buscar.setText("Busqueda");

        jl_venta_id.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jl_venta_id.setText("Clave Venta");

        jtf_buscar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        jl_cantidad.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jl_cantidad.setText("Cantidad");

        jl_fecha.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jl_fecha.setText("Fecha de la Venta");

        jl_precio.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jl_precio.setText("Precio Unitario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(jl_buscar)
                            .addGap(30, 30, 30)
                            .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(132, 132, 132))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb_nuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb_modificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jb_guardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jb_eliminar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jb_primero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb_anterior)
                                        .addGap(36, 36, 36)
                                        .addComponent(jb_siguiente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jb_ultimo)))
                                .addGap(76, 76, 76))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_cantidad)
                                        .addGap(67, 67, 67)
                                        .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(86, 86, 86))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_venta_id)
                                            .addComponent(jl_detalle))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtf_venta, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(jtf_detalle))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcb_idventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_fecha)
                                            .addComponent(jl_precio))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtf_fecha)
                                            .addComponent(jtf_precio, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_total)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_buscar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_fecha)
                            .addComponent(jtf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_detalle)
                            .addComponent(jtf_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jl_venta_id)
                                .addComponent(jtf_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcb_idventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jl_cantidad)
                                .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jl_precio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jl_total)
                                .addComponent(jtf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jtf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_primero)
                        .addComponent(jb_anterior)
                        .addComponent(jb_siguiente)
                        .addComponent(jb_ultimo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_nuevo)
                        .addComponent(jb_modificar)
                        .addComponent(jb_guardar)
                        .addComponent(jb_eliminar))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jb_anterior;
    public javax.swing.JButton jb_eliminar;
    public javax.swing.JButton jb_guardar;
    public javax.swing.JButton jb_modificar;
    public javax.swing.JButton jb_nuevo;
    public javax.swing.JButton jb_primero;
    public javax.swing.JButton jb_siguiente;
    public javax.swing.JButton jb_ultimo;
    public javax.swing.JComboBox<String> jcb_idventa;
    public javax.swing.JLabel jl_buscar;
    public javax.swing.JLabel jl_cantidad;
    public javax.swing.JLabel jl_detalle;
    public javax.swing.JLabel jl_fecha;
    public javax.swing.JLabel jl_precio;
    public javax.swing.JLabel jl_total;
    public javax.swing.JLabel jl_venta_id;
    private javax.swing.JTable jt_detalle_venta;
    public javax.swing.JTextField jtf_buscar;
    public javax.swing.JTextField jtf_cantidad;
    public javax.swing.JTextField jtf_detalle;
    public javax.swing.JTextField jtf_fecha;
    public javax.swing.JTextField jtf_precio;
    public javax.swing.JTextField jtf_total;
    public javax.swing.JTextField jtf_venta;
    // End of variables declaration//GEN-END:variables
}
