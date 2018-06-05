/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;

import javax.swing.JOptionPane;

public class AtividadesGreve {

 public static void main(String[] args) {
        boolean tmp = true;
        while (tmp == true) {
            String opcao = JOptionPane.showInputDialog("O QUE DESEJA FAZER?\r\n"
                    + "1 para EXERCICIO 1\r\n"
                    + "2 para EXERCICIO 2\r\n"
                    + "3 para EXERCICIO 3\r\n"
                    + "4 para EXERCICIO 4\r\n"
                    + "5 para EXERCICIO 5\r\n"
                    + "6 para EXERCICIO 6\r\n"
                    + "7 para EXERCICIO 7\r\n"
                    + "8 para EXERCICIO 8\r\n"
                    + "9 para EXERCICIO 9\r\n"
                    + "10 para EXERCICIO 10\r\n"
                    + "0 para sair");
            if (opcao.toUpperCase().equals("0")) {
                tmp = false;
            } else if( (opcao.equals("1")) || (opcao.equals("2")) || (opcao.equals("3"))
                    || (opcao.equals("4")) || (opcao.equals("5")) || (opcao.equals("6"))
                    || (opcao.equals("7")) || (opcao.equals("8")) || (opcao.equals("9"))
                    || (opcao.equals("10"))) {
                int opcao2 = Integer.parseInt(opcao);
                switch (opcao2) {
                    case 1:
                        Exercicio1 ex1 = new Exercicio1();
                        ex1.imprimir();
                        break;
                    case 2:
                        Exercicio2 ex2 = new Exercicio2();
                        ex2.imprimir();
                        break;
                    case 3:
                        Exercicio3 ex3 = new Exercicio3();
                        ex3.operacoes();
                        break;
                    case 4:
                        Exercicio4 ex4 = new Exercicio4();
                        ex4.ordemCrescente();
                        break;
                    case 5:
                        Exercicio5 ex5 = new Exercicio5();
                        ex5.frase();
                        break;
                    case 6:
                        Exercicio6 ex6 = new Exercicio6();
                        ex6.posto();
                        break;
                    case 7:
                        Exercicio7 ex7 = new Exercicio7();
                        ex7.inicio();
                        break;
                    case 8:
                        Exercicio8 ex8 = new Exercicio8();
                        ex8.nomeReverso();
                        break;
                    case 9:
                        Exercicio9 ex9 = new Exercicio9();
                        ex9.kmLitro();
                        break;
                    case 10:
                        Exercicio10 ex10 = new Exercicio10();
                        ex10.litroNecessario();
                        break;

                }
            }
        }
    }
}