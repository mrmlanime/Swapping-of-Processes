/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddInput.java
 *
 * Created on Sep 5, 2010, 10:10:11 AM
 */

/*
 * MemorySimulationFrame.java
 * Author : LONGHAS, MARK RYAN M.
 * Created on Oct 3, 2010, 10:33:35 PM
 */


package com.longhas.view;

import com.longhas.data.Process;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YANIX_MRML
 */
public class ManageInput extends javax.swing.JDialog {

    private ArrayList<Process> processList;
    private int memorySize;
    private java.awt.Frame parentFrame;
    private boolean isRenew = false;
    private DefaultTableModel tableModel;

    /** Creates new form AddInput */
    public ManageInput(java.awt.Frame parent, boolean modal,ArrayList<Process> processList, int memorySize) {
        super(parent, modal);
        this.parentFrame = parent;
        initComponents();

        this.processList = processList;
        this.setLocationRelativeTo(parent);
        this.memorySize = memorySize;
        tableModel = (DefaultTableModel) processTable.getModel();
        displayDefaultInputs();
    }

    public ArrayList<Process> getProcessList(){
        return this.processList;
    }

    public int getMemorySize(){
        return this.memorySize;
    }

    private void displayDefaultInputs(){
        memorySizeSpinner.setValue(memorySize);
        displayProcessTable();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        processPane = new javax.swing.JScrollPane();
        processTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        memorySizeSpinner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        memoryEditButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Inputs");
        setResizable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Panel.background"), 8, true));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Panel.background"), 3, true), "Process Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        processTable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        processTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Description", "Size", "State"
            }
        ));
        processTable.getTableHeader().setFont(new java.awt.Font("Calibri",java.awt.Font.BOLD,14));
        processPane.setViewportView(processTable);

        deleteButton.setFont(new java.awt.Font("Calibri", 1, 14));
        deleteButton.setText("Delete Process");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Calibri", 1, 14));
        addButton.setText("Add Process");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Calibri", 1, 14));
        editButton.setText("Edit Process");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 1, 14));
        jButton2.setText("Renew All Process");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(processPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(processPane, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Panel.background"), 3, true), "Memory Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14));
        jLabel6.setText("Memory");

        memorySizeSpinner.setFont(new java.awt.Font("Calibri", 0, 14));
        memorySizeSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        memorySizeSpinner.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14));
        jLabel7.setText("bytes");

        memoryEditButton.setFont(new java.awt.Font("Calibri", 1, 14));
        memoryEditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/longhas/resources/pencil_16.png"))); // NOI18N
        memoryEditButton.setText("Edit");
        memoryEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryEditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memorySizeSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(memoryEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memorySizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(memoryEditButton)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Calibri", 1, 14));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/longhas/resources/01.png"))); // NOI18N
        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/longhas/resources/add.png"))); // NOI18N
        jLabel1.setText("Manage Input");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memoryEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryEditButtonActionPerformed
        // TODO add your handling code here:
        if(memoryEditButton.getText().equalsIgnoreCase("Edit")){
            memoryEditButton.setText("Set");
            memorySizeSpinner.setEnabled(true);
        }else{
            try{
                if(Integer.parseInt(memorySizeSpinner.getValue().toString())>=10){
                    this.memorySize = Integer.parseInt(memorySizeSpinner.getValue().toString());
                }else{
                    JOptionPane.showMessageDialog(parentFrame, "Advisable to put the Memory Size at least 10 bytes", "Memory Settings", JOptionPane.INFORMATION_MESSAGE);
                }
                memoryEditButton.setText("Edit");
                memorySizeSpinner.setEnabled(false);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(parentFrame, "Error integer input " +  e.getMessage(), "Memory Settings", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_memoryEditButtonActionPerformed


    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Random random = new Random();
        int red = random.nextInt(253) + 1;
        int green = random.nextInt(253) + 1;
        int blue = random.nextInt(253) + 1;

        if(memorySize > 0){

            AddProcess addProcess = new AddProcess(parentFrame,true,memorySize);
            addProcess.setVisible(true);
            Process newProcess = addProcess.getNewProcess();

            if(newProcess!=null){
                newProcess.setId(processList.size() + 1);
                newProcess.setColor(new Color(red,green,blue));
                processList.add(newProcess);
                tableModel.addRow(new Object[]{newProcess.getId(),newProcess.getProcessName(),newProcess.getMemorySize(),newProcess.getState()});
            }
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int index = processTable.getSelectedRow();
        if(index>=0 ){


            for(int i=index+1; i<processList.size();i++){
                Process process = processList.get(i);
                process.setId(i);
                processList.set(i, process);
                tableModel.setValueAt(process.getId(), i, 0);

            }
            tableModel.removeRow(index);
            processList.remove(index);
        }


    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int index = processTable.getSelectedRow();

        if(index>=0 ){

                Process selectedProcess = processList.get(index);
                EditProcess edit = new EditProcess(parentFrame,true,memorySize,selectedProcess);
                edit.setVisible(true);
                selectedProcess = edit.getUpdatedProcess();

                if(selectedProcess!=null){

                    processList.set(index, selectedProcess);
                    tableModel.setValueAt(selectedProcess.getProcessName(), index, 1);
                    tableModel.setValueAt(selectedProcess.getMemorySize(), index, 2);
                    tableModel.setValueAt(selectedProcess.getState(), index, 3);
                }


       }
           
    }//GEN-LAST:event_editButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(isValidProcess()){
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "One of the processess exceeds the limit of the memory size", "Manage Input",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(processList.size()>0){
            int choice = JOptionPane.showConfirmDialog(this, "Do you want to set all processess in New state", "Renew Processess", JOptionPane.YES_NO_OPTION);
            if(choice==JOptionPane.YES_OPTION){

                JOptionPane.showMessageDialog(this, "You have renew all the processess", "Renew Process", JOptionPane.INFORMATION_MESSAGE);

                isRenew = true;
                for(int i=0;i<processList.size();i++){

                   Process process = processList.get(i);
                   process.setState("New");
                   processList.set(i, process);

               }

               displayProcessTable();

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clearProcessTable(){
        if(!processList.isEmpty() && tableModel.getRowCount() > 0){
            for(int i=tableModel.getRowCount()-1;i>=0;i--){
                tableModel.removeRow(i);
            }
        }
    }

    private void displayProcessTable(){

        clearProcessTable();

        for(Process process : processList){
            tableModel.addRow(new Object[]{process.getId(),process.getProcessName(),process.getMemorySize(),process.getState()});
        }


    }

    private boolean isValidProcess(){

        for(Process process : processList){
            if(process.getMemorySize() > memorySize){
                return false;
            }
        }

        return true;

    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton memoryEditButton;
    private javax.swing.JSpinner memorySizeSpinner;
    private javax.swing.JScrollPane processPane;
    private javax.swing.JTable processTable;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the isRenew
     */
    public boolean isIsRenew() {
        return isRenew;
    }

   
}
