package sigemonitoria.modelo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sigemonitoria.modelo.Hospital;
import sigemonitoria.modelo.TipoUtilizador;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-03T09:52:45", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Utilizador.class)
public class Utilizador_ { 

    public static volatile SingularAttribute<Utilizador, String> senha;
    public static volatile SingularAttribute<Utilizador, Short> id;
    public static volatile SingularAttribute<Utilizador, Hospital> hospital;
    public static volatile SingularAttribute<Utilizador, TipoUtilizador> tipoUtilizador;
    public static volatile SingularAttribute<Utilizador, String> nomeCompleto;
    public static volatile SingularAttribute<Utilizador, String> username;

}