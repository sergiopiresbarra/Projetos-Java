/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Sérgio
 */
public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("comer vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
