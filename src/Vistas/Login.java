/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import PrincipalM.*;
import javafx.scene.paint.Color;
import org.w3c.dom.css.RGBColor;


/**
 *
 * @author osvaldo
 */
public class Login extends javax.swing.JFrame {

    
    Registro b = new Registro();
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        TextPrompt p = new TextPrompt("Usuario", jtf_Usuario);
        TextPrompt a = new TextPrompt("Contraseña", jtf_Contraseña);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jp_login = new javax.swing.JPanel();
        btn_Iniciar = new javax.swing.JButton();
        lbl_olvideContraseña = new javax.swing.JLabel();
        lbl_ImagenLogin = new javax.swing.JLabel();
        lbl_iniciarSesion = new javax.swing.JLabel();
        jp_backgroun_password = new javax.swing.JPanel();
        jtf_Contraseña = new javax.swing.JTextField();
        jp_background_usuario = new javax.swing.JPanel();
        jtf_Usuario = new javax.swing.JTextField();
        lbl_registro = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setForeground(java.awt.Color.white);
        setLocationByPlatform(true);
        setName("fm_Login"); // NOI18N
        setResizable(false);

        jp_login.setBackground(new java.awt.Color(255, 255, 255));

        btn_Iniciar.setBackground(new java.awt.Color(20, 111, 246));
        btn_Iniciar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_Iniciar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Iniciar.setText("Iniciar sesion");
        btn_Iniciar.setAlignmentX(0.5F);
        btn_Iniciar.setBorder(null);
        btn_Iniciar.setName("btn_iniciar"); // NOI18N
        btn_Iniciar.setNextFocusableComponent(lbl_olvideContraseña);

