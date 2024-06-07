package sigemonitoria.controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import static com.itextpdf.text.Element.ALIGN_CENTER;
import static com.itextpdf.text.FontFactory.HELVETICA_BOLD;
import static com.itextpdf.text.FontFactory.getFont;
import static com.itextpdf.text.Image.getInstance;
import static com.itextpdf.text.PageSize.A3;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import static com.itextpdf.text.pdf.PdfWriter.getInstance;
import java.io.File;

import static java.io.File.separator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import static java.util.Locale.getDefault;
import javax.swing.*;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import static javax.swing.JFileChooser.DIRECTORIES_ONLY;
import sigemonitoria.MetodosGerais;
import sigemonitoria.modelo.Caso;
import sigemonitoria.modelo.Utilizador;

public class GeradorPDF implements MetodosGerais {

    public void gerarRelatorio(List<Caso> casos, int ano, int mesInicio, int mesFim, Utilizador usuario) throws IOException {

        var fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(DIRECTORIES_ONLY);

        var result = fileChooser.showSaveDialog(null);

        var dateFormatExtenso = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        var dataExtenso = dateFormatExtenso.format(new Date());

        var dateFormat = new SimpleDateFormat("HH:mm:ss", getDefault());
        var dateFormat2 = new SimpleDateFormat("HH'h' mm'min' ss's' ", getDefault());

        var horaGeracao = dateFormat.format(new Date());
        var horaGeracao2 = dateFormat2.format(new Date());

        if (result == APPROVE_OPTION) {
            var selectedDirectory = fileChooser.getSelectedFile();

            var filePath = selectedDirectory.getAbsolutePath() + separator + "relatorio  " + dataExtenso + " " + horaGeracao2 + ".pdf";

            var document = new Document(A3);
            try {

                getInstance(document, new FileOutputStream(filePath));
                document.open();

                File imageFile = new File("src/sigemonitoria/vista/imagens/emblema.png");

                if (imageFile.exists()) {
                    var image = getInstance(imageFile.getAbsolutePath()); // Obtém o caminho absoluto do arquivo
                    image.setAlignment(ALIGN_CENTER);
                    document.add(image);
                } else {
                    System.out.println("Arquivo de imagem não encontrado.");
                }
                var paragraph = new Paragraph("REPÚBLICA DE MOÇAMBIQUE");
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);

                paragraph = new Paragraph("PROVÍNCIA DE NAMPULA");
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);

                paragraph = new Paragraph("SERVIÇO PROVINCIAL DE SAÚDE");
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);

                paragraph = new Paragraph(usuario.getHospital().getNomeHospital().toUpperCase());
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);

                paragraph = new Paragraph("RELATÓRIO DE REGISTO E ACTUALIZAÇÃO DE CASOS DE DOENÇAS CRÓNICAS");
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);

                document.add(new Paragraph("\n\n"));
                document.add(new Paragraph("Ano: " + ano));
                document.add(new Paragraph("Meses: " + (obterMesPorExtenso(mesInicio)).toUpperCase() + " a " + (obterMesPorExtenso(mesFim)).toUpperCase()));
                document.add(new Paragraph("\n\n\n"));

                // Cria uma tabela com o número de colunas igual ao número de campos
                var table = new PdfPTable(12); // 12 colunas conforme o número de campos
                table.setWidthPercentage(100);

                // Adiciona o cabeçalho da tabela
                addTableHeader(table);

                // Adiciona os campos e valores à tabela
                for (var caso : casos) {
                    addTableRow(table, caso);
                }

                // Adiciona a tabela ao documento
                document.add(table);

                document.add(new Paragraph("\n\n"));
                document.add(new Paragraph("\nGerado por " + usuario.getNomeCompleto() + "\nData " + dataExtenso + "\nHora : " + horaGeracao));

                document.add(new Paragraph("\n\n"));
                paragraph = new Paragraph("_________________________________________________");
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);

                paragraph = new Paragraph(usuario.getNomeCompleto());
                paragraph.setAlignment(ALIGN_CENTER);
                document.add(paragraph);

            } catch (DocumentException | FileNotFoundException e) {
                // Trate as exceções apropriadamente
            } finally {
                document.close();
            }

        }
    }

    private void addTableHeader(PdfPTable table) {
        String[] headers = {
            "NID",
            "Nome",
            "Data de Registo do caso",
            "Enfermidade",
            "Rastreio",
            "Diagnóstico",
            "ESP actual",
            "Situacao Atual do Paciente",
            "US de Assistencia",
            "Local da US",
            "Sector de Trabalho",
            "Morada"
        };

        var font = getFont(HELVETICA_BOLD);
        font.setSize(11);
        for (var header : headers) {
            var cell = new PdfPCell(new Phrase(header, font));
            table.addCell(cell);
        }
    }

    private void addTableRow(PdfPTable table, Caso caso) {
        table.addCell(caso.getNid().getNid());
        table.addCell(caso.getNid().getNome());
        table.addCell((caso.getDataRegistoCaso() != null) ? new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt", "MZ")).format(caso.getDataRegistoCaso()) : "null");
        table.addCell(caso.getEnfermidade());
        table.addCell(caso.getRastreio());
        table.addCell(caso.getDiagnostico());
        table.addCell(caso.getEspActual());
        table.addCell(caso.getSituacaoActualPaciente());
        table.addCell(caso.getUsDeAssistencia());
        table.addCell(caso.getLocalDaUs());
        table.addCell(caso.getNid().getSectorTrabalho());
        table.addCell(caso.getNid().getMorada());
    }

}
