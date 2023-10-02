package lab06;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public final class VENT_PROFESORES extends javax.swing.JFrame {

    //Le aplicamos un atributo con el objeto de la ventana anterior
    GestorCursos padreCurso;
    DefaultListModel modeloProfesores = new DefaultListModel();
    List<PROFESOR> listaProfesores = new ArrayList<>();
    
    
    public VENT_PROFESORES() {
        initComponents();
    }
    //Le aplicamos otro constructor
    public VENT_PROFESORES(GestorCursos padreCurso){
        initComponents();
        this.padreCurso = padreCurso;
        //calculamos el indice seleccionado
        int index = padreCurso.BuscarIndiceActual();

        //tenemos el indice del curso a ver
        //Ahora buscaremos el curso en ese indice
        CURSO n = padreCurso.listaCursos.get(index);

        //En el curso n esta los profesores que veremos
        //Ahora le sacamos su atributos List<Profesor>
        this.listaProfesores = n.getProfesores();
        ActualizarModelo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtBuscarProfesor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        seguro = new javax.swing.JTextField();
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

        jPanel4.setBackground(new java.awt.Color(82, 215, 61));
        jPanel4.setPreferredSize(new java.awt.Dimension(645, 440));

        jPanel5.setBackground(new java.awt.Color(82, 215, 61));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarProfesor.setToolTipText("");
        txtBuscarProfesor.setBorder(null);
        jPanel5.add(txtBuscarProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/Rectangle 2.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        seguro.setText("jTextField1");
        jPanel5.add(seguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 0, 0));

        lblbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/BUSCAR_P.png"))); // NOI18N
        lblbtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbtnBuscarMouseClicked(evt);
            }
        });

        jList4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jList4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(jList4);

        lblbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/SALIR_P.png"))); // NOI18N
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

        lblbtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/AGREGAR_P.png"))); // NOI18N
        lblbtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbtnAgregarMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(82, 215, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltxtTitulo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbltxtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltxtTitulo.setText("AEFEFQ");
        jPanel1.add(lbltxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 350, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/PROFESOR DE_.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblbtnBuscar)))
                        .addGap(1, 1, 1)))
                .addGap(44, 44, 44))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblbtnSalir)
                    .addComponent(lblbtnAgregar)
                    .addComponent(lblbtnEliminar))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblbtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbtnSalirMouseClicked
        // TODO add your handling code here:
        //BOTON SALIR
        this.setVisible(false);
        padreCurso.setVisible(true);
    }//GEN-LAST:event_lblbtnSalirMouseClicked

    private void lblbtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbtnAgregarMouseClicked

        //AGREGAMOS UN PROFE
        VENT_A_CURSO vent = new VENT_A_CURSO(this);
        vent.setVisible(true);
        vent.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblbtnAgregarMouseClicked

    private void lblbtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbtnEliminarMouseClicked
        //BOTON PARA ELIMINAR
        if(BuscarIndiceActual_P() == -1){
            //No hacemos nada
        }
        else{
            //Eliminamos el objeto en la posicion indicada de la lista
            listaProfesores.remove(BuscarIndiceActual_P());
            //Ahora actualizamos el modelo
            ActualizarModelo();
        }
    }//GEN-LAST:event_lblbtnEliminarMouseClicked

    private void lblbtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbtnBuscarMouseClicked
        // Boton buscar
        if(txtBuscarProfesor.getText().equals("")){
            //NO hacemos nada
        }else{
            //Vamos a buscar el string en la lista actual de Estudiante
            String palabra = txtBuscarProfesor.getText();
            int flag = 0;
            for( int i = 0; i< listaProfesores.size();i++){
                if(listaProfesores.get(i).getNombre().equals(palabra)){
                    //Mostramos que si esta encontrado
                    flag = 1;
                    //Mostramos mensaje
                    JOptionPane.showMessageDialog(null, ""
                            + "El Profesor SI fue encontrado");
                }
            }
            if(flag == 0){
                JOptionPane.showMessageDialog(null, ""
                        + "El Profesor NO fue encontrado");
            }
        }
    }//GEN-LAST:event_lblbtnBuscarMouseClicked

    
    //METODO PARA ACTUALIZAR El MODELO DE LA LISTA DE PROFE 
    //DEPENDIENDO DEL CURSO SELECCIONADO
    public void ActualizarModelo(){
        this.modeloProfesores = new DefaultListModel();
        for (int i = 0; i < listaProfesores.size(); i++) {
            String text = listaProfesores.get(i).getTEXTO_P();
            this.modeloProfesores.addElement(text);
        }
        this.jList4.setModel(modeloProfesores);
    }
    
    public int BuscarIndiceActual_P(){
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
    private javax.swing.JTextField txtBuscarProfesor;
    // End of variables declaration//GEN-END:variables
}
