package tugas.tugaspemro;

import java.util.ArrayList;
import tugaspemro.kelas.ProgramStudi;
import tugaspemro.kelas.Students;

public class FormMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMenu.class.getName());
    // Menambahkan array program studi dan mahasiswa
    public ArrayList<ProgramStudi> programStudi = new ArrayList<>();
    public ArrayList<Students> mahasiswa = new ArrayList<>();
    
    public FormMenu() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        addMenu = new javax.swing.JMenu();
        menuAddProgramStudi = new javax.swing.JMenuItem();
        menuAddStudents = new javax.swing.JMenuItem();
        menuAddKonsultasi = new javax.swing.JMenuItem();
        displayMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addMenu.setText("Add Menu");

        menuAddProgramStudi.setText("Add Program Studi");
        menuAddProgramStudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddProgramStudiActionPerformed(evt);
            }
        });
        addMenu.add(menuAddProgramStudi);

        menuAddStudents.setText("Add Students");
        menuAddStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddStudentsActionPerformed(evt);
            }
        });
        addMenu.add(menuAddStudents);

        menuAddKonsultasi.setText("Add Konsultasi");
        menuAddKonsultasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddKonsultasiActionPerformed(evt);
            }
        });
        addMenu.add(menuAddKonsultasi);

        jMenuBar1.add(addMenu);

        displayMenu.setText("Display");
        jMenuBar1.add(displayMenu);

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

    private void menuAddProgramStudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddProgramStudiActionPerformed
        FormProgramStudi fp = new FormProgramStudi(programStudi);
        fp.setVisible(true);
    }//GEN-LAST:event_menuAddProgramStudiActionPerformed

    private void menuAddKonsultasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddKonsultasiActionPerformed
        FormKonsultasi fk = new FormKonsultasi(mahasiswa);
        fk.setVisible(true);
    }//GEN-LAST:event_menuAddKonsultasiActionPerformed

    private void menuAddStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddStudentsActionPerformed
        FormStudents fs = new FormStudents(programStudi, mahasiswa);
        fs.setVisible(true);
    }//GEN-LAST:event_menuAddStudentsActionPerformed

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
    private javax.swing.JMenu addMenu;
    private javax.swing.JMenu displayMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAddKonsultasi;
    private javax.swing.JMenuItem menuAddProgramStudi;
    private javax.swing.JMenuItem menuAddStudents;
    // End of variables declaration//GEN-END:variables
}
