package org.example;

public class Cliente {
    private String Nome;
    private int Idade;

    // construtor.

    public Cliente(String nome, int idade) {
        this.Nome = Nome;
        this.Idade = Idade;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
}
