/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eduhance_student_inquiry_system_mainfile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import javax.swing.JOptionPane;


public class LOGIN_EDH2 extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN_EDH2
     */
    public LOGIN_EDH2() {
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

        loginButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        titleLabel2 = new javax.swing.JLabel();
        titleLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        showpassToggleButton = new javax.swing.JToggleButton();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();

        loginButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        loginButton1.setForeground(new java.awt.Color(102, 102, 102));
        loginButton1.setText("Login");
        loginButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 78, 114));

        titleLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        titleLabel2.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel2.setText("EDUHANCE");

        titleLabel3.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        titleLabel3.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel3.setText("Student Inquiry System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(5, 35, 79));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        emailLabel.setBackground(new java.awt.Color(255, 255, 255));
        emailLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Enter your email:");

        emailField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailField.setForeground(new java.awt.Color(33, 78, 114));
        emailField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 5));
        emailField.setCaretColor(new java.awt.Color(35, 35, 35));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        passwordLabel.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Enter your password:");

        passwordField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(33, 78, 114));
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 5));
        passwordField.setCaretColor(new java.awt.Color(35, 35, 35));
        passwordField.setMargin(new java.awt.Insets(10, 6, 2, 6));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(250, 250, 250));
        loginButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(5, 35, 79));
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(5, 35, 79));

        jPanel1.setBackground(new java.awt.Color(5, 35, 79));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 35, 79), 3));
        jPanel1.setForeground(new java.awt.Color(5, 35, 79));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label3.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        label3.setForeground(new java.awt.Color(5, 35, 79));
        label3.setText("Palengke Plus");

        label2.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        label2.setForeground(new java.awt.Color(5, 35, 79));
        label2.setText("2.0");

        label1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(5, 35, 79));
        label1.setText("Sales Forecasting");
        label1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(label2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3)
                    .addComponent(label2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        label8.setBackground(new java.awt.Color(5, 35, 79));
        label8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(5, 35, 79));
        label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label8.setText("Or sign in with your other accounts");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(label8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        showpassToggleButton.setBackground(new java.awt.Color(209, 209, 209));
        showpassToggleButton.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        showpassToggleButton.setForeground(new java.awt.Color(66, 255, 255));
        showpassToggleButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        showpassToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showpassToggleButton.setFocusPainted(false);
        showpassToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassToggleButtonActionPerformed(evt);
            }
        });

        label9.setBackground(new java.awt.Color(255, 255, 255));
        label9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        label9.setForeground(new java.awt.Color(0, 153, 255));
        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setText("<html>Create new account</html>");
        label9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewAccountClick(evt);
            }
        });

        label10.setBackground(new java.awt.Color(255, 255, 255));
        label10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        label10.setForeground(new java.awt.Color(0, 153, 255));
        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setText("<html>Forgot Password?</html>");
        label10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label10NewAccountClick(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showpassToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(showpassToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(52, 52, 52)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 517, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String email = emailField.getText();
        String password = passwordField.getText();

        try {
            
            URL url = new URL("http://localhost/EDUHANCE/verify_password_EDUHANCE.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            String postData = "username=" + URLEncoder.encode(email, "UTF-8") + 
                             "&password=" + URLEncoder.encode(password, "UTF-8");

            try (OutputStream os = conn.getOutputStream()) {
                os.write(postData.getBytes());
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            if (response.toString().contains("\"status\":\"success\"")) {
                String responseStr = response.toString();
                
                String nametext = responseStr.substring(
                    responseStr.indexOf("\"name\":\"") + 8,
                    responseStr.indexOf("\"", responseStr.indexOf("\"name\":\"") + 8)
                );
                String emailtext = responseStr.substring(
                    responseStr.indexOf("\"email\":\"") + 9,
                    responseStr.indexOf("\"", responseStr.indexOf("\"email\":\"") + 9)
                );
                
                String coursetext = responseStr.substring(
                    responseStr.indexOf("\"course\":\"") + 10,
                    responseStr.indexOf("\"", responseStr.indexOf("\"course\":\"") + 10)
                );

                String yearleveltext = responseStr.substring(
                    responseStr.indexOf("\"yearLevel\":\"") + 13,
                    responseStr.indexOf("\"", responseStr.indexOf("\"yearLevel\":\"") + 13)
                );
                
                String userId = responseStr.substring(
                    responseStr.indexOf("\"userid\":") + 8,
                    responseStr.indexOf("}", responseStr.indexOf("\"userid\":"))
                ).trim();

                System.out.println("Raw response: " + responseStr);
                System.out.println("Extracted UserID: " + userId);
                
                UserSession.getInstance().setUserId(userId);
                
                EDUHANCE_StudentLandingPage studentLandingpage = new EDUHANCE_StudentLandingPage();
                
                studentLandingpage.setUserData(nametext, emailtext, coursetext, yearleveltext);
                studentLandingpage.setVisible(true);
                this.dispose();
                
            } else if (email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Must input valid email and password.",
                                            "Login Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid email or password.",
                                            "Login Failed", JOptionPane.ERROR_MESSAGE);
                handleFailedLogin();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage() + "\nCould be that Xampp Mysql isn't turned on.",
                                        "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void showpassToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassToggleButtonActionPerformed
        if (showpassToggleButton.isSelected()) {
            passwordField.setEchoChar((char)0);
            showpassToggleButton.setText("✓");
        } else {
            passwordField.setEchoChar('•');
            showpassToggleButton.setText("");
        }
    }//GEN-LAST:event_showpassToggleButtonActionPerformed

    private void NewAccountClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewAccountClick
        REGISTER_EDH2 registerwin = new REGISTER_EDH2();
        registerwin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NewAccountClick

    private void label10NewAccountClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label10NewAccountClick
        // TODO add your handling code here:
    }//GEN-LAST:event_label10NewAccountClick
    
    private void handleFailedLogin(){
        passwordField.setText(""); 
        passwordField.requestFocus();

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
            java.util.logging.Logger.getLogger(LOGIN_EDH2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_EDH2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_EDH2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_EDH2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_EDH2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginButton1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JToggleButton showpassToggleButton;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JLabel titleLabel3;
    // End of variables declaration//GEN-END:variables
}
