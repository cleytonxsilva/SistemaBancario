package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PessoaFisica> listaPessoaFisica = new ArrayList<PessoaFisica>();

        listaPessoaFisica.add(new PessoaFisica("Cleyton", "12345678910", 0.0f));

        for (PessoaFisica item : listaPessoaFisica){
            System.out.println(listaPessoaFisica);
        }


    }
}