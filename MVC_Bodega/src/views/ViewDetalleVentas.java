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
public class ViewDetalleVentas extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetalleVentas
     */
    public ViewDetalleVentas() {
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

        jcb_cliente = new javax.swing.JComboBox<>();
        jb_ultimo = new javax.swing.JButton();
        jcb_producto = new javax.swing.JComboBox<>();
        jb_nuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jb_modificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jb_guardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jb_eliminar = new javax.swing.JButton();
        jtf_id = new javax.swing.JTextField();
        jtf_cliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_venta = new javax.swing.JTable();
        jtf_producto = new javax.swing.JTextField();
        jb_primero = new javax.swing.JButton();
        jl_buscar = new javax.swing.JLabel();
        jb_atras = new javax.swing.JButton();
        jtf_buscar = new javax.swing.JTextField();
        jb_siguiente = new javax.swing.JButton();

        jb_ultimo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_ultimo.setText(">|");

        jb_nuevo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_nuevo.setText("Nuevo");

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel1.setText("Clave de la venta");

        jb_modificar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_modificar.setText("Modificar");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel2.setText("Cliente ID");

        jb_guardar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_guardar.setText("Guardar");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel3.setText("Producto ID");

        jb_eliminar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_eliminar.setText("Eliminar");

        jtf_id.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N

        jtf_cliente.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N

        jt_venta.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jt_venta.setModel(new javax.swing.table.DefaultTableModel(
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
        jt_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_ventaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_venta);

        jtf_producto.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N

        jb_primero.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_primero.setText("|<");

        jl_buscar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jl_buscar.setText("Busqueda");

        jb_atras.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_atras.setText("<<");

        jtf_buscar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N

        jb_siguiente.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jb_siguiente.setText(">>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jl_buscar)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(72, 72, 72)
                                    .addComponent(jtf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtf_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcb_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jb_primero)
                        .addComponent(jb_nuevo))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jb_modificar)
                            .addGap(18, 18, 18)
                            .addComponent(jb_guardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jb_eliminar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jb_atras)
                            .addGap(57, 57, 57)
                            .addComponent(jb_siguiente)
                            .addGap(51, 51, 51)
                            .addComponent(jb_ultimo)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_buscar)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(207, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_primero)
                        .addComponent(jb_atras)
                        .addComponent(jb_siguiente)
                        .addComponent(jb_ultimo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_nuevo)
                        .addComponent(jb_modificar)
                        .addComponent(jb_guardar)
                        .addComponent(jb_eliminar))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_ventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ventaMouseClicked

    }//GEN-LAST:event_jt_ventaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jb_atras;
    public javax.swing.JButton jb_eliminar;
    public javax.swing.JButton jb_guardar;
    public javax.swing.JButton jb_modificar;
    public javax.swing.JButton jb_nuevo;
    public javax.swing.JButton jb_primero;
    public javax.swing.JButton jb_siguiente;
    public javax.swing.JButton jb_ultimo;
    public javax.swing.JComboBox<String> jcb_cliente;
    public javax.swing.JComboBox<String> jcb_producto;
    public javax.swing.JLabel jl_buscar;
    private javax.swing.JTable jt_venta;
    public javax.swing.JTextField jtf_buscar;
    public javax.swing.JTextField jtf_cliente;
    public javax.swing.JTextField jtf_id;
    public javax.swing.JTextField jtf_producto;
    // End of variables declaration//GEN-END:variables
}
