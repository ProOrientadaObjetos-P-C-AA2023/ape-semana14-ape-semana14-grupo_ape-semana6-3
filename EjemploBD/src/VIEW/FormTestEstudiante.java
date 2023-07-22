package VIEW;

import MODEL.Estudiante;
import CONTROLER.ProcesarEstudiantes;
import MODEL.ConeccionDB;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormTestEstudiante extends javax.swing.JFrame {

    DefaultTableModel modelo;
    boolean inputsHabilitados = false;
    ArrayList<Estudiante> lstEstudiantes = new ArrayList<>();

    public FormTestEstudiante() {
        initComponents();
        modelo = (DefaultTableModel) this.jTable1.getModel();
        Guardar.setEnabled(false);
        Nombre.setEnabled(false);
        nota1.setEnabled(false);
        nota2.setEnabled(false);
        Actualizar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Conectar = new javax.swing.JButton();
        Selecionar = new javax.swing.JButton();
        Insertar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        nota1 = new javax.swing.JTextField();
        nota2 = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Conectar.setText("Conectar");
        Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectarActionPerformed(evt);
            }
        });

        Selecionar.setText("Seleccionar");
        Selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionarActionPerformed(evt);
            }
        });

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nota1", "Nota2", "Promedio", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Nota1:");

        jLabel3.setText("Nota2:");

        nota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota1ActionPerformed(evt);
            }
        });

        nota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota2ActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Conectar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Selecionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Insertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Actualizar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nota1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(Guardar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cerrar)
                                .addGap(47, 47, 47))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Conectar)
                    .addComponent(Selecionar)
                    .addComponent(Insertar)
                    .addComponent(Eliminar)
                    .addComponent(Actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Guardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectarActionPerformed
        // TODO add your handling code here:
        conectarDB();
    }//GEN-LAST:event_ConectarActionPerformed

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        // TODO add your handling code here:
        activar();
        while (modelo.getRowCount() > 0) {
            this.modelo.removeRow(0);
        }
        ArrayList<Estudiante> lstEst = new ArrayList<Estudiante>();
        ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEst);
        lstEst = procesarEstudiantes.getLstEstudiantes();
        for (Estudiante est : lstEst)
            this.modelo.addRow(new Object[]{est.nombreEst, est.nota1, est.nota2, est.promedio, est.estado});
    }//GEN-LAST:event_SelecionarActionPerformed

    private void nota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota1ActionPerformed

    private void nota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota2ActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        insertarDatos();
        if (!inputsHabilitados) {
            Nombre.setEnabled(true);
            nota1.setEnabled(true);
            nota2.setEnabled(true);
            inputsHabilitados = true;

            Insertar.setEnabled(false);
            Guardar.setEnabled(true);
        }
    }//GEN-LAST:event_InsertarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String nombreEst = Nombre.getText();
        String nota1Text = nota1.getText();
        String nota2Text = nota2.getText();

        if (nombreEst.isEmpty() || nota1Text.isEmpty() || nota2Text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese todos los datos.");
            return;
        }

        try {
            double nota1Value = Double.parseDouble(nota1Text);
            double nota2Value = Double.parseDouble(nota2Text);

            if (nota1Value < 0 || nota1Value > 10 || nota2Value < 0 || nota2Value > 10) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese notas válidas (0-10).");
                return;
            }

            double promedio = (nota1Value + nota2Value) / 2;
            String estado = (promedio >= 7) ? "Aprobado" : "Reprobado";

            Estudiante estudiante = new Estudiante(nombreEst, nota1Value, nota2Value, promedio, estado);

            modelo.addRow(new Object[]{nombreEst, nota1Value, nota2Value, promedio, estado});
            lstEstudiantes.add(estudiante); 
            ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEstudiantes);
            procesarEstudiantes.insertarEstudiante(estudiante);

            Nombre.setEnabled(false);
            nota1.setEnabled(false);
            nota2.setEnabled(false);
            inputsHabilitados = false;
            Insertar.setEnabled(true);
            Guardar.setEnabled(false);

            Nombre.setText("");
            nota1.setText("");
            nota2.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese notas válidas.");
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un estudiante para eliminar.");
            return;
        }

        String nombreEst = (String) jTable1.getValueAt(filaSeleccionada, 0);

        eliminarEstudiante(nombreEst);

        actualizarTabla();
        lstEstudiantes = getListaEstudiantes();

        JOptionPane.showMessageDialog(this, "Estudiante eliminado correctamente.");
    }

    private void eliminarEstudiante(String nombreEstudiante) {
        ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEstudiantes);
        procesarEstudiantes.eliminarEstudiante(nombreEstudiante);
    }

    private void actualizarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        lstEstudiantes = getListaEstudiantes();
        for (Estudiante est : lstEstudiantes) {
            modelo.addRow(new Object[]{est.nombreEst, est.nota1, est.nota2, est.promedio, est.estado});
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un estudiante para actualizar.");
            return;
        }

        String nombreEst = Nombre.getText();
        String nota1Text = nota1.getText();
        String nota2Text = nota2.getText();

        if (nombreEst.isEmpty() || nota1Text.isEmpty() || nota2Text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese todos los datos.");
            return;
        }

        try {
            double nota1Value = Double.parseDouble(nota1Text);
            double nota2Value = Double.parseDouble(nota2Text);

            if (nota1Value < 0 || nota1Value > 10 || nota2Value < 0 || nota2Value > 10) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese notas válidas (0-10).");
                return;
            }

            double promedio = (nota1Value + nota2Value) / 2;
            String estado = (promedio >= 7) ? "Aprobado" : "Reprobado";

            Estudiante estudiante = lstEstudiantes.get(filaSeleccionada);
            estudiante.nombreEst = nombreEst;
            estudiante.nota1 = nota1Value;
            estudiante.nota2 = nota2Value;
            estudiante.promedio = promedio;
            estudiante.estado = estado;

            ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEstudiantes); // Pasar la lista al constructor
            procesarEstudiantes.actualizarEstudiante(estudiante);

            actualizarTabla();
            jTable1.clearSelection();

            JOptionPane.showMessageDialog(this, "Estudiante actualizado correctamente.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese notas válidas.");
        }
    }//GEN-LAST:event_ActualizarActionPerformed
    private ArrayList<Estudiante> getListaEstudiantes() {
        ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEstudiantes);
        return procesarEstudiantes.getLstEstudiantes();
    }

    private void conectarDB() {
        ConeccionDB coneccionDB = new ConeccionDB();
        coneccionDB.setConcDB("jdbc:sqlite:bd/dbTest1.db");
    }

    private void insertarDatos() {
        Nombre.setEnabled(true);
        nota1.setEnabled(true);
        nota2.setEnabled(true);
        Guardar.setEnabled(true);
    }
    
    private void activar(){
        Actualizar.setEnabled(true);
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
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTestEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTestEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Conectar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Insertar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Selecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    // End of variables declaration//GEN-END:variables
}
