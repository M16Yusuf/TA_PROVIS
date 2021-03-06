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
public class editKelas extends javax.swing.JFrame {

    /**
     * Creates new form editKelas
     */
    public editKelas() {
        initComponents();
        cbwalikelas();
    }
    
    private void cbwalikelas(){
        sambungDatabase sambung = new sambungDatabase();
        try{
            String sql="select * from tb_guru";
            ResultSet res = sambung.stat.executeQuery(sql);
            
           while(res.next()){
               String jenis =res.getString("nama_guru");
               CBwali.addItem(jenis);
           }    
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtinEditKelas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDKelas = new javax.swing.JTextField();
        CBTingkatKelas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CBwali = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelNip = new javax.swing.JLabel();
        btnEditKelas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnTutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Kelas ");

        jLabel2.setText("Masukan ID Kelas yang akan di Edit :");

        jLabel3.setText("Masukan data Kelas yang baru :");

        jLabel4.setText("Tingkat Kelas ");

        CBTingkatKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelas 1", "Kelas 2", "Kelas 3", "Kelas 4", "Kelas 5", "Kelas 6" }));

        jLabel5.setText("ID Kelas");

        CBwali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBwaliActionPerformed(evt);
            }
        });

        jLabel6.setText("Wali Kelas");

        jLabel7.setText("NIP");

        labelNip.setText("NIP");

        btnEditKelas.setText("Submit");
        btnEditKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditKelasActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnTutup.setText("Tutup");
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(txtinEditKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnTutup)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditKelas))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CBwali, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIDKelas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CBTingkatKelas, javax.swing.GroupLayout.Alignment.LEADING, 0, 139, Short.MAX_VALUE)
                                .addComponent(labelNip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtinEditKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBTingkatKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBwali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelNip))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditKelas)
                    .addComponent(jButton2)
                    .addComponent(btnTutup))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(412, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnTutupActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtinEditKelas.setText("");
        txtIDKelas.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEditKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditKelasActionPerformed
        // TODO add your handling code here:
        sambungDatabase sambung = new sambungDatabase();
       int tingkat = 0;
       if(CBTingkatKelas.getSelectedItem()=="Kelas 1"){
           tingkat = 1;
       }
       else
       if (CBTingkatKelas.getSelectedItem()=="Kelas 2"){
           tingkat = 2;
       }
       else
       if (CBTingkatKelas.getSelectedItem()=="Kelas 3"){
           tingkat = 3;
       }
       else
       if (CBTingkatKelas.getSelectedItem()=="Kelas 4"){
           tingkat = 4;
       }
       else
       if (CBTingkatKelas.getSelectedItem()=="Kelas 5"){
           tingkat = 5;
       }
       else
       if (CBTingkatKelas.getSelectedItem()=="Kelas 6"){
           tingkat = 6;
       }
       
       try{
           String temp = txtIDKelas.getText();
           String sql ="UPDATE tb_kelas SET id_kelas='" +temp.toUpperCase()+ "', tingkat_kelas='" 
                   +tingkat+ "', nip_walikelas='" +labelNip.getText()+"' WHERE id_kelas='"+ txtinEditKelas.getText().toUpperCase() +"' ";
           sambung.stat.executeUpdate(sql);
           
           JOptionPane.showMessageDialog(null, "Data berhasil di Update");
           dispose();
       }
       catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        } 
    }//GEN-LAST:event_btnEditKelasActionPerformed

    private void CBwaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBwaliActionPerformed
        // TODO add your handling code here:
        sambungDatabase sambung = new sambungDatabase();
        try{
            String sql = "SELECT * FROM tb_guru WHERE nama_guru= '"+ CBwali.getSelectedItem() +"' ";
            ResultSet res = sambung.stat.executeQuery(sql);
            while(res.next()){
                String nip_wali = res.getString("nip");
                labelNip.setText(nip_wali);
            }  
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        } 
    }//GEN-LAST:event_CBwaliActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBTingkatKelas;
    private javax.swing.JComboBox<String> CBwali;
    private javax.swing.JButton btnEditKelas;
    private javax.swing.JButton btnTutup;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelNip;
    private javax.swing.JTextField txtIDKelas;
    private javax.swing.JTextField txtinEditKelas;
    // End of variables declaration//GEN-END:variables
}
