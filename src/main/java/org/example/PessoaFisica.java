package org.example;

public class PessoaFisica {

    private String nome;
    private String cpf;

    private float saldoInicial;

    //function resgate
    //function depósito
    //function saldo investimentos


    //constructor
    public PessoaFisica(String nome, String cpf, float saldoInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldoInicial = saldoInicial;
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

    public  float getSaldoInicial(){
        return saldoInicial;
    }
    public  void setSaldoInicial(float saldoInicial){
        this.saldoInicial = saldoInicial;
    }


    //functions

}
