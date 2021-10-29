/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultraemojicombat;

/**
 *
 * @author Sérgio
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("pretty boy", "frança", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("spikes", "brasil", 30, 1.8f, 70f, 10, 1, 2);
        
        /*for(Lutador lu : l){
          if(lu !=null){  
            lu.apresentar();
            lu.status();
          }
        }
        */
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        //
        l[0].status();
        l[1].status();
    }
    
}
