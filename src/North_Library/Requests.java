/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package North_Library;

import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Balsara
 */
public class Requests extends javax.swing.JFrame {
    
    int row;
    
    /**
     * Creates new form results
     */
    public Requests() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Issue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Rejected");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Log out");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Home");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Requests");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)))
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

    String path, mysql_username, mysql_pass;
    
    void setSettings(String v1, String v2, String v3)
    {
        path = v1;
        mysql_username = v2;
        mysql_pass = v3;
    }
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Point pnt = evt.getPoint();
        row = jTable1.rowAtPoint(pnt);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jTable1.isRowSelected(row)==false)
        {
            JOptionPane.showMessageDialog(this, "Please select a request.");
        }
        
        else 
        {
            if(jTable1.getSelectedRowCount()>1)
            {
                JOptionPane.showMessageDialog(this, "Please select only one request.");
            }
            
        else
        {
            
        String username = (String) jTable1.getValueAt(row, 1);
        String str = (String) jTable1.getValueAt(row, 0);
        
        try
        {
            conn in = new conn();
            Connection con = in.connect(path, mysql_username, mysql_pass);
            
            java.util.Date date=new java.util.Date();
            java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			
			
            try
            {
                PreparedStatement create = con.prepareStatement("create table issued(user varchar(50), title varchar(50), issue_date date)");
                create.executeUpdate();
                System.out.println("Issued table created.");
            }
            catch(Exception e)
            {
            }
            
            PreparedStatement ps0 = con.prepareStatement("select copies from books where title='"+str+"'");
            ResultSet rs0 = ps0.executeQuery();
            rs0.next();
            int a = rs0.getInt(1);
            System.out.println(a);
            
            if(a>0) {
                System.out.println("1");
            PreparedStatement ps1 = con.prepareStatement("select book1 from user_info where username='"+username+"'");
            ResultSet rs = ps1.executeQuery();
            rs.next();
            String x = rs.getString(1);
            
            if(x==null)
            {
                System.out.println("2");
                PreparedStatement ps2 = con.prepareStatement("set SQL_SAFE_UPDATES=0;");
                ps2.executeUpdate();
                PreparedStatement ps3 = con.prepareStatement("update user_info set rented='"+1+"', book1='"+str+"' where username='"+username+"'");
                ps3.executeUpdate();
                PreparedStatement ps4 = con.prepareStatement("delete from RequestTable where title='"+ str +"' && username='"+username+"'");
                ps4.executeUpdate();
                a--;
                PreparedStatement ps5 = con.prepareStatement("update books set copies='"+ a +"' where title='"+str+"'");
                ps5.executeUpdate();	
                PreparedStatement ps6 = con.prepareStatement("insert into issued values(?,?,?)");
                ps6.setString(1, username);
                ps6.setString(2, str);
                ps6.setDate(3, sqlDate);
                ps6.executeUpdate();
                JOptionPane.showMessageDialog(this, "Rental request approved. Book issued.");
                System.out.println("Updated to database successfully.");
            }
            else
            {
                System.out.println("3");
                PreparedStatement ps = con.prepareStatement("select book2 from user_info where username='"+username+"'");
                ResultSet res = ps.executeQuery();
                res.next();
                x = res.getString(1);
                
                if(x==null)
                {
                    System.out.println("4");
                    PreparedStatement ps2 = con.prepareStatement("set SQL_SAFE_UPDATES=0;");
                    ps2.executeUpdate();
                    PreparedStatement ps3 = con.prepareStatement("update user_info set rented='"+2+"',book2='"+str+"' where username='"+username+"'");
                    ps3.executeUpdate();
                    PreparedStatement ps4 = con.prepareStatement("delete from RequestTable where title='"+ str +"' && username='"+username+"'");
                    ps4.executeUpdate();
                    PreparedStatement ps5 = con.prepareStatement("update books set copies='"+ a +"' where title='"+str+"'");
                    ps5.executeUpdate();
                    PreparedStatement ps6 = con.prepareStatement("insert into issued values(?,?,?)");
                    ps6.setString(1, username);
                    ps6.setString(2, str);
                    ps6.setDate(3, sqlDate);
                    ps6.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Rental request approved. Book issued.");
                    System.out.println("Updated to database successfully.");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "User has already been issued 2 books.");
                    PreparedStatement pst = con.prepareStatement("delete from RequestTable where title='"+ str +"'");
                    pst.executeUpdate();
                }
            }
            }
            else {
                    JOptionPane.showMessageDialog(this, "All copies of this book have been issued at the moment.");
                    PreparedStatement pst = con.prepareStatement("delete from RequestTable where title='"+ str +"'");
                    pst.executeUpdate();
            }
            
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        Requests obj = new Requests();
        obj.setVisible(true);
        dispose();
        obj.setSettings(path, mysql_username, mysql_pass);
        obj.RequestTable();
       }
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           
        if(jTable1.isRowSelected(row)==false)
        {
            JOptionPane.showMessageDialog(this, "Please select a request.");
        }
        
        else 
        {
            if(jTable1.getSelectedRowCount()>1)
            {
                JOptionPane.showMessageDialog(this, "Please select only one request.");
            }
            
        else
        {
        JOptionPane.showMessageDialog(this, "Rental request rejected.");
        
        String username = (String) jTable1.getValueAt(row, 1);
        String str = (String) jTable1.getValueAt(row, 0);
        
        try
        {
            conn in = new conn();
            Connection con = in.connect(path, mysql_username, mysql_pass);
            /*
            PreparedStatement ps1 = con.prepareStatement("select book1 from user_info where username='"+username+"'");
            ResultSet rs = ps1.executeQuery();
            rs.next();
            String x = rs.getString(1);
            
            if(x==null)
            {
            */
                PreparedStatement ps2 = con.prepareStatement("delete from RequestTable where title='"+ str +"' && username='"+username+"'");
                ps2.executeUpdate();
            //}
            //else
            //{
                //PreparedStatement ps2 = con.prepareStatement("delete from RequestTable where title='"+ str +"'");
                //ps2.executeUpdate();
            
            //}
            
            System.out.println("Updated to database successfully.");
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        Requests obj = new Requests();
        obj.setVisible(true);
        dispose();
        obj.setSettings(path, mysql_username, mysql_pass);
        obj.RequestTable();
       }
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        LoginFrame obj = new LoginFrame();
        obj.setVisible(true);
        dispose();
        obj.setSettings(path, mysql_username, mysql_pass);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        WelcomeAdmin obj = new WelcomeAdmin();
        obj.setVisible(true);
        dispose();
        obj.setSettings(path, mysql_username, mysql_pass);
    }//GEN-LAST:event_jButton9ActionPerformed

    
    void RequestTable()
    {
        
        try {
            conn in = new conn();
            Connection con = in.connect(path, mysql_username, mysql_pass);
            
            Statement stmt = con.createStatement();
            
            try
            {
                stmt.executeUpdate("create table RequestTable(title varchar(50), username varchar(50))");
            }
            catch(Exception e)
            {
            }
            ResultSet rs1 = stmt.executeQuery("select * from RequestTable");
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
            
            if(jTable1.getRowCount()>0)
            jTable1.setVisible(true);
            else
            JOptionPane.showMessageDialog(this, "No new requests.");
            
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }
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
            java.util.logging.Logger.getLogger(Requests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Requests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Requests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Requests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Requests obj = new Requests();
                obj.setVisible(true);
                obj.setSize(720,480);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
