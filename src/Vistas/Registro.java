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
public class Registro extends javax.swing.JFrame {
    /**
     * Creates new form Login
     */
    public Registro() {
        initComponents();
        TextPrompt p = new TextPrompt("Usuario", jtf_UsuarioR);
        TextPrompt a = new TextPrompt("Contraseña", jtf_ContraseñaR);
        TextPrompt c = new TextPrompt("Confirmar Contraseña", jtf_ContraseñaRConfirmar);
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
        jp_Registro = new javax.swing.JPanel();
        btn_Registrar = new javax.swing.JButton();
        lbl_olvideContraseña = new javax.swing.JLabel();
        lbl_ImagenRegistrto = new javax.swing.JLabel();
        lbl_Registrate = new javax.swing.JLabel();
        jp_backgroun_passwordR = new javax.swing.JPanel();
        jtf_ContraseñaR = new javax.swing.JTextField();
        jp_background_usuarioR = new javax.swing.JPanel();
        jtf_UsuarioR = new javax.swing.JTextField();
        lbl_inicioSesion = new javax.swing.JLabel();
        jp_backgroun_passwordR1 = new javax.swing.JPanel();
        jtf_ContraseñaRConfirmar = new javax.swing.JTextField();

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
        setName("fm_LoginR"); // NOI18N
        setResizable(false);

        jp_Registro.setBackground(new java.awt.Color(255, 255, 255));

        btn_Registrar.setBackground(new java.awt.Color(20, 111, 246));
        btn_Registrar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registrar.setText("Registrar");
        btn_Registrar.setAlignmentX(0.5F);
        btn_Registrar.setBorder(null);
        btn_Registrar.setName("btn_iniciar"); // NOI18N
        btn_Registrar.setNextFocusableComponent(lbl_olvideContraseña);

        lbl_olvideContraseña.setBackground(new java.awt.Color(51, 255, 51));
        lbl_olvideContraseña.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbl_olvideContraseña.setForeground(new java.awt.Color(20, 111, 246));
        lbl_olvideContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_olvideContraseña.setText("Olvide mi contraseña");
        lbl_olvideContraseña.setName("lbl_olvideContraseña"); // NOI18N
        lbl_olvideContraseña.setNextFocusableComponent(lbl_inicioSesion);
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

        lbl_ImagenRegistrto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ImagenRegistrto.setIcon(new javax.swing.ImageIcon("C:\\Users\\osvaldo\\Documents\\ProyectoGRUD-TBD\\src\\Recursos\\user.png")); // NOI18N
        lbl_ImagenRegistrto.setName("lbl_imagenLogin"); // NOI18N

        lbl_Registrate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Registrate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Registrate.setText("Registrate");
        lbl_Registrate.setName("lbl_Registrate"); // NOI18N

        jp_backgroun_passwordR.setBackground(new java.awt.Color(235, 235, 235));

        jtf_ContraseñaR.setBackground(new java.awt.Color(235, 235, 235));
        jtf_ContraseñaR.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jtf_ContraseñaR.setBorder(null);
        jtf_ContraseñaR.setName("jtf_usuario"); // NOI18N
        jtf_ContraseñaR.setSelectionEnd(10);

        javax.swing.GroupLayout jp_backgroun_passwordRLayout = new javax.swing.GroupLayout(jp_backgroun_passwordR);
        jp_backgroun_passwordR.setLayout(jp_backgroun_passwordRLayout);
        jp_backgroun_passwordRLayout.setHorizontalGroup(
            jp_backgroun_passwordRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_backgroun_passwordRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_ContraseñaR)
                .addContainerGap())
        );
        jp_backgroun_passwordRLayout.setVerticalGroup(
            jp_backgroun_passwordRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_backgroun_passwordRLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtf_ContraseñaR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jp_background_usuarioR.setBackground(new java.awt.Color(235, 235, 235));

        jtf_UsuarioR.setBackground(new java.awt.Color(235, 235, 235));
        jtf_UsuarioR.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jtf_UsuarioR.setBorder(null);
        jtf_UsuarioR.setName("jtf_usuario"); // NOI18N

        javax.swing.GroupLayout jp_background_usuarioRLayout = new javax.swing.GroupLayout(jp_background_usuarioR);
        jp_background_usuarioR.setLayout(jp_background_usuarioRLayout);
        jp_background_usuarioRLayout.setHorizontalGroup(
            jp_background_usuarioRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_background_usuarioRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_UsuarioR)
                .addContainerGap())
        );
        jp_background_usuarioRLayout.setVerticalGroup(
            jp_background_usuarioRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtf_UsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbl_inicioSesion.setBackground(new java.awt.Color(51, 255, 51));
        lbl_inicioSesion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbl_inicioSesion.setForeground(new java.awt.Color(20, 111, 246));
        lbl_inicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_inicioSesion.setText("Iniciar Sesion");
        lbl_inicioSesion.setName("lbl_Registro"); // NOI18N
        lbl_inicioSesion.setNextFocusableComponent(jtf_UsuarioR);
        lbl_inicioSesion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl_inicioSesionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lbl_inicioSesionFocusLost(evt);
            }
        });
        lbl_inicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_inicioSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_inicioSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_inicioSesionMouseExited(evt);
            }
        });

        jp_backgroun_passwordR1.setBackground(new java.awt.Color(235, 235, 235));

        jtf_ContraseñaRConfirmar.setBackground(new java.awt.Color(235, 235, 235));
        jtf_ContraseñaRConfirmar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jtf_ContraseñaRConfirmar.setBorder(null);
        jtf_ContraseñaRConfirmar.setName("jtf_usuario"); // NOI18N
        jtf_ContraseñaRConfirmar.setSelectionEnd(10);

        javax.swing.GroupLayout jp_backgroun_passwordR1Layout = new javax.swing.GroupLayout(jp_backgroun_passwordR1);
        jp_backgroun_passwordR1.setLayout(jp_backgroun_passwordR1Layout);
        jp_backgroun_passwordR1Layout.setHorizontalGroup(
            jp_backgroun_passwordR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_backgroun_passwordR1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_ContraseñaRConfirmar)
                .addContainerGap())
        );
        jp_backgroun_passwordR1Layout.setVerticalGroup(
            jp_backgroun_passwordR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_backgroun_passwordR1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtf_ContraseñaRConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jp_RegistroLayout = new javax.swing.GroupLayout(jp_Registro);
        jp_Registro.setLayout(jp_RegistroLayout);
        jp_RegistroLayout.setHorizontalGroup(
            jp_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_RegistroLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jp_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_ImagenRegistrto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_RegistroLayout.createSequentialGroup()
                        .addComponent(lbl_olvideContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_inicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jp_backgroun_passwordR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_background_usuarioR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_backgroun_passwordR1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Registrate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jp_RegistroLayout.setVerticalGroup(
            jp_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Registrate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_ImagenRegistrto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_background_usuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_backgroun_passwordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_backgroun_passwordR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_inicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(lbl_olvideContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        btn_Registrar.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_inicioSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_inicioSesionMouseExited
        lbl_inicioSesion.setForeground(new java.awt.Color(20, 111, 200));
    }//GEN-LAST:event_lbl_inicioSesionMouseExited

    private void lbl_inicioSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_inicioSesionMouseEntered
        lbl_inicioSesion.setForeground(new java.awt.Color(0,60,255));
    }//GEN-LAST:event_lbl_inicioSesionMouseEntered

    private void lbl_inicioSesionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_inicioSesionFocusLost
        lbl_inicioSesion.setForeground(new java.awt.Color(20, 111, 200));
    }//GEN-LAST:event_lbl_inicioSesionFocusLost

    private void lbl_inicioSesionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_inicioSesionFocusGained
        lbl_inicioSesion.setForeground(new java.awt.Color(0,60,255));
    }//GEN-LAST:event_lbl_inicioSesionFocusGained

    private void lbl_olvideContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_olvideContraseñaMouseExited
        lbl_olvideContraseña.setForeground(new java.awt.Color(20, 111, 200));
    }//GEN-LAST:event_lbl_olvideContraseñaMouseExited

    private void lbl_olvideContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_olvideContraseñaMouseEntered
        lbl_olvideContraseña.setForeground(new java.awt.Color(0,60,255));
    }//GEN-LAST:event_lbl_olvideContraseñaMouseEntered

    private void lbl_olvideContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_olvideContraseñaFocusLost
        lbl_olvideContraseña.setForeground(new java.awt.Color(20, 111, 200));
    }//GEN-LAST:event_lbl_olvideContraseñaFocusLost

    private void lbl_olvideContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_olvideContraseñaFocusGained
        lbl_olvideContraseña.setForeground(new java.awt.Color(0,60,255));
    }//GEN-LAST:event_lbl_olvideContraseñaFocusGained

    private void lbl_inicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_inicioSesionMouseClicked

        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_inicioSesionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jp_Registro;
    private javax.swing.JPanel jp_backgroun_passwordR;
    private javax.swing.JPanel jp_backgroun_passwordR1;
    private javax.swing.JPanel jp_background_usuarioR;
    private javax.swing.JTextField jtf_ContraseñaR;
    private javax.swing.JTextField jtf_ContraseñaRConfirmar;
    private javax.swing.JTextField jtf_UsuarioR;
    private javax.swing.JLabel lbl_ImagenRegistrto;
    private javax.swing.JLabel lbl_Registrate;
    private javax.swing.JLabel lbl_inicioSesion;
    private javax.swing.JLabel lbl_olvideContraseña;
    // End of variables declaration//GEN-END:variables
}
