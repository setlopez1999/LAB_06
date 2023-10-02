package lab06;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public final class VENT_ESTUDIANTES extends javax.swing.JFrame {

    GestorCursos padreCurso;
    DefaultListModel modeloEstudiantes = new DefaultListModel();
    List<ESTUDIANTE> listaEstudiantes = new ArrayList<>();
    
    public VENT_ESTUDIANTES() {
        initComponents();
    }
    
    public VENT_ESTUDIANTES(GestorCursos padreCurso) {
        initComponents();
        this.padreCurso = padreCurso;
        //Ahora actualizamos la lista con el del padre
        //segun el indice seleccionado
        int index = padreCurso.BuscarIndiceActual();
        CURSO n = padreCurso.listaCursos.get(index);
        this.listaEstudiantes = n.getEstudiantes();
        ActualizarModelo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        seguro = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtBuscarEstudiante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblbtnBuscar = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        lblbtnSalir = new javax.swing.JLabel();
        lblbtnEliminar = new javax.swing.JLabel();
        lblbtnAgregar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbltxtTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(137, 183, 8));
        jPanel4.setPreferredSize(new java.awt.Dimension(645, 440));

        seguro.setText("jTextField1");

        jPanel5.setBackground(new java.awt.Color(137, 183, 8));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarEstudiante.setBorder(null);
        txtBuscarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarEstudianteActionPerformed(evt);
            }
        });
        jPanel5.add(txtBuscarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/Rectangle 2.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        lblbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/BUSCAR_E.png"))); // NOI18N
        lblbtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbtnBuscarMouseClicked(evt);
            }
        });

        jList4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jList4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(jList4);

        lblbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/SALIR_E.png"))); // NOI18N
        lblbtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbtnSalirMouseClicked(evt);
            }
        });

        lblbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/ELIMINAR.png"))); // NOI18N
        lblbtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbtnEliminarMouseClicked(evt);
            }
        });

        lblbtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/AGREGAR_E.png"))); // NOI18N
        lblbtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbtnAgregarMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(137, 183, 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltxtTitulo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbltxtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltxtTitulo.setText("FEFWFWEF");
        jPanel1.add(lbltxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 350, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/ESTUDIANTE DE _.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seguro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblbtnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblbtnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(lblbtnEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(422, 422, 422)
                                .addComponent(lblbtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(1, 1, 1)))
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seguro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblbtnSalir)
                    .addComponent(lblbtnAgregar)
                    .addComponent(lblbtnEliminar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarEstudianteActionPerformed

    private void lblbtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbtnSalirMouseClicked
        // TODO add your handling code here:
        //BOTON PARA SALIR/REGRESAR
        padreCurso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblbtnSalirMouseClicked

    private void lblbtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbtnAgregarMouseClicked
        // TODO add your handling code here:
        //BOTON AGREGAR
        //Primero abrimos la ventana
        VENT_A_CURSO vent = new VENT_A_CURSO(this);
        vent.setVisible(true);
        vent.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_lblbtnAgregarMouseClicked

    private void lblbtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbtnEliminarMouseClicked
        //Revise el indexseleccionado
        if(BuscarIndiceActual_E() == -1){
            //No hacemos nada
        }
        else{
            //Eliminamos el objeto en la posicion indicada de la lista
            listaEstudiantes.remove(BuscarIndiceActual_E());
            //Ahora actualizamos el modelo
            ActualizarModelo();
        }
    }//GEN-LAST:event_lblbtnEliminarMouseClicked

    private void lblbtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbtnBuscarMouseClicked
        // Boton buscar
        if(txtBuscarEstudiante.getText().equals("")){
            //NO hacemos nada
        }else{
            //Vamos a buscar el string en la lista actual de Estudiante
            String palabra = txtBuscarEstudiante.getText();
            int flag = 0;
            for( int i = 0; i< listaEstudiantes.size();i++){
                if(listaEstudiantes.get(i).getCodigo().equals(palabra)){
                    //Mostramos que si esta encontrado
                    flag = 1;
                    //Mostramos mensaje
                    JOptionPane.showMessageDialog(null, ""
                            + "El Estudiante SI fue encontrado");
                }
            }
            if(flag == 0){
                JOptionPane.showMessageDialog(null, ""
                        + "El estudiante NO fue encontrado");
            }
        }
        
        
        
    }//GEN-LAST:event_lblbtnBuscarMouseClicked

    
    //METODO PARA ACTUALIZAR METODO
    public void ActualizarModelo(){
        this.modeloEstudiantes = new DefaultListModel();
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            String text = listaEstudiantes.get(i).getTEXTO_E();
            this.modeloEstudiantes.addElement(text);
        }
        this.jList4.setModel(modeloEstudiantes);
    }

    public int BuscarIndiceActual_E(){
        int index = jList4.getSelectedIndex();
        return index;
    }
    
    public void CambiarTitulo(String t){
        lbltxtTitulo.setText(t);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblbtnAgregar;
    private javax.swing.JLabel lblbtnBuscar;
    private javax.swing.JLabel lblbtnEliminar;
    private javax.swing.JLabel lblbtnSalir;
    private javax.swing.JLabel lbltxtTitulo;
    private javax.swing.JTextField seguro;
    private javax.swing.JTextField txtBuscarEstudiante;
    // End of variables declaration//GEN-END:variables
}
