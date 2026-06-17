package latihanuas.annualtaxsystem;

// payment date gabisa diinput oleh user karena default hari ini

import Kelas.EriBuldingTax;
import Kelas.EriTax;
import Kelas.EriVehicleTax;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormAdd extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormAdd.class.getName());
    ArrayList<EriTax> annualTaxs;
    
    public FormAdd( ArrayList<EriTax> annualTaxs) {
        initComponents();
         this.annualTaxs = annualTaxs;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTax = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spinnerTaxDueDate = new javax.swing.JSpinner();
        radioButtonVehical = new javax.swing.JRadioButton();
        radioButtonBuilding = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        spinnerProductionYear = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        textFieldRegistrationNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spinnerProductionSelingPrice = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        textFieldTaxObjectNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        spinnerPropertySize = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        spinnerBuildingSize = new javax.swing.JSpinner();
        buttonSave = new javax.swing.JButton();
        buttonSaveToFile = new javax.swing.JButton();
        buttonOpenFIle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("Address");

        textFieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAddressActionPerformed(evt);
            }
        });

        jLabel3.setText("ID Resident");

        jLabel4.setText("Tax Due Date");

        spinnerTaxDueDate.setModel(new javax.swing.SpinnerDateModel());

        buttonGroupTax.add(radioButtonVehical);
        radioButtonVehical.setText("Vehicle Tax");
        radioButtonVehical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonVehicalActionPerformed(evt);
            }
        });

        buttonGroupTax.add(radioButtonBuilding);
        radioButtonBuilding.setText("Building Tax");

        jLabel5.setText("Production Year");

        spinnerProductionYear.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.YEAR));

        jLabel6.setText("Registration Number");

        textFieldRegistrationNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldRegistrationNumberActionPerformed(evt);
            }
        });

        jLabel7.setText("Seling Price");

        spinnerProductionSelingPrice.setModel(new javax.swing.SpinnerNumberModel(1000.0d, null, null, 500.0d));

        jLabel8.setText("Tax Object Number");

        textFieldTaxObjectNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTaxObjectNumberActionPerformed(evt);
            }
        });

        jLabel9.setText("Property Size");

        spinnerPropertySize.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 0.5d));

        jLabel10.setText("Buinding Size");

        spinnerBuildingSize.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 0.5d));

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonSaveToFile.setText("Save to File");
        buttonSaveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveToFileActionPerformed(evt);
            }
        });

        buttonOpenFIle.setText("Open File");
        buttonOpenFIle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOpenFIleActionPerformed(evt);
            }
        });

        textAreaInfo.setColumns(20);
        textAreaInfo.setRows(5);
        jScrollPane1.setViewportView(textAreaInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSaveToFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonOpenFIle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioButtonVehical)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radioButtonBuilding))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textFieldID)
                                            .addComponent(textFieldName)
                                            .addComponent(textFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerTaxDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spinnerProductionSelingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textFieldRegistrationNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                            .addComponent(spinnerProductionYear))))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldTaxObjectNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(spinnerPropertySize)
                                    .addComponent(spinnerBuildingSize))))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(spinnerTaxDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonVehical)
                    .addComponent(radioButtonBuilding))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spinnerProductionYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTaxObjectNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldRegistrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(spinnerProductionSelingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(spinnerBuildingSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(spinnerPropertySize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonSave)
                .addGap(18, 18, 18)
                .addComponent(buttonSaveToFile)
                .addGap(18, 18, 18)
                .addComponent(buttonOpenFIle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAddressActionPerformed

    private void radioButtonVehicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonVehicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonVehicalActionPerformed

    private void textFieldRegistrationNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldRegistrationNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldRegistrationNumberActionPerformed

    private void textFieldTaxObjectNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTaxObjectNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTaxObjectNumberActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        EriTax tax = null;
        
        Date taxDueDate = (Date) spinnerTaxDueDate.getValue();
        LocalDate localTaxDueDate = taxDueDate.toInstant()
                                                .atZone(ZoneId.systemDefault())
                                                .toLocalDate();
        
        if(radioButtonVehical.isSelected()){
            Date productionYear = (Date) spinnerProductionYear.getValue();
            LocalDate localProductionYear = productionYear.toInstant()
                                                .atZone(ZoneId.systemDefault())
                                                .toLocalDate();
            
            tax = new EriVehicleTax(
                                   textFieldID.getText(),
                                   textFieldName.getText(),
                                   textFieldAddress.getText(),
                                   localTaxDueDate,
                                   LocalDate.now(),
                                   localProductionYear,
                                   textFieldRegistrationNumber.getText(),
                                   (double) spinnerProductionSelingPrice.getValue());
        } else if(radioButtonBuilding.isSelected()){
            tax = new EriBuldingTax(
                                   textFieldID.getText(),
                                   textFieldName.getText(),
                                   textFieldAddress.getText(),
                                   localTaxDueDate,
                                   LocalDate.now(),
                                   textFieldTaxObjectNumber.getText(),
                                   (double) spinnerPropertySize.getValue(),
                                   (double) spinnerBuildingSize.getValue());
        }
        
        annualTaxs.add(tax);
        
        String print = "";
        for(EriTax annualTax : annualTaxs){
            
            print +=  annualTax.toString() + "\n"
                    + "=============================\n";
            
            System.out.println("latihanuas.annualtaxsystem.FormAdd.buttonSaveActionPerformed()" + print);
        }
        
        textAreaInfo.setText(print);
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonSaveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveToFileActionPerformed
        if(annualTaxs.size() > 0){
            try (FileOutputStream fos = new FileOutputStream("AnnualTax.ser");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                
                oos.writeObject(annualTaxs); // simpan seluruh ArrayList
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan😁");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Data gagal disimpan");
            }
        }else if (annualTaxs.isEmpty()){
            JOptionPane.showMessageDialog(this, "Tidak ada data yang disimpan!");
        }
        
    }//GEN-LAST:event_buttonSaveToFileActionPerformed

    private void buttonOpenFIleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOpenFIleActionPerformed
        
        try (
                FileInputStream fis = new FileInputStream("AnnualTax.ser");
                ObjectInputStream ois = new ObjectInputStream(fis) {
                }
                ){
            ArrayList<EriTax> taxs = (ArrayList)ois.readObject();
            
            for(EriTax tax : taxs){
                annualTaxs.add(tax);
            }
            
            String print = "";
            for(EriTax annualTax : annualTaxs){
                print += annualTax.toString() + "\n"
                        + "======================================\n";
                
            }
            textAreaInfo.setText(print);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data gagal dimuat, " + e.getMessage());
    }

    }//GEN-LAST:event_buttonOpenFIleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTax;
    private javax.swing.JButton buttonOpenFIle;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSaveToFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioButtonBuilding;
    private javax.swing.JRadioButton radioButtonVehical;
    private javax.swing.JSpinner spinnerBuildingSize;
    private javax.swing.JSpinner spinnerProductionSelingPrice;
    private javax.swing.JSpinner spinnerProductionYear;
    private javax.swing.JSpinner spinnerPropertySize;
    private javax.swing.JSpinner spinnerTaxDueDate;
    private javax.swing.JTextArea textAreaInfo;
    private javax.swing.JTextField textFieldAddress;
    private javax.swing.JTextField textFieldID;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldRegistrationNumber;
    private javax.swing.JTextField textFieldTaxObjectNumber;
    // End of variables declaration//GEN-END:variables
}
