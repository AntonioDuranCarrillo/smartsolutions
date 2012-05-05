/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Donaciones;

import ValidarCampos.ValidarCampos;
import com.mysql.jdbc.Statement;
import diaketas.ConexionBD;
import diaketas.Modelo.ONG.Movimiento;
import diaketas.Modelo.ONG.ONG;
import diaketas.UI.UI;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class jModificarMovimiento extends javax.swing.JPanel {

    JPanel panel;
    /**
     * Creates new form jModificarMovimiento
     */
    public jModificarMovimiento() {
        initComponents();
        
        /*Consultamos el movimiento seleccionado 
         Movimiento datosMovimiento = ONG.gestorDonaciones.consultarDatosMovimiento();

        
        Cod_Movimiento.setText(String.valueOf(datosMovimiento.Cod_Movimiento));
        Tipo.setSelectedItem(datosMovimiento.Tipo_Movimiento);
        Cuantia.setText(String.valueOf(datosMovimiento.cuantia));
        Descripcion.setText(datosMovimiento.descripcion);
        NIF_Involucrado.setText(datosMovimiento.involucrado);
        NIF_CIF_Crea.setText(datosMovimiento.voluntario_crea);
        
        SimpleDateFormat formatoFecha=new java.text.SimpleDateFormat("dd/MM/yy");
        Fecha.setText(formatoFecha.format(datosMovimiento.Fecha));
        
        if (datosMovimiento.confirmado){
            botonConfirmar.setEnabled(false);
            botonModificar.setEnabled(false);
            NIF_Voluntario.setEnabled(false);
            Tipo.setEnabled(false);
            Cuantia.setEnabled(false);
            Descripcion.setEnabled(false);
            NIF_Involucrado.setEnabled(false);
            
            JOptionPane.showMessageDialog(this, "Este movimiento ya ha sido confirmado y no puede modificarse",
                                "Movimiento confirmado", JOptionPane.ERROR_MESSAGE);  
        }
        */


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
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonCancel = new javax.swing.JButton();
        jTitulo2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Cod_Movimiento = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NIF_CIF_Crea = new javax.swing.JLabel();
        jTitulo1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Cuantia = new javax.swing.JTextField();
        botonConfirmar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        Fecha = new javax.swing.JLabel();
        Descripcion = new javax.swing.JTextField();
        Tipo = new javax.swing.JComboBox();
        NIF_Involucrado = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        NIF_Voluntario = new javax.swing.JTextField();

        setBackground(new java.awt.Color(238, 225, 192));
        setForeground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(32767, 500));
        setPreferredSize(new java.awt.Dimension(1100, 518));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Fecha");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Cuantia");

        botonCancel.setText("Cancelar");
        botonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelActionPerformed(evt);
            }
        });

        jTitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo2.setText("Modificar un movimiento");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setText("Codigo Movimiento");

        Cod_Movimiento.setText("Cod_Movimiento");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Descripción");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Implicado");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Voluntario que lo creó");

        NIF_CIF_Crea.setText("Voluntario crea");

        jTitulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTitulo1.setText("Donaciones");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/Donaciones.png"))); // NOI18N

        Cuantia.setColumns(9);
        Cuantia.setText("0.00");

        botonConfirmar.setText("Confirmar");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        Fecha.setText("Fecha");

        Descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DescripcionKeyTyped(evt);
            }
        });

        Tipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Donacion Efectiva", "Donacian Bancaria", "Donacian Material", "Ayuda Efectiva", "Ayuda Bancaria", "Ayuda Material", "Gasto" }));

        NIF_Involucrado.setColumns(9);
        NIF_Involucrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF_InvolucradoKeyTyped(evt);
            }
        });

        jLabel20.setText("NIF Voluntario");

        NIF_Voluntario.setBackground(new java.awt.Color(255, 255, 153));
        NIF_Voluntario.setColumns(9);
        NIF_Voluntario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF_VoluntarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(45, 45, 45)
                                .addComponent(jTitulo1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Cod_Movimiento)
                                            .addComponent(Cuantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Fecha)
                                            .addComponent(Descripcion)
                                            .addComponent(Tipo, 0, 277, Short.MAX_VALUE)))
                                    .addComponent(jTitulo2)
                                    .addComponent(jSeparator7))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel7))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NIF_CIF_Crea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(NIF_Involucrado)))
                                    .addComponent(jSeparator8)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NIF_Voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(botonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(botonConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(botonCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTitulo1)
                        .addGap(32, 32, 32)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cod_Movimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cuantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(NIF_Involucrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(NIF_CIF_Crea))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NIF_Voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancel)
                    .addComponent(botonConfirmar)
                    .addComponent(botonModificar))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelActionPerformed
        UI.cl.show(UI.jPrincipal, "Donaciones");
    }//GEN-LAST:event_botonCancelActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
     
        double fuente = 13 + (this.getSize().width - 1262) / 30;
        for (int i = 0; i < this.getComponentCount(); i++) {
            this.getComponent(i).setFont(new Font("Courier", Font.BOLD, (int) fuente));
        }

        jTitulo1.setFont(new Font("Courier", Font.BOLD, (int) fuente+12));
        jTitulo2.setFont(new Font("Courier", Font.BOLD, (int) fuente+2));
        
        Descripcion.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Cod_Movimiento.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Tipo.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Cuantia.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Fecha.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        NIF_Involucrado.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        NIF_CIF_Crea.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        NIF_Voluntario.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
    }//GEN-LAST:event_formComponentResized

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        panel = new jConfirmarMovimiento();

        UI.jPrincipal.add("ConfirmarMovimiento", panel);
        UI.cl.show(UI.jPrincipal, "ConfirmarMovimiento");
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        int error;
        if (Cuantia.getText().compareTo("") == 0)
            Cuantia.setText("0.00");
        if (!ValidarCampos.isDouble(Cuantia.getText()))
           JOptionPane.showMessageDialog(this, "La cuantia no es correcta. Debe de ser un número",
                                "Cuantia Movimiento inválida", JOptionPane.ERROR_MESSAGE);
        else if (NIF_Voluntario.getText().compareTo("") == 0)
           JOptionPane.showMessageDialog(this, "No se ha introducido el Nif del voluntario",
                                "NIF Voluntario", JOptionPane.ERROR_MESSAGE);    
        
            /*Introducimos los nuevos datos del movimiento y comprobamos si el dni del voluntario existe*/
        else if ((error = ONG.gestorDonaciones.introducirMovimiento((String)Tipo.getSelectedItem(), Double.parseDouble(Cuantia.getText()),
                    NIF_Involucrado.getText().toUpperCase(), Descripcion.getText(), NIF_Voluntario.getText().toUpperCase())) == 0){

                /*Confirmamos la modificación*/
                ONG.gestorDonaciones.confirmarModificacion();
                
                UI.cl.show(UI.jPrincipal, "Donaciones");
        }else{
            if (error == 1 || error == 2)
               JOptionPane.showMessageDialog(this, "No se ha encontrado a ninguna persona con ese NIF",
                                "NIF Involucrado", JOptionPane.ERROR_MESSAGE);     
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void NIF_VoluntarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF_VoluntarioKeyTyped
        if (NIF_Voluntario.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_NIF_VoluntarioKeyTyped

    private void NIF_InvolucradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF_InvolucradoKeyTyped
        if (NIF_Involucrado.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_NIF_InvolucradoKeyTyped

    private void DescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescripcionKeyTyped
        if (Descripcion.getText().length() == 40) {
            evt.consume();
        }
    }//GEN-LAST:event_DescripcionKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cod_Movimiento;
    private javax.swing.JTextField Cuantia;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel NIF_CIF_Crea;
    private javax.swing.JTextField NIF_Involucrado;
    private javax.swing.JTextField NIF_Voluntario;
    private javax.swing.JComboBox Tipo;
    private javax.swing.JButton botonCancel;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel jTitulo1;
    private javax.swing.JLabel jTitulo2;
    // End of variables declaration//GEN-END:variables
}
