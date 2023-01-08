/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.projeto.aula;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class ProjetoAula {

    
    public static void main(String[] args) {
        //calculadora();
        pessoa();
    }
    static void calculadora(){
       String texto = JOptionPane.showInputDialog(null, "Digite um valor: ");
       double valor1 = Double.parseDouble(texto);
       
       String texto2 = JOptionPane.showInputDialog(null, "Digite a operação: ");
       
       String texto3 = JOptionPane.showInputDialog(null, "Digite um valor: ");
       double valor2 = Double.parseDouble(texto3);
       
       double valorfinal = 0;
       switch(texto2) {
           case "+":
               valorfinal = valor1 + valor2;
               break;
           case "-":
               valorfinal = valor1 - valor2;
               break;
           case "*":
               valorfinal = valor1 * valor2;
               break;
           case "/":
               valorfinal = valor1 / valor2;
           default:
              

       }
       
         JOptionPane.showMessageDialog(null, "O resultado da operação é: " + valorfinal);

       
       
    }
    
    static void pessoa(){
        String anos = JOptionPane.showInputDialog(null, "Digite quantos anos voceê tem: ");
        String meses = JOptionPane.showInputDialog(null, "Digite quantos meses você tem: ");
        String dias = JOptionPane.showInputDialog(null, "E digite quantos dias: ");
        
        anos = "365";
        meses = "30";
        
        JOptionPane.showMessageDialog(null, "O usuário digitou "+ anos+ ","+ meses+ "meses e "+dias);
        
    }
}

