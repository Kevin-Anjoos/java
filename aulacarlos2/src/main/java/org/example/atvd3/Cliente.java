package org.example.atvd3;

public class Cliente {
    private String nome;
    private int numero;
    private Endereco endereco;

    //construtor.
    public Cliente(String nome, int numero, Endereco endereco) {
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco1(Endereco endereco) {
        this.endereco = endereco;
    }
}
