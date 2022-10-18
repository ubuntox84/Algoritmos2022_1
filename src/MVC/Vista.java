/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author davidmramirez
 */
public class Vista extends javax.swing.JFrame {

    
    String nombre = "";
    String apellido = "";
    String id = "";
    String telefono = "";
    
    ArrayList<Alumno> lista = new ArrayList<>();
    
    public Vista() {
        initComponents();
        
        jTableAlumno.addMouseListener(new MouseAdapter(){
        DefaultTableModel model = new DefaultTableModel();
        
        public void mouseClicked(MouseEvent e){
        int i = jTableAlumno.getSelectedRow();
        nombre = (jTableAlumno.getValueAt(i, 0).toString());
        apellido = (jTableAlumno.getValueAt(i, 1).toString());
        id = (jTableAlumno.getValueAt(i, 2).toString());
        telefono = (jTableAlumno.getValueAt(i, 3).toString());
        
        }});
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumno = new javax.swing.JTable();
        btnCrear = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardaModificacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel1.setText("Agregar datos de alumno");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 23, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 77, -1, -1));

        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 123, -1, -1));

        jLabel4.setText("Identificación");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 169, -1, -1));

        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 215, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 71, 160, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 117, 160, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 163, 160, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 209, 160, -1));

        jTableAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Identificación", "Telefóno"
            }
        ));
        jScrollPane1.setViewportView(jTableAlumno);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 23, 432, 275));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 249, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 249, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 249, -1, -1));

        btnGuardaModificacion.setText("Guardar Modificación");
        btnGuardaModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaModificacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardaModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 283, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
        Alumno alumno = new Alumno(txtNombre.getText(),txtApellido.getText(),txtId.getText(),txtTelefono.getText());
        lista.add(alumno);
        
        mostrarDatos();
        
        txtNombre.setText("");
        txtApellido.setText("");
        txtId.setText("");
        txtTelefono.setText("");
        
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        for (int i = 0; i < lista.size(); i++) {
            if(nombre.equals(lista.get(i).getNombre())){
            lista.remove(i);
            }
        }
        
        mostrarDatos();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        txtId.setText(id);
        txtTelefono.setText(telefono);
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardaModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaModificacionActionPerformed
        
        for (int i = 0; i < lista.size(); i++) {
            if(id.equals(lista.get(i).getId())){
            lista.get(i).setNombre(txtNombre.getText());
            lista.get(i).setApellido(txtApellido.getText());
            lista.get(i).setId(txtId.getText());
            lista.get(i).setTelefono(txtTelefono.getText());
            }
        }
        
        txtNombre.setText("");
        txtApellido.setText("");
        txtId.setText("");
        txtTelefono.setText("");
        
        mostrarDatos();
        
    }//GEN-LAST:event_btnGuardaModificacionActionPerformed

    public void mostrarDatos(){
    String matriz[][] = new String[lista.size()][4];
    
        for (int i = 0; i < lista.size(); i++) {
            
            matriz[i][0]=lista.get(i).getNombre();
            matriz[i][1]=lista.get(i).getApellido();
            matriz[i][2]=lista.get(i).getId();
            matriz[i][3]=lista.get(i).getTelefono();
                              
        }
        
        jTableAlumno.setModel(new javax.swing.table.DefaultTableModel(matriz, 
                new String [] {"Nombre","Apellido","Id","Teléfono"}) );
               
    }
            
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardaModificacion;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumno;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
