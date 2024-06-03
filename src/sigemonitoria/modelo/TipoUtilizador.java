
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
@Table(name = "tipo_utilizador", catalog = "sigemonitoria", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"descricao"})})
@NamedQueries({
    @NamedQuery(name = "TipoUtilizador.findAll", query = "SELECT t FROM TipoUtilizador t"),
    @NamedQuery(name = "TipoUtilizador.findById", query = "SELECT t FROM TipoUtilizador t WHERE t.id = :id"),
    @NamedQuery(name = "TipoUtilizador.findByDescricao", query = "SELECT t FROM TipoUtilizador t WHERE t.descricao = :descricao")})
public class TipoUtilizador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Short id;
    @Basic(optional = false)
    @Column(nullable = false, length = 70)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoUtilizador", fetch = FetchType.LAZY)
    private List<Utilizador> utilizadorList;

    public TipoUtilizador() {
    }

    public TipoUtilizador(Short id) {
        this.id = id;
    }

    public TipoUtilizador(Short id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        if (!(object instanceof TipoUtilizador)) {
            return false;
        }
        TipoUtilizador other = (TipoUtilizador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sigemonitoria.modelo.TipoUtilizador[ id=" + id + " ]";
    }
    
}
