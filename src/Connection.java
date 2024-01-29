
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author crisk
 */
public class Connection extends javax.swing.JFrame {

    /**
     * Creates new form Connection
     */
    public Connection() {
        initComponents();
        
        // cener the form and change background color 
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.yellow);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPword = new javax.swing.JLabel();
        jUsername = new javax.swing.JLabel();
        jTxF = new javax.swing.JTextField();
        jPwordF = new javax.swing.JPasswordField();
        jBExt = new javax.swing.JButton();
        jBLog = new javax.swing.JButton();
        jCBx = new javax.swing.JCheckBox();
        jDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Display");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 0, 0));

        jPword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPword.setText("Password");

        jUsername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jUsername.setText("Username");

        jTxF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTxF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxFActionPerformed(evt);
            }
        });

        jBExt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBExt.setText("Exit");
        jBExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExtActionPerformed(evt);
            }
        });

        jBLog.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBLog.setText("Login");
        jBLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogActionPerformed(evt);
            }
        });

        jCBx.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCBx.setText("Show Password");
        jCBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBxActionPerformed(evt);
            }
        });

        jDisplay.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jDisplay.setText("LOGIN DISPLAY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPword, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBExt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxF)
                            .addComponent(jPwordF, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBLog, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jDisplay)
                        .addGap(168, 168, 168))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jDisplay)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPwordF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLog, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBExt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExtActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBExtActionPerformed

    private void jTxFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxFActionPerformed

    private void jBLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogActionPerformed
        // TODO add your handling code here:
        if (jTxF.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"Please fill out username ");
            
        }
        else if (jPwordF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out password");
        }
        
        else if (jTxF.getText().contains("Welcome")&& jPwordF.getText().contains("12345678")){
            JOptionPane.showMessageDialog(null, "Login Successful");
            
    }
        else{
            JOptionPane.showMessageDialog(null, "Wrong username or password!!!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBLogActionPerformed

    private void jCBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBxActionPerformed
        // TODO add your handling code here:
        if (jCBx.isSelected()){
            jPwordF.setEchoChar((char)0);
        }
        else{
            jPwordF.setEchoChar('*');
        }
    }//GEN-LAST:event_jCBxActionPerformed

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
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExt;
    private javax.swing.JButton jBLog;
    private javax.swing.JCheckBox jCBx;
    private javax.swing.JLabel jDisplay;
    private javax.swing.JLabel jPword;
    private javax.swing.JPasswordField jPwordF;
    private javax.swing.JTextField jTxF;
    private javax.swing.JLabel jUsername;
    // End of variables declaration//GEN-END:variables
}
