/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nilai;

import SambungDB.sambungDatabase;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author m16yusuf
 */
public class tambahNilai extends javax.swing.JFrame {

    /**
     * Creates new form tambahNilai
     */
    public tambahNilai() {
        initComponents();
        cbKelasMethod();
    }
    
    private void cbKelasMethod(){
        sambungDatabase sambung = new sambungDatabase();
        try{
            String sql="select id_kelas from tb_kelas";
            ResultSet res = sambung.stat.executeQuery(sql);
            
           while(res.next()){
               String jenis =res.getString("id_kelas");
               CBKelas.addItem(jenis);
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CBTingkat = new javax.swing.JComboBox<>();
        CBPelajaran = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        labelIDPel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNilai = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        CBKelas = new javax.swing.JComboBox<>();
        CBNamaSiswa = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelNis = new javax.swing.JLabel();
        btnAddNilai = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnTutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Tambah Nilai");

        jLabel4.setText("Tingkat ");

        jLabel6.setText("Nama Pelajaran");

        CBTingkat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelas 1", "Kelas 2", "Kelas 3", "Kelas 4", "Kelas 5", "Kelas 6" }));
        CBTingkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTingkatActionPerformed(evt);
            }
        });

        CBPelajaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPelajaranActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Pelajaran");

        labelIDPel.setText("ID");

        jLabel7.setText("Nilai");

        jLabel1.setText("Mata Pelajaran :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIDPel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBTingkat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 84, Short.MAX_VALUE))
                            .addComponent(CBPelajaran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBTingkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CBPelajaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelIDPel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Siswa :");

        CBKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBKelasActionPerformed(evt);
            }
        });

        CBNamaSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNamaSiswaActionPerformed(evt);
            }
        });

        jLabel9.setText("NIS");

        jLabel10.setText("Kelas Siswa");

        jLabel11.setText("Nama Siswa");

        labelNis.setText("NIS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNis, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CBNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelNis))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btnAddNilai.setText("Submit");
        btnAddNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNilaiActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTutup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddNilai)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddNilai)
                        .addComponent(btnReset))
                    .addComponent(btnTutup))
                .addGap(16, 16, 16))
        );

        setSize(new java.awt.Dimension(455, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnTutupActionPerformed

    private void btnAddNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNilaiActionPerformed
        // TODO add your handling code here:
        sambungDatabase sambung = new sambungDatabase();
        try{
//           String temp = labelIDPel.getText();
           String sql ="INSERT INTO tb_nilai VALUES(NULL,'" + txtNilai.getText() +  "','" + labelNis.getText() + "','" 
                   + labelIDPel.getText() +"')";
           sambung.stat.executeUpdate(sql);
           
           JOptionPane.showMessageDialog(null, "Data berhasil di tambahkan");
           dispose();
       }
       catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
       } 
    }//GEN-LAST:event_btnAddNilaiActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtNilai.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void CBKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBKelasActionPerformed
        // TODO add your handling code here:
        sambungDatabase sambung = new sambungDatabase();
        try{
            String sql="select * from tb_siswa WHERE id_kelas='"+CBKelas.getSelectedItem()+"' ";
            ResultSet res = sambung.stat.executeQuery(sql);

            CBNamaSiswa.removeAllItems();

            while(res.next()){
                String jenis =res.getString("nama_siswa");
                CBNamaSiswa.addItem(jenis);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }//GEN-LAST:event_CBKelasActionPerformed

    private void CBNamaSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNamaSiswaActionPerformed
        // TODO add your handling code here:
        sambungDatabase sambung = new sambungDatabase();
        try{
            String sql = "SELECT * FROM tb_siswa WHERE nama_siswa= '"+ CBNamaSiswa.getSelectedItem() +"' ";
            ResultSet res = sambung.stat.executeQuery(sql);
            while(res.next()){
                String nis = res.getString("nis");
                labelNis.setText(nis);
            }  
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        } 
    }//GEN-LAST:event_CBNamaSiswaActionPerformed

    private void CBTingkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTingkatActionPerformed
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
            String sql="select * from tb_pelajaran WHERE tingkat='"+tingkat+"' ";
            ResultSet res = sambung.stat.executeQuery(sql);

            CBPelajaran.removeAllItems();
            while(res.next()){
                String jenis =res.getString("nama_pelajaran");
                CBPelajaran.addItem(jenis);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        }
    }//GEN-LAST:event_CBTingkatActionPerformed

    private void CBPelajaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPelajaranActionPerformed
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
            String sql = "SELECT * FROM tb_pelajaran WHERE nama_pelajaran= '"+ CBPelajaran.getSelectedItem() +"' and tingkat='"+tingkat+"' ";
            ResultSet res = sambung.stat.executeQuery(sql);
            while(res.next()){
                String id_pelajaran = res.getString("id_pelajaran");
                labelIDPel.setText(id_pelajaran);
            }  
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        } 
    }//GEN-LAST:event_CBPelajaranActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBKelas;
    private javax.swing.JComboBox<String> CBNamaSiswa;
    private javax.swing.JComboBox<String> CBPelajaran;
    private javax.swing.JComboBox<String> CBTingkat;
    private javax.swing.JButton btnAddNilai;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTutup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelIDPel;
    private javax.swing.JLabel labelNis;
    private javax.swing.JTextField txtNilai;
    // End of variables declaration//GEN-END:variables
}