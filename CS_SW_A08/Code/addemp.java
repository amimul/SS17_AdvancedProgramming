/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_salary;
import java.io.*;
import java.awt.*;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.util.calendar.BaseCalendar.Date;
//import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 *
 * @author Ab Tawab
 */
public class addemp extends javax.swing.JFrame {
Connection con;
ResultSet rs;
Statement pst;
PreparedStatement prst;
    /**
     * Creates new form addemp
     */
    public addemp() {
        initComponents();
        Toolkit toolkit =getToolkit();
     Dimension size=toolkit.getScreenSize();
    int getHeight;
     setLocation(size.width/2 - getWidth()/2 , size.height/2 - getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tlastname = new javax.swing.JTextField();
        tfirstname = new javax.swing.JTextField();
        tdepartement = new javax.swing.JTextField();
        tdob = new javax.swing.JTextField();
        tfathername = new javax.swing.JTextField();
        tphonenumber = new javax.swing.JTextField();
        tcity = new javax.swing.JTextField();
        taddress = new javax.swing.JTextField();
        tworktime = new javax.swing.JTextField();
        tdegree = new javax.swing.JTextField();
        tcontry = new javax.swing.JTextField();
        tstatus = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        badd = new javax.swing.JButton();
        rmale = new javax.swing.JRadioButton();
        rfemale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        bclose = new javax.swing.JButton();
        cclear = new javax.swing.JButton();
        tposition = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        regback = new javax.swing.JButton();
        tsalary = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tlastname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tfirstname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tdepartement.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tdob.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tfathername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tphonenumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tcity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        taddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tworktime.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tworktime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tworktimeActionPerformed(evt);
            }
        });

        tdegree.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tcontry.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tstatus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        temail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temailActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Firstname");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Lastname :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Fathername :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Date of Birth :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setText("Departement :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setText("Phone Number :");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setText("Work Time :");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel12.setText("Status :");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel13.setText("Email :");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel14.setText("Address :");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel15.setText("City :");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel16.setText("Contry :");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel17.setText("Edu_Degree :");

        badd.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        badd.setText("Add Record");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });

        buttonGroup1.add(rmale);
        rmale.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        rmale.setSelected(true);
        rmale.setText("Male");

        buttonGroup1.add(rfemale);
        rfemale.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        rfemale.setText("Female");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("Gender :");

        bclose.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        bclose.setText("Close");
        bclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcloseActionPerformed(evt);
            }
        });

        cclear.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        cclear.setText("Clear");
        cclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cclearActionPerformed(evt);
            }
        });

        tposition.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Position");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel7.setText("Employee Regestration Form ");

        regback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_salary/image/prev.png"))); // NOI18N
        regback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbackActionPerformed(evt);
            }
        });

        tsalary.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel18.setText("Salary :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regback, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(badd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bclose)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cclear))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rmale)
                                    .addGap(28, 28, 28)
                                    .addComponent(rfemale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tposition)
                                        .addComponent(tphonenumber)
                                        .addComponent(tdepartement)
                                        .addComponent(tdob)
                                        .addComponent(tfathername)
                                        .addComponent(tlastname)
                                        .addComponent(tfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tstatus, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tworktime, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tdegree, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tcontry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tcity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(taddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tsalary))))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regback, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfathername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tdob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tposition, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tdepartement, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcontry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tdegree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tworktime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rmale)
                        .addComponent(rfemale)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(badd)
                    .addComponent(bclose)
                    .addComponent(cclear))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        // TODO add your handling code here:
        try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con=DriverManager.getConnection("jdbc:mysql://localhost/test?username=root & password=");
        
        }catch(Exception e){
    
        }
    
        String fn=tfirstname.getText();
        String ln=tlastname.getText();
        String fan=tfathername.getText();
       String db=tdob.getText();
        int gender=1;
        if(rfemale.isSelected()){
        gender=0;
        }
        if(rmale.isSelected()){
        
          gender=1;        
        }
        String pos=tposition.getText();
        String dep=tdepartement.getText();
        String ph=tphonenumber.getText();
        String em=temail.getText();
        String add=taddress.getText();
        String ci=tcity.getText();
        String cont=tcontry.getText();
        String edu=tdegree.getText();
       String wt=tworktime.getText();
       String st=tstatus.getText();
       String sa=tsalary.getText();
        try{
            pst=con.createStatement();
             pst.execute("INSERT INTO emp_info (Employee_Id,firstname,lastname,fathername,dob,position,gender,department,phone_number,email,address,city,country,work_time,edu_degree,status,basic_salary) values(null,'"+fn+"','"+ln+"','"+fan+"','"+db+"','"
                     +pos+"','"+gender+"','"+dep+"','"+ph+"','"+em+"','"+add+"','"+ci+"','"+cont+"','"+wt+"','"+edu+"','"+st+"','"+sa+"')");
        
        JOptionPane.showMessageDialog(null, "Data is Inserted Succesfuly");
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, "catch block");
        
        
    
  
    }//GEN-LAST:event_baddActionPerformed
    }    
    private void bcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_bcloseActionPerformed

    private void cclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cclearActionPerformed
        // TODO add your handling code here:
     tfirstname.setText("");
      tlastname.setText("");
      tfathername.setText("");
       tdob.setText("");
        tposition.setText("");
        tdepartement.setText("");
        tphonenumber.setText("");
        temail.setText("");
        taddress.setText("");
        tcity.setText("");
        tcontry.setText("");
        tdegree.setText("");
        tsalary.setText("");
        tworktime.setText("");
        tstatus.setText("");
      
        
        
    }//GEN-LAST:event_cclearActionPerformed

    private void battachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_battachActionPerformed
        // TODO add your handling code here:
/*JFileChooser ch=new JFileChooser();
ch.showOpenDialog(null);
file f=ch.getSelectedFile();*/
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_battachActionPerformed

    private void temailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temailActionPerformed

    private void tworktimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tworktimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tworktimeActionPerformed

    private void regbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbackActionPerformed
        mianmanu m=new mianmanu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regbackActionPerformed

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
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new addemp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badd;
    private javax.swing.JButton bclose;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cclear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton regback;
    private javax.swing.JRadioButton rfemale;
    private javax.swing.JRadioButton rmale;
    private javax.swing.JTextField taddress;
    private javax.swing.JTextField tcity;
    private javax.swing.JTextField tcontry;
    private javax.swing.JTextField tdegree;
    private javax.swing.JTextField tdepartement;
    private javax.swing.JTextField tdob;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tfathername;
    private javax.swing.JTextField tfirstname;
    private javax.swing.JTextField tlastname;
    private javax.swing.JTextField tphonenumber;
    private javax.swing.JTextField tposition;
    private javax.swing.JTextField tsalary;
    private javax.swing.JTextField tstatus;
    private javax.swing.JTextField tworktime;
    // End of variables declaration//GEN-END:variables

}


