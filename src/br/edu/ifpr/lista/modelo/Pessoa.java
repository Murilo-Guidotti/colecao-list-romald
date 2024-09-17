package br.edu.ifpr.lista.modelo;

import br.edu.ifpr.lista.Utils.Utils;

import java.time.LocalDate;

public abstract class Pessoa{
    protected String nome;
    protected LocalDate nascimento;
    protected Endereco ender;


    public Pessoa() {}
    public Pessoa(String nome, LocalDate nascimento, Endereco endereco) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.ender = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "; Data de nascimento: " + Utils.formatDate(nascimento) +
                "; \nEndereço = " + ender;
    }

    @Override
    public boolean equals(Object obj) {
        // se o "this" e é igual a obj retorna TRUE
        if (this == obj) return true;

        if (!(obj instanceof Pessoa)) return false; // se a classe do obj e do equals/this forem
        // diferentes, ele retorna FALSE
        // OU

        if (this.getClass() != obj.getClass()) return false;

        if (obj == null) return false;
        Pessoa temp = (Pessoa) obj;
        if (!this.getNome().equals(temp.nome)) {
            return false;
        }
        if (!this.getNascimento().equals(temp.nascimento)) {
            return false;
        }
        if (!this.ender.equals(temp.ender)) {
            return false;
        }

        return true;
    }

}
