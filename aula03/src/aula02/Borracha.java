/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author Sérgio
 */
public class Borracha {
    String modelo;
    float tamanho;
    String cor;
    
    
    void apagando(){
        if(tamanho > 0){
            System.out.println("Está apagando");
            this.tamanho -= 1f; 
        }
        else{
            System.out.println("A Borracha já acabou!, use outra.");
        }
    }
    void status(){
        System.out.println("==============");
        System.out.println("modelo: "+this.modelo);
        System.out.println("tamanho: "+this.tamanho);
        System.out.println("cor: "+this.cor);
        System.out.println("--------------");
    }
}
