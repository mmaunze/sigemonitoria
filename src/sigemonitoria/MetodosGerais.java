package sigemonitoria;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_YEAR;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public interface MetodosGerais {

    public default Date converterStringParaData(String dataString) throws ParseException {
        var formato = new SimpleDateFormat("dd/MM/yyyy");
        var dataUtil = formato.parse(dataString);
        return new Date(dataUtil.getTime());
    }

    public default String converteDataParaString(Date data) {
        var df = new SimpleDateFormat("yyyy-MM-dd");
        var dataFormatada = df.format(data);
        var partes = dataFormatada.split("-");
        return String.format("%s/%s/%s", partes[2], partes[1], partes[0]);
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

    public default String obterMesPorExtenso(int numeroMes) {
        if (numeroMes < 1 || numeroMes > 12) {
            throw new IllegalArgumentException("Número de mês inválido. Deve estar entre 1 e 12.");
        }
        var meses = new DateFormatSymbols(new Locale("pt", "BR")).getMonths();
        return meses[numeroMes - 1];
    }

    public default void habilitarCampo(JTextField campo) {
        campo.setEnabled(true);
        campo.setEditable(true);
        campo.setFocusable(true);
        campo.requestFocus();
    }

    public default void habilitarSelect(JComboBox<String> campo) {
        campo.setEnabled(true);
        campo.setEditable(true);
        campo.setFocusable(true);
        campo.requestFocus();
    }

    public default void desabilitarCampo(JTextField campo) {
        campo.setEnabled(false);
        campo.setEditable(false);
        campo.setFocusable(false);
        campo.setText("");
    }

    public default void desabilitarSelect(JComboBox<String> campo) {
        campo.setEnabled(false);
        campo.setEditable(false);
        campo.setFocusable(false);
        campo.setSelectedIndex(0);
    }

}
