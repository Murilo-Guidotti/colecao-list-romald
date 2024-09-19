package br.edu.ifpr.lista.aplicacao;

import br.edu.ifpr.lista.Utils.Utils;
import br.edu.ifpr.lista.modelo.Pessoa;
import br.edu.ifpr.lista.modelo.PessoaFisica;
import br.edu.ifpr.lista.modelo.PessoaJuridica;
import br.edu.ifpr.lista.modelo.Endereco;

import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listPF = new ArrayList<Pessoa>();
        ArrayList<Pessoa> listPJ = new ArrayList<Pessoa>();


        // Cria uma lista com 5 pessoas fisicas
        for(int i = 0; i < 5; i++){
            listPF.add(new PessoaFisica("Milena Kamilly Marina Sales", LocalDate.of(1999, Month.JUNE, 25),
                    "93154049045", new Endereco("asdasd", "12345678", "asdasd", "asdasd", "asdasd", i)));
        }

        // Cria a lista com 5 pessoas juridicas
        for(int i = 0; i < 5; i++){
            listPJ.add(new PessoaJuridica("Rafaela Aurora Francisca Farias", LocalDate.of(1967, Month.JULY, 3), "Amazon Brasil",
                    "26352326000171", new Endereco("asdasd", "12345678", "asdasd", "asdasd", "asdasd", i)));
        }


        // Mostras os usuarios inseridos nas listas
        System.out.println("Lista Pessoa Fisica ->");
        for(int i = 0; i < 5; i++) {
            System.out.println(listPF.get(i));
        }

        System.out.println("Lista Pessoa Juridica ->");
        for(int i = 0; i < 5; i++) {
            System.out.println(listPJ.get(i));
        }

        new Gui();

    }
    public static class Gui extends JFrame{
        public Gui(){
            setTitle("Sistema de Usuarios");
            setSize(500,500);
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            //Botao para adicionar pessoa fisica
            JButton botao = new JButton("Adicionar pessoa fisica");

            botao.setBounds(125,0,250,100);
            add(botao);

            botao.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JFrame frame = new JFrame();
                    JFormattedTextField limit = new JFormattedTextField(12);

                    frame.setTitle("Cadastro de Pessoa fisica");
                    frame.setSize(500,500);
                    frame.setLayout(null);


                    JTextField nome = new JTextField("teste nome"); // Adiciona a caixa de texto para o nome
                    nome.setBounds(75,25,250,20);
                    JLabel labelNome = new JLabel("Nome: "); // indica onde e pra por o nome
                    labelNome.setBounds(35,25,250,20);



                    JTextField cpf = new JTextField(); // Adiciona a caixa pra por o CPF bruto
                    cpf.setBounds(75,50,250,20);
                    cpf.addFocusListener(new FocusAdapter() {
                        public void focusLost(FocusEvent e) {
                            if (cpf.getText().length() > 11) {
                                cpf.setText(cpf.getText().substring(0,11));
                            }
                        }
                    });
                    JLabel labelCpf = new JLabel("CPF: ");
                    labelCpf.setBounds(45,50,250,20);


                    JTextField rua = new JTextField();
                    rua.setBounds(75,90,250,20);
                    JLabel labelRua = new JLabel("Rua: ");
                    labelRua.setBounds(45,90,250,20);

                    JTextField CEP = new JTextField(8);
                    CEP.setBounds(75,250,80,20);
                    CEP.addFocusListener(new FocusAdapter() {
                        public void focusLost(FocusEvent e) {
                            if (CEP.getText().length() > 8) {
                                CEP.setText(CEP.getText().substring(0,8));
                            }
                        }
                    });
                    JLabel labelCEP = new JLabel("CEP: ");
                    labelCEP.setBounds(45,250,250,20);


                    JTextArea resultado = new JTextArea();
                    resultado.setBounds(25,300,380,80);



                    JButton submit = new JButton("Submit :)");
                    submit.setBounds(350,400,120,50);
                    submit.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            PessoaFisica temp = new PessoaFisica(nome.getText(), LocalDate.of(2008, Month.FEBRUARY, 26), cpf.getText(), new Endereco(rua.getText(), CEP.getText(), "asdasd", "asdasd", "asdasd", 143));

                            resultado.append(temp.toString());

                            System.out.println(temp.toString());
                        }
                    });

                    frame.add(nome);
                    frame.add(labelNome);
                    frame.add(cpf);
                    frame.add(labelCpf);
                    frame.add(CEP);
                    frame.add(labelCEP);
                    frame.add(rua);
                    frame.add(labelRua);
                    frame.add(submit);
                    frame.add(resultado);
                    frame.add(limit);

                    frame.setVisible(true);


                }
            });

            setVisible(true);
        }
    }
}