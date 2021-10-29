/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author Sérgio
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("=====================");
        System.out.println("uma caneta: "+ this.cor);
        System.out.println("está tampada?: "+this.tampada);
        System.out.println("modelo: "+this.modelo);
        System.out.println("ponta: "+this.ponta);
        System.out.println("nivel de carga: "+this.carga);
        System.out.println("---------------------");
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro: está tampada!");
        }
        else{
            System.out.println("Estou rabiscando!");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
