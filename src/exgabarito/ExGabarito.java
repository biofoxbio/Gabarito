/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exgabarito;

import javax.swing.JOptionPane;

/**
 *
 * @author logonpta
 */
public class ExGabarito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gabarito[] = new int[10];
        int resp[] = new int[10];
        
        String alunos[] = new String[15];
        int notas[] = new int[15];
        
        int i, j, resposta=0, nota=0;
        String aluno, saida;
        
        for(i=0; i<10; i++){
            gabarito[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a resposta " + (i+1)
                            + " do gabarito da prova: "));
        }
        
        for(i=0; i<15; i++){
            aluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
            alunos[i] = aluno;
            
            for(j=0; j<10; j++){
                resp[j] = Integer.parseInt(
                        JOptionPane.showInputDialog("Digite sua resposta "
                                + "para a " + (j+1) + "º pergunta da prova: "));
                if(resp[j] == gabarito[j]){
                    nota++;
                }
            }
            JOptionPane.showMessageDialog(null, aluno + ", sua nota é = "
                    + nota);
            notas[i] = nota;
            nota = 0;
        }
        
        saida = "";
        for(i=0; i<15; i++){
            saida = saida + alunos[i] + " nota = " + notas[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, saida);
    }
}
    
    

