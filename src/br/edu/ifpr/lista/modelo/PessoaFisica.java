package br.edu.ifpr.lista.modelo;

import br.edu.ifpr.lista.Utils.Utils;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica() { super(); }
    public PessoaFisica(String nome, LocalDate nascimento, String cpf, Endereco ender) {
        super(nome, nascimento, ender);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


//     Método ToString
    @Override
    public String toString() {
        return super.toString() + "\n" + "Cpf: " + Utils.formatCPF(cpf) + "\n" ;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Pessoa)) return false;
        if (this.getClass() != obj.getClass()) return false;

        PessoaFisica temp = (PessoaFisica) obj;

        if (!this.getCpf().equals(temp.cpf)) return false;

        if (!super.equals(temp)) return false;

        return true;
    }
}


