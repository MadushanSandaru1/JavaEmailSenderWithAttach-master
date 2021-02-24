/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaemailsenderwithattach;

import java.io.File;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author sanda
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    File file = null;
    String file_path;
    String file_name;
    
    public MainFrame() {
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
        heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sender_gmail = new javax.swing.JTextField();
        receiver_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        email_subject = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        email_message = new javax.swing.JTextArea();
        button_attachment = new javax.swing.JButton();
        button_send = new javax.swing.JButton();
        status_bar = new javax.swing.JProgressBar();
        sender_gmail_validity = new javax.swing.JLabel();
        receiver_email_validity = new javax.swing.JLabel();
        attachment_name = new javax.swing.JLabel();
        button_clear = new javax.swing.JButton();
        button_new_email = new javax.swing.JButton();
        sender_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Email Sender API");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        heading.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        heading.setForeground(new java.awt.Color(102, 0, 204));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("Email Sender API with Attachment");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Sender Gmail :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("To :");

        sender_gmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sender_gmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sender_gmailKeyReleased(evt);
            }
        });

        receiver_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        receiver_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                receiver_emailKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Subject :");

        jPanel2.setBackground(new java.awt.Color(102, 0, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        email_subject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Message :");

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        email_message.setColumns(20);
        email_message.setRows(5);
        jScrollPane1.setViewportView(email_message);

        button_attachment.setBackground(new java.awt.Color(255, 255, 255));
        button_attachment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_attachment.setForeground(new java.awt.Color(102, 0, 204));
        button_attachment.setText("Attachment");
        button_attachment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 204)));
        button_attachment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_attachmentActionPerformed(evt);
            }
        });

        button_send.setBackground(new java.awt.Color(255, 255, 255));
        button_send.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_send.setForeground(new java.awt.Color(102, 0, 204));
        button_send.setText("Send");
        button_send.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 204)));
        button_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sendActionPerformed(evt);
            }
        });

        status_bar.setBackground(new java.awt.Color(255, 255, 255));
        status_bar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        status_bar.setForeground(new java.awt.Color(102, 0, 204));
        status_bar.setStringPainted(true);

        sender_gmail_validity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sender_gmail_validity.setForeground(new java.awt.Color(255, 96, 92));

        receiver_email_validity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        receiver_email_validity.setForeground(new java.awt.Color(0, 202, 78));

        attachment_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        attachment_name.setForeground(new java.awt.Color(0, 202, 78));

        button_clear.setBackground(new java.awt.Color(255, 255, 255));
        button_clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_clear.setForeground(new java.awt.Color(255, 96, 92));
        button_clear.setText("Clear");
        button_clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 96, 92)));
        button_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_clearActionPerformed(evt);
            }
        });

        button_new_email.setBackground(new java.awt.Color(255, 255, 255));
        button_new_email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_new_email.setForeground(new java.awt.Color(0, 202, 78));
        button_new_email.setText("New Email");
        button_new_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 202, 78)));
        button_new_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_new_emailActionPerformed(evt);
            }
        });

        sender_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attachment_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button_attachment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_send, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(email_subject)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(status_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(receiver_email, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(receiver_email_validity, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(sender_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(sender_gmail, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sender_gmail_validity, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 20, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_new_email, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sender_gmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sender_gmail_validity, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sender_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(receiver_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiver_email_validity, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(email_subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_attachment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_send, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(attachment_name, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(status_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_new_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_clearActionPerformed
        sender_gmail.setText(null);
        sender_gmail_validity.setText(null);
        sender_password.setText(null);
        receiver_email.setText(null);
        receiver_email_validity.setText(null);
        email_subject.setText(null);
        email_message.setText(null);
        attachment_name.setText(null);
        status_bar.setValue(0);
        
        file = null;
        file_path = null;
        file_name = null;
    }//GEN-LAST:event_button_clearActionPerformed

    private void button_new_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_new_emailActionPerformed
        receiver_email.setText(null);
        receiver_email_validity.setText(null);
        email_subject.setText(null);
        email_message.setText(null);
        attachment_name.setText(null);
        status_bar.setValue(0);
        
        file = null;
        file_path = null;
        file_name = null;
    }//GEN-LAST:event_button_new_emailActionPerformed

    private void button_attachmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_attachmentActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        
        file = chooser.getSelectedFile();
        file_path = file.getAbsolutePath();
        file_name = file.getName();
        
        attachment_name.setText(file_path);
    }//GEN-LAST:event_button_attachmentActionPerformed

    private void button_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sendActionPerformed
        String sender_gmail = this.sender_gmail.getText().trim();
        String sender_password = new String(this.sender_password.getPassword());
        
        String receiver_email = this.receiver_email.getText().trim();
        
        String email_subject = this.email_subject.getText().trim();
        String email_message = this.email_message.getText().trim();
        
        if(sender_gmail.isEmpty() || sender_password.isEmpty() || receiver_email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");
        }
        else {
            status_bar.setIndeterminate(true);
            status_bar.setValue(50);

            Properties properties = new Properties();

            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.socketFactory.port", "465");
            properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            properties.put("mail.smtp.auth","true");
            properties.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(properties,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication(){
                            return new PasswordAuthentication(sender_gmail,sender_password);
                        }
                    }
            );

            try {

                if (file != null) {

                    // Create a default MimeMessage object.
                    MimeMessage message = new MimeMessage(session);

                    // Set From: header field of the header.
                    message.setFrom(new InternetAddress(sender_gmail));

                    // Set To: header field of the header.
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver_email));

                    // Set Subject: header field
                    message.setSubject(email_subject);

                    // Create the message part
                    BodyPart messageBodyPart = new MimeBodyPart();

                    // Fill the message
                    //method 01
                    messageBodyPart.setText(email_message);
                    
                    //method 02
                    /*String emailContent = "<h3>Heading 03</h3><br><p>Testing</p><br>Thank You!";
                    messageBodyPart.setContent(emailContent, "text/html");*/

                    // Create a multipar message
                    Multipart multipart = new MimeMultipart();

                    // Set text message part
                    multipart.addBodyPart(messageBodyPart);

                    // Part two is attachment
                    messageBodyPart = new MimeBodyPart();
                    DataSource source = new FileDataSource(file_path);
                    messageBodyPart.setDataHandler(new DataHandler(source));
                    messageBodyPart.setFileName(file_name);

                    multipart.addBodyPart(messageBodyPart);

                    // Send the complete message parts
                    message.setContent(multipart);

                    // Send message
                    Transport.send(message);

                } else {

                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(sender_gmail));
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver_email));
                    message.setSubject(email_subject);
                    
                    //method 01
                    message.setText(email_message);
                    
                    //method 02
                    /*String emailContent = "<h3>Heading 03</h3><br><p>Testing</p><br>Thank You!";
                    message.setContent(emailContent, "text/html");*/
                    
                    Transport.send(message);

                }

                status_bar.setValue(100);
                status_bar.setIndeterminate(false);
                
                this.email_subject.setText(null);
                this.email_message.setText(null);
                attachment_name.setText(null);
                status_bar.setValue(0);

                file = null;
                file_path = null;
                file_name = null;

                JOptionPane.showMessageDialog(null, "Mail sent to "+receiver_email);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
                
    }//GEN-LAST:event_button_sendActionPerformed

    private void sender_gmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sender_gmailKeyReleased
        if (sender_gmail.getText().length() != 0){
            if (!(Pattern.matches("^[a-zA-Z0-9]+@gmail.+[a-zA-Z0-9]+$", sender_gmail.getText()))) {
                sender_gmail_validity.setForeground(new java.awt.Color(255,96,92));
                sender_gmail_validity.setText("Not a vaild Gmail");
            }
            else {
                sender_gmail_validity.setForeground(new java.awt.Color(0,202,78));
                sender_gmail_validity.setText("Vaild Gmail");
            }
        }
        else {
            sender_gmail_validity.setText(null);
        }
    }//GEN-LAST:event_sender_gmailKeyReleased

    private void receiver_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_receiver_emailKeyReleased
        if (receiver_email.getText().length() != 0){
            if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", receiver_email.getText()))) {
                receiver_email_validity.setForeground(new java.awt.Color(255,96,92));
                receiver_email_validity.setText("Not a vaild Gmail");
            }
            else {
                receiver_email_validity.setForeground(new java.awt.Color(0,202,78));
                receiver_email_validity.setText("Vaild Gmail");
            }
        }
        else {
            receiver_email_validity.setText(null);
        }
    }//GEN-LAST:event_receiver_emailKeyReleased

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attachment_name;
    private javax.swing.JButton button_attachment;
    private javax.swing.JButton button_clear;
    private javax.swing.JButton button_new_email;
    private javax.swing.JButton button_send;
    private javax.swing.JTextArea email_message;
    private javax.swing.JTextField email_subject;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField receiver_email;
    private javax.swing.JLabel receiver_email_validity;
    private javax.swing.JTextField sender_gmail;
    private javax.swing.JLabel sender_gmail_validity;
    private javax.swing.JPasswordField sender_password;
    private javax.swing.JProgressBar status_bar;
    // End of variables declaration//GEN-END:variables
}
