package sigemonitoria.vista.conta;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import sigemonitoria.Sigemonitoria;
import sigemonitoria.modelo.Utilizador;
import sigemonitoria.vista.MenuPrincipal;

/**
 *
 * @author Meldo Maunze
 */
public class AlterarSenha extends javax.swing.JFrame {

    Utilizador usuario;

    /**
     *
     * @param usuario
     */
    public AlterarSenha(Utilizador usuario) {
        initComponents();
        this.usuario = usuario;
        this.usernameTXT.setText(usuario.getNomeCompleto());
        this.hospital.setText(usuario.getHospital().getNomeHospital());

    }

    private AlterarSenha() {
        initComponents();
    }

    /**
     * Creates new form MenuPrincipal
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        esquerda = new javax.swing.JPanel();
        emblema = new javax.swing.JLabel();
        republica = new javax.swing.JLabel();
        provincia = new javax.swing.JLabel();
        servicos = new javax.swing.JLabel();
        hospital = new javax.swing.JLabel();
        lema = new javax.swing.JLabel();
        sistema1 = new javax.swing.JLabel();
        sistema2 = new javax.swing.JLabel();
        usernameTXT = new javax.swing.JButton();
        direita = new javax.swing.JPanel();
        senha = new javax.swing.JPasswordField();
        alterarSenhaBtn = new javax.swing.JButton();
        senhaActualTxt = new javax.swing.JLabel();
        novaSenhaTxt = new javax.swing.JLabel();
        novaSenha = new javax.swing.JPasswordField();
        confirmarNovaSenhaTxt = new javax.swing.JLabel();
        confirmarNovaSenha = new javax.swing.JPasswordField();
        terminarSessao = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Alterar Senha");

        esquerda.setBackground(new java.awt.Color(255, 255, 255));
        esquerda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        emblema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sigemonitoria/vista/imagens/emblema.png"))); // NOI18N
        emblema.setToolTipText("");

        republica.setText("Republica de Moçambique");

        provincia.setText("Provincia de Nampula");

        servicos.setText("Serviço Provincial de Saúde");

        hospital.setText("Nome do Hospital");

        lema.setText("O nosso maior valor e a vida");

        sistema1.setText("Sistema de Informação e Monitoria da Saúde");

        sistema2.setText(" de Funcionários  Com  Doenças Crónicas");

        usernameTXT.setText("username");
        usernameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout esquerdaLayout = new javax.swing.GroupLayout(esquerda);
        esquerda.setLayout(esquerdaLayout);
        esquerdaLayout.setHorizontalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerdaLayout.createSequentialGroup()
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(sistema2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(usernameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(esquerdaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(provincia))
                    .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                            .addComponent(emblema)
                            .addGap(117, 117, 117))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                            .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(servicos)
                                .addComponent(republica))
                            .addGap(66, 66, 66)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                        .addComponent(hospital)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                        .addComponent(sistema1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                        .addComponent(lema)
                        .addGap(51, 51, 51))))
        );
        esquerdaLayout.setVerticalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerdaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emblema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(republica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hospital)
                .addGap(24, 24, 24)
                .addComponent(sistema1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sistema2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usernameTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lema, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        direita.setPreferredSize(new java.awt.Dimension(700, 400));

        senha.setForeground(new java.awt.Color(0, 153, 204));
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        alterarSenhaBtn.setBackground(new java.awt.Color(255, 102, 0));
        alterarSenhaBtn.setForeground(new java.awt.Color(255, 255, 255));
        alterarSenhaBtn.setText("Alterar Senha");
        alterarSenhaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaBtnActionPerformed(evt);
            }
        });

        senhaActualTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaActualTxt.setText("Senha Actual");

        novaSenhaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        novaSenhaTxt.setText("Nova Senha");

        novaSenha.setForeground(new java.awt.Color(0, 153, 204));
        novaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaSenhaActionPerformed(evt);
            }
        });

        confirmarNovaSenhaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmarNovaSenhaTxt.setText("Confirmar Senha");

        confirmarNovaSenha.setForeground(new java.awt.Color(0, 153, 204));
        confirmarNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarNovaSenhaActionPerformed(evt);
            }
        });

        terminarSessao.setBackground(new java.awt.Color(255, 0, 0));
        terminarSessao.setForeground(new java.awt.Color(255, 255, 255));
        terminarSessao.setText("Terminar Sessao");
        terminarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarSessaoActionPerformed(evt);
            }
        });

        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout direitaLayout = new javax.swing.GroupLayout(direita);
        direita.setLayout(direitaLayout);
        direitaLayout.setHorizontalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(direitaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, direitaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alterarSenhaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(direitaLayout.createSequentialGroup()
                                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(novaSenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirmarNovaSenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(terminarSessao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(direitaLayout.createSequentialGroup()
                        .addComponent(senhaActualTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmarNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        direitaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {alterarSenhaBtn, confirmarNovaSenha, confirmarNovaSenhaTxt, novaSenha, novaSenhaTxt, senha, senhaActualTxt});

        direitaLayout.setVerticalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direitaLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaActualTxt))
                .addGap(28, 28, 28)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaSenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarNovaSenhaTxt)
                    .addComponent(confirmarNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterarSenhaBtn)
                    .addComponent(voltarBtn))
                .addGap(18, 18, 18)
                .addComponent(terminarSessao)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        direitaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {alterarSenhaBtn, confirmarNovaSenha, confirmarNovaSenhaTxt, novaSenha, novaSenhaTxt, senha, senhaActualTxt});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direita, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direita, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(esquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTXTActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed

    }//GEN-LAST:event_senhaActionPerformed

    private void alterarSenhaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaBtnActionPerformed


    }//GEN-LAST:event_alterarSenhaBtnActionPerformed

    private void novaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaSenhaActionPerformed

    }//GEN-LAST:event_novaSenhaActionPerformed

    private void confirmarNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarNovaSenhaActionPerformed

    }//GEN-LAST:event_confirmarNovaSenhaActionPerformed

    private void terminarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarSessaoActionPerformed
        showMessageDialog(this, "A sessão foi encerrada. Você será desconectado.", "Sessão Encerrada", INFORMATION_MESSAGE);
        var inicio = new Sigemonitoria();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_terminarSessaoActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        var inicio = new MenuPrincipal(usuario);
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AlterarSenha().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarSenhaBtn;
    private javax.swing.JPasswordField confirmarNovaSenha;
    private javax.swing.JLabel confirmarNovaSenhaTxt;
    private javax.swing.JPanel direita;
    private javax.swing.JLabel emblema;
    private javax.swing.JPanel esquerda;
    private javax.swing.JLabel hospital;
    private javax.swing.JLabel lema;
    private javax.swing.JPasswordField novaSenha;
    private javax.swing.JLabel novaSenhaTxt;
    private javax.swing.JLabel provincia;
    private javax.swing.JLabel republica;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel senhaActualTxt;
    private javax.swing.JLabel servicos;
    private javax.swing.JLabel sistema1;
    private javax.swing.JLabel sistema2;
    private javax.swing.JButton terminarSessao;
    private javax.swing.JButton usernameTXT;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
