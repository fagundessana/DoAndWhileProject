/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doandwhileproject;
import java.util.Scanner;//importei a classe scanner

public class DoAndWhileProject { //denominei a atividade de DoAndWhileProject
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;//declarei a variável opção
        
        // Aqui é o menu para acessar cada exercício
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Números pares entre 1 e 20");//opção 1- números pares de 1 a 20
            System.out.println("2 - Tabuada de um número");//opção 2- Tabuada
            System.out.println("3 - Quantidade de números entre 100 e 125");//opção 3- quantidade de números entre 100 e 125
            System.out.println("4 - Soma de números ímpares em um intervalo");// opção 4- soma dos números ímpares de determinado intervalo
            System.out.println("0 - Sair");//opção de sair 
            System.out.print("Escolha uma das opções: ");//mensagem exibida para que o usuário escolha uma das opções
            
            opcao = scanner.nextInt();// leitura da opção escolhida
            //Neste bloco estão separados cada uma das opções do menu
            switch (opcao) {
                case 1:
                    numerosPares();//opção 1
                    break;
                case 2:
                    tabuada(scanner);//opção 2
                    break;
                case 3:
                    quantidadeNumeros();//opção 3
                    break;
                case 4:
                    somaImpares(scanner);//opção 4
                    break;
                case 0:
                    System.out.println("Encerrando programa...");//opção de encerramento
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");//mensagem de erro
            }
            
        } while (opcao != 0);// então se a opção for diferente ou igual a zero, será encerrado o scanner
        
        scanner.close();//fecha o scanner
    }
    
    // Exercício 1: Números pares entre 1 e 20 
    public static void numerosPares() { 
        System.out.println("\n--- NÚMEROS PARES ENTRE 1 E 20 ---");
        int numero = 1;//iniciará pelo 1
        
        System.out.print("Os números pares entre 1 e 20 são: ");//mensagem exibida ao usuário
        while (numero <= 20) {//quando o número for menor ou igual a 20 será executado
            if (numero % 2 == 0) {//faz a verificação se o número é par
                System.out.print(numero + " ");
            }
            numero++;//incrementa o contador 
        }
        System.out.println();//cria uma nova linha
    }
    
    // Exercício 2: Tabuada 
    public static void tabuada(Scanner scanner) {
        System.out.println("\n--- TABUADA ---");
        System.out.print("Digite o número para descobrir a sua tabuada: ");//pede para o usuário digitar um número
        int numero = scanner.nextInt();
        
        int multiplicador = 1;//o multiplicador inicial será o 1
        System.out.println("\nTabuada do " + numero + ":");//exibirá a tabuada do número escolhido
        
        //neste bloco será realizado os cálculos e a exibição de seus respectivos resultados
        do {
            int resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);//esquema da multiplicação montado
            multiplicador++;
        } while (multiplicador <= 10);//o multiplicador será a partir do 1 e até o 10
    }
    
    // Exercício 3: Quantidade de números entre 100 e 125 
    public static void quantidadeNumeros() {
        System.out.println("\n--- QUANTIDADE DE NÚMEROS ENTRE 100 E 125 ---");
        int numero = 100;//iniciará pelo 100
        int contador = 0;
        //neste bloco é realizado o cálculo de quantos números tem entre 100 e 125
        while (numero <= 125) {//executa enquanto o número for menor ou igual a 125
         contador++; // Incrementa o contador a cada iteração
            numero++;   // Passa para o próximo número
        }
        
        System.out.println("Quantidade de números entre 100 e 125 é de: " + contador);//exibe a mensagem final da quantidade de números entre 100 e 125
    }
    
    // Exercício 4: Soma de números ímpares em um intervalo usando do-while
    public static void somaImpares(Scanner scanner) {
        System.out.println("\n--- SOMA DE NÚMEROS ÍMPARES ---");
        System.out.print("Digite o valor inicial: ");//pede um valor inicial ao usuário
        int inicio = scanner.nextInt();
        System.out.print("Digite o valor final: ");//pede um valor final
        int fim = scanner.nextInt();
        
        // Garante que o início seja menor que fim, caso o usuário coloque a ordem contrária do que é esperado, será automaticamente trocado a ordem informada
        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }
        
        int soma = 0;//variável da soma
        int numero = inicio;//variável que vai armazenar o número
        
        System.out.print("Números ímpares encontrados: ");
        
        //neste bloco será realizado o cálculo
        do {// será executado pelo menos uma vez
            if (numero % 2 != 0) {// deve ser diferente de zero o resultado da divisão
                System.out.print(numero + " ");//exibe o número ímpar
                soma += numero;// Adiciona o número ímpar à soma total
            }
            numero++;//passa para o próximo número
        } while (numero <= fim);//continua até chegar ao valor final
        
        System.out.println("\nA Soma dos números ímpares foi: " + soma);//mensagem final da soma dos números
    }
}