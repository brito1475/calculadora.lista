package calculadora;

import java.util.Scanner;
import javax.swing.JOptionPane;

import calculadora.Calculadora;

public class Menu {
    static Integer valor = 0;
    static Scanner ler = new Scanner(System.in);
    static Calculadora calculadora = new Calculadora();
    
    private static void chamar(){
        System.out.println ("Menu \n1 Somar \n2 Subtrair \n3 Multiplicar \n4 Dividir \n5 Imprimir \n6 Sair");
        valor = ler.nextInt();
    }

    private static void informar() {
        Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 1 Valor"));
        Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o 2 Valor"));                
        calculadora.setValor1 (numero1);
        calculadora.setValor2 (numero2);
    }
    
    public static void main (String[] args){        
        while(true){
            if(valor == 0){
                chamar();             
            }else if(valor == 1){
                informar();
                calculadora.somar();
                chamar();                                
            
            }else if(valor == 2){
                informar();
                calculadora.subtrair();
                chamar();                                
            
            }else if(valor == 3){
                informar();
                calculadora.multiplicar();
                chamar();                
            }else if(valor==4) {
            	informar();
            	calculadora.dividir();
            	chamar();  	    
            }else if(valor == 5){
                System.out.println(calculadora.getResultados());
                chamar();
            
            }else if(valor == 6)break;
        }
    }  
}    
