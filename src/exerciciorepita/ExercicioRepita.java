/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author LUIZ FELIPE
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n, s = 0, totalValores = 0, totalPares = 0, totalImpares = 0, totalAcima100 = 0;;
        float media = 0;

        do {
            // Variável n recebe o número digitado pelo usuário na janela
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrrompe)</em></html>"));
            
            s += n; // Soma todos os números que foram digitados

            
            if (n != 0) { // Se o número digitado for diferente de 0 
                
                totalValores++; // Conta o número de valores digitados pelo usuário

                if (n % 2 == 0) { // Se o número digitado pelo usuário for par
                    
                    totalPares++; // O número de pares passa a ser contado por esta variável.
                
                } else { // Senão
                    totalImpares++; // O número de ímparas é contado
                }

                if (n > 100) { // Se o número digitado pelo usuário for maior do que 100
                    
                    totalAcima100++; // Os números maiores do que 100 passam a serem contados.
                }
            }

        } while (n != 0); // O laço é feito enquanto  o número digitado pelo usuário for diferente de zero.

        media = s / totalValores; // A média dos valores digitados é calculada.

        // Janela que exibe os resultados calculados o usuário digitar os valores (Somatório, Total De Valores Digitados, Total de pares, 
        // Total de Ímpares, Total de valores maiores que 100, Média dos valores).
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr> "
                + "<br>Somatório vale " + s + "<br> Total de Valores: " + totalValores + "<br> Total de Pares: " + totalPares + 
                "<br> Total de Ímpares: " + totalImpares + "<br> Total Acime de 100: " + totalAcima100 + "<br> Média dos Valores: " + 
                media + "</html>");
    }

}
