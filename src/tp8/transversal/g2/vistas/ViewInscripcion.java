/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8.transversal.g2.vistas;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import tp8.transversal.g2.clases.*;
import tp8.transversal.g2.data.AlumnoData;
import tp8.transversal.g2.data.CursadaData;
import tp8.transversal.g2.data.MateriaData;

/**
 *
 * @author Guido Caballero
 */
public class ViewInscripcion extends javax.swing.JInternalFrame {
private AlumnoData ad;
private MateriaData md;
private CursadaData cd;
    /**
     * Creates new form ViewInscripcion
     */
    public ViewInscripcion(AlumnoData ad,MateriaData md,CursadaData cd) {
        initComponents();
        this.ad=ad;
        this.md=md;
        this.cd=cd;
        Iterator <Alumno> it=ad.obtenerAlumnos().iterator();
        Iterator <Materia> it2=md.obtenerMaterias().iterator();
        cbAlumnos.addItem(null);
        cbMaterias.addItem(null);
        while(it.hasNext()){
            Alumno a1=it.next();
            if(a1.isActivo())
                cbAlumnos.addItem(a1);
        }
        while(it2.hasNext()){
            Materia m1=it2.next();
            if(m1.isEstado())
                cbMaterias.addItem(m1);
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
        jPanel1 = new javax.swing.JPanel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMaterias = new javax.swing.JComboBox<>();
        jbConfirmar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbVerificar = new javax.swing.JButton();

        setClosable(true);

        cbAlumnos.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel1.setText("Seleccione un alumno ");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione una materia ");

        cbMaterias.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        cbMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMateriasActionPerformed(evt);
            }
        });

        jbConfirmar.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jbConfirmar.setText("Inscribir");
        jbConfirmar.setEnabled(false);
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setMaximumSize(new java.awt.Dimension(86, 38));
        jbSalir.setMinimumSize(new java.awt.Dimension(86, 38));
        jbSalir.setPreferredSize(new java.awt.Dimension(86, 38));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbVerificar.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jbVerificar.setText("Verificar");
        jbVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jbVerificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbAlumnos, 0, 369, Short.MAX_VALUE)
                            .addComponent(cbMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConfirmar)
                    .addComponent(jbVerificar))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMateriasActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
    Alumno a1=(Alumno)cbAlumnos.getSelectedItem();
    Materia m1=(Materia)cbMaterias.getSelectedItem();
    Cursada c1=new Cursada(a1,m1,0);
    cd.guardarCursada(c1);
    jbConfirmar.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerificarActionPerformed
    Alumno a1 = (Alumno)cbAlumnos.getSelectedItem();
    Materia m1 = (Materia)cbMaterias.getSelectedItem();
    boolean ok = false;
    if(a1!=null && m1!=null){
        List <Materia> lm=cd.obtenerMateriasCursadas(a1.getId_alumno());
        for(Materia m:lm){
            System.out.print(m.getId_materia()+" ");
            System.out.println(m1.getId_materia());
        if(m.getId_materia() == m1.getId_materia())
            ok=true;
        }
        System.out.println(ok);
        if(!ok)
            jbConfirmar.setEnabled(true);
        else{
            JOptionPane.showMessageDialog(this,"No es posible, alumno ya se encuentra inscripto a la materia");
            jbConfirmar.setEnabled(false);
        }
    }
    // TODO add your handling code here:
    }//GEN-LAST:event_jbVerificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JComboBox<Materia> cbMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVerificar;
    // End of variables declaration//GEN-END:variables
}
