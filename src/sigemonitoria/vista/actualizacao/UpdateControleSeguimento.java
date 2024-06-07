package sigemonitoria.vista.actualizacao;

import static java.awt.EventQueue.invokeLater;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManagerFactory;
import static javax.persistence.Persistence.createEntityManagerFactory;
import javax.swing.JOptionPane;
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
public class UpdateControleSeguimento extends javax.swing.JFrame implements MetodosGerais {

    EntityManagerFactory emf = createEntityManagerFactory("sigemonitoriaPU");

    DoenteJpaController doentes = new DoenteJpaController(emf);

    CasoJpaController casos = new CasoJpaController(emf);
    Caso caso;
    Doente doente;
    Utilizador usuario;

    private UpdateLocalTrabalhoResidencia frame2 = null;

    /**
     * @param frame2
     * @param doente the value of doente
     * @param caso
     * @param usuario the value of usuario
     */
    public UpdateControleSeguimento(UpdateLocalTrabalhoResidencia frame2, Doente doente, Caso caso, Utilizador usuario) {
        initComponents();
        this.doente = doente;
        this.frame2 = frame2;
        this.usuario = usuario;
        this.username.setText(usuario.getNomeCompleto());
        this.hospital.setText(usuario.getHospital().getNomeHospital());
        this.caso = caso;
        this.caso.setNid(doente);

        if (doente != null && caso != null) {

            habilitarSelect(consultaMedicaInput);
            consultaMedicaInput.setSelectedItem(caso.getConsultaMedica());
            consultaMedicaPreenchido = true;

            habilitarSelect(enfermidadeInput);
            enfermidadeInput.setSelectedItem(caso.getEnfermidade());
            enfermidadePreenchido = true;

            habilitarSelect(rastreioInput);
            rastreioInput.setSelectedItem(caso.getRastreio());
            rastreioPreenchido = true;

            habilitarSelect(diagnosticoInput);
            diagnosticoInput.setSelectedItem(caso.getDiagnostico());
            diagnosticoPreenchido = true;

            habilitarSelect(aonInput);
            aonInput.setSelectedItem(caso.getAon());
            aonPreenchido = true;

            habilitarSelect(apssInput);
            apssInput.setSelectedItem(caso.getApss());
            apssPreenchido = true;

            habilitarSelect(espAnteriorInput);
            espAnteriorInput.setSelectedItem(caso.getEspAnterior());
            espAnteriorPreenchido = true;

            habilitarCampo(dataConsultaAnteriorInput);
            dataConsultaAnteriorInput.setText(converterDataParaString(caso.getDataConsultaAnterior()));
            dataConsultaAnteriorPreencido = true;

            habilitarSelect(espActualInput);
            espActualInput.setSelectedItem(caso.getEspActual());
            espActualPreenchido = true;

            habilitarCampo(dataConsultaActualInput);
            dataConsultaActualInput.setText(converterDataParaString(caso.getDataConsultaActual()));
            dataConsultaActualPreencido = true;

            habilitarCampo(dataProximaConsultaInput);
            dataProximaConsultaInput.setText(converterDataParaString(caso.getDataProxima()));
            dataProximaConsultaPreencido = true;

            habilitarSelect(espObservadoInput);
            espObservadoInput.setSelectedItem(caso.getEspProximo());
            espProximoPreenchido = true;

            habilitarSelect(situacaoActualPacienteInput);
            situacaoActualPacienteInput.setSelectedItem(caso.getSituacaoActualPaciente());
            situacaoActualPacientePreenchido = true;
            if (caso.getSituacaoActualPaciente().equalsIgnoreCase("falecido")) {
                habilitarCampo(dataFalecimentoInput);
                if (caso.getDataFacelimento() != null) {
                    dataFalecimentoInput.setText(converterDataParaString(caso.getDataFacelimento()));

                } else {
                    dataFalecimentoInput.setText(converterDataParaString(new Date()));
                }
            }
            avancarBTN.setEnabled(true);
            avancarBTN.requestFocus();

        } else {
            String mensagem = "Nao foi fornecido nenhum NID\n, portanto,\n nao ha dados para actualizar,\n Redireccionando ao Menu";
            showMessageDialog(this, mensagem, "NID vazio", ERROR_MESSAGE);
            var escolherAccao = new MenuPrincipal(usuario);
            escolherAccao.setLocationRelativeTo(null);
            escolherAccao.setVisible(true);
            this.dispose();

        }
    }

