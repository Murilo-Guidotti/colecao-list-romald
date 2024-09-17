package br.edu.ifpr.lista.modelo;

import br.edu.ifpr.lista.Utils.Utils;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {
    private String NomeFantasia;
    private String CNPJ;

    public PessoaJuridica() {super(); }
    public PessoaJuridica(String nome, LocalDate nascimento, String NomeFantasia, String CNPJ,  Endereco endereco) {
        super(nome, nascimento, endereco);
        this.NomeFantasia = NomeFantasia;
        this.CNPJ = CNPJ;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        NomeFantasia = nomeFantasia;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        return "CNPJ: " + Utils.formatCNPJ(CNPJ) + "; Nome Fantasia: " + NomeFantasia + "; " + super.toString() + "\n";
    }
}
