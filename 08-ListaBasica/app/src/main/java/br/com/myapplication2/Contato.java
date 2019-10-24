package br.com.myapplication2;

import java.io.Serializable;

public class Contato implements Serializable {

    private String nome;
    private String telefome;


    public Contato(String nome, String telefome) {
        this.nome = nome;
        this.telefome = telefome;
    }
    public Contato(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefome() {
        return telefome;
    }

    public void setTelefome(String telefome) {
        this.telefome = telefome;
    }


}
