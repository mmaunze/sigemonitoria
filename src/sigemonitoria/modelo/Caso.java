/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sigemonitoria.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Meldo Maunze
 */
@Entity
@Table(catalog = "sigemonitoria", schema = "")
@NamedQueries({
    @NamedQuery(name = "Caso.findAll", query = "SELECT c FROM Caso c"),
    @NamedQuery(name = "Caso.findById", query = "SELECT c FROM Caso c WHERE c.id = :id"),
    @NamedQuery(name = "Caso.findByDataRegistoCaso", query = "SELECT c FROM Caso c WHERE c.dataRegistoCaso = :dataRegistoCaso"),
    @NamedQuery(name = "Caso.findByLocalDaUs", query = "SELECT c FROM Caso c WHERE c.localDaUs = :localDaUs"),
    @NamedQuery(name = "Caso.findByUsDeAssistencia", query = "SELECT c FROM Caso c WHERE c.usDeAssistencia = :usDeAssistencia"),
    @NamedQuery(name = "Caso.findByEstabelecimentoSaude", query = "SELECT c FROM Caso c WHERE c.estabelecimentoSaude = :estabelecimentoSaude"),
    @NamedQuery(name = "Caso.findByConsultaMedica", query = "SELECT c FROM Caso c WHERE c.consultaMedica = :consultaMedica"),
    @NamedQuery(name = "Caso.findByEnfermidade", query = "SELECT c FROM Caso c WHERE c.enfermidade = :enfermidade"),
    @NamedQuery(name = "Caso.findByRastreio", query = "SELECT c FROM Caso c WHERE c.rastreio = :rastreio"),
    @NamedQuery(name = "Caso.findByDiagnostico", query = "SELECT c FROM Caso c WHERE c.diagnostico = :diagnostico"),
    @NamedQuery(name = "Caso.findByAon", query = "SELECT c FROM Caso c WHERE c.aon = :aon"),
    @NamedQuery(name = "Caso.findByApss", query = "SELECT c FROM Caso c WHERE c.apss = :apss"),
    @NamedQuery(name = "Caso.findByEspAnterior", query = "SELECT c FROM Caso c WHERE c.espAnterior = :espAnterior"),
    @NamedQuery(name = "Caso.findByDataConsultaAnterior", query = "SELECT c FROM Caso c WHERE c.dataConsultaAnterior = :dataConsultaAnterior"),
    @NamedQuery(name = "Caso.findByEspActual", query = "SELECT c FROM Caso c WHERE c.espActual = :espActual"),
    @NamedQuery(name = "Caso.findByDataConsultaActual", query = "SELECT c FROM Caso c WHERE c.dataConsultaActual = :dataConsultaActual"),
    @NamedQuery(name = "Caso.findByDataProxima", query = "SELECT c FROM Caso c WHERE c.dataProxima = :dataProxima"),
    @NamedQuery(name = "Caso.findByEspProximo", query = "SELECT c FROM Caso c WHERE c.espProximo = :espProximo"),
    @NamedQuery(name = "Caso.findBySituacaoActualPaciente", query = "SELECT c FROM Caso c WHERE c.situacaoActualPaciente = :situacaoActualPaciente"),
    @NamedQuery(name = "Caso.findByDataFacelimento", query = "SELECT c FROM Caso c WHERE c.dataFacelimento = :dataFacelimento"),
    @NamedQuery(name = "Caso.findByObservacao", query = "SELECT c FROM Caso c WHERE c.observacao = :observacao")})
