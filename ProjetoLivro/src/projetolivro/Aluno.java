/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Sérgio
 */
public class Aluno extends Pessoa{
    private int mat;
    private String curso;

    public Aluno(String nome, char sexo, int idade) {
        super(nome, sexo, idade);
    }
    
    public void cancelarMatricula(){
        System.out.println("Matricula será cancelada!");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
