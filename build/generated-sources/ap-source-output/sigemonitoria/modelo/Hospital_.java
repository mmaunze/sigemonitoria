package sigemonitoria.modelo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sigemonitoria.modelo.Utilizador;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-07T11:31:36", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Hospital.class)
public class Hospital_ { 

    public static volatile ListAttribute<Hospital, Utilizador> utilizadorList;
    public static volatile SingularAttribute<Hospital, String> endereco;
    public static volatile SingularAttribute<Hospital, String> nomeHospital;
    public static volatile SingularAttribute<Hospital, Short> id;

}