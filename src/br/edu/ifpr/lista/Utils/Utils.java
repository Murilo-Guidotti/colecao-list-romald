package br.edu.ifpr.lista.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static String formatDate(LocalDate date) {

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        return date.format(pattern);
    }

    public static String formatCPF(String cpf) {

        StringBuilder sb = new StringBuilder(cpf);

        sb.insert(3, ".");
        sb.insert(7, ".");
        sb.insert(11, "-");

        String temp = sb.toString();

        return temp;
    }

    public static String formatCNPJ(String cnpj) {
        StringBuilder sb = new StringBuilder(cnpj);

        sb.insert(2,".");
        sb.insert(6,".");
        sb.insert(10,"/");
        sb.insert(15,"-");

        String temp = sb.toString();

        return temp;
    }

    public static String formatCEP(String cep) {
        StringBuilder sb = new StringBuilder(cep);

        sb.insert(5,"-");

        String temp = sb.toString();

        return temp;
    }

}