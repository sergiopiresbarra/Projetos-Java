/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author Sérgio
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc =0;
        System.out.println("While=================");
        while(cc<10){
            cc++;
            
            if(cc == 5 || cc == 4){
                continue;
            }
            if(cc == 7){
                break;
            }
            System.out.println("cambalhota "+cc);
        }
        System.out.println("DoWhile================");
        
        cc = 0;
        do{
            System.out.println("cambalhota");
            cc++;
        }while(cc<4);
            
        
        System.out.println("For====================");
        for(int i=0; i<=3; i++){
            System.out.println(i);
            
        }
        
        
        
    }
    
    
    
}
