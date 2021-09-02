/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ROSHAN
 */
public class Menu3 extends javax.swing.JInternalFrame {

    String comboBox1text;
    /**
     * Creates new form Menu3
     */
    public Menu3() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        connect();
        load();
        
        fillComboA();
        
    }
    
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
    
    
    
    public void load()
    {
        int a;
        try {
            pst = con.prepareStatement("select * from policy");
            ResultSet rs = pst.executeQuery();
            
            
            ResultSetMetaData rd =rs.getMetaData();
            a =rd.getColumnCount();
            
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            while(rs.next()){
                Vector v2= new Vector();
                for(int i=1;i<=a;i++){
                    v2.add(rs.getString("pol_id"));
                    v2.add(rs.getString("cat_name"));
                    v2.add(rs.getString("sub_cat_name"));
                    v2.add(rs.getString("company"));
                     v2.add(rs.getString("sum_insured"));
                      v2.add(rs.getString("annual_pre"));
                    
                }
                df.addRow(v2);
            }
                    } catch (SQLException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
       
    
     
    private void fillComboA(){
        try{
            
            String sql = "SELECT DISTINCT name FROM category ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while(rs.next()){
                String AItems = rs.getString("name");          
                box1.addItem(AItems);
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

        jPanel2 = new javax.swing.JPanel();
        pol_d = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pol_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        company = new javax.swing.JTextField();
        sum_insured = new javax.swing.JTextField();
        annual_pre = new javax.swing.JTextField();
        cat_name = new javax.swing.JTextField();
        sub_cat_name = new javax.swing.JTextField();
        box1 = new javax.swing.JComboBox<>();
        box2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(860, 550));

        pol_d.setBackground(new java.awt.Color(255, 255, 204));
        pol_d.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Policy_id");

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cat_Name");

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Sub_Cat_Name");

        pol_id.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pol_id.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Insurance company");

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Sum_Insured");

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Annual_premium");

        company.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        company.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        sum_insured.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sum_insured.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        annual_pre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        annual_pre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        cat_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cat_name.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        cat_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat_nameActionPerformed(evt);
            }
        });

        sub_cat_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sub_cat_name.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        sub_cat_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_cat_nameActionPerformed(evt);
            }
        });

        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Item--" }));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        box2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Item--" }));
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pol_dLayout = new javax.swing.GroupLayout(pol_d);
        pol_d.setLayout(pol_dLayout);
        pol_dLayout.setHorizontalGroup(
            pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pol_dLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pol_dLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(80, 80, 80)
                        .addComponent(pol_id, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pol_dLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(66, 66, 66)
                        .addComponent(cat_name, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pol_dLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(box2, 0, 130, Short.MAX_VALUE)
                            .addComponent(sub_cat_name))))
                .addGroup(pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pol_dLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pol_dLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)))
                .addGroup(pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annual_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum_insured, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pol_dLayout.setVerticalGroup(
            pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pol_dLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(pol_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pol_dLayout.createSequentialGroup()
                        .addGroup(pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(31, 31, 31)
                .addGroup(pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(sum_insured, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cat_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pol_dLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pol_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(annual_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pol_dLayout.createSequentialGroup()
                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(sub_cat_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Pristina", 1, 35)); // NOI18N
        jLabel1.setText("Policy");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), java.awt.Color.gray, new java.awt.Color(102, 102, 0), java.awt.Color.darkGray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton2.setText("Edit");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), java.awt.Color.gray, new java.awt.Color(102, 102, 0), java.awt.Color.darkGray));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), java.awt.Color.gray, new java.awt.Color(102, 102, 0), java.awt.Color.darkGray));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), java.awt.Color.gray, new java.awt.Color(102, 102, 0), java.awt.Color.darkGray));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Poilcy_ID", "Cat_Name", "Sub_Cat_Name", "Insurance_Company", "Sum_Insured", "Annual_Premium"
            }
        ));
        jTable1.setRowHeight(17);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pol_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(20, 20, 20))
                    .addComponent(pol_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         df =(DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow ();
        
        int bid = Integer.parseInt(df.getValueAt(selected,0).toString());
        
         String pol_pid = pol_id.getText();
           String pol_catname = cat_name.getText();
           String pol_subcatname = sub_cat_name.getText();
           String pol_company= company.getText();
           String pol_sum_insured= sum_insured.getText();
           String pol_annual_pre= annual_pre.getText();
         
        
        try {
            pst = con.prepareStatement("UPDATE policy SET pol_id=?,cat_name=?,sub_cat_name=?,company=?,sum_insured=?,annual_pre=? WHERE pol_id=?");
            pst.setString(1,pol_pid);
            pst.setString(2,pol_catname);
            pst.setString(3,pol_subcatname);
             pst.setString(4,pol_company);
             pst.setString(5,pol_sum_insured);
             pst.setString(6,pol_annual_pre);
             pst.setInt(7,bid);
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"policy updated");
            
            pol_id.setText("");
            cat_name.setText("");
            sub_cat_name.setText("");
            company.setText("");
            sum_insured.setText("");
            annual_pre.setText("");
             box1.getItemAt(0);
              box2.getItemAt(0);
            
            pol_id.requestFocus();
            load();
             jButton1.setEnabled(true);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this,"Enter a valid data \n\n Check  Policy_ID , Sum_Insured ,Annual_Premium  Should be Integer ");
            
            
            pol_id.setText("");
            cat_name.setText("");
            sub_cat_name.setText("");
            company.setText("");
            sum_insured.setText("");
            annual_pre.setText("");
             box1.setSelectedIndex(0);
              box2.getItemAt(0);
           
            pol_id.requestFocus();
            jButton1.setEnabled(true);
        }

        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{
            
           String pol_pid = pol_id.getText();
           String pol_catname = cat_name.getText();
           String pol_subcatname = sub_cat_name.getText();
           String pol_company= company.getText();
           String pol_sum_insured= sum_insured.getText();
           String pol_annual_pre= annual_pre.getText();
            
            
            
            pst = con.prepareStatement("INSERT INTO policy(pol_id, cat_name, sub_cat_name, company, sum_insured, annual_pre) VALUES (?,?,?,?,?,?)");
            
            
            pst.setString(1,pol_pid);
            pst.setString(2,pol_catname);
            pst.setString(3,pol_subcatname);
            pst.setString(4,pol_company);
             pst.setString(5,pol_sum_insured);
              pst.setString(6,pol_annual_pre);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"policy addedd");
            
            pol_id.setText("");
            cat_name.setText("");
            sub_cat_name.setText("");
            company.setText("");
            sum_insured.setText("");
            annual_pre.setText("");
             box1.setSelectedIndex(0);
              box2.getItemAt(0);
           
            pol_id.requestFocus();
            load();
        } catch(Exception e){
            JOptionPane.showMessageDialog(this,"Enter a valid data \n\n Check Policy_ID , Sum_Insured ,Annual_Premium Should be Integer ");
            
            
            pol_id.setText("");
            cat_name.setText("");
            sub_cat_name.setText("");
            company.setText("");
            sum_insured.setText("");
            annual_pre.setText("");
             box1.setSelectedIndex(0);
              box2.getItemAt(0);
           
            pol_id.requestFocus();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cat_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cat_nameActionPerformed

    private void sub_cat_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_cat_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub_cat_nameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          
         df =(DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow ();
        
        int bid = Integer.parseInt(df.getValueAt(selected,0).toString());
        pol_id.setText(df.getValueAt(selected,0).toString());
        cat_name.setText(df.getValueAt(selected,1).toString());
        sub_cat_name.setText(df.getValueAt(selected,2).toString());
        company.setText(df.getValueAt(selected,3).toString());
        sum_insured.setText(df.getValueAt(selected,4).toString());
        annual_pre.setText(df.getValueAt(selected,5).toString());
        
        jButton1.setEnabled(false);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        df =(DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow ();
        
        int bid = Integer.parseInt(df.getValueAt(selected,0).toString());
        
        
        try {
            pst = con.prepareStatement("delete from policy where pol_id =?");
           
             pst.setInt(1,bid);
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"sub_category deleted");
            
            pol_id.setText("");
            cat_name.setText("");
            sub_cat_name.setText("");
            company.setText("");
            sum_insured.setText("");
             annual_pre.setText("");
           
             box1.setSelectedIndex(0);
             
               pol_id.requestFocus();
            load();
             jButton1.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         pol_id.setText("");
            cat_name.setText("");
            sub_cat_name.setText("");
            company.setText("");
            sum_insured.setText("");
             annual_pre.setText("");
              box1.setSelectedIndex(0);
               
            pol_id.requestFocus();
            load();
             jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        // TODO add your handling code here:
        
        Object s = box1.getSelectedItem();
        cat_name.setText((String) s);
        
         int itemCount = box2.getItemCount();    
        for(int i=0;i<itemCount;i++){
            box2.removeItemAt(0);
        }
//fill second combo box
        comboBox1text = String.valueOf(box1.getSelectedItem());
        if (!comboBox1text.isEmpty() || comboBox1text != null) {
            // get data from DataBase with Distinct 

            try {
                String sql = "SELECT Distinct sub_cat_name FROM sub_category WHERE cat_name = '"
                        + comboBox1text + "' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();        
                while(rs.next()){
                    String BItems = rs.getString("sub_cat_name");
                    box2.addItem(BItems);
                }        
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage()); 
            }
        }
        
    }//GEN-LAST:event_box1ActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
        // TODO add your handling code here:
        
        Object s = box2.getSelectedItem();
        sub_cat_name.setText((String) s);
    }//GEN-LAST:event_box2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField annual_pre;
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JComboBox<String> box2;
    private javax.swing.JTextField cat_name;
    private javax.swing.JTextField company;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pol_d;
    private javax.swing.JTextField pol_id;
    private javax.swing.JTextField sub_cat_name;
    private javax.swing.JTextField sum_insured;
    // End of variables declaration//GEN-END:variables
}