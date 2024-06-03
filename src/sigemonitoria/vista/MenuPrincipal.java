package sigemonitoria.vista;

import static java.awt.EventQueue.invokeLater;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import sigemonitoria.Sigemonitoria;
import sigemonitoria.modelo.Utilizador;
import sigemonitoria.vista.admin.CadastrarUsuario;
import sigemonitoria.vista.cadastro.InformacaoBasicaPaciente;
import sigemonitoria.vista.conta.AlterarSenha;
import sigemonitoria.vista.dados.ProduzirRelatorioPeriodico;

/**
 *
 * @author Meldo Maunze
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Utilizador usuario;

    /**
     *
     * @param usuario
     */
    public MenuPrincipal(Utilizador usuario) {
        initComponents();
        this.usuario = usuario;
        this.usernameTXT.setText(usuario.getNomeCompleto());
        this.hospital.setText(usuario.getHospital().getNomeHospital());
        if (!usuario.getTipoUtilizador().getDescricao().equals("Administrador")) {
            this.criarUsuarioBtn.setVisible(false);

        }
    }

    private MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        direita = new javax.swing.JPanel();
        inserirBtn = new javax.swing.JButton();
        actualizarBtn = new javax.swing.JButton();
        criarUsuarioBtn = new javax.swing.JButton();
        alterarSenha = new javax.swing.JButton();
        produzirRelatorioBtn = new javax.swing.JButton();
        verDados = new javax.swing.JButton();
        terminarSessao = new javax.swing.JButton();
        esquerda = new javax.swing.JPanel();
        emblema = new javax.swing.JLabel();
        republica = new javax.swing.JLabel();
        provincia = new javax.swing.JLabel();
        servicos = new javax.swing.JLabel();
        hospital = new javax.swing.JLabel();
        lema = new javax.swing.JLabel();
        sistema1 = new javax.swing.JLabel();
        sistema2 = new javax.swing.JLabel();
        usernameTXT = new javax.swing.JTextField();
        usuarioLabel = new javax.swing.JLabel();

        setTitle("Menu Principal");

        direita.setPreferredSize(new java.awt.Dimension(700, 400));

        inserirBtn.setText("Inserir um novo caso");
        inserirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirBtnActionPerformed(evt);
            }
        });

        actualizarBtn.setText("Actualizar registo existente");
        actualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBtnActionPerformed(evt);
            }
        });

        criarUsuarioBtn.setText("Adicionar Usuario");
        criarUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarUsuarioBtnActionPerformed(evt);
            }
        });

        alterarSenha.setText("Alterar a Minha Senha");
        alterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarSenhaActionPerformed(evt);
            }
        });

        produzirRelatorioBtn.setText("Produzir Relatório Periódico");
        produzirRelatorioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produzirRelatorioBtnActionPerformed(evt);
            }
        });

        verDados.setText("Visualizar Dados");
        verDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDadosActionPerformed(evt);
            }
        });

        terminarSessao.setText("Terminar Sessao");
        terminarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarSessaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout direitaLayout = new javax.swing.GroupLayout(direita);
        direita.setLayout(direitaLayout);
        direitaLayout.setHorizontalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, direitaLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terminarSessao)
                    .addComponent(criarUsuarioBtn)
                    .addComponent(alterarSenha)
                    .addComponent(produzirRelatorioBtn)
                    .addComponent(actualizarBtn)
                    .addComponent(verDados)
                    .addComponent(inserirBtn))
                .addGap(37, 37, 37))
        );

        direitaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {actualizarBtn, alterarSenha, criarUsuarioBtn, inserirBtn, produzirRelatorioBtn, terminarSessao, verDados});

        direitaLayout.setVerticalGroup(
            direitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, direitaLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(verDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inserirBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizarBtn)
                .addGap(7, 7, 7)
                .addComponent(produzirRelatorioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(criarUsuarioBtn)
                .addGap(56, 56, 56)
                .addComponent(terminarSessao)
                .addGap(24, 24, 24))
        );

        direitaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {actualizarBtn, alterarSenha, criarUsuarioBtn, inserirBtn, produzirRelatorioBtn, terminarSessao, verDados});

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

        usernameTXT.setEditable(false);

        usuarioLabel.setText("Usuario:");

        javax.swing.GroupLayout esquerdaLayout = new javax.swing.GroupLayout(esquerda);
        esquerda.setLayout(esquerdaLayout);
        esquerdaLayout.setHorizontalGroup(
            esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                        .addComponent(hospital)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                        .addComponent(sistema1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(esquerdaLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(provincia))
                        .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                                .addComponent(lema)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                                .addComponent(emblema)
                                .addGap(117, 117, 117))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(servicos)
                                    .addComponent(republica))
                                .addGap(66, 66, 66))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaLayout.createSequentialGroup()
                        .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(esquerdaLayout.createSequentialGroup()
                                .addComponent(usuarioLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sistema2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
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
                .addGap(18, 18, 18)
                .addGroup(esquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lema, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        esquerdaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {usernameTXT, usuarioLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direita, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(esquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direita, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirBtnActionPerformed
        this.dispose();
        var tela1 = new InformacaoBasicaPaciente(usuario);
        try {
            setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(MenuPrincipal.class.getName()).log(SEVERE, null, ex);
        }
        tela1.setLocationRelativeTo(null);
        tela1.setVisible(true);
    }//GEN-LAST:event_inserirBtnActionPerformed

    private void actualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBtnActionPerformed


    }//GEN-LAST:event_actualizarBtnActionPerformed

    private void criarUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarUsuarioBtnActionPerformed
        var escolherAccao = new CadastrarUsuario(usuario);
        escolherAccao.setLocationRelativeTo(null);
        escolherAccao.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_criarUsuarioBtnActionPerformed

    private void alterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarSenhaActionPerformed

        var escolherAccao = new AlterarSenha(usuario);
        escolherAccao.setLocationRelativeTo(null);
        escolherAccao.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_alterarSenhaActionPerformed

    private void produzirRelatorioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produzirRelatorioBtnActionPerformed
        var escolherAccao = new ProduzirRelatorioPeriodico(usuario);
        escolherAccao.setLocationRelativeTo(null);
        escolherAccao.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_produzirRelatorioBtnActionPerformed

    private void verDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDadosActionPerformed
        String mensagem = "Para Aceder a Essa Funcionalidade \ndeve Fazer Upgrade do Seu Plano";
        showMessageDialog(this, mensagem, "Funcionalidade Premium", ERROR_MESSAGE);
    }//GEN-LAST:event_verDadosActionPerformed

    private void terminarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarSessaoActionPerformed
        showMessageDialog(this, "A sessão foi encerrada. Você será desconectado.", "Sessão Encerrada", INFORMATION_MESSAGE);
        var inicio = new Sigemonitoria();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_terminarSessaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        invokeLater(() -> {
            new MenuPrincipal().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBtn;
    private javax.swing.JButton alterarSenha;
    private javax.swing.JButton criarUsuarioBtn;
    private javax.swing.JPanel direita;
    private javax.swing.JLabel emblema;
    private javax.swing.JPanel esquerda;
    private javax.swing.JLabel hospital;
    private javax.swing.JButton inserirBtn;
    private javax.swing.JLabel lema;
    private javax.swing.JButton produzirRelatorioBtn;
    private javax.swing.JLabel provincia;
    private javax.swing.JLabel republica;
    private javax.swing.JLabel servicos;
    private javax.swing.JLabel sistema1;
    private javax.swing.JLabel sistema2;
    private javax.swing.JButton terminarSessao;
    private javax.swing.JTextField usernameTXT;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JButton verDados;
    // End of variables declaration//GEN-END:variables
}