public class Caso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "data_registo_caso", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataRegistoCaso;
    @Basic(optional = false)
    @Column(name = "local_da_us", nullable = false, length = 75)
    private String localDaUs;
    @Basic(optional = false)
    @Column(name = "us_de_assistencia", nullable = false, length = 75)
    private String usDeAssistencia;
    @Basic(optional = false)
    @Column(name = "estabelecimento_saude", nullable = false, length = 75)
    private String estabelecimentoSaude;
    @Basic(optional = false)
    @Column(name = "consulta_medica", nullable = false, length = 75)
    private String consultaMedica;
    @Basic(optional = false)
    @Column(nullable = false, length = 75)
    private String enfermidade;
    @Basic(optional = false)
    @Column(nullable = false, length = 75)
    private String rastreio;
    @Basic(optional = false)
    @Column(nullable = false, length = 75)
    private String diagnostico;
    @Basic(optional = false)
    @Column(nullable = false, length = 75)
    private String aon;
    @Basic(optional = false)
    @Column(nullable = false, length = 75)
    private String apss;
    @Basic(optional = false)
    @Column(name = "esp_anterior", nullable = false, length = 75)
    private String espAnterior;
    @Basic(optional = false)
    @Column(name = "data_consulta_anterior", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataConsultaAnterior;
    @Basic(optional = false)
    @Column(name = "esp_actual", nullable = false, length = 75)
    private String espActual;
    @Basic(optional = false)
    @Column(name = "data_consulta_actual", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataConsultaActual;
    @Basic(optional = false)
    @Column(name = "data_proxima", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataProxima;
    @Basic(optional = false)
    @Column(name = "esp_proximo", nullable = false, length = 75)
    private String espProximo;
    @Basic(optional = false)
    @Column(name = "situacao_actual_paciente", nullable = false, length = 75)
    private String situacaoActualPaciente;
    @Basic(optional = false)
    @Column(name = "data_facelimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFacelimento;
    
    @Basic(optional = false)
    @Column(nullable = false, length = 120)
    private String observacao;
    
    @JoinColumn(name = "nid", referencedColumnName = "nid", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Doente nid;

    public Caso() {
    }

    public Caso(Long id) {
        this.id = id;
    }

    public Caso(Long id, Date dataRegistoCaso, String localDaUs, String usDeAssistencia, String estabelecimentoSaude, String consultaMedica, String enfermidade, String rastreio, String diagnostico, String aon, String apss, String espAnterior, Date dataConsultaAnterior, String espActual, Date dataConsultaActual, Date dataProxima, String espProximo, String situacaoActualPaciente, Date dataFacelimento, String observacao) {
        this.id = id;
        this.dataRegistoCaso = dataRegistoCaso;
        this.localDaUs = localDaUs;
        this.usDeAssistencia = usDeAssistencia;
        this.estabelecimentoSaude = estabelecimentoSaude;
        this.consultaMedica = consultaMedica;
        this.enfermidade = enfermidade;
        this.rastreio = rastreio;
        this.diagnostico = diagnostico;
        this.aon = aon;
        this.apss = apss;
        this.espAnterior = espAnterior;
        this.dataConsultaAnterior = dataConsultaAnterior;
        this.espActual = espActual;
        this.dataConsultaActual = dataConsultaActual;
        this.dataProxima = dataProxima;
        this.espProximo = espProximo;
        this.situacaoActualPaciente = situacaoActualPaciente;
        this.dataFacelimento = dataFacelimento;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataRegistoCaso() {
        return dataRegistoCaso;
    }

    public void setDataRegistoCaso(Date dataRegistoCaso) {
        this.dataRegistoCaso = dataRegistoCaso;
    }

    public String getLocalDaUs() {
        return localDaUs;
    }

    public void setLocalDaUs(String localDaUs) {
        this.localDaUs = localDaUs;
    }

    public String getUsDeAssistencia() {
        return usDeAssistencia;
    }

    public void setUsDeAssistencia(String usDeAssistencia) {
        this.usDeAssistencia = usDeAssistencia;
    }

    public String getEstabelecimentoSaude() {
        return estabelecimentoSaude;
    }

    public void setEstabelecimentoSaude(String estabelecimentoSaude) {
        this.estabelecimentoSaude = estabelecimentoSaude;
    }

    public String getConsultaMedica() {
        return consultaMedica;
    }

    public void setConsultaMedica(String consultaMedica) {
        this.consultaMedica = consultaMedica;
    }

    public String getEnfermidade() {
        return enfermidade;
    }

    public void setEnfermidade(String enfermidade) {
        this.enfermidade = enfermidade;
    }

    public String getRastreio() {
        return rastreio;
    }

    public void setRastreio(String rastreio) {
        this.rastreio = rastreio;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getAon() {
        return aon;
    }

    public void setAon(String aon) {
        this.aon = aon;
    }

    public String getApss() {
        return apss;
    }

    public void setApss(String apss) {
        this.apss = apss;
    }

    public String getEspAnterior() {
        return espAnterior;
    }

    public void setEspAnterior(String espAnterior) {
        this.espAnterior = espAnterior;
    }

    public Date getDataConsultaAnterior() {
        return dataConsultaAnterior;
    }

    public void setDataConsultaAnterior(Date dataConsultaAnterior) {
        this.dataConsultaAnterior = dataConsultaAnterior;
    }

    public String getEspActual() {
        return espActual;
    }

    public void setEspActual(String espActual) {
        this.espActual = espActual;
    }

    public Date getDataConsultaActual() {
        return dataConsultaActual;
    }

    public void setDataConsultaActual(Date dataConsultaActual) {
        this.dataConsultaActual = dataConsultaActual;
    }

    public Date getDataProxima() {
        return dataProxima;
    }

    public void setDataProxima(Date dataProxima) {
        this.dataProxima = dataProxima;
    }

    public String getEspProximo() {
        return espProximo;
    }

    public void setEspProximo(String espProximo) {
        this.espProximo = espProximo;
    }

    public String getSituacaoActualPaciente() {
        return situacaoActualPaciente;
    }

    public void setSituacaoActualPaciente(String situacaoActualPaciente) {
        this.situacaoActualPaciente = situacaoActualPaciente;
    }

    public Date getDataFacelimento() {
        return dataFacelimento;
    }

    public void setDataFacelimento(Date dataFacelimento) {
        this.dataFacelimento = dataFacelimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Doente getNid() {
        return nid;
    }

    public void setNid(Doente nid) {
        this.nid = nid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caso)) {
            return false;
        }
        Caso other = (Caso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sigemonitoria.modelo.Caso[ id=" + id + " ]";
    }
    
}
