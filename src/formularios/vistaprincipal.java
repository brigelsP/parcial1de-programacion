/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import usuarios.Usuario;
import validacion.Validar;

/**
 *
 * @author Brigels Pacheco
 */
public class vistaprincipal extends javax.swing.JFrame {

    /**
     * Creates new form vistaprincipal
     */
    
    private void execLogin(){
        
        String user = txtUsuario.getText();
        user.toLowerCase();
        String pass = String.copyValueOf(txtContrasena.getPassword());
        
         if(!Validar.email(user)){
            
            warninglbl.setText("Usuario Invalido");
            return;
        }
         
        if(!Validar.password(pass)){
            
             warninglbl.setText("Contraseña Invalida");
             return;
        
        }
           
        
        int userPos = -1;
    
        for(int i = 0; i < dbase.length; i++){
            
            if(dbase[i] == null){
                warninglbl.setText("Usuario inexistente (null)");
                return;
            }
            
            if(dbase[i].getUser().equals(user)){
            
                userPos = i;
                break;
            }
            
        }
        
        if (userPos == -1) {
            warninglbl.setText("Usuario Inexistente");
            return;
        }
        
        if(!dbase[userPos].checkPassword(pass)){
        
            warninglbl.setText("Contraseña Incorrecta");
            return;
        }
             
        System.out.println("Exito");
        bienvenida verbienvenida = new bienvenida(dbase[userPos].getUser());
        verbienvenida.setVisible(true);

        dispose();
        
        
    }
    
    private Usuario[] dbase;
    
    public vistaprincipal() {
        
        //quitar los bordes de la pantalla
        vistaprincipal.super.setUndecorated(true);
        
        dbase = Usuario.fill();
        
             
        //centrarlo
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width / 2, height / 2);

        setLocationRelativeTo(null);
        setVisible(true);
        
         

        initComponents();
        
        

        //color de fondo
        //this.getContentPane().setBackground(Color.WHITE);
        //imagen de la ues
        ImageIcon fot = new ImageIcon("src/imagenes/logo-ues-png-4.png");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setIcon(icono);
        this.repaint();

        //ubicar el foco en el primer textfield
        txtUsuario.requestFocus();

        //foto de grupo
        ImageIcon fotodeGrupo = new ImageIcon("src/imagenes/Fotodeequipo.jpg");
        Icon iconogrupo = new ImageIcon(fotodeGrupo.getImage().getScaledInstance(fotoGrupo.getWidth(), fotoGrupo.getHeight(), Image.SCALE_DEFAULT));
        fotoGrupo.setIcon(iconogrupo);
        this.repaint();

//image del fondo
        ImageIcon fondo1 = new ImageIcon("src/imagenes/ues_fondo02.jpg");
        Icon iconosalida = new ImageIcon(fondo1.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(iconosalida);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistro = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblcontra = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnRegistro = new javax.swing.JButton();
        lblIngresar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        fotoGrupo = new javax.swing.JLabel();
        lblRegistrarse = new javax.swing.JLabel();
        lblCambiar1 = new javax.swing.JLabel();
        warninglbl = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar"));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblcontra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblcontra.setText("contraseña: ");

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyPressed(evt);
            }
        });

        btnRegistro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistro.setText("ingresar");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        lblIngresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresar.setText("Ingresar");

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcontra, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(258, 258, 258))
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addComponent(lblIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcontra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistro)
                .addGap(28, 28, 28))
        );

        getContentPane().add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 380, 170));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setText("salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 29));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 62, 56));
        getContentPane().add(fotoGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 100));

        lblRegistrarse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarse.setText("Registrarse");
        lblRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseClicked(evt);
            }
        });
        getContentPane().add(lblRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        lblCambiar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCambiar1.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiar1.setText("Cambiar contraseña");
        lblCambiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCambiar1MouseClicked(evt);
            }
        });
        getContentPane().add(lblCambiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        warninglbl.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(warninglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtContrasena.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        execLogin();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void lblRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseClicked
        formRegistro verformulario = new formRegistro();
        verformulario.setVisible(true);

        dispose();

    }//GEN-LAST:event_lblRegistrarseMouseClicked

    private void txtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            execLogin();
        }
    }//GEN-LAST:event_txtContrasenaKeyPressed

    private void lblCambiar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiar1MouseClicked
        formContrasena verformulario = new formContrasena();
        verformulario.setVisible(true);

        dispose();

    }//GEN-LAST:event_lblCambiar1MouseClicked

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
            java.util.logging.Logger.getLogger(vistaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fotoGrupo;
    private javax.swing.JLabel lblCambiar1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblcontra;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel warninglbl;
    // End of variables declaration//GEN-END:variables
}
