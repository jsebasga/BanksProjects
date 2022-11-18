
package banksprojects;

import javax.swing.JOptionPane;
import network.ApiManager;

/**
 *
 * @author Sebastian Güiza & Paola Montoya
 */
public class AdminLoginView extends javax.swing.JFrame {

    public AdminLoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adLogBackground = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        imageBanner = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        warningEmail = new javax.swing.JLabel();
        warningPassword = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(null);

        adLogBackground.setBackground(new java.awt.Color(166, 166, 166));
        adLogBackground.setLayout(null);

        user.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 0));
        user.setText("Contraseña:");
        adLogBackground.add(user);
        user.setBounds(200, 480, 240, 30);

        imageBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Iniciar Sesion Banner.png"))); // NOI18N
        adLogBackground.add(imageBanner);
        imageBanner.setBounds(100, 60, 800, 250);

        user1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        user1.setForeground(new java.awt.Color(0, 0, 0));
        user1.setText("Correo Electronico:");
        adLogBackground.add(user1);
        user1.setBounds(200, 400, 240, 30);

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        adLogBackground.add(back);
        back.setBounds(300, 600, 150, 50);

        email.setBackground(new java.awt.Color(204, 204, 204));
        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("venus@venus.com");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        adLogBackground.add(email);
        email.setBounds(525, 400, 240, 30);

        login.setBackground(new java.awt.Color(204, 204, 204));
        login.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("Ingresar");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        adLogBackground.add(login);
        login.setBounds(550, 600, 150, 50);

        warningEmail.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        warningEmail.setForeground(new java.awt.Color(255, 0, 0));
        warningEmail.setText(" ");
        adLogBackground.add(warningEmail);
        warningEmail.setBounds(530, 430, 230, 16);

        warningPassword.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        warningPassword.setForeground(new java.awt.Color(255, 0, 0));
        warningPassword.setText(" ");
        adLogBackground.add(warningPassword);
        warningPassword.setBounds(530, 510, 240, 16);

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setText("Venus2710");
        adLogBackground.add(password);
        password.setBounds(525, 480, 240, 30);

        getContentPane().add(adLogBackground);
        adLogBackground.setBounds(0, 0, 1000, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        RolView rolView = new RolView();
        rolView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
     String rol = "Docente";
        
        if (email.getText().length() == 0) {
            warningEmail.setText("Debe de llenar este espacio");
        }
        
        if (password.getText().length() == 0) {
            warningPassword.setText("Debe de llenar este espacio");
        }

        User adminUser = new User();
        adminUser.setEmail(email.getText());
        ApiManager apiManager = new ApiManager();
        User userResponse = apiManager.readUser(adminUser);
        
        if (email.getText().equals(userResponse.getEmail()) && password.getText().equals(userResponse.getPassword())) {

            if (rol.equals(userResponse.getRol())){
               
                AdminView adminView = new AdminView();
                adminView.setUser(userResponse);
                adminView.setVisible(true);
                this.setVisible(false);
            }
            else {

            JOptionPane.showMessageDialog(null, "Usted no es un docente");

        }
        } else {

            JOptionPane.showMessageDialog(null, "El usuario o la contraseña no coindiden");

        }
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adLogBackground;
    private javax.swing.JButton back;
    private javax.swing.JTextField email;
    private javax.swing.JLabel imageBanner;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel warningEmail;
    private javax.swing.JLabel warningPassword;
    // End of variables declaration//GEN-END:variables
}
