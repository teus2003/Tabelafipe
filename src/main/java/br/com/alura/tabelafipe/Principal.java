package br.com.alura.tabelafipe;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    public void exibeMenu() {
        System.out.println("****OPÇÕES****");
        System.out.println("Carro");
        System.out.println("Moto");
        System.out.println("Caminhão");
        System.out.println("Digite uma das opções para consulta de valores");
        var opcao = leitura.nextLine();
        System.out.println(opcao);
    }

}
