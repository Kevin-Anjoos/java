package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Marta", 25);

        System.out.println("Seu Nome É: " + c1.getNome());
        System.out.println("Sua Idade É: " + c1.getIdade());

    }
}