package br.imd.fic.projetologin.domain;

public class Cidade {

    private int id;
    private String nome;

    public Cidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
