package org.example.ex1;

public class pet1 {
    private String nome;
    private String raca;
    private String porte;
    private String alm;
    private int idade;

    //construtor.


    public pet1(String nome, String raca, String porte, String alm, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.porte = porte;
        this.alm = alm;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlm() {
        return alm;
    }

    public void setAlm(String alm) {
        this.alm = alm;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
