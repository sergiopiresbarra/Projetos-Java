/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

/**
 *
 * @author Sérgio
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        c1.status();
        //c1.destampar();
        c1.rabiscar();
        
        
        Borracha b1 = new Borracha();
        b1.cor = "branca";
        b1.modelo = "highfly";
        b1.tamanho = 3f;
        
        b1.status();
        for(int i=0; i<5; i++){
            b1.apagando();
        }
        
        
        
    }
    
}
