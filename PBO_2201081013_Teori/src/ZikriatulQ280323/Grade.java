/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZikriatulQ280323;

/**
 *
 * @author hp
 */
public class Grade { //nilai grade harus jelas ada rentang dan tertera. //ketika kode program yang selalu mencekterus tidak berhenti2
    public static void main(String[] args){
         int grade = 92; 

        switch(grade){ 
         case 100:  
               System.out.println( "Excellent!" ); 
               break;                 
         case 90:
               System.out.println("Good job!" ); 
               break;
        case 80:
               System.out.println("Study harder!" ); 
               break; 
        default: 
               System.out.println("Sorry, you failed."); 

    }
  }
    
}
