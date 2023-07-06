package uninter;

import java.util.Scanner;

public class Menu {
    
    private Scanner sc;
    private Cofrinho cofrinho;


 
    public Menu() {
        sc = new Scanner(System.in);
        cofrinho = new Cofrinho() ;

    }

    public void exibirMenuPrincipal() {
        System.out.println("COFRINHO");
        System.out.println("1-Adiconar moeda: ");
        System.out.println("2-Remover moeda: ");
        System.out.println("3-Listar moedas: ");
        System.out.println("4-Calcular valor total convertido para Real: ");
        System.out.println("0-Encerrar");

        String opcaoSelecionada = sc.next();

        switch (opcaoSelecionada) {

            case "0":
                System.out.println("Finalizado");
                break;

            case "1":
                System.out.println("Escolha moeda!");
                System.out.println("1 -- Real: ");
                System.out.println("2 --  Dolar: ");
                System.out.println("3 --  Euro: ");

                int escolhaMoeda = sc.nextInt();

                System.out.println("Digite o valor: ");
                double valorMoeda = sc.nextDouble();
                
                Moeda moeda = null;

                if (escolhaMoeda == 1){
                     moeda = new Real(valorMoeda);
                    cofrinho.Adiconar(moeda);
                } else if (escolhaMoeda == 2){
                     moeda = new Dolar(valorMoeda);
                    cofrinho.Adiconar(moeda);
                } else if (escolhaMoeda == 3){
                     moeda = new Euro(valorMoeda);
                    cofrinho.Adiconar(moeda);
                } else {
                    System.out.println("Invalido, tente novamente");
                    exibirMenuPrincipal();
                }

                cofrinho.Adiconar(moeda);
                exibirMenuPrincipal();
                break;

            case "3":
                
                
            default:
                System.out.println("Opção invalida, digite novamente!");
                exibirMenuPrincipal();
                break;


        } 
    } 
}
