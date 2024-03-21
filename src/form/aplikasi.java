/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author leb1-4
 */
public class aplikasi extends javax.swing.JFrame {

    /**
     * Creates new form aplikasi
     */
    public aplikasi() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        admin = new javax.swing.JMenu();
        member = new javax.swing.JMenu();
        buku = new javax.swing.JMenu();
        kate = new javax.swing.JMenu();
        pemin = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        admin.setMnemonic('f');
        admin.setText("Admin");
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        menuBar.add(admin);

        member.setMnemonic('e');
        member.setText("Member");
        member.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                memberMenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
            }
        });
        menuBar.add(member);

        buku.setText("Buku");
        buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bukuMouseClicked(evt);
            }
        });
        menuBar.add(buku);

        kate.setText("Ketegori");
        kate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kateMouseClicked(evt);
            }
        });
        menuBar.add(kate);

        pemin.setText("Peminjaman");
        pemin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peminMouseClicked(evt);
            }
        });
        menuBar.add(pemin);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        // TODO add your handling code here:
        Admin ad = new  Admin();
        desktopPane.add(ad);
        ad.setVisible(true);
    }//GEN-LAST:event_adminMouseClicked

    private void memberMenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_memberMenuCanceled
        // TODO add your handling code here:
        member mb = new member();
        desktopPane.add(mb);
        mb.setVisible(true);
    }//GEN-LAST:event_memberMenuCanceled

    private void bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bukuMouseClicked
        // TODO add your handling code here:
        Buku bk = new Buku();
        desktopPane.add(bk);
        bk.setVisible(true);
    }//GEN-LAST:event_bukuMouseClicked

    private void kateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kateMouseClicked
        // TODO add your handling code here:
        KategoriBuku kb = new KategoriBuku();
        desktopPane.add(kb);
        kb.setVisible(true);
    }//GEN-LAST:event_kateMouseClicked

    private void peminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peminMouseClicked
        // TODO add your handling code here:
        Peminjaman pj = new Peminjaman();
        desktopPane.add(pj);
        pj.setVisible(true);
    }//GEN-LAST:event_peminMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu admin;
    private javax.swing.JMenu buku;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu kate;
    private javax.swing.JMenu member;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu pemin;
    // End of variables declaration//GEN-END:variables

}
