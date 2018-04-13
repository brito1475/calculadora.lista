
package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
        private float valor1;
        private float valor2;
        private float resultado;
        private List<String> resultados = new ArrayList<String>();
        
    public float getValor1() {
        return valor1;
    }
    
    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }
    
    public float getValor2() {
        return valor2;
    }
    
    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
    
    public float getResultado() {
        return resultado;
    }
    
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public List<String> getResultados() {
        return resultados;
    }

    public void setResultados(List<String> resultados) {
        this.resultados = resultados;
    }
    
    public void somar() {
        resultado = valor1 + valor2;
        resultados.add ("["+valor1+" + "+valor2+" = "+resultado+"]");
    }
    
    public void subtrair() {
        resultado = valor1 - valor2;
        resultados.add ("["+valor1+" - "+valor2+" = "+resultado+"]");
    }
    
    public void multiplicar() {
        resultado = valor1 * valor2;
        resultados.add ("["+valor1+" * "+valor2+" = "+resultado+"]");
    }
    
    public void dividir() {
        resultado = valor1 / valor2;
        resultados.add ("["+valor1+" / "+valor2+" = "+resultado+"]");
    }
}