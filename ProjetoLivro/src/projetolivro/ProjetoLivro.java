/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Sérgio
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("pedro", 'M', 22);
        p[1] = new Pessoa("maria", 'F', 25);
        
        Aluno p2 = new Aluno("pedrox",' ' ,20 );
        Professor p3 = new Professor("julio", 'M', 30);
        Funcionario p4 = new Funcionario("mary", 'F', 18);
        
        p2.setCurso("info");
        p3.setSalario(2500.5f);
        p4.mudaTrabalho();
        
        System.out.println(p[0].toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        //l[0] = new Livro("java", "jose", 300, p[0]);
        //l[1] = new Livro("poo", "pedro", 500, p[1]);
        //l[2] = new Livro("java avancado", "maria", 800, p[0]);
        
        //l[0].folhear(10);
        
        //l[0].detalhes();
        
        
    }
    
}
