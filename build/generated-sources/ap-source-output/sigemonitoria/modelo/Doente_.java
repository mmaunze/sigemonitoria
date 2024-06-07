package sigemonitoria.modelo;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sigemonitoria.modelo.Caso;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-07T15:01:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Doente.class)
public class Doente_ { 

    public static volatile SingularAttribute<Doente, String> distritoNascimento;
    public static volatile SingularAttribute<Doente, String> provinciaNascimento;
    public static volatile SingularAttribute<Doente, String> nivelCarreira;
    public static volatile SingularAttribute<Doente, String> categoria;
    public static volatile SingularAttribute<Doente, String> provinciaResidencia;
    public static volatile SingularAttribute<Doente, String> nid;
    public static volatile SingularAttribute<Doente, String> distritoResidencia;
    public static volatile SingularAttribute<Doente, String> nome;
    public static volatile SingularAttribute<Doente, String> sectorTrabalho;
    public static volatile SingularAttribute<Doente, Short> idade;
    public static volatile SingularAttribute<Doente, String> faixaEtaria;
    public static volatile ListAttribute<Doente, Caso> casoList;
    public static volatile SingularAttribute<Doente, Date> dataNascimento;
    public static volatile SingularAttribute<Doente, String> sexo;
    public static volatile SingularAttribute<Doente, String> carreira;
    public static volatile SingularAttribute<Doente, String> morada;

}