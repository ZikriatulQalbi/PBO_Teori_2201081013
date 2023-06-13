/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZikriatulQalbi110423;

/**
 *
 * @author hp
 */
public class TestPassByReference {
    public static void main(String[] args){
        //membuat array integer
        int []ages ={10, 11,12};
        
        //mencetak nilai array
        for(int i=0; i<ages.length; i++){
            System.out.println(ages[i] );
        }  
            test(ages); //alamat kalau dikrim maka dia berubah yg di bawahnya
            
            for(int i=0; i<ages.length; i++){
            System.out.println(ages[i]);
            
        }
        }
        public static void test(int[] arr){ //isi arr adalah alamat dari ages
            //merubah nilai aarray
            for(int i=0; i<arr.length; i++){
                arr[i] = i+50;
            }
        }
    }
    

