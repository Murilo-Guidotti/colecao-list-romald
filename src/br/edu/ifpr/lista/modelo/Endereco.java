package br.edu.ifpr.lista.modelo;

import br.edu.ifpr.lista.Utils.Utils;

import java.util.Objects;

public class Endereco {
    private String nome_rua;
    private int num_rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String CEP;

    public Endereco(String nome_rua, String CEP, String estado, String cidade, String bairro, int num_rua) {
        this.nome_rua = nome_rua;
        this.CEP = CEP;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.num_rua = num_rua;
    }

    public String getNome_rua() {
        return nome_rua;
    }

    public void setNome_rua(String nome_rua) {
        this.nome_rua = nome_rua;
    }

    public int getNum_rua() {
        return num_rua;
    }

    public void setNum_rua(int num_rua) {
        this.num_rua = num_rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return  "Rua " + nome_rua +
                ", Número: " + num_rua +
                ", Bairro " + bairro  +
                ", \nCidade: " + cidade  +
                ", Estado: " + estado  +
                ", CEP: [" + Utils.formatCEP(CEP) + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(nome_rua, endereco.nome_rua) && Objects.equals(num_rua, endereco.num_rua) && Objects.equals(bairro, endereco.bairro) && Objects.equals(cidade, endereco.cidade) && Objects.equals(estado, endereco.estado) && Objects.equals(CEP, endereco.CEP);
    }
}
