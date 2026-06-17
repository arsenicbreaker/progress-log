package latihanuas.annualtaxsystem;

import Kelas.EriTax;
import java.util.ArrayList;

public class FormMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMenu.class.getName());
    ArrayList<EriTax> annualTaxs = new ArrayList<>();
    public FormMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAnualTax = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuDisplayData = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Input");

        menuAnualTax.setText("Add Anual Tax");
        menuAnualTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAnualTaxActionPerformed(evt);
            }
        });
        jMenu1.add(menuAnualTax);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Display");

        menuDisplayData.setText("Display Data");
        menuDisplayData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDisplayDataActionPerformed(evt);
            }
        });
        jMenu2.add(menuDisplayData);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAnualTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnualTaxActionPerformed
        FormAdd fa = new FormAdd(annualTaxs);
        fa.setVisible(true);
    }//GEN-LAST:event_menuAnualTaxActionPerformed

    private void menuDisplayDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDisplayDataActionPerformed
        FormDisplay fd = new FormDisplay(annualTaxs);
        fd.setVisible(true);
    }//GEN-LAST:event_menuDisplayDataActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormMenu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAnualTax;
    private javax.swing.JMenuItem menuDisplayData;
    // End of variables declaration//GEN-END:variables
}
