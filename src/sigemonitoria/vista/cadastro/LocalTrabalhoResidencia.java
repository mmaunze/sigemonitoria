package sigemonitoria.vista.cadastro;

import static java.awt.EventQueue.invokeLater;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import static javax.persistence.Persistence.createEntityManagerFactory;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import sigemonitoria.MetodosGerais;
import sigemonitoria.controller.CasoJpaController;
import sigemonitoria.controller.DoenteJpaController;
import sigemonitoria.modelo.Caso;
import sigemonitoria.modelo.Doente;
import sigemonitoria.modelo.Utilizador;
import sigemonitoria.vista.MenuPrincipal;

/**
 *
 * @author Meldo Maunze
 */
public class LocalTrabalhoResidencia extends javax.swing.JFrame implements MetodosGerais {
        
    Caso caso ;
  
    Doente doente;
    Utilizador usuario;
    
    private InformacaoBasicaPaciente frame1;
    private ControleSeguimento frame3 = null;

    /**
     *
     * @param frame1 the value of frame1
     * @param doente the value of doente
     * @param caso the value of caso
     * @param usuario the value of usuario
     */
    public LocalTrabalhoResidencia(InformacaoBasicaPaciente frame1, Doente doente, Caso caso, Utilizador usuario) {
        initComponents();
        this.frame1 = frame1;
        this.usuario = usuario;
        this.doente = doente;
        this.username.setText(usuario.getNomeCompleto());
        this.hospital.setText(usuario.getHospital().getNomeHospital());
        this.caso = caso;

    }
    
