package com.mycompany.teladlogin;

import java.awt.event.ActionEvent;

public class telalogin extends javax.swing.JFrame {

    public telalogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TITULO_EMAIL_LOGIN = new javax.swing.JLabel();
        TITULO_SENHA_LOGIN = new javax.swing.JLabel();
        TITULO_LOGIN_SIG2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LOGO_BOMPAO_LOGIN = new javax.swing.JLabel();
        TITULO_BOMPAO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ESQ_SENHA_LOGIN = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        BT_ENTRAR_LOGIN3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        IMG_BACKGRUND_LOGIN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOM PÃO (SIG - SISTEMA INTEGRADO DE GESTÃO)");
        setMinimumSize(new java.awt.Dimension(1243, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITULO_EMAIL_LOGIN.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TITULO_EMAIL_LOGIN.setForeground(new java.awt.Color(255, 243, 211));
        TITULO_EMAIL_LOGIN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TITULO_EMAIL_LOGIN.setText("E-MAIL:");
        getContentPane().add(TITULO_EMAIL_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        TITULO_SENHA_LOGIN.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TITULO_SENHA_LOGIN.setForeground(new java.awt.Color(255, 243, 211));
        TITULO_SENHA_LOGIN.setText("SENHA:");
        getContentPane().add(TITULO_SENHA_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 100, -1));

        TITULO_LOGIN_SIG2.setBackground(new java.awt.Color(0, 0, 0));
        TITULO_LOGIN_SIG2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TITULO_LOGIN_SIG2.setForeground(new java.awt.Color(255, 243, 211));
        TITULO_LOGIN_SIG2.setText("SISTEMA INTEGRADO DE GESTÃO");
        getContentPane().add(TITULO_LOGIN_SIG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 440, 30));

        jLabel8.setBackground(new java.awt.Color(68, 45, 37));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 243, 211));
        jLabel8.setText("AINDA SEM CADASTRO?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, -1, -1));

        LOGO_BOMPAO_LOGIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1730577049734-d53051c6-8d4a-44e0-9eec-101dc7bcf838_1_2-removebg (1).png"))); // NOI18N
        LOGO_BOMPAO_LOGIN.setText("jLabel9");
        getContentPane().add(LOGO_BOMPAO_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 180, 210));

        TITULO_BOMPAO.setBackground(new java.awt.Color(0, 0, 0));
        TITULO_BOMPAO.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        TITULO_BOMPAO.setForeground(new java.awt.Color(255, 243, 211));
        TITULO_BOMPAO.setText("BOM PÃO");
        getContentPane().add(TITULO_BOMPAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 500, 80));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 243, 211));
        jLabel2.setText("Após informar os dados e preencher o formulário no site,");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 640, 380, 20));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 243, 211));
        jLabel3.setText("aguarde contato para agendamento e instalação do sistema.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 660, 410, 20));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 243, 211));
        jLabel1.setText("Acesse o site bompao.onrender.com/registro e faça seu cadastro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 430, 20));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 243, 211));
        jLabel4.setText("IMPORTANTE: Faça o mini curso de ultilização, e oferte aos funcionarios");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 690, 480, -1));

        ESQ_SENHA_LOGIN.setForeground(new java.awt.Color(255, 243, 211));
        ESQ_SENHA_LOGIN.setText("Esquecei minha senha ou e-mail!");
        getContentPane().add(ESQ_SENHA_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 180, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setText("LOGIN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 150, 30));

        jTextField7.setBackground(new java.awt.Color(255, 243, 211));
        jTextField7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(68, 45, 37));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 320, 40));

        jTextField9.setBackground(new java.awt.Color(255, 243, 211));
        jTextField9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(68, 45, 37));
        jTextField9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 320, 40));

        BT_ENTRAR_LOGIN3.setBackground(new java.awt.Color(255, 243, 211));
        BT_ENTRAR_LOGIN3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BT_ENTRAR_LOGIN3.setForeground(new java.awt.Color(68, 45, 37));
        BT_ENTRAR_LOGIN3.setText("ENTRAR");
        BT_ENTRAR_LOGIN3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_ENTRAR_LOGIN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ENTRAR_LOGIN3ActionPerformed(evt);
            }
        });
        getContentPane().add(BT_ENTRAR_LOGIN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 130, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setForeground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Registre-se");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 140, -1));

        IMG_BACKGRUND_LOGIN.setForeground(new java.awt.Color(230, 25, 117));
        IMG_BACKGRUND_LOGIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Home.png.png"))); // NOI18N
        getContentPane().add(IMG_BACKGRUND_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_ENTRAR_LOGIN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ENTRAR_LOGIN3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_ENTRAR_LOGIN3ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

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
            java.util.logging.Logger.getLogger(telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telalogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_ENTRAR_LOGIN3;
    private javax.swing.JLabel ESQ_SENHA_LOGIN;
    private javax.swing.JLabel IMG_BACKGRUND_LOGIN;
    private javax.swing.JLabel LOGO_BOMPAO_LOGIN;
    private javax.swing.JLabel TITULO_BOMPAO;
    private javax.swing.JLabel TITULO_EMAIL_LOGIN;
    private javax.swing.JLabel TITULO_LOGIN_SIG2;
    private javax.swing.JLabel TITULO_SENHA_LOGIN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
