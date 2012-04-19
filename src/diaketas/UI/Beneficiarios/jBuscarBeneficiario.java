/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Beneficiarios;

import diaketas.UI.UI;
import diaketas.Modelo.ONG.Beneficiario;
import diaketas.Modelo.ONG.Familiar;
import diaketas.Modelo.Gestores.Gestor_de_beneficiarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kesada
 */
public class jBuscarBeneficiario extends javax.swing.JPanel {

    JPanel panel;
    jModificarBeneficiario modificarBeneficiario;
    String jPanelSiguiente;
    
    /**
     * Creates new form jBuscarBeneficiario
     * @param jPanelSiguiente 
     */
    public jBuscarBeneficiario(String jPanelSiguiente) {
        this.jPanelSiguiente = jPanelSiguiente;
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

        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        NIF = new javax.swing.JTextField();
        botonConsultar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(223, 232, 249));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Buscar Beneficiario por NIF");

        jLabel2.setText("NIF");

        NIF.setColumns(9);
        NIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIFKeyTyped(evt);
            }
        });

        botonConsultar.setText("Consultar");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel30.setText("Beneficiarios");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/beneficiarios.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel17)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel30))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(55, 55, 55)
                                            .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(198, 198, 198)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(botonConsultar)))))
                .addGap(0, 69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonConsultar)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed

        if (NIF.getText().compareTo("") != 0){
            
            /*Consultamos el beneficiario*/
            Beneficiario datosBeneficiario = diaketas.diaketas.ong.gestorBeneficiarios.consultarBeneficiario(NIF.getText());

            /*Si datos != null existe*/
            if (datosBeneficiario != null){

                if (jPanelSiguiente.compareTo("ConsultarBeneficiario") ==0){
                    panel = new jConsultarBeneficiario(datosBeneficiario);
                    UI.jPrincipal.add(jPanelSiguiente, panel); 
                    UI.cl.show(UI.jPrincipal, jPanelSiguiente); 
                }else{
                    panel = new jModificarBeneficiario(datosBeneficiario);
                    UI.jPrincipal.add(jPanelSiguiente, panel); 
                    UI.cl.show(UI.jPrincipal, jPanelSiguiente); 
                }
            }else{
                JOptionPane.showMessageDialog(this, "No se ha encontrado ningún beneficiario con ese NIF.",
                    "NIF Beneficiario", JOptionPane.ERROR_MESSAGE); 
            }
        }else{
                JOptionPane.showMessageDialog(this, "El NIF de Beneficiario no se ha introducido.",
                    "NIF Beneficiario", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void NIFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIFKeyTyped
        if (NIF.getText().length()==9)
            evt.consume();
    }//GEN-LAST:event_NIFKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIF;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
