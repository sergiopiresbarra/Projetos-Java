/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Sérgio
 */
public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de ave");
    }
    
    public void fazerNinho(){
        System.out.println("construindo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
