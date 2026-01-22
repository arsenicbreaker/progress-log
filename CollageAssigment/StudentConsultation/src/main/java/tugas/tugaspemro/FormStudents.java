package tugas.tugaspemro;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import tugaspemro.kelas.ProgramStudi;
import tugaspemro.kelas.Students;

public class FormStudents extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormStudents.class.getName());
    // Menambahkan array
    ArrayList<ProgramStudi> programStudi = null;
    ArrayList<Students> students = null;
    
    public FormStudents(ArrayList<ProgramStudi> programStudi, ArrayList<Students> students) {
        initComponents();
        
        this.programStudi = programStudi;
        this.students = students;
        
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfieldNIM = new javax.swing.JTextField();
        bttnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaInfo = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtfieldNamaMahasiswa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxProgramStudi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bttnSimpan.setText("Simpan");
        bttnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSimpanActionPerformed(evt);
            }
        });

        txtareaInfo.setColumns(20);
        txtareaInfo.setRows(5);
        jScrollPane1.setViewportView(txtareaInfo);

        jLabel3.setText("Mahasiswa");

        jLabel1.setText("NIM");

        jLabel2.setText("Nama Mahasiswa");

        jLabel4.setText("Program Studi");

        cbxProgramStudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProgramStudiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnSimpan))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfieldNIM, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(txtfieldNamaMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(cbxProgramStudi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldNamaMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxProgramStudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(bttnSimpan)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxProgramStudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProgramStudiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProgramStudiActionPerformed

    private void bttnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSimpanActionPerformed
        Students mahasiswa = new Students(
                                          txtfieldNamaMahasiswa.getText(), 
                                          txtfieldNIM.getText(), 
                                          (ProgramStudi) cbxProgramStudi.getSelectedItem());
        
        students.add(mahasiswa);
        
        String print = "";
        for(Students mhs : students){
            print +=("Nama: " + mhs.getNama() + "\n"
                    + "NIM: " + mhs.getNIM() + "\n"
                    + "Program Studi:" + mhs.getProgramStudi().toString() + "\n"
                    + "====================================\n");
        }
        txtareaInfo.setText(print);
        
    }//GEN-LAST:event_bttnSimpanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultComboBoxModel<ProgramStudi> model = new DefaultComboBoxModel<>();
        
        for(ProgramStudi ps : programStudi){
            model.addElement(ps);
        }
        
        cbxProgramStudi.setModel(model);
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnSimpan;
    private javax.swing.JComboBox<ProgramStudi> cbxProgramStudi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtareaInfo;
    private javax.swing.JTextField txtfieldNIM;
    private javax.swing.JTextField txtfieldNamaMahasiswa;
    // End of variables declaration//GEN-END:variables
}