    private LocalTrabalhoResidencia() {
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

        cabecalho = new javax.swing.JPanel();
        sistema1 = new javax.swing.JLabel();
        emblema = new javax.swing.JLabel();
        republica = new javax.swing.JLabel();
        provincia = new javax.swing.JLabel();
        servicos = new javax.swing.JLabel();
        hospital = new javax.swing.JLabel();
        cadastro = new javax.swing.JPanel();
        estabelecimentoSaudeLabel = new javax.swing.JLabel();
        provinciaNacimentoLabel = new javax.swing.JLabel();
        estabelecimentoSaudeInput = new javax.swing.JTextField();
        distritoResidenciaLabel = new javax.swing.JLabel();
        localUsLabel = new javax.swing.JLabel();
        provinciaResidenciaInput = new javax.swing.JComboBox<>();
        distritoResidenciaInput = new javax.swing.JTextField();
        lema = new javax.swing.JLabel();
        recuarBTN = new javax.swing.JButton();
        avancarBTN = new javax.swing.JButton();
        gaurdarRascunhoBTN = new javax.swing.JButton();
        avancarBTN1 = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        sectorTrabalhoInput = new javax.swing.JComboBox<>();
        moradaInput = new javax.swing.JTextField();
        moradaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Local de Trabalho e Residencia");
        setResizable(false);

        cabecalho.setBackground(new java.awt.Color(255, 255, 255));
        cabecalho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sistema1.setText("Sistema de Informação e Monitoria da Saúde de Funcionários  Com  Doenças Crónicas");

        emblema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sigemonitoria/vista/imagens/emblema.png"))); // NOI18N
        emblema.setToolTipText("");

        republica.setText("Republica de Moçambique");

        provincia.setText("Provincia de Nampula");

        servicos.setText("Serviço Provincial de Saúde");

        hospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hospital.setText("Nome do Hospital");

        javax.swing.GroupLayout cabecalhoLayout = new javax.swing.GroupLayout(cabecalho);
        cabecalho.setLayout(cabecalhoLayout);
        cabecalhoLayout.setHorizontalGroup(
            cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabecalhoLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(provincia))
                    .addGroup(cabecalhoLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(republica)
                            .addComponent(servicos)))
                    .addGroup(cabecalhoLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(hospital))
                    .addGroup(cabecalhoLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(emblema))
                    .addComponent(sistema1))
                .addGap(109, 109, 109))
        );
        cabecalhoLayout.setVerticalGroup(
            cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emblema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(republica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(provincia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hospital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sistema1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        estabelecimentoSaudeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estabelecimentoSaudeLabel.setText("Estabelecimnto de Saude");

        provinciaNacimentoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        provinciaNacimentoLabel.setText("Provincia de Residencia");

        estabelecimentoSaudeInput.setEditable(false);
        estabelecimentoSaudeInput.setEnabled(false);
        estabelecimentoSaudeInput.setFocusable(false);
        estabelecimentoSaudeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estabelecimentoSaudeInputActionPerformed(evt);
            }
        });

        distritoResidenciaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        distritoResidenciaLabel.setText("Distrito de Residencia");

        localUsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        localUsLabel.setText("Sector de Trabalho");

        provinciaResidenciaInput.setEditable(true);
        provinciaResidenciaInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Maputo", "Gaza", "Inhambane", "Sofala", "Manica", "Tete", "Zambezia", "Niassa", "Nampula", "Cabo Delgado" }));
        provinciaResidenciaInput.setFocusable(false);
        provinciaResidenciaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaResidenciaInputActionPerformed(evt);
            }
        });

        distritoResidenciaInput.setEditable(false);
        distritoResidenciaInput.setEnabled(false);
        distritoResidenciaInput.setFocusable(false);
        distritoResidenciaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distritoResidenciaInputActionPerformed(evt);
            }
        });

        lema.setForeground(new java.awt.Color(255, 0, 0));
        lema.setText("O Nosso Maior Valor é a vida");

        recuarBTN.setBackground(new java.awt.Color(204, 255, 153));
        recuarBTN.setText("Recuar");
        recuarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuarBTNActionPerformed(evt);
            }
        });

        avancarBTN.setBackground(new java.awt.Color(153, 255, 153));
        avancarBTN.setText("Avancar");
        avancarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarBTNActionPerformed(evt);
            }
        });

        gaurdarRascunhoBTN.setBackground(new java.awt.Color(102, 255, 255));
        gaurdarRascunhoBTN.setText("Guardar Rascunho");
        gaurdarRascunhoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaurdarRascunhoBTNActionPerformed(evt);
            }
        });

        avancarBTN1.setBackground(new java.awt.Color(255, 0, 0));
        avancarBTN1.setForeground(new java.awt.Color(255, 255, 255));
        avancarBTN1.setText("Cancelar");
        avancarBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarBTN1ActionPerformed(evt);
            }
        });

        username.setEditable(false);
        username.setFocusable(false);
        username.setRequestFocusEnabled(false);

        sectorTrabalhoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Banca", "Morada" }));
        sectorTrabalhoInput.setEnabled(false);
        sectorTrabalhoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectorTrabalhoInputActionPerformed(evt);
            }
        });

        moradaInput.setEditable(false);
        moradaInput.setEnabled(false);
        moradaInput.setFocusable(false);
        moradaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moradaInputActionPerformed(evt);
            }
        });

        moradaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moradaLabel.setText("Morada");

        javax.swing.GroupLayout cadastroLayout = new javax.swing.GroupLayout(cadastro);
        cadastro.setLayout(cadastroLayout);
        cadastroLayout.setHorizontalGroup(
            cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(provinciaNacimentoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(estabelecimentoSaudeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moradaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estabelecimentoSaudeInput)
                            .addComponent(provinciaResidenciaInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moradaInput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(distritoResidenciaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(localUsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(distritoResidenciaInput)
                            .addComponent(sectorTrabalhoInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lema, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gaurdarRascunhoBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(recuarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(avancarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(avancarBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        cadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {avancarBTN, avancarBTN1, gaurdarRascunhoBTN, recuarBTN});

        cadastroLayout.setVerticalGroup(
            cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(distritoResidenciaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(distritoResidenciaLabel)
                            .addComponent(provinciaNacimentoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(localUsLabel)
                            .addComponent(estabelecimentoSaudeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estabelecimentoSaudeLabel)
                            .addComponent(sectorTrabalhoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moradaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moradaLabel)))
                    .addComponent(provinciaResidenciaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recuarBTN)
                    .addComponent(avancarBTN)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(avancarBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gaurdarRascunhoBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean estabelecimentoSaudePreenchido = false;
    boolean provinciaResidenciaPreenchido = false;
    boolean distritoResidenciaPreenchido = false;
    boolean moradaPreenchido = false;
    boolean sectorTrabalhoPreenchido = false;
    
    private void estabelecimentoSaudeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estabelecimentoSaudeInputActionPerformed
        var estabelecimentoSaudeValue = estabelecimentoSaudeInput.getText().trim();
        if (estabelecimentoSaudeValue != null && !estabelecimentoSaudeValue.trim().isEmpty()) {
            if (estabelecimentoSaudeValue.matches("[a-zA-Z ]+")) {
                estabelecimentoSaudePreenchido = true;
                caso.setEstabelecimentoSaude(estabelecimentoSaudeValue);
                habilitarSelect(sectorTrabalhoInput);
            } else {
                showMessageDialog(this, "O estabelecimento de Saude deve conter apenas letras.", "Entrada inválida", ERROR_MESSAGE);
                estabelecimentoSaudeInput.requestFocus();
                desabilitarSelect(sectorTrabalhoInput);
            }
        } else {
            showMessageDialog(this, "Deve Preencher o Campo antes de avancar.", "Estabelecimento de Saude Vazio", ERROR_MESSAGE);
            estabelecimentoSaudeInput.requestFocus();
            desabilitarSelect(sectorTrabalhoInput);
        }
    }//GEN-LAST:event_estabelecimentoSaudeInputActionPerformed

    private void provinciaResidenciaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaResidenciaInputActionPerformed
        var valorSeleccionado = (String) provinciaResidenciaInput.getSelectedItem();
        if (!("seleccionar".equals(valorSeleccionado))) {
            if ("Maputo".equals(valorSeleccionado)
                    || "Gaza".equals(valorSeleccionado)
                    || "Inhambane".equals(valorSeleccionado)
                    || "Sofala".equals(valorSeleccionado)
                    || "Manica".equals(valorSeleccionado)
                    || "Zambezia".equals(valorSeleccionado)
                    || "Tete".equals(valorSeleccionado)
                    || "Nampula".equals(valorSeleccionado)
                    || "Niassa".equals(valorSeleccionado)
                    || "Cabo Delgado".equals(valorSeleccionado)) {
                provinciaResidenciaPreenchido = true;
                doente.setProvinciaResidencia(valorSeleccionado);
                habilitarCampo(distritoResidenciaInput);
            } else {
                showMessageDialog(this, "Seleccione uma provincia válida", "Provincia inválida", ERROR_MESSAGE);
                provinciaResidenciaInput.requestFocus();
                desabilitarCampo(distritoResidenciaInput);
            }
        } else {
            showMessageDialog(this, "Seleccione uma provincia válida", "Provincia inválida", ERROR_MESSAGE);
            provinciaResidenciaInput.requestFocus();
            desabilitarCampo(distritoResidenciaInput);
        }

    }//GEN-LAST:event_provinciaResidenciaInputActionPerformed

    private void distritoResidenciaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distritoResidenciaInputActionPerformed
        var distritoValue = distritoResidenciaInput.getText().trim();
        if (distritoValue != null && !distritoValue.trim().isEmpty()) {
            if (distritoValue.matches("[a-zA-Z ]+")) {
                distritoResidenciaPreenchido = true;
                doente.setDistritoResidencia(distritoValue);
                estabelecimentoSaudeInput.setText(usuario.getHospital().getNomeHospital());
                habilitarCampo(estabelecimentoSaudeInput);
            } else {
                showMessageDialog(this, "O Distrito deve conter apenas letras.", "Entrada inválida", ERROR_MESSAGE);
                distritoResidenciaInput.requestFocus();
                desabilitarCampo(estabelecimentoSaudeInput);
            }
        } else {
            showMessageDialog(this, "Deve Preencher o Campo antes de avancar.", "Distrito Vazio", ERROR_MESSAGE);
            distritoResidenciaInput.requestFocus();
            desabilitarCampo(estabelecimentoSaudeInput);
        }
    }//GEN-LAST:event_distritoResidenciaInputActionPerformed

    private void gaurdarRascunhoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaurdarRascunhoBTNActionPerformed
        
        String mensagem = "Para aproveitar esta funcionalidade incrível, \nvocê pode fazer um upgrade do seu plano. \nContacte o desenvolvedor para mais detalhes";

        showMessageDialog(this, mensagem, "Funcionalidade Premium", ERROR_MESSAGE);
    }//GEN-LAST:event_gaurdarRascunhoBTNActionPerformed

    private void avancarBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarBTN1ActionPerformed
        showMessageDialog(this, "O cadastro foi cancelado");
        var escolherAccao = new MenuPrincipal(usuario);
        escolherAccao.setLocationRelativeTo(null);
        escolherAccao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_avancarBTN1ActionPerformed

    private void moradaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moradaInputActionPerformed
        var moradaValue = moradaInput.getText().trim();
        if (moradaValue != null && !moradaValue.trim().isEmpty()) {
            if (moradaValue.matches("[a-zA-Z ]+")) {
                moradaPreenchido = true;
                avancarBTN.requestFocus();
                avancarBTN.setEnabled(true);
                doente.setMorada(moradaValue);
                
            } else {
                showMessageDialog(this, "A morada deve conter apenas letras.", "Entrada inválida", ERROR_MESSAGE);
                moradaInput.requestFocus();
            }
        } else {
            showMessageDialog(this, "Deve Preencher o Campo antes de avancar.", "Morada Vazia", ERROR_MESSAGE);
            moradaInput.requestFocus();
            
        }
    }//GEN-LAST:event_moradaInputActionPerformed

    private void sectorTrabalhoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectorTrabalhoInputActionPerformed
        var valorSeleccionado = (String) sectorTrabalhoInput.getSelectedItem();
        if (!("seleccionar".equals(valorSeleccionado))) {
            if ("Morada".equals(valorSeleccionado)
                    || "Gaza".equals(valorSeleccionado)) {
                sectorTrabalhoPreenchido = true;
                habilitarCampo(moradaInput);
                doente.setSectorTrabalho(valorSeleccionado);
            } else {
                showMessageDialog(this, "Seleccione um sector válido", "Sector de Trabalho inválido", ERROR_MESSAGE);
                sectorTrabalhoInput.requestFocus();
                desabilitarCampo(moradaInput);
            }
        } else {
            showMessageDialog(this, "Seleccione um sector válido", "Sector de Trabalho inválido", ERROR_MESSAGE);
            sectorTrabalhoInput.requestFocus();
            desabilitarCampo(moradaInput);
        }
    }//GEN-LAST:event_sectorTrabalhoInputActionPerformed

    private void recuarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuarBTNActionPerformed
        try {
            try {
                setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (UnsupportedLookAndFeelException ex) {
                getLogger(LocalTrabalhoResidencia.class.getName()).log(SEVERE, null, ex);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            getLogger(LocalTrabalhoResidencia.class.getName()).log(SEVERE, null, ex);
        }
        
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_recuarBTNActionPerformed

    private void avancarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarBTNActionPerformed
        if (provinciaResidenciaPreenchido
                && distritoResidenciaPreenchido
                && estabelecimentoSaudePreenchido
                && sectorTrabalhoPreenchido
                && moradaPreenchido) {
            if (frame3 == null) {
                frame3 = new ControleSeguimento(this, doente, caso, usuario);
            }
            this.setVisible(false);
            frame3.setVisible(true);
            
            try {
                setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                getLogger(LocalTrabalhoResidencia.class.getName()).log(SEVERE, null, ex);
            }
            
            frame3.setLocationRelativeTo(null);
            frame3.setVisible(true);
        } else {
            showMessageDialog(this, "Deve Preencher Todos os Campos Antes de Avancar", "Campos Vazios", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_avancarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(LocalTrabalhoResidencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        invokeLater(() -> {
            new LocalTrabalhoResidencia().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avancarBTN;
    private javax.swing.JButton avancarBTN1;
    private javax.swing.JPanel cabecalho;
    private javax.swing.JPanel cadastro;
    private javax.swing.JTextField distritoResidenciaInput;
    private javax.swing.JLabel distritoResidenciaLabel;
    private javax.swing.JLabel emblema;
    private javax.swing.JTextField estabelecimentoSaudeInput;
    private javax.swing.JLabel estabelecimentoSaudeLabel;
    private javax.swing.JButton gaurdarRascunhoBTN;
    private javax.swing.JLabel hospital;
    private javax.swing.JLabel lema;
    private javax.swing.JLabel localUsLabel;
    private javax.swing.JTextField moradaInput;
    private javax.swing.JLabel moradaLabel;
    private javax.swing.JLabel provincia;
    private javax.swing.JLabel provinciaNacimentoLabel;
    private javax.swing.JComboBox<String> provinciaResidenciaInput;
    private javax.swing.JButton recuarBTN;
    private javax.swing.JLabel republica;
    private javax.swing.JComboBox<String> sectorTrabalhoInput;
    private javax.swing.JLabel servicos;
    private javax.swing.JLabel sistema1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
