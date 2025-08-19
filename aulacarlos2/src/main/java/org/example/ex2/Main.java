package org.example.ex2;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Marta","Barra",123456789-12,7194578-4879,21);
        Veiculo v1 = new Veiculo("Vermelho","OUV-4135",5, 48, 180,12);

        System.out.println("Cor: " + v1.getCor());
        System.out.println("Placa: " + v1.getPlaca());
        System.out.println("Numero De Passageiros: " + v1.getNumeropassageiros());
        System.out.println("Capacidade Do Tanque: " + v1.getCapacidadetanque());
        System.out.println("Consumo Medio: " + v1.getConsmed());
        System.out.println("Velocidade Maxima: " + v1.getVelmax());

        System.out.println("Nome: " + c1.getNome());
        System.out.println("Endereço: " + c1.getEndereco());
        System.out.println("Cpf: " + c1.getCpf());
        System.out.println("Telefone: " + c1.getTelefone());
        System.out.println("Idade: " + c1.getIdade());
    }
}
