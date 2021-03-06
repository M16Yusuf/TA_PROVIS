/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

import SambungDB.sambungDatabase;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author m16yusuf
 */
public class hapusKelas extends javax.swing.JFrame {

    /**
     * Creates new form hapusKelas
     */
    public hapusKelas() {
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

        txthapusKelas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnTutup = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnHapusKelas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txthapusKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthapusKelasActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Kelas");

        btnTutup.setText("Tutup");
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnHapusKelas.setText("Submit");
        btnHapusKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKelasActionPerformed(evt);
            }
        });

        jLabel2.setText("Masukan ID Kelas yang akan DiHapus");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTutup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapusKelas))
                            .addComponent(txthapusKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthapusKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTutup)
                    .addComponent(btnReset)
                    .addComponent(btnHapusKelas))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 265));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txthapusKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthapusKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthapusKelasActionPerformed

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnTutupActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txthapusKelas.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnHapusKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKelasActionPerformed
        // TODO add your handling code here:
        sambungDatabase sambung = new sambungDatabase();
        try{
            String sql = "DELETE FROM tb_kelas WHERE id_kelas='"+txthapusKelas.getText()+"'";
            sambung.stat.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Kelas dengan ID: "+txthapusKelas.getText()+" berhasil di hapus");
            dispose();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }//GEN-LAST:event_btnHapusKelasActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapusKelas;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTutup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txthapusKelas;
    // End of variables declaration//GEN-END:variables
}
