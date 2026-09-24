package br.com.alura.tabelafipe;

import java.util.List;
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
        String tipo;
        if(opcao.equalsIgnoreCase("Carro")){
            tipo = "carros";
        }
        else if (opcao.equalsIgnoreCase("Moto")){
            tipo = "motos";
        }
        else{
            tipo = "caminhoes";

        }
        String endereco = "https://parallelum.com.br/fipe/api/v1/" + tipo + "/marcas";
        System.out.println(endereco);

        var consumo = new ConsumoApi();
        var json = consumo.obterDados(endereco);

        var conversor = new ConverteDados();
        List<Dados> marcas = conversor.obterLista(json, Dados.class);
        marcas.forEach(System.out::println);
    }
}
