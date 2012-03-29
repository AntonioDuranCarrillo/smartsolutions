/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Beneficiarios;

import diaketas.ConexionBD;
import diaketas.UI.UI;
import diaketas.Modelo.Gestores.Gestor_de_beneficiarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kesada
 */
public class jAltaFamiliar extends javax.swing.JPanel {

    /**
     * Creates new form jAltaFamiliar
     */
    public jAltaFamiliar() {
        
        /*Inicializmos la UI*/
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Nombre_Apellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Fecha_Nacimiento = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        Ocupacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Parentesco = new javax.swing.JComboBox();
        botonOK = new javax.swing.JButton();
        botonCancel = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Beneficiarios");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Añadir familiar");

        jLabel2.setText("Nombre y Apellidos");

        Nombre_Apellidos.setColumns(30);
        Nombre_Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre_ApellidosKeyTyped(evt);
            }
        });

        jLabel6.setText("Nacimiento");

        Fecha_Nacimiento.setColumns(9);
        Fecha_Nacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        Fecha_Nacimiento.setText("d/mm/aa");

        jLabel7.setText("Ocupacion");

        Ocupacion.setColumns(20);
        Ocupacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                OcupacionKeyTyped(evt);
            }
        });

        jLabel8.setText("Parentesco");

        Parentesco.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Parentesco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Padre", "Madre", "Marido", "Mujer", "Hermano", "Hijo" }));

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        botonCancel.setText("Cancelar");
        botonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Nombre_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Fecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Parentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(botonOK)
                                    .addGap(18, 18, 18)
                                    .addComponent(botonCancel)))))
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nombre_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Fecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Parentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOK)
                    .addComponent(botonCancel))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        /*Convertimos la fecha de String a Date*/
        Date Fecha_Nac = null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");
        try {
            Fecha_Nac = formatoFecha.parse(Fecha_Nacimiento.getText());
            
            /*Introducimos los datos del familiar*/
            diaketas.diaketas.ong.gestorBeneficiarios.introducirDatosFamiliar(Nombre_Apellidos.getText(), Fecha_Nac,
                    (String) Parentesco.getSelectedItem(), Ocupacion.getText());

            /*Confirmamos datos del familiar */
            /*ConfirmarInsercion()*/
            diaketas.diaketas.ong.gestorBeneficiarios.confirmarInsercion();

            /*Cambia parte principal de la aplicacion*/
            UI.cl.show(UI.jPrincipal, "Familiar");
        } catch (ParseException ex) {
            Logger.getLogger(jAltaBeneficiario.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(this, "Fecha de nacimiento de familiar incorrecta utilice formato dd/MM/yy.", "Fecha de Nacimiento de familiar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonOKActionPerformed

    private void botonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelActionPerformed
        /*Cambia parte principal de la aplicacion*/
        UI.cl.show(UI.jPrincipal, "Familiar");
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelActionPerformed

    private void Nombre_ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_ApellidosKeyTyped
        if (Nombre_Apellidos.getText().length()==50)
            evt.consume();
    }//GEN-LAST:event_Nombre_ApellidosKeyTyped

    private void OcupacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OcupacionKeyTyped
        if (Ocupacion.getText().length()==20)
            evt.consume();
    }//GEN-LAST:event_OcupacionKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Fecha_Nacimiento;
    private javax.swing.JTextField Nombre_Apellidos;
    private javax.swing.JTextField Ocupacion;
    private javax.swing.JComboBox Parentesco;
    private javax.swing.JButton botonCancel;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
