/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;

import javax.swing.JOptionPane;

public class Exercicio2 {

    private int var1;
    private double var2;
    private float var3;
    private boolean var4;
    private String var5;

    public Exercicio2() {
        var1 = 5;
        var2 = 700.5;
        var3 = 5.7f;
        var4 = true;
        var5 = "THIAGO H. CRESTANI";
    }

    public void imprimir() {

        JOptionPane.showMessageDialog(null,
                "A variável int: " + this.var1
                + "\r\nA variável double: " + this.var2
                + "\r\nA variável float: " + this.var3
                + "\r\nA variável boolean: " + this.var4
                + "\r\nA variável String: " + this.var5);

    }
}