    private UpdateControleSeguimento() {
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
        enfermidadeTxt = new javax.swing.JLabel();
        dataConsultaAnteriorInput = new javax.swing.JTextField();
        consultaMedicaTxt = new javax.swing.JLabel();
        rastreioTxt = new javax.swing.JLabel();
        aonInput = new javax.swing.JComboBox<>();
        apssTxt = new javax.swing.JLabel();
        enfermidadeInput = new javax.swing.JComboBox<>();
        aspAnteriorTxt = new javax.swing.JLabel();
        apssInput = new javax.swing.JComboBox<>();
        diagnosticoInput = new javax.swing.JComboBox<>();
        dataProximaConsultaTxt = new javax.swing.JLabel();
        espObservadoInput = new javax.swing.JComboBox<>();
        dataConsultaActualTxt = new javax.swing.JLabel();
        espActualTxt = new javax.swing.JLabel();
        situacaoActualPacienteInput = new javax.swing.JComboBox<>();
        rastreioInput = new javax.swing.JComboBox<>();
        diagnosticoTxt = new javax.swing.JLabel();
        espActualInput = new javax.swing.JComboBox<>();
        situacaoActualPacienteTxt = new javax.swing.JLabel();
        aonTxt = new javax.swing.JLabel();
        EspObservadoTxt = new javax.swing.JLabel();
        dataConsultaAnteriorTxt = new javax.swing.JLabel();
        dataProximaConsultaInput = new javax.swing.JTextField();
        espAnteriorInput = new javax.swing.JComboBox<>();
        dataConsultaActualInput = new javax.swing.JTextField();
        consultaMedicaInput = new javax.swing.JComboBox<>();
        dataFalecimentoTxt = new javax.swing.JLabel();
        dataFalecimentoInput = new javax.swing.JTextField();
        recuarBTN = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        actualizarBTN = new javax.swing.JButton();
        avancarBTN = new javax.swing.JButton();
        gaurdarRascunhoBTN = new javax.swing.JButton();
        lema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Controle e Seguimento");
        setResizable(false);

        cabecalho.setBackground(new java.awt.Color(255, 255, 255));
        cabecalho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sistema1.setText("Sistema de Informação e Monitoria da Saúde de Funcionários  Com  Doenças Crónicas");

        emblema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sigemonitoria/vista/imagens/emblema.png"))); // NOI18N
        emblema.setToolTipText("");

        republica.setText("Republica de Moçambique");

        provincia.setText("Provincia de Nampula");

        servicos.setText("Serviço Provincial de Saúde");

        hospital.setText("Nome do Hospital");

        javax.swing.GroupLayout cabecalhoLayout = new javax.swing.GroupLayout(cabecalho);
        cabecalho.setLayout(cabecalhoLayout);
        cabecalhoLayout.setHorizontalGroup(
            cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoLayout.createSequentialGroup()
                .addGroup(cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabecalhoLayout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(provincia))
                    .addGroup(cabecalhoLayout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addGroup(cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(republica)
                            .addComponent(servicos)))
                    .addGroup(cabecalhoLayout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(hospital))
                    .addGroup(cabecalhoLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(emblema))
                    .addGroup(cabecalhoLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(sistema1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cabecalhoLayout.setVerticalGroup(
            cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoLayout.createSequentialGroup()
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
                .addGap(29, 29, 29))
        );

        enfermidadeTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        enfermidadeTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enfermidadeTxt.setText("Enfermidade");

        dataConsultaAnteriorInput.setEditable(false);
        dataConsultaAnteriorInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataConsultaAnteriorInput.setEnabled(false);
        dataConsultaAnteriorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataConsultaAnteriorInputActionPerformed(evt);
            }
        });

        consultaMedicaTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        consultaMedicaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consultaMedicaTxt.setText("Consulta Médica ");

        rastreioTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rastreioTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rastreioTxt.setText("Rastreio");

        aonInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        aonInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Sempre vai a consulta", "Às vezes vai a consulta", "Nunca foi a consulta", "Não Aplicável" }));
        aonInput.setEnabled(false);
        aonInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aonInputActionPerformed(evt);
            }
        });

        apssTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        apssTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apssTxt.setText("APSS");

        enfermidadeInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        enfermidadeInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "HIV", "TB", "Hipertensão", "Diabetes", "Cancro da mama", "Cancro uterino, ", "Câncro da próstata", "HIV e TB", "HIV e Hipertensão", "HIV e Diabetes", "HIV e Câncro", "TB e Hipertensão", "Hipertensão e Diabetes" }));
        enfermidadeInput.setEnabled(false);
        enfermidadeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enfermidadeInputActionPerformed(evt);
            }
        });

        aspAnteriorTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        aspAnteriorTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aspAnteriorTxt.setText("ESP Anterior Observado");

        apssInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        apssInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Sempre vai a consulta", "Às vezes vai a consulta", "Nunca foi a consulta", "Não Aplicável" }));
        apssInput.setEnabled(false);
        apssInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apssInputActionPerformed(evt);
            }
        });

        diagnosticoInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        diagnosticoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Determinado", "Não Determinado" }));
        diagnosticoInput.setEnabled(false);
        diagnosticoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosticoInputActionPerformed(evt);
            }
        });

        dataProximaConsultaTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataProximaConsultaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataProximaConsultaTxt.setText("Data da Próxima Consulta");

        espObservadoInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        espObservadoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Bem", "Normal", "Mal" }));
        espObservadoInput.setEnabled(false);
        espObservadoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espObservadoInputActionPerformed(evt);
            }
        });

        dataConsultaActualTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataConsultaActualTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataConsultaActualTxt.setText("Data Da Consulta ACtual");

        espActualTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        espActualTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        espActualTxt.setText("ESP Actual Observado");

        situacaoActualPacienteInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        situacaoActualPacienteInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Activo", "Abandono", "Falecido" }));
        situacaoActualPacienteInput.setEnabled(false);
        situacaoActualPacienteInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                situacaoActualPacienteInputActionPerformed(evt);
            }
        });

        rastreioInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rastreioInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Rastreado", "Não rastreado" }));
        rastreioInput.setEnabled(false);
        rastreioInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rastreioInputActionPerformed(evt);
            }
        });

        diagnosticoTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        diagnosticoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diagnosticoTxt.setText("Diagnóstico");

        espActualInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        espActualInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Bem", "Normal", "Mal" }));
        espActualInput.setEnabled(false);
        espActualInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espActualInputActionPerformed(evt);
            }
        });

        situacaoActualPacienteTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        situacaoActualPacienteTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        situacaoActualPacienteTxt.setText("Situação Actual do Paciente");

        aonTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        aonTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aonTxt.setText("AON");

        EspObservadoTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        EspObservadoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EspObservadoTxt.setText("Esp Observado");

        dataConsultaAnteriorTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataConsultaAnteriorTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataConsultaAnteriorTxt.setText("Data da Consulta Anterior");
        dataConsultaAnteriorTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dataConsultaAnteriorTxtMouseExited(evt);
            }
        });

        dataProximaConsultaInput.setEditable(false);
        dataProximaConsultaInput.setEnabled(false);
        dataProximaConsultaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataProximaConsultaInputActionPerformed(evt);
            }
        });

        espAnteriorInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        espAnteriorInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Bem", "Normal", "Mal" }));
        espAnteriorInput.setEnabled(false);
        espAnteriorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espAnteriorInputActionPerformed(evt);
            }
        });

        dataConsultaActualInput.setEditable(false);
        dataConsultaActualInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataConsultaActualInput.setEnabled(false);
        dataConsultaActualInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataConsultaActualInputActionPerformed(evt);
            }
        });

        consultaMedicaInput.setEditable(true);
        consultaMedicaInput.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        consultaMedicaInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Sempre vai a consulta", "Às vezes vai a consulta", "Nunca foi a consulta" }));
        consultaMedicaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaMedicaInputActionPerformed(evt);
            }
        });

        dataFalecimentoTxt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dataFalecimentoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataFalecimentoTxt.setText("Data de Falecimento");

        dataFalecimentoInput.setEditable(false);
        dataFalecimentoInput.setEnabled(false);
        dataFalecimentoInput.setFocusable(false);
        dataFalecimentoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataFalecimentoInputActionPerformed(evt);
            }
        });

        recuarBTN.setBackground(new java.awt.Color(204, 255, 153));
        recuarBTN.setText("Recuar");
        recuarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuarBTNActionPerformed(evt);
            }
        });

        username.setEditable(false);
        username.setFocusable(false);
        username.setRequestFocusEnabled(false);

        actualizarBTN.setBackground(new java.awt.Color(153, 255, 153));
        actualizarBTN.setText("Actualizar");
        actualizarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBTNActionPerformed(evt);
            }
        });

        avancarBTN.setBackground(new java.awt.Color(255, 0, 0));
        avancarBTN.setForeground(new java.awt.Color(255, 255, 255));
        avancarBTN.setText("Terminar");
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

        lema.setForeground(new java.awt.Color(255, 0, 0));
        lema.setText("O Nosso Maior Valor é a vida");

        javax.swing.GroupLayout cadastroLayout = new javax.swing.GroupLayout(cadastro);
        cadastro.setLayout(cadastroLayout);
        cadastroLayout.setHorizontalGroup(
            cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addComponent(dataProximaConsultaTxt)
                        .addGap(18, 18, 18)
                        .addComponent(dataProximaConsultaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EspObservadoTxt)
                        .addGap(18, 18, 18)
                        .addComponent(espObservadoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addComponent(aonTxt)
                        .addGap(18, 18, 18)
                        .addComponent(aonInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apssTxt)
                        .addGap(18, 18, 18)
                        .addComponent(apssInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addComponent(rastreioTxt)
                        .addGap(18, 18, 18)
                        .addComponent(rastreioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diagnosticoTxt)
                        .addGap(18, 18, 18)
                        .addComponent(diagnosticoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addComponent(consultaMedicaTxt)
                        .addGap(18, 18, 18)
                        .addComponent(consultaMedicaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enfermidadeTxt)
                        .addGap(18, 18, 18)
                        .addComponent(enfermidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addComponent(espActualTxt)
                        .addGap(18, 18, 18)
                        .addComponent(espActualInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataConsultaActualTxt)
                        .addGap(18, 18, 18)
                        .addComponent(dataConsultaActualInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addComponent(aspAnteriorTxt)
                        .addGap(18, 18, 18)
                        .addComponent(espAnteriorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataConsultaAnteriorTxt)
                        .addGap(18, 18, 18)
                        .addComponent(dataConsultaAnteriorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addComponent(situacaoActualPacienteTxt)
                        .addGap(18, 18, 18)
                        .addComponent(situacaoActualPacienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataFalecimentoTxt)
                        .addGap(18, 18, 18)
                        .addComponent(dataFalecimentoInput))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroLayout.createSequentialGroup()
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastroLayout.createSequentialGroup()
                                .addComponent(lema, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(cadastroLayout.createSequentialGroup()
                                .addComponent(username)
                                .addGap(33, 33, 33)))
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gaurdarRascunhoBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(recuarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actualizarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(avancarBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 65, Short.MAX_VALUE))
        );

        cadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EspObservadoTxt, aonInput, aonTxt, apssInput, apssTxt, aspAnteriorTxt, consultaMedicaInput, consultaMedicaTxt, dataConsultaActualInput, dataConsultaActualTxt, dataConsultaAnteriorInput, dataConsultaAnteriorTxt, dataFalecimentoTxt, dataProximaConsultaInput, dataProximaConsultaTxt, diagnosticoInput, diagnosticoTxt, enfermidadeInput, enfermidadeTxt, espActualInput, espActualTxt, espAnteriorInput, espObservadoInput, rastreioInput, rastreioTxt, situacaoActualPacienteInput, situacaoActualPacienteTxt});

        cadastroLayout.setVerticalGroup(
            cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroLayout.createSequentialGroup()
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consultaMedicaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enfermidadeTxt)
                        .addComponent(enfermidadeInput)
                        .addComponent(consultaMedicaInput)))
                .addGap(18, 18, 18)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rastreioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rastreioTxt)
                    .addComponent(diagnosticoTxt)
                    .addComponent(diagnosticoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aonInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aonTxt)
                    .addComponent(apssTxt)
                    .addComponent(apssInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dataConsultaAnteriorTxt)
                        .addComponent(dataConsultaAnteriorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(espAnteriorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aspAnteriorTxt))
                .addGap(18, 18, 18)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(espActualInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dataConsultaActualTxt)
                        .addComponent(dataConsultaActualInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(espActualTxt)))
                .addGap(18, 18, 18)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataProximaConsultaTxt)
                    .addComponent(EspObservadoTxt)
                    .addComponent(espObservadoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataProximaConsultaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(situacaoActualPacienteTxt)
                    .addComponent(situacaoActualPacienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFalecimentoTxt)
                    .addComponent(dataFalecimentoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recuarBTN)
                    .addComponent(actualizarBTN)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avancarBTN)
                    .addComponent(gaurdarRascunhoBTN)
                    .addComponent(lema))
                .addGap(22, 22, 22))
        );

        cadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EspObservadoTxt, aonInput, aonTxt, apssInput, apssTxt, aspAnteriorTxt, consultaMedicaInput, consultaMedicaTxt, dataConsultaActualInput, dataConsultaActualTxt, dataConsultaAnteriorInput, dataConsultaAnteriorTxt, dataFalecimentoTxt, dataProximaConsultaInput, dataProximaConsultaTxt, diagnosticoInput, diagnosticoTxt, enfermidadeInput, enfermidadeTxt, espActualInput, espActualTxt, espAnteriorInput, espObservadoInput, rastreioInput, rastreioTxt, situacaoActualPacienteInput, situacaoActualPacienteTxt});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean consultaMedicaPreenchido = false;
    boolean enfermidadePreenchido = false;
    boolean rastreioPreenchido = false;
    boolean diagnosticoPreenchido = false;
    boolean aonPreenchido = false;
    boolean apssPreenchido = false;
    boolean espAnteriorPreenchido = false;
    boolean dataConsultaAnteriorPreencido = false;
    boolean espActualPreenchido = false;
    boolean dataConsultaActualPreencido = false;
    boolean dataProximaConsultaPreencido = false;
    boolean espProximoPreenchido = false;
    boolean situacaoActualPacientePreenchido = false;

    private void dataConsultaAnteriorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataConsultaAnteriorInputActionPerformed
        var dataTexto = dataConsultaAnteriorInput.getText();
        if (dataTexto != null && !dataTexto.trim().isEmpty()) {
            dataConsultaAnteriorPreencido = true;
            if (dataValida(dataTexto)) {
                habilitarSelect(espActualInput);
                try {
                    caso.setDataConsultaAnterior(converterStringParaData(dataTexto));
                } catch (ParseException ex) {
                    Logger.getLogger(UpdateControleSeguimento.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                showMessageDialog(this, "Formato de data inválido.\n Use dd/MM/aaaa.", "Data Invalida", ERROR_MESSAGE);
                desabilitarSelect(espActualInput);
                dataConsultaAnteriorInput.requestFocus();
            }
        } else {
            showMessageDialog(this, "Por favor, \n preencha a Data de consulta anterior primeiro.");
            dataConsultaAnteriorInput.requestFocus();
            desabilitarSelect(espActualInput);
        }
    }//GEN-LAST:event_dataConsultaAnteriorInputActionPerformed

    private void aonInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aonInputActionPerformed
        var valorSeleccionado = (String) aonInput.getSelectedItem();
        if (!("seleccionar".equals(valorSeleccionado))) {
            if ("Sempre vai a consulta".equals(valorSeleccionado)
                    || "Às vezes vai a consulta".equals(valorSeleccionado)
                    || "Nunca foi a consulta".equals(valorSeleccionado)
                    || "Não Aplicável".equals(valorSeleccionado)) {
                aonPreenchido = true;
                habilitarSelect(apssInput);
                caso.setAon(valorSeleccionado);
            } else {
                showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
                aonInput.requestFocus();
                desabilitarSelect(apssInput);
            }
        } else {
            showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
            aonInput.requestFocus();
            desabilitarSelect(apssInput);
        }
    }//GEN-LAST:event_aonInputActionPerformed

    private void enfermidadeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enfermidadeInputActionPerformed
        var valorSeleccionado = (String) enfermidadeInput.getSelectedItem();
        if (!("seleccionar".equals(valorSeleccionado))) {
            if ("HIV e Hipertensão".equals(valorSeleccionado)
                    || "HIV".equals(valorSeleccionado)
                    || "HIV e TB".equals(valorSeleccionado)
                    || "Câncro da próstata".equals(valorSeleccionado)
                    || "Cancro uterino".equals(valorSeleccionado)
                    || "Cancro da mama".equals(valorSeleccionado)
                    || "Diabetes".equals(valorSeleccionado)
                    || "Hipertensão".equals(valorSeleccionado)
                    || "TB".equals(valorSeleccionado)
                    || "HIV e Diabetes".equals(valorSeleccionado)
                    || "HIV e Câncro".equals(valorSeleccionado)
                    || "TB e Hipertensão".equals(valorSeleccionado)
                    || "Hipertensão e Diabetes".equals(valorSeleccionado)) {
                enfermidadePreenchido = true;
                habilitarSelect(rastreioInput);
                caso.setEnfermidade(valorSeleccionado);
            } else {
                showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
                enfermidadeInput.requestFocus();
                desabilitarSelect(rastreioInput);
            }
        } else {
            showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
            enfermidadeInput.requestFocus();
            desabilitarSelect(rastreioInput);
        }
    }//GEN-LAST:event_enfermidadeInputActionPerformed

    private void apssInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apssInputActionPerformed
        var valorSeleccionado = (String) apssInput.getSelectedItem();
        if (!("seleccionar".equals(valorSeleccionado))) {
            if ("Sempre vai a consulta".equals(valorSeleccionado)
                    || "Às vezes vai a consulta".equals(valorSeleccionado)
                    || "Nunca foi a consulta".equals(valorSeleccionado)
                    || "Não Aplicável".equals(valorSeleccionado)) {
                apssPreenchido = true;
                habilitarSelect(espAnteriorInput);
                caso.setApss(valorSeleccionado);
            } else {
                showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
                apssInput.requestFocus();
                desabilitarSelect(espAnteriorInput);
            }
        } else {
            showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
            apssInput.requestFocus();
            desabilitarSelect(espAnteriorInput);
        }
    }//GEN-LAST:event_apssInputActionPerformed

    private void diagnosticoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosticoInputActionPerformed
        var valorSeleccionado = (String) diagnosticoInput.getSelectedItem();
        if (!("seleccionar".equals(valorSeleccionado))) {
            if ("Determinado".equals(valorSeleccionado)
                    || "Não Determinado".equals(valorSeleccionado)) {
                diagnosticoPreenchido = true;
                habilitarSelect(aonInput);
                caso.setDiagnostico(valorSeleccionado);
            } else {
                showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
                diagnosticoInput.requestFocus();
                desabilitarSelect(aonInput);
            }
        } else {
            showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
            diagnosticoInput.requestFocus();
            desabilitarSelect(aonInput);
        }
    }//GEN-LAST:event_diagnosticoInputActionPerformed

    private void espObservadoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espObservadoInputActionPerformed
        var valorSeleccionado = (String) espObservadoInput.getSelectedItem();
        if (!("seleccionar".equals(valorSeleccionado))) {
            if ("Bem".equals(valorSeleccionado)
                    || "Normal".equals(valorSeleccionado)
                    || "Mal".equals(valorSeleccionado)) {
                espProximoPreenchido = true;
                habilitarSelect(situacaoActualPacienteInput);
                caso.setEspProximo(valorSeleccionado);
            } else {
                showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
                espObservadoInput.requestFocus();
                desabilitarSelect(situacaoActualPacienteInput);
            }
        } else {
            showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
            espObservadoInput.requestFocus();
            desabilitarSelect(situacaoActualPacienteInput);
        }
    }//GEN-LAST:event_espObservadoInputActionPerformed

    private void situacaoActualPacienteInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_situacaoActualPacienteInputActionPerformed
        var situacaoActualPacienteSelecionado = (String) situacaoActualPacienteInput.getSelectedItem();
        if (!situacaoActualPacienteSelecionado.equals("seleccionar")) {
            situacaoActualPacientePreenchido = true;
            if (situacaoActualPacienteSelecionado.equals("Falecido")) {
                habilitarCampo(dataFalecimentoInput);
                dataFalecimentoInput.requestFocus();
                caso.setSituacaoActualPaciente(situacaoActualPacienteSelecionado);
            } else {
                actualizarBTN.requestFocus();
                actualizarBTN.setEnabled(true);
                caso.setSituacaoActualPaciente(situacaoActualPacienteSelecionado);
            }
        } else {
            showMessageDialog(this, "Por favor selecione uma opcao válida.", "Seleccionar Campo", ERROR_MESSAGE);
            desabilitarCampo(dataFalecimentoInput);
            situacaoActualPacienteInput.requestFocus();
        }
    }//GEN-LAST:event_situacaoActualPacienteInputActionPerformed

    private void rastreioInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rastreioInputActionPerformed
        var valorSeleccionado = (String) rastreioInput.getSelectedItem();
        if (!("seleccionar".equals(valorSeleccionado))) {
            if ("Rastreado".equals(valorSeleccionado)
                    || "Não rastreado".equals(valorSeleccionado)) {
                rastreioPreenchido = true;
                habilitarSelect(diagnosticoInput);
                caso.setRastreio(valorSeleccionado);
            } else {
                showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
                rastreioInput.requestFocus();
                desabilitarSelect(diagnosticoInput);
            }
        } else {
            showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
            rastreioInput.requestFocus();
            desabilitarSelect(diagnosticoInput);
        }
    }//GEN-LAST:event_rastreioInputActionPerformed

    private void espActualInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espActualInputActionPerformed
        var valorSeleccionado = (String) espActualInput.getSelectedItem();
        if (!("seleccionar".equals(valorSeleccionado))) {
            if ("Bem".equals(valorSeleccionado)
                    || "Normal".equals(valorSeleccionado)
                    || "Mal".equals(valorSeleccionado)) {
                espActualPreenchido = true;
                habilitarCampo(dataConsultaActualInput);
                caso.setEspActual(valorSeleccionado);
            } else {
                showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
                espActualInput.requestFocus();
                desabilitarCampo(dataConsultaActualInput);
            }
        } else {
            showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
            espActualInput.requestFocus();
            desabilitarCampo(dataConsultaActualInput);
        }
    }//GEN-LAST:event_espActualInputActionPerformed

    private void dataConsultaAnteriorTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataConsultaAnteriorTxtMouseExited

    }//GEN-LAST:event_dataConsultaAnteriorTxtMouseExited

    private void dataProximaConsultaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataProximaConsultaInputActionPerformed
        var dataTexto = dataProximaConsultaInput.getText();
        if (dataTexto != null && !dataTexto.trim().isEmpty()) {
            dataProximaConsultaPreencido = true;
            if (dataValida(dataTexto)) {
                habilitarSelect(espObservadoInput);
                try {
                    caso.setDataProxima(converterStringParaData(dataTexto));
                } catch (ParseException ex) {
                    Logger.getLogger(UpdateControleSeguimento.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                showMessageDialog(this, "Formato de data inválido.\n Use dd/MM/aaaa.", "Data Invalida", ERROR_MESSAGE);
                desabilitarSelect(espObservadoInput);
                dataProximaConsultaInput.requestFocus();
            }
        } else {
            showMessageDialog(this, "Por favor, \n preencha a Data da Proxima consulta primeiro.");
            dataProximaConsultaInput.requestFocus();
            desabilitarSelect(espObservadoInput);
        }
    }//GEN-LAST:event_dataProximaConsultaInputActionPerformed

    private void espAnteriorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espAnteriorInputActionPerformed
        var valorSeleccionado = (String) espAnteriorInput.getSelectedItem();
        if (!("seleccionar".equals(valorSeleccionado))) {
            if ("Bem".equals(valorSeleccionado)
                    || "Normal".equals(valorSeleccionado)
                    || "Mal".equals(valorSeleccionado)) {
                espAnteriorPreenchido = true;
                habilitarCampo(dataConsultaAnteriorInput);
                caso.setEspAnterior(valorSeleccionado);
            } else {
                showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
                espAnteriorInput.requestFocus();
                desabilitarCampo(dataConsultaAnteriorInput);
            }
        } else {
            showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
            espAnteriorInput.requestFocus();
            desabilitarCampo(dataConsultaAnteriorInput);
        }
    }//GEN-LAST:event_espAnteriorInputActionPerformed

    private void dataConsultaActualInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataConsultaActualInputActionPerformed
        var dataTexto = dataConsultaActualInput.getText();
        if (dataTexto != null && !dataTexto.trim().isEmpty()) {
            dataConsultaActualPreencido = true;
            if (dataValida(dataTexto)) {
                habilitarCampo(dataProximaConsultaInput);
                try {
                    caso.setDataConsultaActual(converterStringParaData(dataTexto));
                } catch (ParseException ex) {
                    Logger.getLogger(UpdateControleSeguimento.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                showMessageDialog(this, "Formato de data inválido.\n Use dd/MM/aaaa.", "Data Invalida", ERROR_MESSAGE);
                desabilitarCampo(dataProximaConsultaInput);
                dataConsultaAnteriorInput.requestFocus();
            }
        } else {
            showMessageDialog(this, "Por favor, \n preencha a Data de consulta Actual primeiro.");
            dataConsultaAnteriorInput.requestFocus();
            desabilitarCampo(dataProximaConsultaInput);
        }
    }//GEN-LAST:event_dataConsultaActualInputActionPerformed

    private void consultaMedicaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaMedicaInputActionPerformed
        var valorSeleccionado = (String) consultaMedicaInput.getSelectedItem();
        if (!("seleccionar".equals(valorSeleccionado))) {
            if ("Sempre vai a consulta".equals(valorSeleccionado)
                    || "Às vezes vai a consulta".equals(valorSeleccionado)
                    || "Nunca foi a consulta".equals(valorSeleccionado)) {
                consultaMedicaPreenchido = true;
                habilitarSelect(enfermidadeInput);
                caso.setConsultaMedica(valorSeleccionado);
            } else {
                showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
                consultaMedicaInput.requestFocus();
                desabilitarSelect(enfermidadeInput);
            }
        } else {
            showMessageDialog(this, "Seleccione uma opcao válida", "Escolha inválida", ERROR_MESSAGE);
            consultaMedicaInput.requestFocus();
            desabilitarSelect(enfermidadeInput);
        }
    }//GEN-LAST:event_consultaMedicaInputActionPerformed

    private void avancarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarBTNActionPerformed
        showMessageDialog(this, "O cadastro foi terminado");
        var escolherAccao = new MenuPrincipal(usuario);
        escolherAccao.setLocationRelativeTo(null);
        escolherAccao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_avancarBTNActionPerformed

    private void gaurdarRascunhoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaurdarRascunhoBTNActionPerformed

        String mensagem = "Para aproveitar esta funcionalidade incrível, \nvocê pode solicitar a versão completa do sistema. \nContacte o desenvolvedor para mais detalhes";

        showMessageDialog(this, mensagem, "Funcionalidade Avançada", ERROR_MESSAGE);
    }//GEN-LAST:event_gaurdarRascunhoBTNActionPerformed

    private void recuarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuarBTNActionPerformed
        try {
            try {
                setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (UnsupportedLookAndFeelException ex) {
                getLogger(UpdateControleSeguimento.class.getName()).log(SEVERE, null, ex);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            getLogger(UpdateControleSeguimento.class.getName()).log(SEVERE, null, ex);
        }

        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_recuarBTNActionPerformed

    private void actualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBTNActionPerformed

        try {
            doentes.edit(doente);
            JOptionPane.showMessageDialog(this, "\n Nome: " + doente.getNome() + "\nNID: " + doente.getNid() + "\n Idade: " + doente.getIdade(), "Dados do Doente Actualizados", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            Logger.getLogger(UpdateControleSeguimento.class.getName()).log(Level.SEVERE, null, ex);
        }

        caso.setObservacao("Actualizacao de um Caso Existente");
        casos.create(caso);
        System.out.println(caso);
        JOptionPane.showMessageDialog(this, "\n Nid: " + caso.getNid().getNid() + "\nData: " + converterDataParaString(caso.getDataRegistoCaso()) + "\n US: " + caso.getUsDeAssistencia(), "Actualizacao de Caso Registada", JOptionPane.INFORMATION_MESSAGE);

        var escolherAccao = new MenuPrincipal(usuario);
        escolherAccao.setLocationRelativeTo(null);
        escolherAccao.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_actualizarBTNActionPerformed

    private void dataFalecimentoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataFalecimentoInputActionPerformed
        var dataTexto = dataFalecimentoInput.getText();
        if (dataTexto != null && !dataTexto.trim().isEmpty()) {
            if (dataValida(dataTexto)) {
                actualizarBTN.requestFocus();
                try {
                    caso.setDataFacelimento(converterStringParaData(dataTexto));
                } catch (ParseException ex) {
                    Logger.getLogger(UpdateControleSeguimento.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                showMessageDialog(this, "Formato de data inválido.\n Use dd/MM/aaaa.", "Data Invalida", ERROR_MESSAGE);
                dataFalecimentoInput.requestFocus();
            }
        } else {
            showMessageDialog(this, "Por favor, \n preencha a Data de Facelecimento.");
            dataFalecimentoInput.requestFocus();
        }
    }//GEN-LAST:event_dataFalecimentoInputActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateControleSeguimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        invokeLater(() -> {
            new UpdateControleSeguimento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EspObservadoTxt;
    private javax.swing.JButton actualizarBTN;
    private javax.swing.JComboBox<String> aonInput;
    private javax.swing.JLabel aonTxt;
    private javax.swing.JComboBox<String> apssInput;
    private javax.swing.JLabel apssTxt;
    private javax.swing.JLabel aspAnteriorTxt;
    private javax.swing.JButton avancarBTN;
    private javax.swing.JPanel cabecalho;
    private javax.swing.JPanel cadastro;
    private javax.swing.JComboBox<String> consultaMedicaInput;
    private javax.swing.JLabel consultaMedicaTxt;
    private javax.swing.JTextField dataConsultaActualInput;
    private javax.swing.JLabel dataConsultaActualTxt;
    private javax.swing.JTextField dataConsultaAnteriorInput;
    private javax.swing.JLabel dataConsultaAnteriorTxt;
    private javax.swing.JTextField dataFalecimentoInput;
    private javax.swing.JLabel dataFalecimentoTxt;
    private javax.swing.JTextField dataProximaConsultaInput;
    private javax.swing.JLabel dataProximaConsultaTxt;
    private javax.swing.JComboBox<String> diagnosticoInput;
    private javax.swing.JLabel diagnosticoTxt;
    private javax.swing.JLabel emblema;
    private javax.swing.JComboBox<String> enfermidadeInput;
    private javax.swing.JLabel enfermidadeTxt;
    private javax.swing.JComboBox<String> espActualInput;
    private javax.swing.JLabel espActualTxt;
    private javax.swing.JComboBox<String> espAnteriorInput;
    private javax.swing.JComboBox<String> espObservadoInput;
    private javax.swing.JButton gaurdarRascunhoBTN;
    private javax.swing.JLabel hospital;
    private javax.swing.JLabel lema;
    private javax.swing.JLabel provincia;
    private javax.swing.JComboBox<String> rastreioInput;
    private javax.swing.JLabel rastreioTxt;
    private javax.swing.JButton recuarBTN;
    private javax.swing.JLabel republica;
    private javax.swing.JLabel servicos;
    private javax.swing.JLabel sistema1;
    private javax.swing.JComboBox<String> situacaoActualPacienteInput;
    private javax.swing.JLabel situacaoActualPacienteTxt;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
