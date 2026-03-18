package com.mycompany.poon;
import ucb.estudo.modelo.Pessoa;

public class App {

    public static void main(String[] args) {
        System.out.println("");
        
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Luiz Antonio");
        p1.setCpf("158.661.789-90");
        p1.setAltura(1.75);
        p1.setPeso(80);
        
        Pessoa p2 = new Pessoa();
        
        p2.setNome("Maria Novais");
        p2.setCpf("158.661.789-88");
        p2.setAltura(1.50);
        p2.setPeso(60);
    System.out.println("Ola, seja bem Vindo: " + p2.getNome());
    p2.exibirIMC();
    
    System.out.println("Ola, seja bem Vindo: "+p1.getNome());
    p1.exibirIMC();
    }
}
