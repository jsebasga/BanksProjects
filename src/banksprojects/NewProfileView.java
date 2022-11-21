
package banksprojects;

import javax.swing.JOptionPane;
import network.ApiManager;

/**
 *
 * @author Sebastian Güiza & Paola Montoya
 */
public class NewProfileView extends javax.swing.JFrame {

    public NewProfileView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adLogBackground = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        imageBanner = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        rol = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        login = new javax.swing.JButton();
        user2 = new javax.swing.JLabel();
        user3 = new javax.swing.JLabel();
        user4 = new javax.swing.JLabel();
        user5 = new javax.swing.JLabel();
        user6 = new javax.swing.JLabel();
        warningName = new javax.swing.JLabel();
        warningLastname = new javax.swing.JLabel();
        warningConfirm = new javax.swing.JLabel();
        warningId = new javax.swing.JLabel();
        warningEmail = new javax.swing.JLabel();
        warningPassword = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(null);

        adLogBackground.setBackground(new java.awt.Color(166, 166, 166));
        adLogBackground.setLayout(null);

        user.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 0));
        user.setText("Contraseña *:");
        adLogBackground.add(user);
        user.setBounds(500, 360, 180, 30);

        imageBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Crear Cuenta Banner.png"))); // NOI18N
        adLogBackground.add(imageBanner);
        imageBanner.setBounds(100, 50, 800, 200);

        user1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        user1.setForeground(new java.awt.Color(0, 0, 0));
        user1.setText("Confirmar Contraseña *:");
        adLogBackground.add(user1);
        user1.setBounds(500, 450, 290, 30);

        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        adLogBackground.add(name);
        name.setBounds(100, 310, 240, 30);

        lastName.setBackground(new java.awt.Color(204, 204, 204));
        lastName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        adLogBackground.add(lastName);
        lastName.setBounds(100, 400, 240, 30);

        id.setBackground(new java.awt.Color(204, 204, 204));
        id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        adLogBackground.add(id);
        id.setBounds(100, 490, 240, 30);

        email.setBackground(new java.awt.Color(204, 204, 204));
        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        adLogBackground.add(email);
        email.setBounds(500, 310, 240, 30);

        rol.setBackground(new java.awt.Color(204, 204, 204));
        rol.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        rol.setForeground(new java.awt.Color(0, 0, 0));
        rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente", "Estudiante" }));
        rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolActionPerformed(evt);
            }
        });
        adLogBackground.add(rol);
        rol.setBounds(100, 585, 240, 30);

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        adLogBackground.add(back);
        back.setBounds(300, 650, 150, 50);

        login.setBackground(new java.awt.Color(204, 204, 204));
        login.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("Ingresar");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        adLogBackground.add(login);
        login.setBounds(550, 650, 150, 50);

        user2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        user2.setForeground(new java.awt.Color(0, 0, 0));
        user2.setText("Correo Electronico *:");
        adLogBackground.add(user2);
        user2.setBounds(500, 270, 260, 30);

        user3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        user3.setForeground(new java.awt.Color(0, 0, 0));
        user3.setText("Nombre *:");
        adLogBackground.add(user3);
        user3.setBounds(100, 270, 130, 30);

        user4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        user4.setForeground(new java.awt.Color(0, 0, 0));
        user4.setText("Apellido *:");
        adLogBackground.add(user4);
        user4.setBounds(100, 360, 130, 30);

        user5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        user5.setForeground(new java.awt.Color(0, 0, 0));
        user5.setText("ID Universitario *:");
        adLogBackground.add(user5);
        user5.setBounds(100, 450, 230, 30);

        user6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        user6.setForeground(new java.awt.Color(0, 0, 0));
        user6.setText("Rol *:");
        adLogBackground.add(user6);
        user6.setBounds(100, 540, 70, 30);

        warningName.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        warningName.setForeground(new java.awt.Color(255, 0, 0));
        warningName.setText(" ");
        adLogBackground.add(warningName);
        warningName.setBounds(100, 340, 240, 16);

        warningLastname.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        warningLastname.setForeground(new java.awt.Color(255, 0, 0));
        warningLastname.setText(" ");
        adLogBackground.add(warningLastname);
        warningLastname.setBounds(100, 430, 240, 16);

        warningConfirm.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        warningConfirm.setForeground(new java.awt.Color(255, 0, 0));
        warningConfirm.setText(" ");
        adLogBackground.add(warningConfirm);
        warningConfirm.setBounds(500, 520, 240, 16);

        warningId.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        warningId.setForeground(new java.awt.Color(255, 0, 0));
        warningId.setText(" ");
        adLogBackground.add(warningId);
        warningId.setBounds(100, 520, 240, 16);

        warningEmail.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        warningEmail.setForeground(new java.awt.Color(255, 0, 0));
        warningEmail.setText(" ");
        adLogBackground.add(warningEmail);
        warningEmail.setBounds(500, 340, 240, 16);

        warningPassword.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        warningPassword.setForeground(new java.awt.Color(255, 0, 0));
        warningPassword.setText(" ");
        adLogBackground.add(warningPassword);
        warningPassword.setBounds(500, 430, 240, 16);

        confirmPassword.setBackground(new java.awt.Color(204, 204, 204));
        confirmPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        adLogBackground.add(confirmPassword);
        confirmPassword.setBounds(500, 490, 240, 30);

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        adLogBackground.add(password);
        password.setBounds(500, 400, 240, 30);

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

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
      
        User newUser = new User();
        ApiManager manager = new ApiManager();
        
        if (name.getText().length()==0){
        warningName.setText("Debe de llenar este espacio");
    }
        if (lastName.getText().length()==0){
        warningLastname.setText("Debe de llenar este espacio");
    }
        if (id.getText().length()==0){
        warningId.setText("Debe de llenar este espacio");
    }
        if (email.getText().length()==0){
        warningEmail.setText("Debe de llenar este espacio");
    }
        if (password.getText().length()==0){
        warningPassword.setText("Debe de llenar este espacio");
    }
        if (confirmPassword.getText().length()==0){
        warningConfirm.setText("Debe de llenar este espacio");
    }
        if (password.getText().equals(confirmPassword.getText())) {
            
            newUser.setName(name.getText());
            newUser.setLastName(lastName.getText());
            newUser.setEmail(email.getText());
            newUser.setId(id.getText());
            newUser.setPassword(password.getText());
            newUser.setRol(rol.getSelectedItem().toString());

            if (rol.getSelectedItem().equals("Estudiante")){
            
            StudentView studentView = new StudentView();
            studentView.setUser(newUser);
            studentView.setVisible(true);
            this.setVisible(false);
            
        } else if (rol.getSelectedItem().equals("Docente")){
            
            AdminView adminView = new AdminView();
            adminView.setUser(newUser);
            adminView.setVisible(true);
            this.setVisible(false);
        }
            
            manager.createUser(newUser);
            
        } else {
            
            JOptionPane.showMessageDialog(null,"La contraseña no coindide");
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
            java.util.logging.Logger.getLogger(NewProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewProfileView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adLogBackground;
    private javax.swing.JButton back;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imageBanner;
    private javax.swing.JTextField lastName;
    private javax.swing.JButton login;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> rol;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user2;
    private javax.swing.JLabel user3;
    private javax.swing.JLabel user4;
    private javax.swing.JLabel user5;
    private javax.swing.JLabel user6;
    private javax.swing.JLabel warningConfirm;
    private javax.swing.JLabel warningEmail;
    private javax.swing.JLabel warningId;
    private javax.swing.JLabel warningLastname;
    private javax.swing.JLabel warningName;
    private javax.swing.JLabel warningPassword;
    // End of variables declaration//GEN-END:variables
}
