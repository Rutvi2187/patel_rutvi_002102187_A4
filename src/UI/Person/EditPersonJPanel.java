/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Person;

//import business.City;
//import business.Community;
//import business.House;
import business.MyNumericVerifier;
import business.Person;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rutvi Patel
 */
public class EditPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatientDetailsJPanel
     */
    private Person person;
   // private City city;
  //  private House haddress;
   // private Community ComName;
    private JPanel ProcessContainer;
    private Boolean isEdit = Boolean.FALSE;

    public EditPersonJPanel(JPanel ProcessContainer, Person person, Boolean isEdit) {
        initComponents();
        this.ProcessContainer = ProcessContainer;
        this.person = person;
       // this.city = city;
       // this.haddress = address;
       // this.ComName = comName;
        this.isEdit = isEdit;
        addVerifiers();
        populatePersonDetails();
        modifyTextFields(this.isEdit);
    }


    private void addVerifiers() {
        InputVerifier integerVerifier = new MyNumericVerifier();
        txtEAge.setInputVerifier(integerVerifier);
     
    }

    private void populatePersonDetails() {
        txtEName.setText(person.getPersonName());
        txtEAge.setText(String.valueOf(person.getAge()));
        //txtECity.setText(city.getCName());
       // txtEHAddress.setText(haddress.getHomeAddress());
       // txtECommunity.setText(ComName.getCommunityName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgeJLabel = new javax.swing.JLabel();
        txtEName = new javax.swing.JTextField();
        txtEAge = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        patientNameJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 215, 242));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        AgeJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AgeJLabel.setText("Age:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Person Details");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        patientNameJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        patientNameJLabel.setText("Name:");

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< ");
        backJButton.setBorder(new javax.swing.border.MatteBorder(null));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        editJButton.setBackground(new java.awt.Color(255, 255, 255));
        editJButton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        editJButton.setText("Edit");
        editJButton.setBorder(new javax.swing.border.MatteBorder(null));
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });

        saveJButton.setBackground(new java.awt.Color(255, 255, 255));
        saveJButton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        saveJButton.setText("Save");
        saveJButton.setBorder(new javax.swing.border.MatteBorder(null));
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AgeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(editJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {editJButton, saveJButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeJLabel))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveJButton))
                .addContainerGap(480, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {editJButton, saveJButton});

    }// </editor-fold>//GEN-END:initComponents

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        // TODO add your handling code here:
        modifyTextFields(true);
    }//GEN-LAST:event_editJButtonActionPerformed

    private void modifyTextFields(Boolean isEdit) {
        if (isEdit) {
            txtEName.setEnabled(true);
            txtEAge.setEnabled(true);
          //  txtECity.setEnabled(true);
            //txtEHAddress.setEnabled(true);
            //txtECommunity.setEnabled(true);
        } else {
            txtEName.setEnabled(false);
            txtEAge.setEnabled(false);
            //txtECity.setEnabled(false);
            //txtEHAddress.setEnabled(false);
           // txtECommunity.setEnabled(false);
        }
    }

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:

        if(txtEName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please Enter Your Name.");
        } 
        else if (checkBlankInput()) {
           person.setAge(Integer.parseInt(txtEAge.getText()));
            person.setPersonName(txtEName.getText());
           /* city.setCName(txtECity.getText());
            haddress.setHomeAddress(txtEHAddress.getText());
            ComName.setCommunityName(txtECommunity.getText());
            person.setCity(city);
            person.setHouse(haddress); 
            person.setCommunity2(ComName);
         */
            JOptionPane.showMessageDialog(this, "Person Details edited!!",
                    "Edit", JOptionPane.INFORMATION_MESSAGE);
            modifyTextFields(false);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter correct values", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveJButtonActionPerformed
    private Boolean checkBlankInput() {
        if (txtEAge.getText().length() == 0
                || txtEName.getText().length() == 0) {
            return false;
        } else {
            return true;
        }
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        ProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ProcessContainer.getLayout();
        layout.previous(ProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeJLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton editJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField txtEAge;
    private javax.swing.JTextField txtEName;
    // End of variables declaration//GEN-END:variables
}
