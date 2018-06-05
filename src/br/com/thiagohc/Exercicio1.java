/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;

public class Exercicio1 {
    
    
    private int var1;
    private double var2;
    private float var3;
    private boolean var4;
    private String var5;

    public Exercicio1() {
        var1 = 5;
        var2 = 700.5;
        var3 = 5.7f;
        var4 = true;
        var5= "THIAGO H. CRESTANI";
    }
    
    public void imprimir() {
        
        System.out.printf("A variável int: %d\r\nA variável double: %f\r\n"
                + "A variável float: %f\r\nA variável boolean: %b\r\n"
                + "A variável String: %s\r\n", this.var1, this.var2, this.var3, this.var4, this.var5);
        
    }
}
