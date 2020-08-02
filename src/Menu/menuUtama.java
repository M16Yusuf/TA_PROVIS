/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Admin.formAdmin;
import Guru.formGuru;
import Kelas.formKelas;
import Nilai.formNilai;
import Pelajaran.formPelajaran;
import Siswa.formSiswa;
import java.awt.Dimension;

/**
 *
 * @author m16yusuf
 */
public class menuUtama extends javax.swing.JFrame {

    /**
     * Creates new form menuUtama
     */
    public menuUtama() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        panelUtama = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSiswa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuDataGuru = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuKelas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuPelajaran = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuNilai = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        aboutAplikasi = new javax.swing.JMenuItem();
        JmenuADmin = new javax.swing.JMenu();
        menuAdmin = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        jMenu1.setText("Siswa");

        jMenuSiswa.setText("data Siswa");
        jMenuSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSiswaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSiswa);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Guru");

        jMenuDataGuru.setText("Data Guru");
        jMenuDataGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDataGuruActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuDataGuru);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Kelas");

        jMenuKelas.setText("Data Kelas");
        jMenuKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKelasActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuKelas);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Pelajaran");

        jMenuPelajaran.setText("Data Pelajaran");
        jMenuPelajaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPelajaranActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuPelajaran);

        jMenuBar1.add(jMenu7);

        jMenu6.setText("Nilai");

        jMenuNilai.setText("Data Nilai");
        jMenuNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNilaiActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuNilai);

        jMenuBar1.add(jMenu6);

        jMenu8.setText("About");

        aboutAplikasi.setText("Tentang Aplikasi");
        aboutAplikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutAplikasiActionPerformed(evt);
            }
        });
        jMenu8.add(aboutAplikasi);

        jMenuBar1.add(jMenu8);

        JmenuADmin.setText("Admin");
        JmenuADmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmenuADminActionPerformed(evt);
            }
        });

        menuAdmin.setText("Data Admin");
        menuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdminActionPerformed(evt);
            }
        });
        JmenuADmin.add(menuAdmin);

        jMenuItem3.setText("Logout");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        JmenuADmin.add(jMenuItem3);

        jMenuBar1.add(JmenuADmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUtama)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelUtama)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JmenuADminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmenuADminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmenuADminActionPerformed

    private void menuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdminActionPerformed
        // TODO add your handling code here:
        formAdmin admin = new formAdmin();

        // ambil size screen dan size form admin
        Dimension layarutama = this.getSize();
        Dimension layaradmin = admin.getSize();
        // set form admin di tengah screen
        admin.setLocation(layarutama.width/2-layaradmin.width/2,layarutama.height/2-layaradmin.height/2);
        
        // Menampilkan menu admin di dekstop pane
        panelUtama.add(admin);
        admin.setVisible(true);
        admin.tampilAdmin();
    }//GEN-LAST:event_menuAdminActionPerformed

    private void jMenuSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSiswaActionPerformed
        // TODO add your handling code here:
        formSiswa siswa = new formSiswa();
        
        // ambil size screen dan size form Guru
        Dimension layarutama = this.getSize();
        Dimension layarsiswa = siswa.getSize();
        // set form Guru di tengah screen
        siswa.setLocation(layarutama.width/2-layarsiswa.width/2,layarutama.height/2-layarsiswa.height/2);
        
        //menampilkan menu Guru di dekstop pane
        panelUtama.add(siswa);
        siswa.setVisible(true);
        siswa.tampilSiswa();
    }//GEN-LAST:event_jMenuSiswaActionPerformed

    private void jMenuDataGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDataGuruActionPerformed
        // TODO add your handling code here:
        formGuru guru = new formGuru();
        
        // ambil size screen dan size form Guru
        Dimension layarutama = this.getSize();
        Dimension layarguru = guru.getSize();
        // set form Guru di tengah screen
        guru.setLocation(layarutama.width/2-layarguru.width/2,layarutama.height/2-layarguru.height/2);
        
        panelUtama.add(guru);
        guru.setVisible(true);
        guru.tampilGuru();
    }//GEN-LAST:event_jMenuDataGuruActionPerformed

    private void jMenuKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKelasActionPerformed
        // TODO add your handling code here:
        formKelas kelas = new formKelas();
        
        // ambil size screen dan size form Kelas
        Dimension layarutama = this.getSize();
        Dimension layarkelas = kelas.getSize();
        // set form Kelas di tengah screen
        kelas.setLocation(layarutama.width/2-layarkelas.width/2,layarutama.height/2-layarkelas.height/2);
        
        //menampilkan form kelas di panel utama
        panelUtama.add(kelas);
        kelas.setVisible(true);
        kelas.tampilKelas();
    }//GEN-LAST:event_jMenuKelasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void aboutAplikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutAplikasiActionPerformed
        // TODO add your handling code here:
        tentangAplikasi about = new tentangAplikasi();
        
        // ambil size screen dan about
        Dimension layarutama = this.getSize();
        Dimension layar = about.getSize();
        // set di tengah screen
        about.setLocation(layarutama.width/2-layar.width/2,layarutama.height/2-layar.height/2);
        
        //menampilkan form kelas di panel utama
        panelUtama.add(about);
        about.setVisible(true);
    }//GEN-LAST:event_aboutAplikasiActionPerformed

    private void jMenuNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNilaiActionPerformed
        // TODO add your handling code here:
        formNilai nilai = new formNilai();
        
        // ambil size screen dan form
        Dimension layarutama = this.getSize();
        Dimension layar = nilai.getSize();
        // set di tengah screen
        nilai.setLocation(layarutama.width/2-layar.width/2,layarutama.height/2-layar.height/2);
        
        panelUtama.add(nilai);
        nilai.setVisible(true);
        nilai.tampilNilai();
    }//GEN-LAST:event_jMenuNilaiActionPerformed

    private void jMenuPelajaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPelajaranActionPerformed
        // TODO add your handling code here:
        formPelajaran pelajaran = new formPelajaran();
        
        // ambil size screen dan form
        Dimension layarutama = this.getSize();
        Dimension layar = pelajaran.getSize();
        // set di tengah screen
        pelajaran.setLocation(layarutama.width/2-layar.width/2,layarutama.height/2-layar.height/2);
        
        panelUtama.add(pelajaran);
        pelajaran.setVisible(true);
        pelajaran.tampilPelajaran();
    }//GEN-LAST:event_jMenuPelajaranActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmenuADmin;
    private javax.swing.JMenuItem aboutAplikasi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDataGuru;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuKelas;
    private javax.swing.JMenuItem jMenuNilai;
    private javax.swing.JMenuItem jMenuPelajaran;
    private javax.swing.JMenuItem jMenuSiswa;
    private javax.swing.JMenuItem menuAdmin;
    private javax.swing.JDesktopPane panelUtama;
    // End of variables declaration//GEN-END:variables
}