        lbl_olvideContraseña.setBackground(new java.awt.Color(51, 255, 51));
        lbl_olvideContraseña.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbl_olvideContraseña.setForeground(new java.awt.Color(20, 111, 246));
        lbl_olvideContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_olvideContraseña.setText("Olvide mi contraseña");
        lbl_olvideContraseña.setName("lbl_olvideContraseña"); // NOI18N
        lbl_olvideContraseña.setNextFocusableComponent(lbl_registro);
        lbl_olvideContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl_olvideContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lbl_olvideContraseñaFocusLost(evt);
            }
        });
        lbl_olvideContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_olvideContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_olvideContraseñaMouseExited(evt);
            }
        });

        lbl_ImagenLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ImagenLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\osvaldo\\Documents\\ProyectoGRUD-TBD\\src\\Recursos\\user.png")); // NOI18N
        lbl_ImagenLogin.setName("lbl_imagenLogin"); // NOI18N

        lbl_iniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_iniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_iniciarSesion.setText("Iniciar Sesion");
        lbl_iniciarSesion.setName("lbl_iniciarSesion"); // NOI18N

        jp_backgroun_password.setBackground(new java.awt.Color(235, 235, 235));

        jtf_Contraseña.setBackground(new java.awt.Color(235, 235, 235));
        jtf_Contraseña.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jtf_Contraseña.setBorder(null);
        jtf_Contraseña.setName("jtf_usuario"); // NOI18N
        jtf_Contraseña.setSelectionEnd(10);

        javax.swing.GroupLayout jp_backgroun_passwordLayout = new javax.swing.GroupLayout(jp_backgroun_password);
        jp_backgroun_password.setLayout(jp_backgroun_passwordLayout);
        jp_backgroun_passwordLayout.setHorizontalGroup(
            jp_backgroun_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_backgroun_passwordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_Contraseña)
                .addContainerGap())
        );
        jp_backgroun_passwordLayout.setVerticalGroup(
            jp_backgroun_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_backgroun_passwordLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtf_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jp_background_usuario.setBackground(new java.awt.Color(235, 235, 235));

        jtf_Usuario.setBackground(new java.awt.Color(235, 235, 235));
        jtf_Usuario.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jtf_Usuario.setBorder(null);
        jtf_Usuario.setName("jtf_usuario"); // NOI18N

        javax.swing.GroupLayout jp_background_usuarioLayout = new javax.swing.GroupLayout(jp_background_usuario);
        jp_background_usuario.setLayout(jp_background_usuarioLayout);
        jp_background_usuarioLayout.setHorizontalGroup(
            jp_background_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_background_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_Usuario)
                .addContainerGap())
        );
        jp_background_usuarioLayout.setVerticalGroup(
            jp_background_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtf_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        lbl_registro.setBackground(new java.awt.Color(51, 255, 51));
        lbl_registro.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbl_registro.setForeground(new java.awt.Color(20, 111, 246));
        lbl_registro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_registro.setText("Registrate");
        lbl_registro.setName("lbl_Registro"); // NOI18N
        lbl_registro.setNextFocusableComponent(jtf_Usuario);
        lbl_registro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl_registroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lbl_registroFocusLost(evt);
            }
        });
        lbl_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_registroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_registroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_registroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jp_loginLayout = new javax.swing.GroupLayout(jp_login);
        jp_login.setLayout(jp_loginLayout);
        jp_loginLayout.setHorizontalGroup(
            jp_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_loginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jp_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_ImagenLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_iniciarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_loginLayout.createSequentialGroup()
                        .addComponent(lbl_olvideContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jp_backgroun_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_background_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jp_loginLayout.setVerticalGroup(
            jp_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_iniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ImagenLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jp_background_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_backgroun_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(lbl_olvideContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_olvideContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_olvideContraseñaFocusGained
        lbl_olvideContraseña.setForeground(new java.awt.Color(0,60,255));
    }//GEN-LAST:event_lbl_olvideContraseñaFocusGained

    private void lbl_olvideContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_olvideContraseñaFocusLost
        lbl_olvideContraseña.setForeground(new java.awt.Color(20, 111, 200));
    }//GEN-LAST:event_lbl_olvideContraseñaFocusLost

    private void lbl_registroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_registroFocusGained
        lbl_registro.setForeground(new java.awt.Color(0,60,255));
    }//GEN-LAST:event_lbl_registroFocusGained

    private void lbl_registroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_registroFocusLost
        lbl_registro.setForeground(new java.awt.Color(20, 111, 200));
    }//GEN-LAST:event_lbl_registroFocusLost

    private void lbl_olvideContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_olvideContraseñaMouseEntered
        lbl_olvideContraseña.setForeground(new java.awt.Color(0,60,255));
    }//GEN-LAST:event_lbl_olvideContraseñaMouseEntered

    private void lbl_olvideContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_olvideContraseñaMouseExited
        lbl_olvideContraseña.setForeground(new java.awt.Color(20, 111, 200));
    }//GEN-LAST:event_lbl_olvideContraseñaMouseExited

    private void lbl_registroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registroMouseEntered
        lbl_registro.setForeground(new java.awt.Color(0,60,255));
    }//GEN-LAST:event_lbl_registroMouseEntered

    private void lbl_registroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registroMouseExited
        lbl_registro.setForeground(new java.awt.Color(20, 111, 200));
    }//GEN-LAST:event_lbl_registroMouseExited

    private void lbl_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registroMouseClicked
        b.setVisible(true);
        this.setVisible(false);
        this.enable(false);
        
    }//GEN-LAST:event_lbl_registroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try { 
        javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        } catch (Exception ex) { 
        ex.printStackTrace(); 
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Iniciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jp_backgroun_password;
    private javax.swing.JPanel jp_background_usuario;
    private javax.swing.JPanel jp_login;
    private javax.swing.JTextField jtf_Contraseña;
    private javax.swing.JTextField jtf_Usuario;
    private javax.swing.JLabel lbl_ImagenLogin;
    private javax.swing.JLabel lbl_iniciarSesion;
    private javax.swing.JLabel lbl_olvideContraseña;
    private javax.swing.JLabel lbl_registro;
    // End of variables declaration//GEN-END:variables
}
