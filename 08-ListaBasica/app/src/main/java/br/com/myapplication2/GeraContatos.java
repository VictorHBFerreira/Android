package br.com.myapplication2;

import java.util.ArrayList;
import java.util.List;

public class GeraContatos  {

    public static List<Contato> geraContatos()  {
        List<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato("Paulo","1111");
        Contato contato2 = new Contato("Guilherme","2222");
        Contato contato3 = new Contato("Ygor","3333");
        Contato contato4 = new Contato("Victor","4444");
        Contato contato5 = new Contato("Victor Hugo","5555");

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);
        contatos.add(contato5);

        return contatos;
    }
}
