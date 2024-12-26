/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eduhance_student_inquiry_system_mainfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

/**
 *
 * @author JED
 */
public class EDUHANCE_InstructorLobby extends javax.swing.JFrame {
    private Timer refreshTimer;
    private boolean isPaused = false;
    private JPanel questionsContainer;
    private JScrollPane scrollPane;
    
    
    /**
     * Creates new form EDUHANCE_InstructorLobby
     */
    public EDUHANCE_InstructorLobby() {
        initComponents();
        setupQuestionsContainer();
        startRefreshTimer();
        
        
        questionsContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                isPaused = true;
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                isPaused = false;
            }
        });
    }
    
    private void setupQuestionsContainer() {
        questionsContainer = new JPanel();
        questionsContainer.setLayout(new BoxLayout(questionsContainer, BoxLayout.Y_AXIS));
        questionsContainer.setBackground(new Color(33, 78, 114));

        // Add bottom padding
        JPanel bottomPadding = new JPanel();
        bottomPadding.setBackground(new Color(33, 78, 114));
        bottomPadding.setPreferredSize(new Dimension(1, 20));
        questionsContainer.add(bottomPadding);

        scrollPane = new JScrollPane(questionsContainer);
        scrollPane.setBorder(null);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        getContentPane().add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 540, 530));
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
        titleLabel4 = new javax.swing.JLabel();
        titleLabel5 = new javax.swing.JLabel();
        outIcon = new javax.swing.JLabel();
        titleLabel2 = new javax.swing.JLabel();
        titleLabel3 = new javax.swing.JLabel();
        instructorboxLabel2 = new javax.swing.JLabel();
        subjectboxLabel1 = new javax.swing.JLabel();
        studentsjoinedLabel = new javax.swing.JLabel();
        sectionboxLabel1 = new javax.swing.JLabel();
        instructornameboxField1 = new javax.swing.JTextField();
        subjectboxField1 = new javax.swing.JTextField();
        sectionboxField1 = new javax.swing.JTextField();
        lobbycodeField = new javax.swing.JTextField();
        dateboxLabel3 = new javax.swing.JLabel();
        dateboxField3 = new javax.swing.JTextField();
        endlobbyButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        joinedstudentsList = new javax.swing.JList<>();
        lobbycodeLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 78, 114));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 78, 114), 3, true));

        titleLabel4.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel4.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        titleLabel4.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel4.setText("EDUHANCE");

        titleLabel5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        titleLabel5.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel5.setText("Student Inquiry System");

        outIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_24px.png"))); // NOI18N
        outIcon.setToolTipText("Back to Home");
        outIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        outIcon.setPreferredSize(new java.awt.Dimension(32, 32));
        outIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outlobby(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(titleLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 496, Short.MAX_VALUE)
                .addComponent(outIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(titleLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(titleLabel4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(outIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(titleLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 90));

        titleLabel2.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        titleLabel2.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel2.setText("EDUHANCE");
        getContentPane().add(titleLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        titleLabel3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        titleLabel3.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel3.setText("Student Inquiry System");
        getContentPane().add(titleLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, 20));

        instructorboxLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        instructorboxLabel2.setForeground(new java.awt.Color(255, 255, 255));
        instructorboxLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructorboxLabel2.setText("Instructor Name:");
        getContentPane().add(instructorboxLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 140, 20));

        subjectboxLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        subjectboxLabel1.setForeground(new java.awt.Color(255, 255, 255));
        subjectboxLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subjectboxLabel1.setText("Subject:");
        getContentPane().add(subjectboxLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 130, 20));

        studentsjoinedLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        studentsjoinedLabel.setForeground(new java.awt.Color(255, 255, 255));
        studentsjoinedLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        studentsjoinedLabel.setText("Students Joined:");
        getContentPane().add(studentsjoinedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 130, 30));

        sectionboxLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        sectionboxLabel1.setForeground(new java.awt.Color(255, 255, 255));
        sectionboxLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sectionboxLabel1.setText("Section:");
        getContentPane().add(sectionboxLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 130, 20));

        instructornameboxField1.setEditable(false);
        instructornameboxField1.setBackground(new java.awt.Color(5, 35, 79));
        instructornameboxField1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        instructornameboxField1.setForeground(new java.awt.Color(255, 255, 255));
        instructornameboxField1.setBorder(null);
        instructornameboxField1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        instructornameboxField1.setFocusable(false);
        getContentPane().add(instructornameboxField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 190, 20));

        subjectboxField1.setEditable(false);
        subjectboxField1.setBackground(new java.awt.Color(5, 35, 79));
        subjectboxField1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        subjectboxField1.setForeground(new java.awt.Color(255, 255, 255));
        subjectboxField1.setBorder(null);
        subjectboxField1.setFocusable(false);
        subjectboxField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectboxField1ActionPerformed(evt);
            }
        });
        getContentPane().add(subjectboxField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 190, 20));

        sectionboxField1.setEditable(false);
        sectionboxField1.setBackground(new java.awt.Color(5, 35, 79));
        sectionboxField1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        sectionboxField1.setForeground(new java.awt.Color(255, 255, 255));
        sectionboxField1.setBorder(null);
        sectionboxField1.setFocusable(false);
        sectionboxField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionboxField1ActionPerformed(evt);
            }
        });
        getContentPane().add(sectionboxField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 190, 20));

        lobbycodeField.setEditable(false);
        lobbycodeField.setBackground(new java.awt.Color(5, 35, 79));
        lobbycodeField.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lobbycodeField.setForeground(new java.awt.Color(255, 255, 255));
        lobbycodeField.setBorder(null);
        lobbycodeField.setFocusable(false);
        lobbycodeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lobbycodeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(lobbycodeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 190, 30));

        dateboxLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        dateboxLabel3.setForeground(new java.awt.Color(255, 255, 255));
        dateboxLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateboxLabel3.setText("Date:");
        getContentPane().add(dateboxLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 130, 20));

        dateboxField3.setEditable(false);
        dateboxField3.setBackground(new java.awt.Color(5, 35, 79));
        dateboxField3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        dateboxField3.setForeground(new java.awt.Color(255, 255, 255));
        dateboxField3.setBorder(null);
        dateboxField3.setFocusable(false);
        dateboxField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateboxField3ActionPerformed(evt);
            }
        });
        getContentPane().add(dateboxField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 190, 20));

        endlobbyButton.setBackground(new java.awt.Color(255, 0, 0));
        endlobbyButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        endlobbyButton.setForeground(new java.awt.Color(255, 255, 255));
        endlobbyButton.setText("End Lobby");
        endlobbyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        endlobbyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endlobbyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(endlobbyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 120, 50));

        joinedstudentsList.setBackground(new java.awt.Color(33, 78, 114));
        joinedstudentsList.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        joinedstudentsList.setForeground(new java.awt.Color(255, 255, 255));
        joinedstudentsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        joinedstudentsList.setFixedCellHeight(30);
        jScrollPane1.setViewportView(joinedstudentsList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 320, 240));

        lobbycodeLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lobbycodeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        lobbycodeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lobbycodeLabel1.setText("Lobby Code:");
        getContentPane().add(lobbycodeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 130, 30));

        jPanel2.setBackground(new java.awt.Color(5, 35, 79));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subjectboxField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectboxField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectboxField1ActionPerformed

    private void sectionboxField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionboxField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionboxField1ActionPerformed

    private void lobbycodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lobbycodeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lobbycodeFieldActionPerformed

    private void dateboxField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateboxField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateboxField3ActionPerformed

    private void endlobbyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endlobbyButtonActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to end the lobby?",
        "Leave", JOptionPane.OK_CANCEL_OPTION);
        
        if (result == JOptionPane.OK_OPTION) {
            try {
                Connection conn = DatabaseConnection.getConnection();
                String lobbyCode = lobbycodeField.getText();

                String sql = "UPDATE lobby SET lobbyStatus = 0 WHERE lobbyCode = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, lobbyCode);
                pstmt.executeUpdate();

                sql = "UPDATE lobby_students SET active = 0 WHERE lobbyId = (SELECT lobbyId FROM lobby WHERE lobbyCode = ?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, lobbyCode);
                pstmt.executeUpdate();
                
                EDUHANCE_StudentLandingPage.instance.jPanel7.setVisible(false);
                EDUHANCE_StudentLandingPage.instance.setVisible(true);
                dispose();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_endlobbyButtonActionPerformed

    private void outlobby(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outlobby
        int result = JOptionPane.showConfirmDialog(null, "Go back to homepage?",
            "Leave", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String lobbyCode = lobbycodeField.getText();
            EDUHANCE_StudentLandingPage.instance.setLobbyCode(lobbyCode);
            EDUHANCE_StudentLandingPage.instance.setVisible(true);
            

        }
    }//GEN-LAST:event_outlobby
    
    private void refreshStudentsList() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eduhance_db", "root", "");
            String lobbyCode = lobbycodeField.getText();

            
            String lobbyIdQuery = "SELECT lobbyId FROM lobby WHERE lobbyCode = ?";
            PreparedStatement lobbyStmt = conn.prepareStatement(lobbyIdQuery);
            lobbyStmt.setString(1, lobbyCode);
            ResultSet lobbyRs = lobbyStmt.executeQuery();

            if (lobbyRs.next()) {
                int lobbyId = lobbyRs.getInt("lobbyId");

                // Get students who joined this lobby
                String studentsQuery = "SELECT studentId FROM lobby_students WHERE lobbyId = ? AND active = 1";
                PreparedStatement studentsStmt = conn.prepareStatement(studentsQuery);
                studentsStmt.setInt(1, lobbyId);
                ResultSet studentsRs = studentsStmt.executeQuery();

                DefaultListModel<String> listModel = new DefaultListModel<>();
                while (studentsRs.next()) {
                    listModel.addElement("Student ID: " + studentsRs.getString("studentId"));
                }

                SwingUtilities.invokeLater(() -> {
                    joinedstudentsList.setModel(listModel);
                });

                studentsRs.close();
                studentsStmt.close();
            }

            lobbyRs.close();
            lobbyStmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error refreshing students list: " + e.getMessage());
        }
    }
    
    private void startRefreshTimer() {
        refreshTimer = new Timer();
        refreshTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                refreshInquiries();
                refreshStudentsList();
            }
        }, 0, 1000); // Update every 1000ms (1 second)
    }
    
    private void refreshInquiries() {
        if (isPaused){ 
            return;
        }
        try {
            JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
            int currentScroll = verticalBar.getValue();
     
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eduhance_db", "root", "");

            String lobbyCode = lobbycodeField.getText();
            String lobbyCodeQuery = "SELECT lobbyId FROM lobby WHERE lobbyCode = ?";
            PreparedStatement lobbycodeStmt = conn.prepareStatement(lobbyCodeQuery);
            lobbycodeStmt.setString(1, lobbyCode);
            ResultSet lobbyRs = lobbycodeStmt.executeQuery();

            int lobbyId = 0;
            if (lobbyRs.next()) {
                lobbyId = lobbyRs.getInt("lobbyId");
            }

            String sql = "SELECT * FROM inquiry WHERE lobbyId = ? ORDER BY id DESC";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, lobbyId);
            ResultSet rs = stmt.executeQuery();

            java.util.List<QuestionData> questions = new java.util.ArrayList<>();
            while (rs.next()) {
                questions.add(new QuestionData(
                    rs.getInt("id"),
                    rs.getString("inquiry")
                ));
            }

            SwingUtilities.invokeLater(() -> {
                questionsContainer.removeAll();
                for (QuestionData question : questions) {
                    questionsContainer.add(createQuestionPanel(question));
                }
                questionsContainer.revalidate();
                questionsContainer.repaint();
                
                verticalBar.setValue(currentScroll);
            });

            rs.close();
            stmt.close();
            lobbyRs.close();
            lobbycodeStmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error refreshing inquiries: " + e.getMessage());
        }
    }
    
    private static class QuestionData {
        final int id;
        final String inquiry;

        QuestionData(int id, String inquiry) {
            this.id = id;
            this.inquiry = inquiry;
        }
    }
    
    private JPanel createQuestionPanel(QuestionData data) {
        JPanel questionPanel = new JPanel();
        questionPanel.setLayout(new BorderLayout(10, 5));
        questionPanel.setBackground(new Color(25, 25, 25));

        questionPanel.setPreferredSize(new Dimension(520, 220));
//        questionPanel.setMinimumSize(new Dimension(520, 300));
//        questionPanel.setMaximumSize(new Dimension(520, 700));

        JTextArea questionText = new JTextArea(data.inquiry);
        questionText.setWrapStyleWord(true);
        questionText.setLineWrap(true);
        questionText.setEditable(false);
        questionText.setFocusable(false);
        questionText.setBackground(new Color(45, 90, 126));
        questionText.setForeground(Color.WHITE);
        questionText.setFont(new Font("Arial", Font.BOLD, 14));
        
        questionText.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5),
            BorderFactory.createLineBorder(new Color(45, 90, 126), 3)
        ));

        JLabel studentIdLabel = new JLabel("Student ID: " + data.id);
        studentIdLabel.setForeground(Color.WHITE);

        questionPanel.add(studentIdLabel, BorderLayout.NORTH);
        questionPanel.add(questionText, BorderLayout.CENTER);

        questionPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5),
            BorderFactory.createLineBorder(new Color(33, 78, 114), 1)
        ));

        return questionPanel;
    }
    
    public void setLobbyDetails(String instructorName, String subject, String section, String date) {
        instructornameboxField1.setText(instructorName);
        subjectboxField1.setText(subject);
        sectionboxField1.setText(section);
        dateboxField3.setText(date);
    }
    
    public void dispose() {
        if (refreshTimer != null) {
            refreshTimer.cancel();
        }
        super.dispose();
    }
    
    public javax.swing.JTextField getInstructornameboxField1() {
        return instructornameboxField1;
    }

    public javax.swing.JTextField getSubjectboxField1() {
        return subjectboxField1;
    }

    public javax.swing.JTextField getSectionboxField1() {
        return sectionboxField1;
    }

    public javax.swing.JTextField getDateboxField3() {
        return dateboxField3;
    }
    
    public javax.swing.JTextField getLobbyCodeField() {
        return lobbycodeField;
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
            java.util.logging.Logger.getLogger(EDUHANCE_InstructorLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EDUHANCE_InstructorLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EDUHANCE_InstructorLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EDUHANCE_InstructorLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EDUHANCE_InstructorLobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateboxField3;
    private javax.swing.JLabel dateboxLabel3;
    private javax.swing.JButton endlobbyButton;
    private javax.swing.JLabel instructorboxLabel2;
    private javax.swing.JTextField instructornameboxField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> joinedstudentsList;
    private javax.swing.JTextField lobbycodeField;
    private javax.swing.JLabel lobbycodeLabel1;
    private javax.swing.JLabel outIcon;
    private javax.swing.JTextField sectionboxField1;
    private javax.swing.JLabel sectionboxLabel1;
    private javax.swing.JLabel studentsjoinedLabel;
    private javax.swing.JTextField subjectboxField1;
    private javax.swing.JLabel subjectboxLabel1;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JLabel titleLabel3;
    private javax.swing.JLabel titleLabel4;
    private javax.swing.JLabel titleLabel5;
    // End of variables declaration//GEN-END:variables
}
