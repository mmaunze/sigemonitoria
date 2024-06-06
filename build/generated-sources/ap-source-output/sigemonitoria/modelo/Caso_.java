package sigemonitoria.modelo;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sigemonitoria.modelo.Doente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-06T22:15:45", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Caso.class)
public class Caso_ { 

    public static volatile SingularAttribute<Caso, String> aon;
    public static volatile SingularAttribute<Caso, String> apss;
    public static volatile SingularAttribute<Caso, String> observacao;
    public static volatile SingularAttribute<Caso, String> espAnterior;
    public static volatile SingularAttribute<Caso, String> localDaUs;
    public static volatile SingularAttribute<Caso, String> enfermidade;
    public static volatile SingularAttribute<Caso, String> espActual;
    public static volatile SingularAttribute<Caso, Date> dataProxima;
    public static volatile SingularAttribute<Caso, Date> dataConsultaActual;
    public static volatile SingularAttribute<Caso, Doente> nid;
    public static volatile SingularAttribute<Caso, String> consultaMedica;
    public static volatile SingularAttribute<Caso, Date> dataRegistoCaso;
    public static volatile SingularAttribute<Caso, String> situacaoActualPaciente;
    public static volatile SingularAttribute<Caso, String> espProximo;
    public static volatile SingularAttribute<Caso, String> diagnostico;
    public static volatile SingularAttribute<Caso, Date> dataFacelimento;
    public static volatile SingularAttribute<Caso, Long> id;
    public static volatile SingularAttribute<Caso, String> estabelecimentoSaude;
    public static volatile SingularAttribute<Caso, String> usDeAssistencia;
    public static volatile SingularAttribute<Caso, String> rastreio;
    public static volatile SingularAttribute<Caso, Date> dataConsultaAnterior;

}