/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2.lightout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author emerson / paulo / jessica / carol
 */
public class TPrincipal extends javax.swing.JFrame {
    
    private Timer t;
    private int cont = 0;

    Funcao func = new Funcao();
    
    
    public TPrincipal() {
        initComponents();
        painelRegras.setVisible(false);
        inicioLogo.setVisible(true);
        esperar();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicioLogo = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        painelRegras = new javax.swing.JDesktopPane();
        jButton2 = new javax.swing.JButton();
        Labelregra = new javax.swing.JLabel();
        Play = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelfundoInicial = new javax.swing.JLabel();
        imageregras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lights Out");
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2/lightout/Sprite/logoMenor.png"))); // NOI18N
        inicioLogo.add(jLabel1);
        jLabel1.setBounds(60, 10, 400, 250);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel5");
        jLabel5.setOpaque(true);
        inicioLogo.add(jLabel5);
        jLabel5.setBounds(0, 0, 500, 350);

        getContentPane().add(inicioLogo);
        inicioLogo.setBounds(0, 0, 500, 350);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        painelRegras.add(jButton2);
        jButton2.setBounds(390, 300, 60, 23);

        Labelregra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2/lightout/Sprite/regras.png"))); // NOI18N
        painelRegras.add(Labelregra);
        Labelregra.setBounds(0, 0, 500, 350);

        getContentPane().add(painelRegras);
        painelRegras.setBounds(0, 0, 500, 350);

        Play.setBackground(new java.awt.Color(255, 255, 255));
        Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2/lightout/Sprite/playBranco.png"))); // NOI18N
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        getContentPane().add(Play);
        Play.setBounds(230, 270, 30, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Regras");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 40, 50, 14);

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2/lightout/Sprite/menu1.png"))); // NOI18N
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu);
        menu.setBounds(450, 10, 30, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Play");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 300, 30, 17);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Light Out");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 80, 70, 50);

        LabelfundoInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2/lightout/Sprite/fundo.gif"))); // NOI18N
        getContentPane().add(LabelfundoInicial);
        LabelfundoInicial.setBounds(0, 0, 500, 350);
        getContentPane().add(imageregras);
        imageregras.setBounds(0, 0, 500, 350);

        setSize(new java.awt.Dimension(516, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        // TODO add your handling code here:
        new TelaJogo().setVisible(true);
        this.dispose();
        
        
        
      
    }//GEN-LAST:event_PlayActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        painelRegras.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        painelRegras.setVisible(true);
    }//GEN-LAST:event_menuActionPerformed
      
    public void esperar(){
        //inicioLogo.setVisible(true);
        // try{Thread.sleep(3000);}catch(Exception erro){}
        t = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            cont++;
            if(cont==2){
                inicioLogo.setVisible(false);
            }
            }
        });
        t.start();
    }
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
            java.util.logging.Logger.getLogger(TPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelfundoInicial;
    private javax.swing.JLabel Labelregra;
    private javax.swing.JButton Play;
    private javax.swing.JLabel imageregras;
    private javax.swing.JDesktopPane inicioLogo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton menu;
    private javax.swing.JDesktopPane painelRegras;
    // End of variables declaration//GEN-END:variables
}
