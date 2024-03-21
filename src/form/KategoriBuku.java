/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import konek.koneksi;

/**
 *
 * @author leb1-4
 */
public class KategoriBuku extends javax.swing.JInternalFrame {
void kosong(){
    nama.setText("");
    }
    /**
     * Creates new form KategoriBuku
     */
    public KategoriBuku() {
        initComponents();
        muattabel();
    }
private void muattabel() {
        DefaultTableModel kp = (DefaultTableModel) tabel.getModel();

        kp.getDataVector().removeAllElements();

        String sql = "select * from kategoribuku";

        koneksi md = new koneksi();

        ResultSet rs = md.ambilData(sql);
        try {
            while (rs.next()) {
               Vector baris = new Vector();
               baris.add(rs.getInt("id"));
               baris.add(rs.getString("namakategori"));
               kp.addRow(baris);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        tabel.setModel(kp);

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
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        status = new javax.swing.JLabel();

        jLabel2.setText("Nama Kategori");

        simpan.setText("Simpan");
        simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanMouseClicked(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });

        edit.setText("Edit");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });

        batal.setText("Batal");
        batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batalMouseClicked(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Kategori"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        status.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(simpan)
                                .addGap(18, 18, 18)
                                .addComponent(edit)
                                .addGap(18, 18, 18)
                                .addComponent(batal)
                                .addGap(18, 18, 18)
                                .addComponent(hapus))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(edit)
                    .addComponent(hapus)
                    .addComponent(batal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanMouseClicked
        // TODO add your handling code here:
        String nm = nama.getText();

        String sql = "insert into kategoribuku(namakategori) values('"+nm+"')";

        koneksi md = new koneksi();
         if(md.rubahData(sql)){
            status.setText("data berhasil ditambah");
         muattabel();
        }else{
            status.setText("data gagal ditambah");
        }
      kosong();
    }//GEN-LAST:event_simpanMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here:
         int nobaris = tabel.getSelectedRow();
        String id = tabel.getValueAt(nobaris, 0).toString();
        String nm = nama.getText();
        String sql = "update kategoribuku set namakategori='"+nm+"' where id="+id;

        koneksi md = new koneksi();
         if(md.rubahData(sql)){
            status.setText("data berhasil ditambah");
         muattabel();

        }else{
            status.setText("data gagal ditambah");
        }
        kosong(); 
    }//GEN-LAST:event_editMouseClicked

    private void batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batalMouseClicked
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_batalMouseClicked

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
        // TODO add your handling code here:
          int nobaris = tabel.getSelectedRow();
        String kode = tabel.getValueAt(nobaris, 0).toString();
        String sql = "delete from kategoribuku where id="+kode;

        koneksi md = new koneksi();
         if(md.rubahData(sql)){
            status.setText("data berhasil ditambah");
         muattabel();

        }else{
            status.setText("data gagal ditambah");
        }
        kosong();
    }//GEN-LAST:event_hapusMouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
         int nobaris = tabel.getSelectedRow();
        nama.setText(tabel.getValueAt(nobaris, 1).toString());
    }//GEN-LAST:event_tabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JButton simpan;
    private javax.swing.JLabel status;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}