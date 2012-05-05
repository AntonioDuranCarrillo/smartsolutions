/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Empleo;

import diaketas.Modelo.ONG.ONG;
import diaketas.Modelo.ONG.Oferta;
import diaketas.UI.UI;
import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;

/**
 *
 * @author Cesar
 */
public class jConsultarOferta extends javax.swing.JPanel {

    JPanel panel;
    /**
     * Creates new form jConsultarMovimiento
     */
    public jConsultarOferta() {
        initComponents();
        
        //Ponemos por defecto los datos del voluntario a modificar
        
        Oferta datosOferta = ONG.gestorOfertas.consultarDatosOferta();
        
         
        
        Cod_Oferta.setText( Integer.toString(datosOferta.cod_oferta) );
        Concepto.setText( datosOferta.concepto );
        Activada.setText( Integer.toString(datosOferta.activo) );
        Poblacion.setText( datosOferta.poblacion );
        Num_vacantes.setText( Integer.toString(datosOferta.numero_vacantes) );
        Descripcion.setText( datosOferta.descripcion );
        Req_minimos.setText( datosOferta.requisitos_minimos );
        Tipo_contrato.setText( datosOferta.tipo_contrato );
        Jornada_laboral.setText( Integer.toString(datosOferta.jornada_laboral) );
        Salario.setText( Double.toString(datosOferta.salario) );
        DNI_donante.setText( datosOferta.NIF_CIF_Donante );
        Observaciones.setText( datosOferta.observaciones );
        
        // Representamos la fecha, pasandola de tipo Date a String
        SimpleDateFormat formatoFecha=new java.text.SimpleDateFormat("dd/MM/yy");
               
        Fecha.setText(formatoFecha.format(datosOferta.fecha) );
        
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
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonOK = new javax.swing.JButton();
        jTitulo2 = new javax.swing.JLabel();
        Codigo_oferta = new javax.swing.JLabel();
        Cod_Oferta = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        Concepto = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Activada = new javax.swing.JLabel();
        Poblacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTitulo1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Num_vacantes = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Salario = new javax.swing.JLabel();
        Jornada_laboral = new javax.swing.JLabel();
        Req_minimos = new javax.swing.JLabel();
        Tipo_contrato = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        DNI_donante = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Observaciones = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(233, 225, 242));
        setForeground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(32767, 500));
        setPreferredSize(new java.awt.Dimension(1100, 518));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Poblacion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Activada");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Concepto");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Fecha");

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        jTitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo2.setText("Consultar una oferta");

        Codigo_oferta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Codigo_oferta.setText("Codigo Oferta");

        Cod_Oferta.setText("Cod_Oferta");

        Concepto.setText("Concepto");

        Fecha.setText("Fecha");

        Activada.setText("Activada");

        Poblacion.setText("Poblacion");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Numero vacantes");

        jTitulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTitulo1.setText("Empleo");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/empleo.png"))); // NOI18N

        Num_vacantes.setText("Num vacantes");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Observaciones");

        Salario.setText("Salario");

        Jornada_laboral.setText("Jornada laboral");

        Req_minimos.setText("Req minimos");

        Tipo_contrato.setText("Tipo contrato");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Jornada laboral");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Requisitos minimos");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Tipo contrato");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setText("Descripcion");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("Salario");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("DNI del donante ofertante");

        DNI_donante.setText("DNI donante");

        Descripcion.setColumns(20);
        Descripcion.setEditable(false);
        Descripcion.setRows(5);
        jScrollPane2.setViewportView(Descripcion);

        Observaciones.setColumns(20);
        Observaciones.setEditable(false);
        Observaciones.setRows(5);
        jScrollPane1.setViewportView(Observaciones);

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
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)
                                .addComponent(jTitulo1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTitulo2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Codigo_oferta)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8))
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Poblacion)
                                            .addComponent(Activada)
                                            .addComponent(Cod_Oferta)
                                            .addComponent(Concepto)
                                            .addComponent(Fecha)
                                            .addComponent(Num_vacantes)))
                                    .addComponent(jLabel19)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DNI_donante)
                                            .addComponent(Salario)
                                            .addComponent(Jornada_laboral)
                                            .addComponent(Req_minimos)
                                            .addComponent(Tipo_contrato)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(botonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jTitulo1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Codigo_oferta)
                            .addComponent(Cod_Oferta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Concepto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Fecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Activada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(Poblacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Num_vacantes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Req_minimos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Tipo_contrato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Jornada_laboral))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Salario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(DNI_donante))
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(botonOK)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        UI.cl.show(UI.jPrincipal, "Empleo");
    }//GEN-LAST:event_botonOKActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
     
        double fuente = 13 + (this.getSize().width - 1262) / 30;
        for (int i = 0; i < this.getComponentCount(); i++) {
            this.getComponent(i).setFont(new Font("Courier", Font.BOLD, (int) fuente));
        }

        jTitulo1.setFont(new Font("Courier", Font.BOLD, (int) fuente+12));
        jTitulo2.setFont(new Font("Courier", Font.BOLD, (int) fuente+2));
        
        Cod_Oferta.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Concepto.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Fecha.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Activada.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Poblacion.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Num_vacantes.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Req_minimos.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Tipo_contrato.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Jornada_laboral.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Salario.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        DNI_donante.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Descripcion.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Observaciones.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        
    }//GEN-LAST:event_formComponentResized

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Activada;
    private javax.swing.JLabel Cod_Oferta;
    private javax.swing.JLabel Codigo_oferta;
    private javax.swing.JLabel Concepto;
    private javax.swing.JLabel DNI_donante;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Jornada_laboral;
    private javax.swing.JLabel Num_vacantes;
    private javax.swing.JTextArea Observaciones;
    private javax.swing.JLabel Poblacion;
    private javax.swing.JLabel Req_minimos;
    private javax.swing.JLabel Salario;
    private javax.swing.JLabel Tipo_contrato;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel jTitulo1;
    private javax.swing.JLabel jTitulo2;
    // End of variables declaration//GEN-END:variables
}
