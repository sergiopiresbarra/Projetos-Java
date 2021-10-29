/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

/**
 *
 * @author Sérgio
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Visitante v1 = new Visitante();
        
        //v1.setNome("juvenal");
        //v1.setIdade(22);
        //v1.setSexo("M");
        Aluno a1 = new Aluno();
        a1.setCurso("info");
        a1.setNome("claudio");
        a1.setIdade(16);
        a1.setMatricula(1111);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setCurso("info2");
        b1.setNome("jubi");
        b1.setIdade(17);
        b1.setMatricula(1000);
        b1.setSexo("M");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        
        //System.out.println(v1.toString());
    }
    
}
