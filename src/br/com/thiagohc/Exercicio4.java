/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;

import javax.swing.JOptionPane;

public class Exercicio4 {

    private int[] num;

    public Exercicio4() {
        num = new int[3];
    }

    public void ordemCrescente() {
        for (int i = 0; i < this.num.length; i++) {
            this.num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + " número"));
        }
        this.ordenar();
        this.imprimir();

    }

    public boolean ordenar() {
        int x = 0;
        int tmp;
        while (x < (this.num.length - 1)) {
            if (this.num[x] > this.num[x + 1]) {
                tmp = this.num[x];
                this.num[x] = this.num[x + 1];
                this.num[x + 1] = tmp;
                x = 0;
            } else {
                x++;
            }
        }
        return true;
    }

    public void imprimir() {
        System.out.println("Ordem Crescente");
        for (int i = 0; i < this.num.length; i++) {
            System.out.println((i + 1) + " = " + this.num[i]);
        }
    }
}