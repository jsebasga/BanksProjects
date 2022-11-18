
package banksprojects;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import network.ApiManager;

/**
 *
 * @author Sebastian Güiza & Paola Montoya
 */
public class AdminView extends javax.swing.JFrame {

    DefaultListModel modelList = new DefaultListModel(); 
    
    public AdminView() {
        
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
        deletePMV = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        addPMV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsList = new javax.swing.JList<>();
        rol = new javax.swing.JLabel();
        changePassword = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        projectName = new javax.swing.JTextField();
        warningComment = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(166, 166, 166));
        jPanel1.setBounds(new java.awt.Rectangle(0, 0, 1000, 750));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 750));
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
        lastName.setText("Docente");
        jPanel1.add(lastName);
        lastName.setBounds(800, 390, 150, 40);

        deletePMV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deletePMV.setText("Eliminar PMV");
        deletePMV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePMVActionPerformed(evt);
            }
        });
        jPanel1.add(deletePMV);
        deletePMV.setBounds(800, 580, 170, 33);

        id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setText("655875");
        jPanel1.add(id);
        id.setBounds(800, 420, 150, 40);

        close.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        close.setText("Cerrar Sesion");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(800, 660, 170, 33);

        addPMV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addPMV.setText("Agregar PMV");
        addPMV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPMVActionPerformed(evt);
            }
        });
        jPanel1.add(addPMV);
        addPMV.setBounds(800, 540, 170, 33);

        commentsList.setBackground(new java.awt.Color(166, 166, 166));
        commentsList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        commentsList.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(commentsList);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 260, 640, 350);

        rol.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rol.setForeground(new java.awt.Color(0, 0, 0));
        rol.setText("655875");
        jPanel1.add(rol);
        rol.setBounds(800, 450, 150, 40);

        changePassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        changePassword.setText("Cambiar Contraseña");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(changePassword);
        changePassword.setBounds(800, 500, 170, 33);

        delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete.setText("Eliminar Cuenta");
        jPanel1.add(delete);
        delete.setBounds(800, 620, 170, 33);

        projectName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        projectName.setMaximumSize(new java.awt.Dimension(640, 70));
        projectName.setMinimumSize(new java.awt.Dimension(640, 70));
        projectName.setPreferredSize(new java.awt.Dimension(640, 70));
        jPanel1.add(projectName);
        projectName.setBounds(90, 620, 640, 70);

        warningComment.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        warningComment.setForeground(new java.awt.Color(255, 0, 0));
        warningComment.setText(" ");
        jPanel1.add(warningComment);
        warningComment.setBounds(90, 690, 640, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed

        RolView rolView = new RolView();
        rolView.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_closeActionPerformed

    private void deletePMVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePMVActionPerformed

        int deleteComment = commentsList.getSelectedIndex();
        modelList.remove(deleteComment);
        
        //TODO: Llamar al api para borrar un proyecto, apiManager.deleteProject
        
    }//GEN-LAST:event_deletePMVActionPerformed

    void setUser(User userResponse) {
  
        name.setText(userResponse.getName());
        lastName.setText(userResponse.getLastName());
        int idNumber = userResponse.getId();
        id.setText(Integer.toString(idNumber));    
        rol.setText(userResponse.getRol());

        
    }
    private void addPMVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPMVActionPerformed

        String project = projectName.getText();
        modelList.addElement(project);
        
        Project newProject = new Project();
        ApiManager manager = new ApiManager();
        
        if (projectName.getText().length()==0){
        warningComment.setText("Debe de llenar este espacio");
        
        
    }
        newProject.setProjectName(projectName.getText());
        
        manager.createProject(newProject);
        
        projectName.setText("");

    }//GEN-LAST:event_addPMVActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePasswordActionPerformed

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPMV;
    private javax.swing.JButton changePassword;
    private javax.swing.JButton close;
    private javax.swing.JList<String> commentsList;
    private javax.swing.JButton delete;
    private javax.swing.JButton deletePMV;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel name;
    private javax.swing.JTextField projectName;
    private javax.swing.JLabel rol;
    private javax.swing.JLabel warningComment;
    // End of variables declaration//GEN-END:variables
}
