/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sigemonitoria.vista.dados;

import java.awt.HeadlessException;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static javax.persistence.Persistence.createEntityManagerFactory;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import sigemonitoria.MetodosGerais;
import sigemonitoria.Sigemonitoria;
import sigemonitoria.controller.CasoJpaController;
import sigemonitoria.controller.GeradorPDF;
import sigemonitoria.modelo.Utilizador;
import sigemonitoria.vista.MenuPrincipal;

/**
 *
 * @author Meldo Maunze
 */
public class ProduzirRelatorioPeriodico extends javax.swing.JFrame implements MetodosGerais {

    Utilizador usuario;

    /**
     *
     * @param usuario
     */
    public ProduzirRelatorioPeriodico(Utilizador usuario) {
        initComponents();
        this.usuario = usuario;
        this.usernameTXT.setText(usuario.getNomeCompleto());
        this.hospital.setText(usuario.getHospital().getNomeHospital());
    }

    private ProduzirRelatorioPeriodico() {
        initComponents();
    }

    int anoo, mesInicio, mesFim;
    
    /**
     * Creates new form ProduzirRelatorioPeriodico
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
        esquerda1 = new javax.swing.JPanel();
        anoInput = new javax.swing.JComboBox<>();
        anoLabel = new javax.swing.JLabel();
        mesLabel = new javax.swing.JLabel();
        mesInicialInput = new javax.swing.JComboBox<>();
        mesFinalInput = new javax.swing.JComboBox<>();
        mesLabel1 = new javax.swing.JLabel();
        descarregarBTN = new javax.swing.JButton();
        terminarSessao = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Produzir Relatorio Periodico");
        setResizable(false);

        esquerda.setBackground(new java.awt.Color(255, 255, 255));
        esquerda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        emblema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sigemonitoria/vista/imagens/emblema.png"))); // NOI18N
        emblema.setToolTipText("");

        republica.setText("Republica de Moçambique");

        provincia.setText("Provincia de Nampula");

        servicos.setText("Serviço Provincial de Saúde");

        hospital.setText("Nome do Hospital");

        lema.setText("O nosso maior valor é a vida");

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
                            .addComponent(lema)
                            .addGap(50, 50, 50))
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
                        .addContainerGap())))
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
                .addGap(24, 24, 24))
        );

        esquerda1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        anoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028" }));
        anoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoInputActionPerformed(evt);
            }
        });

        anoLabel.setText("Ano");

        mesLabel.setText("Mes Inicial");

        mesInicialInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        mesInicialInput.setEnabled(false);
        mesInicialInput.setRequestFocusEnabled(false);
        mesInicialInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesInicialInputActionPerformed(evt);
            }
        });

        mesFinalInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        mesFinalInput.setEnabled(false);
        mesFinalInput.setRequestFocusEnabled(false);
        mesFinalInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesFinalInputActionPerformed(evt);
            }
        });

        mesLabel1.setText("Mes Final");

        descarregarBTN.setBackground(new java.awt.Color(255, 204, 153));
        descarregarBTN.setText("descarregar");
        descarregarBTN.setEnabled(false);
        descarregarBTN.setFocusable(false);
        descarregarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descarregarBTNActionPerformed(evt);
            }
        });

        terminarSessao.setBackground(new java.awt.Color(255, 0, 0));
        terminarSessao.setForeground(new java.awt.Color(255, 255, 255));
        terminarSessao.setText("Terminar Sessão");
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

        javax.swing.GroupLayout esquerda1Layout = new javax.swing.GroupLayout(esquerda1);
        esquerda1.setLayout(esquerda1Layout);
        esquerda1Layout.setHorizontalGroup(
            esquerda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerda1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(esquerda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(esquerda1Layout.createSequentialGroup()
                        .addGroup(esquerda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(esquerda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(anoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mesLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(esquerda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesInicialInput, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesFinalInput, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerda1Layout.createSequentialGroup()
                        .addGroup(esquerda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(terminarSessao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voltarBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descarregarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))))
        );

        esquerda1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {anoInput, anoLabel, mesFinalInput, mesInicialInput, mesLabel, mesLabel1});

        esquerda1Layout.setVerticalGroup(
            esquerda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerda1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(esquerda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anoLabel)
                    .addComponent(anoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(esquerda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesLabel)
                    .addComponent(mesInicialInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(esquerda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesFinalInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesLabel1))
                .addGap(35, 35, 35)
                .addComponent(descarregarBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltarBtn)
                .addGap(12, 12, 12)
                .addComponent(terminarSessao)
                .addContainerGap())
        );

        esquerda1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {anoInput, anoLabel, descarregarBTN, mesFinalInput, mesInicialInput, mesLabel, mesLabel1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(esquerda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(esquerda1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(esquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTXTActionPerformed

    
    private void descarregarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descarregarBTNActionPerformed
        try {
            var relatorios = new GeradorPDF();
            var pct = findPacientesPorPeriodo(anoo, mesInicio, mesFim);
            try {
                relatorios.gerarRelatorio(pct, anoo, mesInicio, mesFim, usuario);
            } catch (IOException ex) {
                getLogger(ProduzirRelatorioPeriodico.class.getName()).log(SEVERE, null, ex);
            }
            showMessageDialog(null, "Relatório gerado com sucesso!", "Sucesso", INFORMATION_MESSAGE);

        } catch (HeadlessException ex) {
            showMessageDialog(null, "Erro ao gerar o relatório: " + ex.getMessage(), "Erro", ERROR_MESSAGE);
        } finally {
            this.setVisible(false);
            var accoes = new MenuPrincipal(usuario);
            try {
                setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                getLogger(ProduzirRelatorioPeriodico.class.getName()).log(SEVERE, null, ex);
            }
            accoes.setLocationRelativeTo(null);
            accoes.setVisible(true);
            this.dispose();
        }
    }

    /* 
    }//GEN-LAST:event_descarregarBTNActionPerformed
*/
    private void terminarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarSessaoActionPerformed
        showMessageDialog(this, "A sessão foi encerrada. Você será desconectado.", "Sessão Encerrada", INFORMATION_MESSAGE);
        var inicio = new Sigemonitoria();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_terminarSessaoActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        var inicio = new MenuPrincipal(usuario);
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void anoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoInputActionPerformed
        try {
            var anoDigitado = parseInt((String) anoInput.getSelectedItem());
            var anoAtual = getInstance().get(YEAR);
            if (anoDigitado >= 2010 && anoDigitado <= anoAtual) {
                anoo = anoDigitado;
                habilitarSelect(mesInicialInput);
            } else {
                showMessageDialog(this, "Ano inválido. Digite um ano entre 1930 e " + anoAtual, "Erro", ERROR_MESSAGE);
                desabilitarSelect(mesInicialInput);
            }

        } catch (NumberFormatException e) {
            showMessageDialog(this, "Formato de ano inválido. Digite um valor numérico.", "Erro", ERROR_MESSAGE);

        }
    }//GEN-LAST:event_anoInputActionPerformed

    private void mesInicialInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesInicialInputActionPerformed
        mesInicio = obterNumeroMes((String) mesInicialInput.getSelectedItem());
        habilitarSelect(mesFinalInput);
    }//GEN-LAST:event_mesInicialInputActionPerformed

    private void mesFinalInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesFinalInputActionPerformed
        mesFim = obterNumeroMes((String) mesFinalInput.getSelectedItem());
        if (mesFim <= mesInicio) {
            showMessageDialog(null, "O mes deve ser maior que o primeiro ", "Mes Inferior", ERROR_MESSAGE);
            mesFinalInput.setSelectedIndex(0);
            mesFim = 0;
        } else {
            descarregarBTN.setEnabled(true);
            descarregarBTN.requestFocus();
        }
    }//GEN-LAST:event_mesFinalInputActionPerformed

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
            java.util.logging.Logger.getLogger(ProduzirRelatorioPeriodico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ProduzirRelatorioPeriodico().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anoInput;
    private javax.swing.JLabel anoLabel;
    private javax.swing.JButton descarregarBTN;
    private javax.swing.JLabel emblema;
    private javax.swing.JPanel esquerda;
    private javax.swing.JPanel esquerda1;
    private javax.swing.JLabel hospital;
    private javax.swing.JLabel lema;
    private javax.swing.JComboBox<String> mesFinalInput;
    private javax.swing.JComboBox<String> mesInicialInput;
    private javax.swing.JLabel mesLabel;
    private javax.swing.JLabel mesLabel1;
    private javax.swing.JLabel provincia;
    private javax.swing.JLabel republica;
    private javax.swing.JLabel servicos;
    private javax.swing.JLabel sistema1;
    private javax.swing.JLabel sistema2;
    private javax.swing.JButton terminarSessao;
    private javax.swing.JButton usernameTXT;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
