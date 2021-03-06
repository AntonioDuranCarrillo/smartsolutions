/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.HistorialesyAcciones;

import diaketas.UI.UI;
import java.awt.Font;

/**
 *
 * @author cesar
 */
public class jTiposHistoriales extends javax.swing.JPanel {


    jHistorialSeleccionarVoluntario historialSeleccionarVoluntario;
    jHistorialSeleccionarUsuario historialSeleccionarUsuario;

    /**
     * Creates new form jAltaBeneficiario
     */
    public jTiposHistoriales() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jTitulo2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        botonCancel = new javax.swing.JButton();
        botonUsuarios = new javax.swing.JButton();
        botonVoluntarios = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTitulo1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 246, 155));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jTitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo2.setText("Tipos historiales");

        jLabel2.setText("Seleccione el tipo de historial a consultar:");

        botonCancel.setText("Cancelar");
        botonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelActionPerformed(evt);
            }
        });

        botonUsuarios.setText("Usuarios");
        botonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsuariosActionPerformed(evt);
            }
        });

        botonVoluntarios.setText("Voluntarios");
        botonVoluntarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVoluntariosActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/historiales.png"))); // NOI18N

        jTitulo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTitulo1.setText("Historial y Acciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(42, 42, 42)
                                .addComponent(jTitulo1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(botonUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonVoluntarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCancel))
                            .addComponent(jTitulo2)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jTitulo1)))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancel)
                    .addComponent(botonUsuarios)
                    .addComponent(botonVoluntarios)
                    .addComponent(jLabel2))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelActionPerformed
            UI.cl.show(UI.jPrincipal, "HistorialyAcciones");
            // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelActionPerformed

    private void botonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsuariosActionPerformed
        // TODO add your handling code here:
        
        historialSeleccionarUsuario = new jHistorialSeleccionarUsuario();
        UI.jPrincipal.remove(historialSeleccionarUsuario);
        UI.jPrincipal.add("HistorialSeleccionarUsuario", historialSeleccionarUsuario); 
        UI.cl.show(UI.jPrincipal, "HistorialSeleccionarUsuario");
    }//GEN-LAST:event_botonUsuariosActionPerformed

    private void botonVoluntariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVoluntariosActionPerformed
        // TODO add your handling code here:
        
        historialSeleccionarVoluntario = new jHistorialSeleccionarVoluntario();
        UI.jPrincipal.remove(historialSeleccionarVoluntario);
        UI.jPrincipal.add("HistorialSeleccionarVoluntario", historialSeleccionarVoluntario); 
        UI.cl.show(UI.jPrincipal, "HistorialSeleccionarVoluntario");
    }//GEN-LAST:event_botonVoluntariosActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        int ancho, alto;
        ancho = this.getSize().width;
        alto = this.getSize().height;

        double fuente = 13 + (ancho - 1262) / 30;
        for (int i = 0; i < this.getComponentCount(); i++) {
            this.getComponent(i).setFont(new Font("Courier", Font.BOLD, (int) fuente));
        }
        
        jTitulo1.setFont(new Font("Courier", Font.BOLD, (int) fuente+12));
        jTitulo2.setFont(new Font("Courier", Font.BOLD, (int) fuente+2));
    }//GEN-LAST:event_formComponentResized

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancel;
    private javax.swing.JButton botonUsuarios;
    private javax.swing.JButton botonVoluntarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jTitulo1;
    private javax.swing.JLabel jTitulo2;
    // End of variables declaration//GEN-END:variables
}
