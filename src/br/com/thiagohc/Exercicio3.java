/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;

import javax.swing.JOptionPane;

public class Exercicio3 {

    private String oper;
    private float num;
    private float result;

    public Exercicio3() {
        oper = "";
        num = 0;
        result = 0;
    }

    public void operacoes() {
        this.num = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));

        while (true) {
            String tmpOp = JOptionPane.showInputDialog("Qual é a operação que você deseja?\r\n"
                    + "+     SOMA\r\n"
                    + "-     SUBTRAÇÃO\r\n"
                    + "*     MULTIPLICAÇÃO\r\n"
                    + "/     DIVISÃO\r\n"
                    + "\r\ns    para SAIR");

            if (tmpOp.equals(".")) {
                System.out.printf("O resultado final: %.2f\r\n", this.result);
                break;
            } else {
                this.oper = tmpOp;
                float tmpNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
                this.calculo(tmpNumero);
                JOptionPane.showMessageDialog(null, "Resultado: " + this.result);
                System.out.printf("O resultado é: %.2f\r\n", this.result);
            }
        }
    }

    public void calculo(float tmpNumero2) {
        switch (this.oper) {
            case "+":
                this.result = this.num + tmpNumero2;
                break;
            case "-":
                this.result = this.num - tmpNumero2;
                break;
            case "*":
                this.result = this.num * tmpNumero2;
                break;
            case "/":
                this.result = this.num / tmpNumero2;
                break;
            default:
                System.out.println("???");
                break;
        }
        this.num = this.result;

    }
}