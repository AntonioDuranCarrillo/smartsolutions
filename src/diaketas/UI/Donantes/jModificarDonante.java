/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Donantes;

import ValidarCampos.ValidarCampos;
import diaketas.Modelo.ONG.Donante;
import diaketas.UI.UI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class jModificarDonante extends javax.swing.JPanel {

    JPanel panel;

    /**
     * Creates new form jModificarDonante
     */
    public jModificarDonante() {
        initComponents();
    }

    /**
     *  Funcion que permite modificar los datos de un Donante seleccionad
     * @param donante Donante a modificar
     */
    public jModificarDonante(Donante donante) {
        initComponents();

        java.text.SimpleDateFormat formatoFecha = new java.text.SimpleDateFormat("dd/MM/yyyy");

        System.out.println(donante.Activo);

        if(donante.Activo == 1){
            NIF_CIF.setText(donante.NIF_CIF);
            Nombre.setText(donante.Nombre);
            Apellidos.setText(donante.Apellidos);
            Fecha_Nacimiento.setText(formatoFecha.format(donante.FechaNac));
            Localidad.setText(donante.Localidad);

            Email.setText(donante.Email);
            Telefono.setText(String.valueOf(donante.Telefono));
            Tipo_Donante.setSelectedItem(donante.Tipo_Donante);
            Observaciones.setText(donante.Observaciones);
            Periodicidad_Donaciones.setText(String.valueOf(donante.Periodicidad_Donaciones));
            Cuantia_Donaciones.setText(String.valueOf(donante.Cuantia_Donaciones));
            Tipo_Periodicidad.setSelectedItem(donante.Tipo_Periodicidad);
    
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

        jLabel2 = new javax.swing.JLabel();
        botonOK = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Localidad = new javax.swing.JTextField();
        botonCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        NIF_Voluntario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Apellidos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NIF_CIF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Observaciones = new javax.swing.JTextArea();
        Telefono = new javax.swing.JTextField();
        Fecha_Nacimiento = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Tipo_Donante = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        Periodicidad_Donaciones = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Tipo_Periodicidad = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        Cuantia_Donaciones = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(211, 232, 254));

        jLabel2.setText("NIF");

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Donantes");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Modificar a un donante");

        jLabel4.setText("Nombre");

        Localidad.setColumns(20);
        Localidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LocalidadKeyTyped(evt);
            }
        });

        botonCancel.setText("Cancelar");
        botonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelActionPerformed(evt);
            }
        });

        jLabel6.setText("Nacimiento");

        jLabel15.setText("Observaciones");

        NIF_Voluntario.setBackground(new java.awt.Color(255, 255, 153));
        NIF_Voluntario.setColumns(9);
        NIF_Voluntario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF_VoluntarioKeyTyped(evt);
            }
        });

        jLabel20.setText("NIF Voluntario");

        Apellidos.setColumns(30);
        Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidosKeyTyped(evt);
            }
        });

        jLabel11.setText("Localidad");

        jLabel12.setText("Telefono");

        Nombre.setColumns(20);
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        jLabel5.setText("Apellidos");

        NIF_CIF.setColumns(9);
        NIF_CIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF_CIFKeyTyped(evt);
            }
        });

        Observaciones.setColumns(20);
        Observaciones.setRows(5);
        Observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ObservacionesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(Observaciones);

        Telefono.setColumns(9);
        Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TelefonoKeyReleased(evt);
            }
        });

        Fecha_Nacimiento.setColumns(9);
        Fecha_Nacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        Fecha_Nacimiento.setText("d/mm/aa");

        jLabel8.setText("Email");

        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });

        jLabel7.setText("Tipo Donante");

        Tipo_Donante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Persona", "Empresa" }));

        jLabel13.setText("Periodicidad Donaciones");

        Periodicidad_Donaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Periodicidad_DonacionesKeyTyped(evt);
            }
        });

        jLabel17.setText("Tipo Periodicidad");

        Tipo_Periodicidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Tipo_Periodicidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguna", "Días", "Meses", "Años" }));

        jLabel18.setText("Cuantia Donaciones");

        Cuantia_Donaciones.setColumns(9);
        Cuantia_Donaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cuantia_DonacionesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cuantia_DonacionesKeyTyped(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/Socios.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Fecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NIF_CIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(64, 64, 64)))
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel18))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Cuantia_Donaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Tipo_Periodicidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Periodicidad_Donaciones)
                                                .addComponent(Tipo_Donante, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addGap(164, 164, 164)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(botonOK, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NIF_Voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCancel))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Tipo_Donante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Periodicidad_Donaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tipo_Periodicidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(Cuantia_Donaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NIF_Voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonOK)
                            .addComponent(botonCancel))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NIF_CIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Fecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        Email.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed

        /*
         * Si no se introducen los campos Telefono o el Tipo_Periodicidad es
         * ninguno, se rellenan a 0-Null
         */
        //Si la periodicidad es ninguna, no nos interesan la cuantia y el tiempo
        if (((String) Tipo_Periodicidad.getSelectedItem()).compareTo("Ninguna") == 0) {
            Cuantia_Donaciones.setText("0");
            Periodicidad_Donaciones.setText("0");
        }
        if (Telefono.getText().compareTo(" ") == 0) {
            Telefono.setText("0");
        }


        if (NIF_CIF.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "El NIF del donante no se ha introducido.", "NIF Donante", JOptionPane.ERROR_MESSAGE);
        } else if (Nombre.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "El nombre del donante no se ha introducido.", "Nombre Donante", JOptionPane.ERROR_MESSAGE);
        } else if (Apellidos.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "Los apellidos del donante no se han introducido.", "Apellidos Donante", JOptionPane.ERROR_MESSAGE);
        } else if (NIF_Voluntario.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "El NIF del voluntario no se ha introducido.", "NIF Voluntario", JOptionPane.ERROR_MESSAGE);
        } else if (Telefono.getText().compareTo("") != 0 && !ValidarCampos.isInteger(Telefono.getText())) {
            JOptionPane.showMessageDialog(this, "El telefono no es correcto. Debe ser de tipo numerico", "Telefono Beneficiario", JOptionPane.ERROR_MESSAGE);
        } else if (!ValidarCampos.isEmail(Email.getText())) {
            JOptionPane.showMessageDialog(this, "El Email no es correcto. Debe ser valido", "Email Invalido", JOptionPane.ERROR_MESSAGE);
        } else if (!ValidarCampos.isDouble(Cuantia_Donaciones.getText())) {
            JOptionPane.showMessageDialog(this, "La cantidad no es correcta. Debe ser un numero", "Cuantia Donaciones Invalido", JOptionPane.ERROR_MESSAGE);
        } else if (!ValidarCampos.isInteger(Periodicidad_Donaciones.getText())) {
            JOptionPane.showMessageDialog(this, "La Periodicidad de Donaciones no es correcta. Debe ser un numero", "Cuantia Donaciones Invalido", JOptionPane.ERROR_MESSAGE);
        } else {


            /*
             * Conversion de la fecha
             */
            Date Fecha_Nac = null;
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");
            try {
                Fecha_Nac = formatoFecha.parse(Fecha_Nacimiento.getText());
            } catch (ParseException ex) {
                Logger.getLogger(jAltaDonante.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Fecha de nacimiento incorrecto, utilice formato dd/MM/yy.", "Fecha de Nacimiento", JOptionPane.ERROR_MESSAGE);
            }

            /*
             * IntroducirDatosDonante
             */
            boolean correcto = diaketas.diaketas.ong.gestorDonantes.introducirDatosDonante(NIF_CIF.getText().toUpperCase(), Nombre.getText(), Apellidos.getText(), Fecha_Nac, Localidad.getText(),
                    Email.getText(), Integer.parseInt(Telefono.getText()), (String) Tipo_Donante.getSelectedItem(), new Date(), Observaciones.getText(), Integer.parseInt(Periodicidad_Donaciones.getText()),
                    Double.parseDouble(Cuantia_Donaciones.getText()), (String) Tipo_Periodicidad.getSelectedItem(), NIF_Voluntario.getText());

            if (correcto) {
                diaketas.diaketas.ong.gestorDonantes.confirmarFinModificacion();
            } else {
                JOptionPane.showMessageDialog(this, "No se han podido realizar la inserccion de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }


            /*
             * Actualizamos la pantalla principal
             */
            UI.cl.show(UI.jPrincipal, "Donantes");

        }
    }//GEN-LAST:event_botonOKActionPerformed

    private void botonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelActionPerformed
        UI.cl.show(UI.jPrincipal, "Donantes");
    }//GEN-LAST:event_botonCancelActionPerformed

    private void NIF_CIFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF_CIFKeyTyped
        if (NIF_CIF.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_NIF_CIFKeyTyped

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        if (Nombre.getText().length() == 20) {
            evt.consume();
        }
    }//GEN-LAST:event_NombreKeyTyped

    private void ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidosKeyTyped
        if (Apellidos.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_ApellidosKeyTyped

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
        if (Email.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_EmailKeyTyped

    private void LocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LocalidadKeyTyped
        if (Localidad.getText().length() == 20) {
            evt.consume();
        }
    }//GEN-LAST:event_LocalidadKeyTyped

    private void NIF_VoluntarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF_VoluntarioKeyTyped
        if (NIF_Voluntario.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_NIF_VoluntarioKeyTyped

    private void Periodicidad_DonacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Periodicidad_DonacionesKeyTyped
        if (Periodicidad_Donaciones.getText().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_Periodicidad_DonacionesKeyTyped

    private void Cuantia_DonacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cuantia_DonacionesKeyTyped
        if (Cuantia_Donaciones.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_Cuantia_DonacionesKeyTyped

    private void ObservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ObservacionesKeyTyped
        if (Observaciones.getText().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_ObservacionesKeyTyped

    private void TelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoKeyReleased
        if (!ValidarCampos.isInteger(Cuantia_Donaciones.getText())) {
            JOptionPane.showMessageDialog(this, "El telefono debe ser un numero", "Error en el telefono", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TelefonoKeyReleased

    private void Cuantia_DonacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cuantia_DonacionesKeyReleased
        if (!ValidarCampos.isDouble(Cuantia_Donaciones.getText())) {
            JOptionPane.showMessageDialog(this, "El telefono debe ser un numero", "Error en el telefono", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Cuantia_DonacionesKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellidos;
    private javax.swing.JTextField Cuantia_Donaciones;
    private javax.swing.JTextField Email;
    private javax.swing.JFormattedTextField Fecha_Nacimiento;
    private javax.swing.JTextField Localidad;
    private javax.swing.JTextField NIF_CIF;
    private javax.swing.JTextField NIF_Voluntario;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextArea Observaciones;
    private javax.swing.JTextField Periodicidad_Donaciones;
    private javax.swing.JTextField Telefono;
    private javax.swing.JComboBox Tipo_Donante;
    private javax.swing.JComboBox Tipo_Periodicidad;
    private javax.swing.JButton botonCancel;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
