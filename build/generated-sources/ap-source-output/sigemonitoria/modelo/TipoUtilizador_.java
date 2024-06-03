package sigemonitoria.modelo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sigemonitoria.modelo.Utilizador;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-03T09:52:45", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(TipoUtilizador.class)
public class TipoUtilizador_ { 

    public static volatile ListAttribute<TipoUtilizador, Utilizador> utilizadorList;
    public static volatile SingularAttribute<TipoUtilizador, Short> id;
    public static volatile SingularAttribute<TipoUtilizador, String> descricao;

}