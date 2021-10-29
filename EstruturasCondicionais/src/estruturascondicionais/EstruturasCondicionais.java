/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturascondicionais;

import java.util.Scanner;

/**
 *
 * @author Sérgio
 */
public class EstruturasCondicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int nasc = t.nextInt();
        int i = 2021 - nasc;
        System.out.println("sua idade é"+i);
        if(i>=18){
            System.out.println("maior");
        }else{
            System.out.println("menor");
        }
    }
    
}
