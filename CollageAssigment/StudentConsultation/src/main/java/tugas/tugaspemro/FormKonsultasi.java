package tugas.tugaspemro;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import tugaspemro.kelas.Konsultasi;
import tugaspemro.kelas.Students;

public class FormKonsultasi extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormKonsultasi.class.getName());
    // Menambahkan Array
    ArrayList<Students> mahasiswa = null;
    
    public FormKonsultasi(ArrayList<Students> mahasiswa) {
        initComponents();
        
        this.mahasiswa = mahasiswa;
 
        setLocationRelativeTo(this);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaInfo = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinnerDate = new javax.swing.JSpinner();
        spinnerIPK = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        cbxMahasiswa = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaSaran = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtareaMasalah = new javax.swing.JTextArea();

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

        jLabel3.setText("Konsultasi");

        jLabel1.setText("IPK");

        jLabel2.setText("Tanggal");

        jLabel4.setText("Masalah");

        jLabel5.setText("Saran");

        spinnerDate.setModel(new javax.swing.SpinnerDateModel());

        spinnerIPK.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        jLabel6.setText("Mahasiswa");

        cbxMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMahasiswaActionPerformed(evt);
            }
        });

        txtareaSaran.setColumns(20);
        txtareaSaran.setRows(5);
        jScrollPane2.setViewportView(txtareaSaran);

        txtareaMasalah.setColumns(20);
        txtareaMasalah.setRows(5);
        jScrollPane3.setViewportView(txtareaMasalah);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnSimpan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cbxMahasiswa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spinnerDate)
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spinnerIPK, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinnerDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(spinnerIPK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(bttnSimpan)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSimpanActionPerformed

        Date tanggal = (Date) spinnerDate.getValue();
        LocalDate date = tanggal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        Konsultasi konsul = new Konsultasi(
                                           date, 
                                           (double)spinnerIPK.getValue(),
                                            txtareaMasalah.getText(),
                                            txtareaSaran.getText());
        
        mahasiswa.get(cbxMahasiswa.getSelectedIndex()).AddKonsultasi(konsul);
        
        String print = "";
        for(Students mhs : mahasiswa){
            print +=("Nama: " + mhs.getNama() + "\n"
                    + "NIM: " + mhs.getNIM() + "\n"
                    + "Program Studi: " + mhs.getProgramStudi().toString() + "\n"
                    + "------------------------------------\n"
                    + "Konsultasi: \n" + mhs.PrintKonsul());
        }
        
        txtareaInfo.setText(print);
    }//GEN-LAST:event_bttnSimpanActionPerformed

    private void cbxMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMahasiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMahasiswaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultComboBoxModel<Students> model = new DefaultComboBoxModel<>();
        
        for(Students maha : mahasiswa){
            model.addElement(maha);
        }
        
        cbxMahasiswa.setModel(model);
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnSimpan;
    private javax.swing.JComboBox<Students> cbxMahasiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spinnerDate;
    private javax.swing.JSpinner spinnerIPK;
    private javax.swing.JTextArea txtareaInfo;
    private javax.swing.JTextArea txtareaMasalah;
    private javax.swing.JTextArea txtareaSaran;
    // End of variables declaration//GEN-END:variables
}
