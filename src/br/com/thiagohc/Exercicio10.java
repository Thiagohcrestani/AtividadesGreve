/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;

import javax.swing.JOptionPane;

public class Exercicio10 {

    private float kmL;
    private float distancia;
    
    public void litroNecessario() {
        this.kmL = Float.parseFloat(JOptionPane.showInputDialog("Informe a média KM/L"));
        this.distancia = Float.parseFloat(JOptionPane.showInputDialog("Informe a distância"));
        JOptionPane.showMessageDialog(null, "São necessários " + this.litroCalculo() + " litros de combústivel");
    }
    public float litroCalculo() {
        return (this.distancia / this.kmL);
    }
}
