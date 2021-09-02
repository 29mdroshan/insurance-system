/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import static insurance.cMenu1.id;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ROSHAN
 */
public class cMenu2 extends javax.swing.JInternalFrame {
       String comboBox1text;
       String comboBox2text;
       String comboBox3text;
       String BItems;
       String Item;
    /**
     * Creates new form cMenu2
     */
    public cMenu2() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        connect();
        
        fillComboA();
       
    }

    String arr [];
    
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    DefaultTableModel df;
    
    
    public void connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance management system","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
   
     
    
     private void fillComboA(){
        try{
            
            String sql = "SELECT DISTINCT cat_name  FROM policy ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while(rs.next()){
                String AItems = rs.getString("cat_name");          
                cat.addItem(AItems);
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()); 
        }
    }
     
     
     
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        premium = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        c_id = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        primium = new javax.swing.JTextField();
        sum = new javax.swing.JTextField();
        cat = new javax.swing.JComboBox<>();
        sub_cat = new javax.swing.JComboBox<>();
        company = new javax.swing.JComboBox<>();
        pol_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel10.setText("jLabel10");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        premium.setBackground(new java.awt.Color(255, 255, 204));
        premium.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(17, 40, 70)));
        premium.setPreferredSize(new java.awt.Dimension(820, 348));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setText("Customer ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setText("Policy ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setText("Sub-Category");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setText("Company_Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel8.setText("Category");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel9.setText("Annual_Primium");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel11.setText("Sum_Assured");

        c_id.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        c_id.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 51)));
        c_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_idActionPerformed(evt);
            }
        });

        username.setEditable(false);
        username.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 51)));

        primium.setEditable(false);
        primium.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        primium.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 51)));

        sum.setEditable(false);
        sum.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sum.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 51)));
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });

        cat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select  Item--" }));
        cat.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 51)));
        cat.setFocusCycleRoot(true);
        cat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catMouseClicked(evt);
            }
        });
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });

        sub_cat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sub_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selected Item--" }));
        sub_cat.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 51)));
        sub_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_catActionPerformed(evt);
            }
        });

        company.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        company.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Item--" }));
        company.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 51)));
        company.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companyMouseClicked(evt);
            }
        });
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });

        pol_id.setEditable(false);
        pol_id.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pol_id.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 51)));

        javax.swing.GroupLayout premiumLayout = new javax.swing.GroupLayout(premium);
        premium.setLayout(premiumLayout);
        premiumLayout.setHorizontalGroup(
            premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, premiumLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c_id, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cat, 0, 160, Short.MAX_VALUE)
                    .addComponent(pol_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(41, 41, 41)
                .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(premiumLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(premiumLayout.createSequentialGroup()
                        .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(primium)
                            .addComponent(sub_cat, 0, 160, Short.MAX_VALUE)
                            .addComponent(company, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        premiumLayout.setVerticalGroup(
            premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(premiumLayout.createSequentialGroup()
                .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(premiumLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(c_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(premiumLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(sub_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))))
                .addGap(50, 50, 50)
                .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(primium, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pol_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(premiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 33)); // NOI18N
        jLabel1.setText("Apply Policy");

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 25)); // NOI18N
        jButton1.setText("Apply");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), java.awt.Color.gray, new java.awt.Color(0, 0, 51), java.awt.Color.darkGray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(premium, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(premium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumActionPerformed

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here
                  String BItems = null;
                  int j=0;
                  cat.disable();
                         //fill second combo box
                     comboBox1text = String.valueOf(cat.getSelectedItem());
              
                     
                
        
        if (!comboBox1text.isEmpty() || comboBox1text != null) {
          
            // get data from DataBase with Distinct 

            try {
                
                String sql = "SELECT Distinct sub_cat_name FROM policy WHERE cat_name = '"
                        + comboBox1text + "' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                
                while(rs.next()){
                   BItems = rs.getString("sub_cat_name");                   
                   sub_cat.addItem(BItems);
                    
                }
                
                
                
                
                
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()); 
            }
                 
                                                 
                         
        
            
        }
    }//GEN-LAST:event_catActionPerformed

    private void sub_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_catActionPerformed
                   
         int itemCount = company.getItemCount();    
        for(int i=0;i<itemCount;i++){
            company.removeItemAt(0);
        }
             comboBox2text = String.valueOf(sub_cat.getSelectedItem());
        if (!comboBox2text.isEmpty() || comboBox2text != null) { 
            try{
            
             String sql = "SELECT Distinct company FROM policy where sub_cat_name = '"
                        + comboBox2text +"' AND cat_name='" 
                        + comboBox1text +"'";
                
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();        
                while(rs.next()){
                    String CItems = rs.getString("company");
                    company.addItem(CItems);
        }}
            catch(Exception e){
                
            }
        
        }
        
    }//GEN-LAST:event_sub_catActionPerformed

    private void companyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companyMouseClicked
        // TODO add your handling code here:  
        
        String value1=cat.getSelectedItem().toString();
        String value2=sub_cat.getSelectedItem().toString();
        String value3=company.getSelectedItem().toString();
        try{
            String sql = "select pol_id,sum_insured,annual_pre from policy where cat_name=? and sub_cat_name=? and company=?" ;    
            pst=con.prepareStatement(sql);
            pst.setString(1,value1);
            pst.setString(2,value2);
            pst.setString(3,value3);
            rs=pst.executeQuery();
             if(rs.next())
            {
                 String add1=rs.getString("pol_id");
                pol_id.setText(add1);
                String add2=rs.getString("annual_pre");
                primium.setText(add2);
                String add3=rs.getString("sum_insured");
                sum.setText(add3);
               }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_companyMouseClicked

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_companyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try{

            String aid = c_id.getText();
            String auser = username.getText();
            String  apol_id = pol_id.getText();
            String value1=cat.getSelectedItem().toString();
            String value2=sub_cat.getSelectedItem().toString();
            String value3=company.getSelectedItem().toString();

            String asum= sum.getText();
            String aann = primium.getText();

            pst = con.prepareStatement("INSERT INTO `apply_policy`(`id`, `username`, `pol_id`, `category`, `sub_cat`, `company`, `sum`, `annual_Pre`) VALUES (?,?,?,?,?,?,?,?)");

            pst.setString(1,aid);
            pst.setString(2,auser);
            pst.setString(3,apol_id);
            pst.setString(4,value1);
            pst.setString(5,value2);
            pst.setString(6,value3);
            pst.setString(7,asum);
            pst.setString(8,aann);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"policy applied");

            c_id.setText("");
            username.setText("");
            pol_id.setText("");
            sum.setText("");
            primium.setText("");
            cat.setSelectedIndex(0);
            sub_cat.setSelectedIndex(0);
            company.getItemAt(0);

            c_id.requestFocus();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"you have already applied");
             c_id.setText("");
            username.setText("");
            pol_id.setText("");
            sum.setText("");
            primium.setText("");
            cat.setSelectedIndex(0);
            sub_cat.getItemAt(0);
            company.getItemAt(0);
            this.dispose();
        cMenu1 frm = new cMenu1();
        frm.setVisible(true);
        cMenu2 f= new cMenu2();
        f.hide();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void c_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_idActionPerformed

    private void catMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_catMouseClicked
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField c_id;
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JComboBox<String> company;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pol_id;
    private javax.swing.JPanel premium;
    private javax.swing.JTextField primium;
    private javax.swing.JComboBox<String> sub_cat;
    private javax.swing.JTextField sum;
    public static javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
