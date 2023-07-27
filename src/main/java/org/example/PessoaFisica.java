package org.example;

public class PessoaFisica {

    private String nome;
    private String cpf;

    //constructor
    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public PessoaFisica() {

    }


    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
