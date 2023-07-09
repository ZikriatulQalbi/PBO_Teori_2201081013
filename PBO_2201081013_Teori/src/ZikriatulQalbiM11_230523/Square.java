/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZikriatulQalbiM11_230523;

/**
 *
 * @author hp
 */
public class Square {
    private int s;
     private double area;
    
     public int getS(){
        return s;
    }
    
    public void setS(int s){
        this.s = s;
    }
    
    
    public String getName(){
        return "Persegi";
    }
    
    public double getArea(){
        area = s * s ;
        return area;
    }
}
