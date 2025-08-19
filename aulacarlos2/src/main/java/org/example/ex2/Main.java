package org.example.ex2;

public class Main {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Vermelho","OUV-4135",5, 48, 180,12);

        System.out.println("Nome pet1: " + v1.getCor());
        System.out.println("Nome pet1: " + v1.getPlaca());
        System.out.println("Nome pet1: " + v1.getNumeropassageiros());
        System.out.println("Nome pet1: " + v1.getCapacidadetanque());
        System.out.println("Nome pet1: " + v1.getConsmed());
        System.out.println("Nome pet1: " + v1.getVelmax());
    }
}
