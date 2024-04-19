
package org.example;

import org.example.dataManipulation.DataManipulation;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Program extends javax.swing.JFrame {
    private DataManipulation dm = new DataManipulation();
    public Program() {
        initComponents();
        dm.generateBookshelf();
        jTreeUsers.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Пользователи")));
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
        jTextFieldCountUser = new javax.swing.JTextField();
        jButtonCreateUsers = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTreeUsers = new javax.swing.JTree();
        jLabelUserCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCreateUsers.setText("Создать");
        jButtonCreateUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateUsersActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTreeUsers);

        jLabelUserCount.setText("Введите кол-во пользователей:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonCreateUsers)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextFieldCountUser)
                                                .addComponent(jLabelUserCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabelUserCount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCountUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButtonCreateUsers)
                                .addContainerGap(491, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateUsersActionPerformed

        try{
        int count = Integer.parseInt(jTextFieldCountUser.getText());
        if(count<1) throw new Exception("Неправильный ввод");
        dm.generateUsers(count);
        dm.generateBook2Users();
        jTreeUsers.setModel(new DefaultTreeModel(dm.addInfo2GUI()));
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog (null, "Ошибка ввода", "Oшибка", JOptionPane.ERROR_MESSAGE);
            jTreeUsers.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Пользователи")));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog (null, ex.getMessage(), "Oшибка", JOptionPane.ERROR_MESSAGE);
            jTreeUsers.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Пользователи")));
        }
        jTextFieldCountUser.setText("");
    }//GEN-LAST:event_jButtonCreateUsersActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateUsers;
    private javax.swing.JLabel jLabelUserCount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCountUser;
    private javax.swing.JTree jTreeUsers;
    // End of variables declaration//GEN-END:variables
}
