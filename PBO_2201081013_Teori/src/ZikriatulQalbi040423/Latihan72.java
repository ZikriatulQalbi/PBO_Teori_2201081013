/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZikriatulQalbi040423;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author hp
 */
public class Latihan72 {
    public static void main(String[] args){
        int[] angka = new int[10];
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try{
            for(int i=0;i<angka.length;i++){
           System.out.println("Input nilai ke--->" + (i+1));
           angka[i] = Integer.parseInt(dataIn.readLine());
            }
        }catch(Exception ex){    
        };
        int max=0;
        for(int i=0;i<angka.length;i++){
            max = (angka[i] > max)? angka[i]:max;
        }
        for(int i=0;i<angka.length;i++){ 
        System.out.println("Nilai ke--->"+ (i+1) + " " + angka[0]);
        }
        
        System.out.println("Nilai Max ="+max);
    }
    } 
    

