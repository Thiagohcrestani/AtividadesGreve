/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;

import javax.swing.JOptionPane;

public class Exercicio8{

    private String[] nome;

    public Exercicio8() {
        nome = new String[6];
    }

    public void nomeReverso() {
        for (int i = 0; i < this.nome.length; i++) {
            this.nome[i] = JOptionPane.showInputDialog("Informe o " + (i + 1) + " nome");
        }
        for (int i = (this.nome.length - 1); i >= 0; i--) {
            System.out.printf("Nome: %s\r\n", this.nome[i]);
        }
    }
}