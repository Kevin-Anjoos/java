package org.example.ex1;

public class Main {
    public static void main(String[] args) {

        pet1 p1 = new pet1("Hulk","pitbull","medio","ex",2);
        pet1 p2 = new pet1("Max","Rottweiler","Grande","ex2",3);

        System.out.println("Nome pet1: " + p1.getNome());
        System.out.println("Nome pet1: " + p1.getRaca());
        System.out.println("Nome pet1: " + p1.getPorte());
        System.out.println("Nome pet1: " + p1.getAlm());
        System.out.println("Nome pet1: " + p1.getIdade());

        System.out.println("Nome pet1: " + p2.getNome());
        System.out.println("Nome pet1: " + p2.getRaca());
        System.out.println("Nome pet1: " + p2.getPorte());
        System.out.println("Nome pet1: " + p2.getAlm());
        System.out.println("Nome pet1: " + p2.getIdade());
    }
}
