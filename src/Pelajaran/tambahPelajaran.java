/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pelajaran;

import SambungDB.sambungDatabase;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author m16yusuf
 */
public class tambahPelajaran extends javax.swing.JFrame {

    /**
     * Creates new form tambahPelajaran
     */
    public tambahPelajaran(){
        initComponents();
        cbpengajar();
    }
    
    private void cbpengajar(){
        sambungDatabase sambung = new sambungDatabase();
        try{
            String sql="select * from tb_guru";
            ResultSet res = sambung.stat.executeQuery(sql);
            
           while(res.next()){
               String jenis =res.getString("nama_guru");
               CBPengajar.addItem(jenis);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNamaPelajaran = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CBTingkat = new javax.swing.JComboBox<>();
        CBPengajar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnaddPelajaran = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnTutup = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        labelNIP = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama Pelajaran ");

        jLabel2.setText("Tingkat");

        CBTingkat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelas 1", "Kelas 2", "Kelas 3", "Kelas 4", "Kelas 5", "Kelas 6" }));

        CBPengajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPengajarActionPerformed(evt);
            }
        });

        jLabel3.setText("Pengajar");

        btnaddPelajaran.setText("Submit");
        btnaddPelajaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddPelajaranActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnTutup.setText("Tutup");
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });

        jLabel5.setText("NIP ");

        labelNIP.setText("NIP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaPelajaran, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CBPengajar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBTingkat, javax.swing.GroupLayout.Alignment.LEADING, 0, 154, Short.MAX_VALUE))
                            .addComponent(labelNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTutup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnaddPelajaran))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamaPelajaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBTingkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBPengajar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelNIP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddPelajaran)
                    .addComponent(btnReset)
                    .addComponent(btnTutup)))
        );

        jLabel4.setText("Tambah Data Pelajaran ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel4)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );

        setSize(new java.awt.Dimension(432, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnTutupActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtNamaPelajaran.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnaddPelajaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddPelajaranActionPerformed
        // TODO add your handling code here:
        sambungDatabase sambung = new sambungDatabase();
        int tingkat = 0;
        if(CBTingkat.getSelectedItem()=="Kelas 1"){
            tingkat = 1;
        }
        else
        if (CBTingkat.getSelectedItem()=="Kelas 2"){
            tingkat = 2;
        }
        else
        if (CBTingkat.getSelectedItem()=="Kelas 3"){
            tingkat = 3;
        }
        else
        if (CBTingkat.getSelectedItem()=="Kelas 4"){
            tingkat = 4;
        }
        else
        if (CBTingkat.getSelectedItem()=="Kelas 5"){
            tingkat = 5;
        }
        else
        if (CBTingkat.getSelectedItem()=="Kelas 6"){
            tingkat = 6;
        }
        
        try{
           String sql ="INSERT INTO tb_pelajaran VALUES(NULL,'" + txtNamaPelajaran.getText() +  "','" + tingkat + "','" 
                   + labelNIP.getText() +"')";
           sambung.stat.executeUpdate(sql);
           
           JOptionPane.showMessageDialog(null, "Data berhasil di tambahkan");
           formPelajaran pelajaran = new formPelajaran();
           pelajaran.tampilPelajaran();
           dispose();
       }
       catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
       } 
    }//GEN-LAST:event_btnaddPelajaranActionPerformed

    private void CBPengajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPengajarActionPerformed
        // TODO add your handling code here:
        sambungDatabase sambung = new sambungDatabase();
        try{
            String sql = "SELECT * FROM tb_guru WHERE nama_guru= '"+ CBPengajar.getSelectedItem() +"' ";
            ResultSet res = sambung.stat.executeQuery(sql);
            while(res.next()){
                String nip_pengajar = res.getString("nip");
                labelNIP.setText(nip_pengajar);
            }  
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        } 
    }//GEN-LAST:event_CBPengajarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBPengajar;
    private javax.swing.JComboBox<String> CBTingkat;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTutup;
    private javax.swing.JButton btnaddPelajaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNIP;
    private javax.swing.JTextField txtNamaPelajaran;
    // End of variables declaration//GEN-END:variables
}
