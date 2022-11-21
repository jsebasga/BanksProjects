
package ViewController;

import Model.User;
import Model.Project;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import network.ApiManager;

/**
 *
 * @author Sebastian Güiza & Paola Montoya
 */

public class StudentView extends javax.swing.JFrame {

    DefaultListModel modelList = new DefaultListModel();
    ApiManager manager = new ApiManager();
    User studentUser = new User();

    public StudentView() {
      
        initComponents();
        modelList = new DefaultListModel();
        commentsList.setModel(modelList);
        ApiManager manager = new ApiManager();
        ArrayList<Project> projectsResponseList = manager.readProjects();
        
        for (int i = 0; i < projectsResponseList.size(); i++) {

        modelList.addElement(projectsResponseList.get(i).getProjectName());
        
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        rol = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        changePassword = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsList = new javax.swing.JList<>();
        updateView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1000, 750));
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(166, 166, 166));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 750));
        jPanel1.setSize(new java.awt.Dimension(1000, 750));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Banner PMV.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(78, 27, 850, 192);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(800, 220, 150, 150);

        name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Juan Sebastian");
        jPanel1.add(name);
        name.setBounds(800, 360, 150, 40);

        lastName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lastName.setForeground(new java.awt.Color(0, 0, 0));
        lastName.setText("Guiza Angulo");
        jPanel1.add(lastName);
        lastName.setBounds(800, 400, 150, 40);

        rol.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rol.setForeground(new java.awt.Color(0, 0, 0));
        rol.setText("655875");
        jPanel1.add(rol);
        rol.setBounds(800, 480, 150, 40);

        id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setText("655875");
        jPanel1.add(id);
        id.setBounds(800, 440, 150, 40);

        changePassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        changePassword.setText("Cambiar Contraseña");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(changePassword);
        changePassword.setBounds(800, 540, 170, 33);

        delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete.setText("Eliminar Cuenta");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(800, 620, 170, 33);

        close.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        close.setText("Cerrar Sesion");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(800, 660, 170, 33);

        commentsList.setBackground(new java.awt.Color(166, 166, 166));
        commentsList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        commentsList.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(commentsList);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 260, 640, 440);

        updateView.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateView.setText("Actualizar");
        updateView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateViewActionPerformed(evt);
            }
        });
        jPanel1.add(updateView);
        updateView.setBounds(800, 580, 170, 33);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
       
        RolView rolView = new RolView();
        rolView.setVisible(true);
        this.setVisible(false);
         
    }//GEN-LAST:event_closeActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed

        String oldPassword = JOptionPane.showInputDialog("Escribe tu contraseña actual");
        
        if (oldPassword.equals(studentUser.getPassword())){
            
            String newPassword = JOptionPane.showInputDialog("Escribe tu contraseña nueva");
            
            User updateUser = new User();
            updateUser.setPassword(newPassword);
            manager.updateUser(studentUser, updateUser);
            JOptionPane.showMessageDialog(null, "Contraseña actualizada exitosamente");

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
        }
        
    }//GEN-LAST:event_changePasswordActionPerformed

    private void updateViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateViewActionPerformed
        
        modelList.removeAllElements();
        
        ApiManager manager = new ApiManager();
        ArrayList<Project> projectsResponseList = manager.readProjects();
        for (int i = 0; i < projectsResponseList.size(); i++) {
        modelList.addElement(projectsResponseList.get(i).getProjectName());
        }
        
    }//GEN-LAST:event_updateViewActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       
        int option = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar su cuenta?\nLos cambios no seran reversibles");
        
        if (option == JOptionPane.YES_OPTION){
            
            manager.deleteUser(studentUser);
            JOptionPane.showMessageDialog(null, "Cuenta eliminada");
            RolView rolView = new RolView();
            rolView.setVisible(true);
            this.setVisible(false);
            
        }    
        
    }//GEN-LAST:event_deleteActionPerformed

    void setUser(User userResponse) {
  
        studentUser = userResponse;
        name.setText(userResponse.getName());
        lastName.setText(userResponse.getLastName());
        id.setText(userResponse.getId());
        rol.setText(userResponse.getRol());
        
    }

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePassword;
    private javax.swing.JButton close;
    private javax.swing.JList<String> commentsList;
    private javax.swing.JButton delete;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel name;
    private javax.swing.JLabel rol;
    private javax.swing.JButton updateView;
    // End of variables declaration//GEN-END:variables
}
