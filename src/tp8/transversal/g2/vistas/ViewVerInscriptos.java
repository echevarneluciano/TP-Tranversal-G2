/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8.transversal.g2.vistas;


import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tp8.transversal.g2.clases.*;
import tp8.transversal.g2.data.AlumnoData;
import tp8.transversal.g2.data.CursadaData;
import tp8.transversal.g2.data.MateriaData;

/**
 *
 * @author Guido Caballero
 */
public class ViewVerInscriptos extends javax.swing.JInternalFrame {
    CursadaData cd;
    MateriaData md;
    private DefaultTableModel dtm;
    private Materia mt;
    /**
     * Creates new form ViewVerInscriptos
     */
    public ViewVerInscriptos(CursadaData cd, MateriaData md) {
        this.cd = cd;
        this.md = md;
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

        jPanel1 = new javax.swing.JPanel();
        jtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInscriptos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jbActualizar = new javax.swing.JButton();
        cbVerInactivos = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtEstado = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();

        setClosable(true);

        jtId.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel1.setText("ID Materia");

        jbBuscar.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtInscriptos.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        jtInscriptos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Legajo", "Alumno", "Estado del Alumno", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtInscriptos);

        jbActualizar.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        cbVerInactivos.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        cbVerInactivos.setText("Incluir alumnos inactivos.");
        cbVerInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVerInactivosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel3.setText("Año");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel4.setText("Estado");

        jtEstado.setEditable(false);
        jtEstado.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        jtAnio.setEditable(false);
        jtAnio.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        jtNombre.setEditable(false);
        jtNombre.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(cbVerInactivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbActualizar)
                .addGap(87, 87, 87))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                                .addComponent(jtAnio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtEstado, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtAnio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar)
                    .addComponent(cbVerInactivos))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbVerInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVerInactivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVerInactivosActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        obtenerAlumnosNotas(mt);
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int materiaId = 0;
        jtAnio.setText("");
        jtNombre.setText("");
        jtEstado.setText("");
        dtm = (DefaultTableModel) jtInscriptos.getModel();
        dtm.setRowCount(0);
        try{
            materiaId = Integer.valueOf(jtId.getText());
            if(materiaId<=0)
            JOptionPane.showMessageDialog(null,"El campo ID no puede contener un numero negativo o ser igual a cero");
        else {
               if(md.buscarMateria(materiaId).getId_materia() == 0){
                JOptionPane.showMessageDialog(null,"Parece que la materia que buscas no existe. Prueba otra diferente.");
                } else { 
                   mt = new Materia();
                   mt = cd.buscarMateria(materiaId);
                   if (mt.getId_materia() == 0){ 
                       JOptionPane.showMessageDialog(null,"Parece que la materia que buscas no tiene inscriptos. Prueba otra diferente.");
                   } else { 
                       jtAnio.setText(mt.getAnio()+"");
                       jtNombre.setText(mt.getNombre());
                       if(mt.isEstado()) {
                           jtEstado.setText("Activa"); }
                       else{
                           jtEstado.setText("Inactiva"); }
                       obtenerAlumnosNotas(mt);
                   }
               }
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"El campo ID solo admite caracteres numéricos");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void obtenerAlumnosNotas(Materia m){ 
        dtm = (DefaultTableModel) jtInscriptos.getModel();
        dtm.setRowCount(0);
        if (cbVerInactivos.isSelected()){ 
        for (Cursada c : cd.obtenerCursadas()){                
                if (m.getId_materia() == c.getMateria().getId_materia()){
                    String []row = new String[4];
                    row[0] = c.getAlumno().getLegajo()+"";
                    row[1] = c.getAlumno().getNombre();
                    if(c.getAlumno().isActivo())
                      row[2]= "Activo";
                    else
                     row[2]= "Inactivo";
                    row[3] = c.getNota()+"º";
                    dtm.addRow(row);
                    jtInscriptos.setModel(dtm);
                }     
        }
        } else { 
            for (Cursada c : cd.obtenerCursadas()){  
                if (m.getId_materia() == c.getMateria().getId_materia() && c.getAlumno().isActivo()){
                    String []row = new String[4];
                    row[0] = c.getAlumno().getLegajo()+"";
                    row[1] = c.getAlumno().getNombre();
                    row[2]= "Activo";
                    row[3] = c.getNota()+"º";
                    dtm.addRow(row);
                    jtInscriptos.setModel(dtm);
                }
            
        }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbVerInactivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtId;
    private javax.swing.JTable jtInscriptos;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
