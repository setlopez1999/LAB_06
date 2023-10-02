package lab06;

import java.awt.Color;
import javax.swing.DefaultListModel;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTextField;

public class VENT_A_CURSO extends javax.swing.JFrame {
    //Creamos los atributos de la ventana
    GestorCursos padre_cursos ;
    VENT_ESTUDIANTES padre_estudiantes ;
    VENT_PROFESORES padre_profesores;
    public int llave;
    
    public VENT_A_CURSO() {
        initComponents();
    }
    public VENT_A_CURSO(GestorCursos padre){
        initComponents();
        this.padre_cursos = padre;
        llave = 0;
    }//llave = 0
    public VENT_A_CURSO(VENT_PROFESORES padre){
        initComponents();
        //Le damos el padre y la llave que usara el boton cancelar y guardar
        this.padre_profesores = padre;
        llave = 1;        
        
        //Color del fondo al correspondiente al figma
        jPanel1.setBackground(new java.awt.Color(82, 215, 61));
        jPanel5.setBackground(new java.awt.Color(82, 215, 61));
        
        //Cambiamos los botones ; el de cancelar queda igual
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource
        ("/IMG/PRINCIPAL/Rectangle V.png")));
        lblbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource
        ("/IMG/PRINCIPAL/GUARDAR_P.png")));
        
        //Mostramos solo el textField Nombre
        lblBlancoCodigo.setVisible(false);
        txtCodigo.setVisible(false);
        
        lblBlancoCreditos.setVisible(false);
        txtCreditos.setVisible(false);
        
        //CAmbiamos el titulo
        Titulo.setText("Nombre del Profesor");
        
    }//llave = 1
    public VENT_A_CURSO(VENT_ESTUDIANTES padre){
        initComponents();
        this.padre_estudiantes = padre;
        llave = 2;
        
        //Color del fondo al correspondiente al figma [137,183,8] verde oscuro
        jPanel1.setBackground(new java.awt.Color(137, 183, 8));
        jPanel5.setBackground(new java.awt.Color(137, 183, 8));
        
        //Cambiamos los botones - el de cancelar queda igual
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource
        ("/IMG/PRINCIPAL/Rectangle VD.png")));
        lblbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource
        ("/IMG/PRINCIPAL/GUARDAR_E.png")));
        
        //Mostramos solo el textField Nombre y Codigo
        
        lblBlancoCreditos.setVisible(false);
        txtCreditos.setVisible(false);
        
        //CAmbiamos el titulo
        Titulo.setText("Nombre del Estudiante");

    }//llave = 2
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        seguro = new javax.swing.JTextField();
        lblbtnGuardar = new javax.swing.JLabel();
        lblbtnCancelar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblBlancoCodigo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblBlancoNombre = new javax.swing.JLabel();
        txtCreditos = new javax.swing.JTextField();
        lblBlancoCreditos = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(131, 165, 215));

        seguro.setText("jTextField1");

        lblbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/GUARDAR.png"))); // NOI18N
        lblbtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbtnGuardarMouseClicked(evt);
            }
        });

        lblbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/CANCELAR.png"))); // NOI18N
        lblbtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbtnCancelarMouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(131, 165, 215));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Nombre del Curso");
        jPanel5.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 410, 40));

        txtCodigo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(204, 204, 204));
        txtCodigo.setText("Codigo");
        txtCodigo.setBorder(null);
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoMouseClicked(evt);
            }
        });
        jPanel5.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 370, 20));

        lblBlancoCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/Rectangle 2.png"))); // NOI18N
        jPanel5.add(lblBlancoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 40));

        txtNombre.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Nombre");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        jPanel5.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 370, 20));

        lblBlancoNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/Rectangle 2.png"))); // NOI18N
        jPanel5.add(lblBlancoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 40));

        txtCreditos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtCreditos.setForeground(new java.awt.Color(204, 204, 204));
        txtCreditos.setText("Creditos");
        txtCreditos.setBorder(null);
        txtCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCreditosMouseClicked(evt);
            }
        });
        jPanel5.add(txtCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 370, 20));

        lblBlancoCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/Rectangle 2.png"))); // NOI18N
        jPanel5.add(lblBlancoCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 40));

        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PRINCIPAL/Rectangle B.png"))); // NOI18N
        jPanel5.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblbtnGuardar)
                        .addGap(77, 77, 77)
                        .addComponent(lblbtnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(seguro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(seguro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbtnGuardar)
                    .addComponent(lblbtnCancelar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Mandamos a agregar dependiendo del tipo del padre
    private void lblbtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbtnGuardarMouseClicked
        //Para guardar 3 tipos de objeto: CURSO, ESTUDIANTE o PROFESOR.
        //Dependiendo de la llave           0         1          2 
        switch (llave) {
            case 0:
                //Creamos un Curso
                if(txtNombre.getText().equals("Nombre")||
                txtCodigo.getText().equals("Codigo") ||
                txtCreditos.getText().equals("Creditos")){
                    //No hacemos nada
                }
                else{
                    //METODO DE AGREGACION DE CURSO → PADRE
                    AgregarCurso(padre_cursos);
                }
                break;
            case 1:
                //Creamos un Profesor
                if(txtNombre.getText().equals("Nombre")){
                    //No hacemos nada
                }
                else{
                    //METODO DE AGREGACION DE CURSO → PADRE
                    AgregarProfesor(padre_profesores);
                }
                break;
            case 2:
                //Creamos un Estudiante
                if(txtNombre.getText().equals("Nombre")||
                txtCodigo.getText().equals("Codigo")){
                    //No hacemos nada
                }
                else{
                    //METODO DE AGREGACION DE CURSO → PADRE
                    AgregarEstudiante(padre_estudiantes);
                }
                break;
            default:
                throw new AssertionError();
        }
        
        
    }//GEN-LAST:event_lblbtnGuardarMouseClicked

    //BOTON CANCELAR
    private void lblbtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbtnCancelarMouseClicked
        //Volvemos a la pestaña anterior
        this.dispose();
        switch (llave) {
            case 0:
                padre_cursos.setVisible(true);
                padre_cursos.setLocationRelativeTo(null);
                break;
            case 1:
                padre_profesores.setVisible(true);
                padre_profesores.setLocationRelativeTo(null);
                break;
            case 2:
                padre_estudiantes.setVisible(true);
                padre_estudiantes.setLocationRelativeTo(null);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_lblbtnCancelarMouseClicked

    //METODOS DE AGREGAR
    public void AgregarCurso(GestorCursos padre_cursos){
        //Creamos el curso
        String nombre = txtNombre.getText();
        String codigo = txtCodigo.getText();
        //Si introduce un credito erroneo, se inicializa con 0
        int creditos;
        try{
            creditos = Integer.parseInt(txtCreditos.getText());
        }catch (NumberFormatException ex) {
            creditos = 0;
        }

        //Sacamos los textos y creamos un curso con los textos
        CURSO curso_actual = new CURSO(nombre,codigo,creditos);

        //Ahora agregamos el texto del curso en el modelo del padre
        padre_cursos.modeloCursos.addElement(
                curso_actual.getTEXTO_C());

        //Ahora el curso en la lista de cursos del padre
        padre_cursos.listaCursos.add(curso_actual);

        //Ahora actualizamos el JLista del padre con el modelo
        padre_cursos.ActualizarModelo();

        //Ahora cerramos la pestaña
        this.dispose();
        padre_cursos.setVisible(true);

    }
    public void AgregarProfesor(VENT_PROFESORES padre_profesores){
        //Creamos el profesor, solo con nombre x'd
        String nombre = txtNombre.getText();

        //Sacamos los textos y creamos un profe con los textos
        PROFESOR profesor_actual = new PROFESOR(nombre);
        

        //Ahora al profesor en la lista de profesores del padre
        padre_profesores.listaProfesores.add(profesor_actual);

        //Ahora actualizamos el JLista del padre con el modelo
        padre_profesores.ActualizarModelo();

        //Ahora cerramos la pestaña
        this.dispose();
        padre_profesores.setVisible(true);
    }
    public void AgregarEstudiante(VENT_ESTUDIANTES padre_estudiantes){
        //Creamos al estudiante con los datos ingresados
        String nombre = txtNombre.getText();
        String codigo = txtCodigo.getText();
        ESTUDIANTE estudiante_actual = new ESTUDIANTE(nombre,codigo);
        
        padre_estudiantes.listaEstudiantes.add(estudiante_actual);
        //Ahora actualizamos el modelo del padre_estudiantes
        padre_estudiantes.ActualizarModelo();
        
        //Ahora cerramos la ventana
        this.dispose();
        padre_estudiantes.setVisible(true);
    }
    
    
    //Codigo de las marcas de agua
    private void txtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMouseClicked
        // TODO add your handling code here:
        //Cuando se clickea el textfield del codigo
        //Primero que verifique si esta vacio pone la marca de agua
        if(txtCodigo.getText().equals("Codigo")){
            //No hace nada
            txtCodigo.setText("");
            //Cambiamos el color
            txtCodigo.setForeground(Color.BLACK);
        }
        
        //Ahora evaluamos los otros
        if(txtCreditos.getText().equals("")){
            txtCreditos.setText("Creditos");
            txtCreditos.setForeground(new java.awt.Color(204, 204, 204));
        }
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Nombre");
            txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtCodigoMouseClicked
    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
        ////////nombre
        //Primero que verifique si esta vacio pone la marca de agua
        if(txtNombre.getText().equals("Nombre")){
            //No hace nada
            txtNombre.setText("");
            //Cambiamos el color
            txtNombre.setForeground(Color.BLACK);
        }
        
        //Ahora evaluamos los otros
        if(txtCreditos.getText().equals("")){
            //Si no puso texto le ponemos la marca y cambiamos el color
            txtCreditos.setText("Creditos");
            txtCreditos.setForeground(new java.awt.Color(204, 204, 204));
        }
        if(txtCodigo.getText().equals("")){
            txtCodigo.setText("Codigo");
            txtCodigo.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtNombreMouseClicked
    private void txtCreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCreditosMouseClicked
        // TODO add your handling code here:
        ////////Creditos
        //Primero que verifique si esta vacio pone la marca de agua
        if(txtCreditos.getText().equals("Creditos")){
            //No hace nada
            txtCreditos.setText("");
            //Cambiamos el color
            txtCreditos.setForeground(Color.BLACK);
        }
        else{
            //No cambiamos ningun codigo
        }
        //Ahora evaluamos los otros
        if(txtCodigo.getText().equals("")){
            txtCodigo.setText("Codigo");
            txtCodigo.setForeground(new java.awt.Color(204, 204, 204));
        }
        if(txtNombre.getText().equals("")){
            txtNombre.setText("Nombre");
            txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtCreditosMouseClicked

    //Esto cambia el titulo dependiendo del tipo del padre
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        Titulo.setText(txtNombre.getText());
        if(txtNombre.getText().equals("")){
            switch (llave) {
                case 0:
                    Titulo.setText("Nombre del Curso");
                    break;
                case 1:
                    Titulo.setText("Nombre del Profesor");
                    break;
                case 2:
                    Titulo.setText("Nombre del Estudiante");
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblBlancoCodigo;
    private javax.swing.JLabel lblBlancoCreditos;
    private javax.swing.JLabel lblBlancoNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblbtnCancelar;
    private javax.swing.JLabel lblbtnGuardar;
    private javax.swing.JTextField seguro;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
