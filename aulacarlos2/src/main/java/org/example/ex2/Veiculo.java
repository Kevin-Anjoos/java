package org.example.ex2;

public class Veiculo {
        private String cor;
        private String placa;
        private int numeropassageiros;
        private int capacidadetanque;
        private int velmax;
        private int consmed;

    // construtor.


    public Veiculo(String cor, String placa, int numeropassageiros, int capacidadetanque, int velmax, int consmed) {
        this.cor = cor;
        this.placa = placa;
        this.numeropassageiros = numeropassageiros;
        this.capacidadetanque = capacidadetanque;
        this.velmax = velmax;
        this.consmed = consmed;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeropassageiros() {
        return numeropassageiros;
    }

    public void setNumeropassageiros(int numeropassageiros) {
        this.numeropassageiros = numeropassageiros;
    }

    public int getCapacidadetanque() {
        return capacidadetanque;
    }

    public void setCapacidadetanque(int capacidadetanque) {
        this.capacidadetanque = capacidadetanque;
    }

    public int getVelmax() {
        return velmax;
    }

    public void setVelmax(int velmax) {
        this.velmax = velmax;
    }

    public int getConsmed() {
        return consmed;
    }

    public void setConsmed(int consmed) {
        this.consmed = consmed;
    }
}
