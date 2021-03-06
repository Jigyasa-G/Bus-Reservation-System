/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package busbookingsys;

import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author Jigyasa
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    
    void username(String user){
      user1.setText(user);
        
    }
void passw(String password){
    pass1.setText(password);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UpdateAdmin = new javax.swing.JButton();
        aseat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        removeBus = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        busAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pass1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));
        setPreferredSize(new java.awt.Dimension(720, 620));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UserName :");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 160, 145, 33);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add seats ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 230, 145, 39);

        UpdateAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateAdmin.setText("Add/Remove  Admin");
        UpdateAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAdminActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateAdmin);
        UpdateAdmin.setBounds(393, 443, 270, 40);

        aseat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aseat.setText("Add Seats ");
        aseat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aseat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aseatMouseClicked(evt);
            }
        });
        aseat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aseatActionPerformed(evt);
            }
        });
        getContentPane().add(aseat);
        aseat.setBounds(393, 230, 270, 37);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Bus");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 300, 143, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Admin Update ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 440, 143, 45);

        removeBus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        removeBus.setText("Remove Bus");
        removeBus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removeBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBusActionPerformed(evt);
            }
        });
        getContentPane().add(removeBus);
        removeBus.setBounds(393, 370, 270, 39);

        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton5.setText("Logout");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(170, 530, 424, 39);

        busAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        busAdd.setText("Add Bus ");
        busAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        busAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busAddActionPerformed(evt);
            }
        });
        getContentPane().add(busAdd);
        busAdd.setBounds(393, 301, 270, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Remove Bus:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 370, 143, 45);

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN PAGE");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 1, 720, 100);

        user1.setBackground(new java.awt.Color(153, 255, 255));
        user1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        user1.setOpaque(true);
        getContentPane().add(user1);
        user1.setBounds(390, 160, 270, 40);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 720, 580);
        getContentPane().add(pass1);
        pass1.setBounds(500, 130, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aseatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aseatActionPerformed
        // TODO add your handling code here:
        close();
        AddSeats sa = new AddSeats();
        sa.setVisible(true);
        this.setVisible(false);
       
        dispose();
          
    
    }//GEN-LAST:event_aseatActionPerformed

    private void removeBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBusActionPerformed
        // TODO add your handling code here:
        close();
        
        RemoveBus ab = new RemoveBus();
        ab.setVisible(true);
         this.setVisible(false);
        
        dispose();
        
        
    }//GEN-LAST:event_removeBusActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        close();
     
        AdminValidation av = new AdminValidation();
        av.setVisible(true);
           this.setVisible(false);
        dispose();
        
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void busAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busAddActionPerformed
        // TODO add your handling code here:
        close();
        this.setVisible(false);
        AdditonBus ab = new AdditonBus();
        ab.setVisible(true);
          this.setVisible(false);
      dispose();
    }//GEN-LAST:event_busAddActionPerformed

    private void UpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAdminActionPerformed
        // TODO add your handling code here:
        close();
        AdminUpdate ap = new AdminUpdate();
       ap.setVisible(true);
        this.setVisible(false);
      dispose();
    }//GEN-LAST:event_UpdateAdminActionPerformed

    private void aseatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aseatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aseatMouseClicked

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateAdmin;
    private javax.swing.JButton aseat;
    private javax.swing.JButton busAdd;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel pass1;
    private javax.swing.JButton removeBus;
    private javax.swing.JLabel user1;
    // End of variables declaration//GEN-END:variables
}
