/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doandwhileproject;
import java.util.Scanner;

public class DoAndWhileProject {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        // Menu principal usando do-while
        do {
            System.out.println("\n=== MENU DE EXERCÍCIOS ===");
            System.out.println("1 - Números pares entre 1 e 20");
            System.out.println("2 - Tabuada de um número");
            System.out.println("3 - Quantidade de números entre 100 e 125");
            System.out.println("4 - Soma de números ímpares em um intervalo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma das opções: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    numerosPares();
                    break;
                case 2:
                    tabuada(scanner);
                    break;
                case 3:
                    quantidadeNumeros();
                    break;
                case 4:
                    somaImpares(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 0);
        
        scanner.close();
    }
    
    // Exercício 1: Números pares entre 1 e 20 usando while
    public static void numerosPares() {
        System.out.println("\n--- NÚMEROS PARES ENTRE 1 E 20 ---");
        int numero = 1;
        
        System.out.print("Os números pares entre 1 e 20 são: ");
        while (numero <= 20) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
            numero++;
        }
        System.out.println();
    }
    
    // Exercício 2: Tabuada 
    public static void tabuada(Scanner scanner) {
        System.out.println("\n--- TABUADA ---");
        System.out.print("Digite o número para descobrir a sua tabuada: ");
        int numero = scanner.nextInt();
        
        int multiplicador = 1;
        System.out.println("\nTabuada do " + numero + ":");
        
        do {
            int resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        } while (multiplicador <= 10);
    }
    
    // Exercício 3: Quantidade de números entre 100 e 125 
    public static void quantidadeNumeros() {
        System.out.println("\n--- QUANTIDADE DE NÚMEROS ENTRE 100 E 125 ---");
        int numero = 100;
        int contador = 0;
        
        while (numero <= 125) {
            contador++;
            numero++;
        }
        
        System.out.println("Quantidade de números entre 100 e 125 é de: " + contador);
    }
    
    // Exercício 4: Soma de números ímpares em um intervalo usando do-while
    public static void somaImpares(Scanner scanner) {
        System.out.println("\n--- SOMA DE NÚMEROS ÍMPARES ---");
        System.out.print("Digite o valor inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o valor final: ");
        int fim = scanner.nextInt();
        
        // Garantir que início seja menor que fim
        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }
        
        int soma = 0;
        int numero = inicio;
        
        System.out.print("Números ímpares encontrados: ");
        
        do {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
                soma += numero;
            }
            numero++;
        } while (numero <= fim);
        
        System.out.println("\nA Soma dos números ímpares foi: " + soma);
    }
}