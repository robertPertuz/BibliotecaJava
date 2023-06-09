package Formularios;

import Datos.ArchivoPersona;
import Datos.ConexionOracol;
import Datos.Persona;
import Logico.GestionPersona;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FPersona extends javax.swing.JFrame {

    /**
     * Creates new form FPrestatario
     */
    public FPersona() {

        initComponents();
        cargarAño();
        comboMes.disable();
        comboDia.disable();
        pintar();

    }

    public void pintar() {
        ArrayList<Persona> listaPersona = ArchivoPersona.getPrestatario();
        try {
            tablaPersona.setModel(GestionPersona.getModeloPersona(listaPersona));
        } catch (Exception e) {
        };

    }

    private void cargarAño() {
        for (int i = 2020; i >= 1960; i--) {
            comboAño.addItem(i + "");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSapellido = new javax.swing.JTextField();
        txtSnombre = new javax.swing.JTextField();
        txtPapellido = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPnombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboAño = new javax.swing.JComboBox<>();
        comboDia = new javax.swing.JComboBox<>();
        comboMes = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersona = new javax.swing.JTable();
        radiocc = new javax.swing.JRadioButton();
        radioti = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(300, 20, 0, 2);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(270, 50, 0, 2);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel2.setText("Primer apellido");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 190, 90, 30);

        jLabel3.setText("Cargo");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(360, 190, 110, 30);

        jLabel4.setText("Segundo apellido");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 220, 90, 30);

        jLabel5.setText("Segundo nombre");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 160, 90, 30);

        txtSapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSapellidoActionPerformed(evt);
            }
        });
        jPanel2.add(txtSapellido);
        txtSapellido.setBounds(120, 220, 120, 30);

        txtSnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSnombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtSnombre);
        txtSnombre.setBounds(120, 160, 120, 30);

        txtPapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPapellidoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPapellido);
        txtPapellido.setBounds(120, 190, 120, 30);

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        jPanel2.add(txtTel);
        txtTel.setBounds(480, 160, 190, 30);

        jLabel6.setText("Primer nombre");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 130, 90, 30);

        txtPnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPnombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtPnombre);
        txtPnombre.setBounds(120, 130, 120, 30);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(0, 50, 710, 10);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setText("PRESTATARIO");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(240, 10, 210, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Identificacion");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 80, 90, 30);

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtId);
        txtId.setBounds(120, 80, 120, 30);

        jLabel9.setText("Direccion");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(360, 80, 100, 30);

        comboAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año" }));
        comboAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAñoActionPerformed(evt);
            }
        });
        jPanel2.add(comboAño);
        comboAño.setBounds(480, 130, 70, 30);

        comboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", " " }));
        comboDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDiaActionPerformed(evt);
            }
        });
        jPanel2.add(comboDia);
        comboDia.setBounds(630, 130, 70, 30);

        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));
        comboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMesActionPerformed(evt);
            }
        });
        jPanel2.add(comboMes);
        comboMes.setBounds(550, 130, 80, 30);

        jLabel10.setText("Fecha de nacimiento");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(360, 130, 110, 30);

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel2.add(txtDireccion);
        txtDireccion.setBounds(480, 80, 190, 30);

        jLabel11.setText("Telefono");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(360, 160, 110, 30);

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Estudiante", "Docente", "Administrador", "Particular" }));
        jPanel2.add(cmbCargo);
        cmbCargo.setBounds(480, 190, 190, 30);

        jScrollPane1.setViewportView(tablaPersona);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 370, 710, 140);

        radiocc.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(radiocc);
        radiocc.setText("CC");
        radiocc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioccActionPerformed(evt);
            }
        });
        jPanel2.add(radiocc);
        radiocc.setBounds(240, 80, 50, 30);

        radioti.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(radioti);
        radioti.setText("TI");
        radioti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiotiActionPerformed(evt);
            }
        });
        jPanel2.add(radioti);
        radioti.setBounds(290, 80, 50, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 270, 130, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_man_usersearch_thesearch_theclient_2356.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(330, 330, 120, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/businessapplication_edit_male_user_thepencil_theclient_negocio_2321.png"))); // NOI18N
        jButton3.setText("Modificar");
        jPanel2.add(jButton3);
        jButton3.setBounds(150, 270, 120, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emblemunreadable_93487.png"))); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(570, 270, 130, 41);
        jPanel2.add(jTextField8);
        jTextField8.setBounds(20, 330, 310, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        jButton5.setText("Eliminar");
        jPanel2.add(jButton5);
        jButton5.setBounds(270, 270, 120, 40);

        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(390, 270, 65, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 710, 510);

        setSize(new java.awt.Dimension(722, 546));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSapellidoActionPerformed

    private void txtSnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSnombreActionPerformed

    private void txtPapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPapellidoActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtPnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPnombreActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void comboAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAñoActionPerformed
        comboAño();
    }//GEN-LAST:event_comboAñoActionPerformed

    private void comboDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDiaActionPerformed

    private void comboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesActionPerformed
        comboMes();
    }//GEN-LAST:event_comboMesActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void radioccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioccActionPerformed

    private void radiotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiotiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiotiActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Agregar();
        } catch (SQLException ex) {
            Logger.getLogger(FPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed

    public void Agregar() throws SQLException {
        String respuesta;
        respuesta = GestionPersona.registrarPrestatario(txtId.getText().trim(), txtPnombre.getText().trim(), txtSnombre.getText().trim(), txtPapellido.getText().trim(),
                txtSapellido.getText().trim(), txtDireccion.getText().trim(), fecha(comboDia.getSelectedItem().toString(), comboMes.getSelectedItem().toString(), comboAño.getSelectedItem().toString()),
                cmbCargo.getSelectedItem().toString(), txtTel.getText().trim());
        if (respuesta.equals("OK")) {
            pintar();
            limpiar();
            ConexionOracol co = new ConexionOracol();
            JOptionPane.showMessageDialog(this, "Agregado correctamente");
        } else {
            JOptionPane.showMessageDialog(this, respuesta);
        }

    }

    private String fecha(String dia, String mes, String año) {
        return dia + "/" + mes + "/" + año;
    }

    private void comboAño() {
        if (!comboAño.getSelectedItem().equals("Año")) {
            comboMes.setEnabled(true);

        } else {
            comboDia.setEnabled(false);
            comboMes.setEnabled(false);
            comboMes.setSelectedItem("Mes");
            comboDia.setSelectedItem("Dia");

        }

    }

    private void comboMes() {
        if (comboAño.getSelectedItem().equals("Año")) {
            comboDia.setEnabled(false);
            comboMes.setEnabled(false);
            comboMes.setSelectedItem("Mes");
            comboDia.setSelectedItem("Dia");
        }
        comboDia.removeAllItems();
        if (!comboMes.getSelectedItem().equals("Mes")) {
            comboDia.addItem("Dia");
            comboDia.setEnabled(true);
            if (comboMes.getSelectedItem().equals("Abril") || comboMes.getSelectedItem().equals("junio")
                    || comboMes.getSelectedItem().equals("Septiembre") || comboMes.getSelectedItem().equals("Noviembre")) {

                for (int i = 1; i <= 30; i++) {
                    comboDia.addItem("" + i);
                }
            } else {

                if (comboMes.getSelectedItem().equals("Febrero")) {
                    int anio = Integer.parseInt(comboAño.getSelectedItem().toString());

                    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                        for (int i = 1; i <= 29; i++) {
                            comboDia.addItem("" + i);
                        }
                    } else {
                        for (int i = 1; i <= 28; i++) {
                            comboDia.addItem("" + i);
                        }
                    }

                } else {
                    for (int i = 1; i <= 31; i++) {
                        comboDia.addItem("" + i);
                    }
                }

            }
        } else {
            comboDia.addItem("Dia");
            comboDia.setEnabled(false);
            comboDia.setSelectedItem("Dia");
        }
    }

    private void limpiar() {
        txtId.setText("");
        txtDireccion.setText("");
        txtPapellido.setText("");
        txtPnombre.setText("");
        txtSapellido.setText("");
        txtSnombre.setText("");
        txtTel.setText("");
        cmbCargo.setSelectedItem("Seleccionar");
        comboAño.setSelectedItem("Año");
        comboDia.setSelectedItem("Dia");
        comboMes.setSelectedItem("Mes");

    }

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
            java.util.logging.Logger.getLogger(FPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> comboAño;
    private javax.swing.JComboBox<String> comboDia;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JRadioButton radiocc;
    private javax.swing.JRadioButton radioti;
    private javax.swing.JTable tablaPersona;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPapellido;
    private javax.swing.JTextField txtPnombre;
    private javax.swing.JTextField txtSapellido;
    private javax.swing.JTextField txtSnombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
