/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package busbookingsys;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jigyasa
 */
public class AddSeats extends javax.swing.JFrame {

    /**
     * Creates new form AddSeats
     */
    public AddSeats() {
        initComponents();
        Connect();
        
    }
    
     PreparedStatement psd;
       java.sql.Connection con;
       
       private void Connect()  {
        try {
            // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
             
               con =  DriverManager.getConnection("jdbc:mysql://localhost/super","root","");
                String selectQuery = "select busno from busid";
                psd= con.prepareStatement(selectQuery);
         ResultSet rs= psd.executeQuery(selectQuery);
         while(rs.next())
         {
             busno.addItem(rs.getString("busno"));
             
         }
            } catch (SQLException ex) {
                Logger.getLogger(BookSeat.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookSeat.class.getName()).log(Level.SEVERE, null, ex);
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

        busno = new javax.swing.JComboBox<>();
        date = new com.toedter.calendar.JDateChooser();
        source = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        addseat1 = new javax.swing.JButton();
        src = new javax.swing.JComboBox<>();
        dest = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(570, 490));
        getContentPane().setLayout(null);

        busno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        busno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(busno);
        busno.setBounds(335, 54, 185, 40);

        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(date);
        date.setBounds(335, 138, 185, 31);

        source.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        source.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        source.setText("Source");
        source.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        source.setOpaque(true);
        getContentPane().add(source);
        source.setBounds(38, 208, 130, 41);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bus Number");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(38, 55, 130, 39);

        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cancel.setText("Add");
        Cancel.setBorder(new javax.swing.border.MatteBorder(null));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel);
        Cancel.setBounds(120, 380, 130, 41);

        addseat1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addseat1.setText("Cancel");
        addseat1.setBorder(new javax.swing.border.MatteBorder(null));
        addseat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addseat1ActionPerformed(evt);
            }
        });
        getContentPane().add(addseat1);
        addseat1.setBounds(320, 380, 131, 41);

        src.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        src.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangalore", "Mangalore", "Hampi", "Coorg", "Halebeedu", "Mysore", "Srirangapatna", "Malgudi", "Jog Falls", "Shivmogga", "Mulliyana Giri", "Hassan", "Bijapur", "Badami", "St.Mary's Island", "Kudremukh", "Gulbarga", "Ooty", "Pattadakal", "Udupi" }));
        src.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        src.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcActionPerformed(evt);
            }
        });
        getContentPane().add(src);
        src.setBounds(335, 208, 185, 40);

        dest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangalore", "Mangalore", "Hampi", "Coorg", "Halebeedu", "Mysore", "Srirangapatna", "Malgudi", "Jog Falls", "Shivmogga", "Mulliyana Giri", "Hassan", "Bijapur", "Badami", "St.Mary's Island", "Kudremukh", "Gulbarga", "Ooty", "Pattadakal", "Udupi" }));
        dest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destActionPerformed(evt);
            }
        });
        getContentPane().add(dest);
        dest.setBounds(335, 288, 185, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(38, 128, 130, 41);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Destination");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(38, 288, 130, 41);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\anihk\\Downloads\\java_project\\bus4.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
          
    String bus=busno.getSelectedItem().toString();
    String source=src.getSelectedItem().toString();
   String destin=dest.getSelectedItem().toString();
 
    
     SimpleDateFormat datey = new SimpleDateFormat("YYYY-MM-dd");
     String date1=datey.format(date.getDate());
     for(int i=1;i<=28;i++)
     {
         try{
         if(source.equals(destin))
         {
            JOptionPane.showMessageDialog(this,"source destination same invalid");
            break;
         }
         else
         {
         String seats= Integer.toString(i);
         String status ="unbooked";
         String insertb ="insert into seat(BusNo,Date,status,seats,source,destination)values(?,?,?,?,?,?)";
        psd =con.prepareStatement(insertb);
      
      psd.setString(1,bus);
       psd.setString(2,date1);
       psd.setString(3, status);
       psd.setString(4,seats);
      psd.setString(5,source);
      psd.setString(6,destin);
    

   psd.executeUpdate();
  
    

         }
     }
     
        catch(SQLException ex)
        {
             Logger.getLogger(BookSeat.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this,"Error while loading into database");
             
             break;
        }
     }
        JOptionPane.showMessageDialog(this,"seat added sucessfully");
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed
    
    private void addseat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addseat1ActionPerformed
        // TODO add your handling code here:
        AdminLogin ad=new AdminLogin();
       ad.setVisible(true);
       this.setVisible(true);
       this.setVisible(false);
        
     
    }//GEN-LAST:event_addseat1ActionPerformed

    private void srcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srcActionPerformed

    private void destActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destActionPerformed

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
            java.util.logging.Logger.getLogger(AddSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSeats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton addseat1;
    private javax.swing.JComboBox<String> busno;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JComboBox<String> dest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel source;
    private javax.swing.JComboBox<String> src;
    // End of variables declaration//GEN-END:variables
}
