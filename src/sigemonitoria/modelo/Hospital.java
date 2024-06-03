
package sigemonitoria.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Meldo Maunze
 */
@Entity
@Table(catalog = "sigemonitoria", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"nome_hospital"})})
@NamedQueries({
    @NamedQuery(name = "Hospital.findAll", query = "SELECT h FROM Hospital h"),
    @NamedQuery(name = "Hospital.findById", query = "SELECT h FROM Hospital h WHERE h.id = :id"),
    @NamedQuery(name = "Hospital.findByNomeHospital", query = "SELECT h FROM Hospital h WHERE h.nomeHospital = :nomeHospital")})
public class Hospital implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Short id;
    @Basic(optional = false)
    @Column(name = "nome_hospital", nullable = false, length = 255)
    private String nomeHospital;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String endereco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospital", fetch = FetchType.LAZY)
    private List<Utilizador> utilizadorList;

    public Hospital() {
    }

    public Hospital(Short id) {
        this.id = id;
    }

    public Hospital(Short id, String nomeHospital, String endereco) {
        this.id = id;
        this.nomeHospital = nomeHospital;
        this.endereco = endereco;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNomeHospital() {
        return nomeHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Utilizador> getUtilizadorList() {
        return utilizadorList;
    }

    public void setUtilizadorList(List<Utilizador> utilizadorList) {
        this.utilizadorList = utilizadorList;
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
        if (!(object instanceof Hospital)) {
            return false;
        }
        Hospital other = (Hospital) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sigemonitoria.modelo.Hospital[ id=" + id + " ]";
    }
    
}
