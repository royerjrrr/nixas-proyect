package vista;

import com.formdev.flatlaf.FlatIntelliJLaf;
import controlador.loginCtrl;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ventanaLogin extends javax.swing.JFrame {

    public ventanaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTransparente1 = new LIB.JPanelTransparente();
        CampoUsuario = new componentes.TextField();
        CampoContraseña = new componentes.PasswordField();
        OlvidasteContraseña = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        TituloInicioSesion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ImgFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTransparente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoUsuario.setHint("Usuario");
        jPanelTransparente1.add(CampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 220, -1));

        CampoContraseña.setHint("Contraseña");
        jPanelTransparente1.add(CampoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 220, -1));

        OlvidasteContraseña.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        OlvidasteContraseña.setForeground(new java.awt.Color(255, 255, 255));
        OlvidasteContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OlvidasteContraseña.setText("¿ Olvidaste tu contraseña ?");
        jPanelTransparente1.add(OlvidasteContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 230, -1));

        BtnLogin.setBackground(new java.awt.Color(22, 18, 38));
        BtnLogin.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        BtnLogin.setText("INGRESAR");
        jPanelTransparente1.add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 260, 50));

        TituloInicioSesion.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        TituloInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        TituloInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloInicioSesion.setText("Iniciar Sesión");
        jPanelTransparente1.add(TituloInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/img/IconoUsuario.png"))); // NOI18N
        jPanelTransparente1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/img/IconoContraseña.png"))); // NOI18N
        jPanelTransparente1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 40));

        getContentPane().add(jPanelTransparente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 370, 510));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/img/IconoEquis.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/img/MejorLogo (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ImgFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/img/Fondo_Login.gif"))); // NOI18N
        getContentPane().add(ImgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        ventanaLogin login = new ventanaLogin();
        loginCtrl lox = new loginCtrl(login);
        login.setVisible(true);
                //new ventanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnLogin;
    private componentes.PasswordField CampoContraseña;
    private componentes.TextField CampoUsuario;
    private javax.swing.JLabel ImgFondo;
    private javax.swing.JLabel OlvidasteContraseña;
    private javax.swing.JLabel TituloInicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private LIB.JPanelTransparente jPanelTransparente1;
    // End of variables declaration//GEN-END:variables

    public  JButton getBtnLogin() {
        return BtnLogin;
    }

    public  JPasswordField getCampoContraseña() {
        return CampoContraseña;
    }

    public  JTextField getCampoUsuario() {
        return CampoUsuario;
    }
}