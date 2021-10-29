/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

import java.util.Arrays;

/**
 *
 * @author Sérgio
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n[] = new int[5];
        int n[] = {1,3,2,7,6,0};
        
        for (int i = 0; i < 6; i++) {
            System.out.format(n[i]+" ");
        }
        System.out.println("\n==================");
        Arrays.sort(n);
        for(int valor: n){
            System.out.print(valor+" ");
        }
        
        
        
    }
    
}
