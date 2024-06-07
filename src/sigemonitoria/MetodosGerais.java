package sigemonitoria;

import java.math.BigInteger;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_YEAR;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import static javax.persistence.Persistence.createEntityManagerFactory;
import javax.persistence.Query;
import static javax.persistence.TemporalType.DATE;
import javax.persistence.TypedQuery;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import sigemonitoria.controller.DoenteJpaController;
import sigemonitoria.modelo.Caso;

/**
 *
 * @author Meldo Maunze
 */
public interface MetodosGerais {

    /**
     *
     * @param dataString
     * @return
     * @throws ParseException
     */
    public default Date converterStringParaData(String dataString) throws ParseException {
        var formato = new SimpleDateFormat("dd/MM/yyyy");
        var dataUtil = formato.parse(dataString);
        return new Date(dataUtil.getTime());
    }

    /**
     *
     * @param data
     * @return
     */
    public default String converterDataParaString(Date data) {
        var df = new SimpleDateFormat("yyyy-MM-dd");
        var dataFormatada = df.format(data);
        var partes = dataFormatada.split("-");
        return String.format("%s/%s/%s", partes[2], partes[1], partes[0]);
    }

    public default Caso obterUltimoCasoPorNid(String nid) {
        EntityManagerFactory emf = createEntityManagerFactory("sigemonitoriaPU");
        EntityManager em = emf.createEntityManager();

        try {
            // Consulta JPQL para obter o último Caso baseado no NID
            String jpql = "SELECT c FROM Caso c WHERE c.nid.nid = :nid ORDER BY c.dataRegistoCaso DESC";
            TypedQuery<Caso> query = em.createQuery(jpql, Caso.class);
            query.setParameter("nid", nid);
            query.setMaxResults(1);

            Caso ultimoCaso = query.getResultList().stream().findFirst().orElse(null);
            return ultimoCaso;
        } finally {
            em.close();
            emf.close();
        }
    }

    public default String gerarNid() {
        EntityManagerFactory emf = createEntityManagerFactory("sigemonitoriaPU");
        EntityManager em = emf.createEntityManager();

        try {
            // Realiza a consulta para obter o maior nid existente
            String jpql = "SELECT MAX(CAST(d.nid AS UNSIGNED)) FROM Doente d";
            Query query = em.createQuery(jpql);
            BigInteger maxNidBigInteger = (BigInteger) query.getSingleResult();

            // Converte o BigInteger para Long
            Long maxNid = (maxNidBigInteger != null) ? maxNidBigInteger.longValue() : null;

            // Verifica se maxNid é null e inicia a partir de 1 se não houver nenhum nid existente
            long newNid = (maxNid != null ? maxNid : 0) + 1;

            // Formata o novo nid para garantir 5 dígitos
            return String.format("%05d", newNid);
        } finally {
            em.close();
            emf.close();
        }
    }

    /**
     *
     * @param data
     * @return
     */
    public default boolean dataValida(String data) {
        var sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            var cal = Calendar.getInstance();
            cal.setTime(sdf.parse(data));
            var anoAtual = Calendar.getInstance().get(Calendar.YEAR);
            var anoDigitado = cal.get(Calendar.YEAR);
            return anoDigitado >= 1910 && anoDigitado <= anoAtual;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     *
     * @param dataNascimento
     * @return
     */
    public default int calcularIdade(String dataNascimento) {
        try {
            var sdf = new SimpleDateFormat("dd/MM/yyyy");
            var dataNasc = sdf.parse(dataNascimento);
            Calendar dataNascimentoCal = new GregorianCalendar();
            dataNascimentoCal.setTime(dataNasc);

            var hoje = getInstance();
            var idadee = hoje.get(YEAR) - dataNascimentoCal.get(YEAR);
            if (hoje.get(DAY_OF_YEAR) < dataNascimentoCal.get(DAY_OF_YEAR)) {
                idadee--;
            }
            return idadee;
        } catch (ParseException e) {
            return 0;
        }
    }

    /**
     *
     * @param idade
     * @return
     */
    public default String calcularFaixaEtaria(int idade) {
        if (idade < 18) {
            return "<18";
        } else if (idade >= 18 && idade <= 25) {
            return "18-25";
        } else if (idade >= 26 && idade <= 31) {
            return "26-31";
        } else if (idade >= 32 && idade <= 37) {
            return "32-37";
        } else if (idade >= 38 && idade <= 41) {
            return "38-41";
        } else if (idade >= 42 && idade <= 48) {
            return "42-48";
        } else if (idade >= 49 && idade <= 54) {
            return "49-54";
        } else if (idade >= 55 && idade <= 59) {
            return "55-59";
        } else if (idade >= 60 && idade <= 65) {
            return "60-65";
        } else {
            return ">65";
        }
    }

    /**
     *
     * @param numeroMes
     * @return
     */
    public default String obterMesPorExtenso(int numeroMes) {
        if (numeroMes < 1 || numeroMes > 12) {
            throw new IllegalArgumentException("Número de mês inválido. Deve estar entre 1 e 12.");
        }
        var meses = new DateFormatSymbols(new Locale("pt", "BR")).getMonths();
        return meses[numeroMes - 1];
    }

    /**
     *
     * @param campo
     */
    public default void habilitarCampo(JTextField campo) {
        campo.setEnabled(true);
        campo.setEditable(true);
        campo.setFocusable(true);
        campo.requestFocus();
    }

    /**
     *
     * @param campo
     */
    public default void habilitarSelect(JComboBox<String> campo) {
        campo.setEnabled(true);
        campo.setEditable(true);
        campo.setFocusable(true);
        campo.requestFocus();
    }

    /**
     *
     * @param campo
     */
    public default void desabilitarCampo(JTextField campo) {
        campo.setEnabled(false);
        campo.setEditable(false);
        campo.setFocusable(false);
        campo.setText("");
    }

    /**
     *
     * @param campo
     */
    public default void desabilitarSelect(JComboBox<String> campo) {
        campo.setEnabled(false);
        campo.setEditable(false);
        campo.setFocusable(false);
        campo.setSelectedIndex(0);
    }

    public default int obterNumeroMes(String nomeMes) {
        var symbols = new DateFormatSymbols(new Locale("pt", "BR"));
        var meses = symbols.getMonths();
        for (var i = 0; i < meses.length; i++) {
            if (meses[i].equalsIgnoreCase(nomeMes)) {
                return i + 1;
            }
        }
        return 0;
    }

    public default List<Caso> findPacientesPorPeriodo(int ano, int mesInicio, int mesFim) {
        EntityManagerFactory emf = createEntityManagerFactory("sigemonitoriaPU");
        var em = emf.createEntityManager();

        var dataInicio = converterParaData(ano, mesInicio, 1);
        var dataFim = converterParaData(ano, mesFim, 28);
        try {
            // Consulta JPQL para obter pacientes dentro do período especificado
            var query = em.createQuery(
                    "SELECT c FROM Caso c "
                    + "WHERE c.dataRegistoCaso >= :dataInicio AND c.dataRegistoCaso <= :dataFim "
                    + "ORDER BY c.dataRegistoCaso",
                    Caso.class);
            query.setParameter("dataInicio", dataInicio, DATE);
            query.setParameter("dataFim", dataFim, DATE);

            // Executa a consulta
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    private Date converterParaData(int ano, int mes, int dia) {
        var calendar = getInstance();
        calendar.set(YEAR, ano);
        calendar.set(MONTH, mes - 1); // Mês em Java é baseado em zero (janeiro = 0, fevereiro = 1, ...)
        calendar.set(DAY_OF_MONTH, dia);
        return calendar.getTime();
    }
}
