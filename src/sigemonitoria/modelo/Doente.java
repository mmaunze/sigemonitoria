/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sigemonitoria.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @NamedQuery(name = "Doente.findAll", query = "SELECT d FROM Doente d"),
    @NamedQuery(name = "Doente.findByNid", query = "SELECT d FROM Doente d WHERE d.nid = :nid"),
    @NamedQuery(name = "Doente.findByDistritoNascimento", query = "SELECT d FROM Doente d WHERE d.distritoNascimento = :distritoNascimento"),
    @NamedQuery(name = "Doente.findByProvinciaNascimento", query = "SELECT d FROM Doente d WHERE d.provinciaNascimento = :provinciaNascimento"),
    @NamedQuery(name = "Doente.findByDataNascimento", query = "SELECT d FROM Doente d WHERE d.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "Doente.findByCategoria", query = "SELECT d FROM Doente d WHERE d.categoria = :categoria"),
    @NamedQuery(name = "Doente.findByCarreira", query = "SELECT d FROM Doente d WHERE d.carreira = :carreira"),
    @NamedQuery(name = "Doente.findByNome", query = "SELECT d FROM Doente d WHERE d.nome = :nome"),
    @NamedQuery(name = "Doente.findByNivelCarreira", query = "SELECT d FROM Doente d WHERE d.nivelCarreira = :nivelCarreira"),
    @NamedQuery(name = "Doente.findBySexo", query = "SELECT d FROM Doente d WHERE d.sexo = :sexo"),
    @NamedQuery(name = "Doente.findByProvinciaResidencia", query = "SELECT d FROM Doente d WHERE d.provinciaResidencia = :provinciaResidencia"),
    @NamedQuery(name = "Doente.findByDistritoResidencia", query = "SELECT d FROM Doente d WHERE d.distritoResidencia = :distritoResidencia"),
    @NamedQuery(name = "Doente.findByMorada", query = "SELECT d FROM Doente d WHERE d.morada = :morada"),
    @NamedQuery(name = "Doente.findBySectorTrabalho", query = "SELECT d FROM Doente d WHERE d.sectorTrabalho = :sectorTrabalho"),
    @NamedQuery(name = "Doente.findByIdade", query = "SELECT d FROM Doente d WHERE d.idade = :idade"),
    @NamedQuery(name = "Doente.findByFaixaEtaria", query = "SELECT d FROM Doente d WHERE d.faixaEtaria = :faixaEtaria")})
public class Doente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 5)
    private String nid;
    @Column(name = "distrito_nascimento", length = 75)
    private String distritoNascimento;
    @Column(name = "provincia_nascimento", length = 75)
    private String provinciaNascimento;
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(length = 75)
    private String categoria;
    @Column(length = 75)
    private String carreira;
    @Column(length = 175)
    private String nome;
    @Column(name = "nivel_carreira", length = 25)
    private String nivelCarreira;
    @Column(length = 15)
    private String sexo;
    @Column(name = "provincia_residencia", length = 75)
    private String provinciaResidencia;
    @Column(name = "distrito_residencia", length = 75)
    private String distritoResidencia;
    @Column(length = 175)
    private String morada;
    @Column(name = "sector_trabalho", length = 175)
    private String sectorTrabalho;
    private Short idade;
    @Column(name = "faixa_etaria", length = 30)
    private String faixaEtaria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nid", fetch = FetchType.LAZY)
    private List<Caso> casoList;

    public Doente() {
    }

    public Doente(String nid) {
        this.nid = nid;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getDistritoNascimento() {
        return distritoNascimento;
    }

    public void setDistritoNascimento(String distritoNascimento) {
        this.distritoNascimento = distritoNascimento;
    }

    public String getProvinciaNascimento() {
        return provinciaNascimento;
    }

    public void setProvinciaNascimento(String provinciaNascimento) {
        this.provinciaNascimento = provinciaNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCarreira() {
        return carreira;
    }

    public void setCarreira(String carreira) {
        this.carreira = carreira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivelCarreira() {
        return nivelCarreira;
    }

    public void setNivelCarreira(String nivelCarreira) {
        this.nivelCarreira = nivelCarreira;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProvinciaResidencia() {
        return provinciaResidencia;
    }

    public void setProvinciaResidencia(String provinciaResidencia) {
        this.provinciaResidencia = provinciaResidencia;
    }

    public String getDistritoResidencia() {
        return distritoResidencia;
    }

    public void setDistritoResidencia(String distritoResidencia) {
        this.distritoResidencia = distritoResidencia;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getSectorTrabalho() {
        return sectorTrabalho;
    }

    public void setSectorTrabalho(String sectorTrabalho) {
        this.sectorTrabalho = sectorTrabalho;
    }

    public Short getIdade() {
        return idade;
    }

    public void setIdade(Short idade) {
        this.idade = idade;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public List<Caso> getCasoList() {
        return casoList;
    }

    public void setCasoList(List<Caso> casoList) {
        this.casoList = casoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nid != null ? nid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doente)) {
            return false;
        }
        Doente other = (Doente) object;
        if ((this.nid == null && other.nid != null) || (this.nid != null && !this.nid.equals(other.nid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sigemonitoria.modelo.Doente[ nid=" + nid + " ]";
    }
    
}
