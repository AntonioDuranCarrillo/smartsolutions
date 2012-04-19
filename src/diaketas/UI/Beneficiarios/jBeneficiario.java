/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Beneficiarios;

import diaketas.UI.UI;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author kesada
 */
public class jBeneficiario extends javax.swing.JPanel {

    JPanel panel;
    jBuscarBeneficiario buscarBeneficiario;
    
    /**
     * Creates new form jDiaketas
     */
    public jBeneficiario() {
        initComponents();
                /*Beneficiarios*/
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonAlta = new javax.swing.JButton();
        botonBaja = new javax.swing.JButton();
        botonConsultar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(223, 232, 249));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Acciones");

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        botonAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/aniadir.png"))); // NOI18N
        botonAlta.setText("Alta");
        botonAlta.setMaximumSize(new java.awt.Dimension(123, 90));
        botonAlta.setMinimumSize(new java.awt.Dimension(123, 90));
        botonAlta.setPreferredSize(new java.awt.Dimension(123, 90));
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });
        jPanel2.add(botonAlta);
        botonAlta.setVerticalTextPosition(SwingConstants.BOTTOM); botonAlta.setHorizontalTextPosition(SwingConstants.CENTER); botonAlta.setFont(new Font("Courier", Font.BOLD,14));

        botonBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/eliminar2.png"))); // NOI18N
        botonBaja.setText("Baja");
        botonBaja.setMaximumSize(new java.awt.Dimension(123, 90));
        botonBaja.setMinimumSize(new java.awt.Dimension(123, 90));
        botonBaja.setPreferredSize(new java.awt.Dimension(123, 90));
        botonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaActionPerformed(evt);
            }
        });
        jPanel2.add(botonBaja);
        botonBaja.setVerticalTextPosition(SwingConstants.BOTTOM); botonBaja.setHorizontalTextPosition(SwingConstants.CENTER); botonBaja.setFont(new Font("Courier", Font.BOLD,14));

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/consultar.png"))); // NOI18N
        botonConsultar.setText("Consultar");
        botonConsultar.setMaximumSize(new java.awt.Dimension(123, 90));
        botonConsultar.setMinimumSize(new java.awt.Dimension(123, 90));
        botonConsultar.setPreferredSize(new java.awt.Dimension(123, 90));
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(botonConsultar);
        botonConsultar.setVerticalTextPosition(SwingConstants.BOTTOM); botonConsultar.setHorizontalTextPosition(SwingConstants.CENTER); botonConsultar.setFont(new Font("Courier", Font.BOLD,14));

        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/modificar.png"))); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.setMaximumSize(new java.awt.Dimension(123, 90));
        botonModificar.setMinimumSize(new java.awt.Dimension(123, 90));
        botonModificar.setPreferredSize(new java.awt.Dimension(123, 90));
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        jPanel2.add(botonModificar);
        botonModificar.setVerticalTextPosition(SwingConstants.BOTTOM); botonModificar.setHorizontalTextPosition(SwingConstants.CENTER); botonModificar.setFont(new Font("Courier", Font.BOLD,14));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel30.setText("Beneficiarios");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/beneficiarios.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel17)
                .addGap(69, 69, 69)
                .addComponent(jLabel30)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel30))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaActionPerformed
        panel = new jBajaBeneficiario();

        UI.jPrincipal.add("BajaBeneficiario", panel);
        UI.cl.show(UI.jPrincipal, "BajaBeneficiario");
    }//GEN-LAST:event_botonBajaActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        buscarBeneficiario = new jBuscarBeneficiario("ConsultarBeneficiario");
        

        UI.jPrincipal.add("ConsultarBeneficiario", buscarBeneficiario);
        UI.cl.show(UI.jPrincipal, "ConsultarBeneficiario");
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        buscarBeneficiario = new jBuscarBeneficiario("ModificarBeneficiario");

        UI.jPrincipal.add("ModificarBeneficiario", buscarBeneficiario); 
        UI.cl.show(UI.jPrincipal, "ModificarBeneficiario");
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        panel = new jAltaBeneficiario();

        UI.jPrincipal.add("AltaBeneficiario", panel);
        UI.cl.show(UI.jPrincipal, "AltaBeneficiario");
    }//GEN-LAST:event_botonAltaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonBaja;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
