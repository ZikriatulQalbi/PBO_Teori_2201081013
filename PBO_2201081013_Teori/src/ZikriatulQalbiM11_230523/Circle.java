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
public class Circle  extends Shape{
    private int r;
    private final double phi = 3.14;
    private double area;
    
      public int getR(){
        return r;
    }
    
    public void setR(int r){
        this.r = r;
    }
    
    
    public String getName(){
        return "Lingkaran";
    }
    
    public double getArea(){
        area = phi * r * r;
        return area;
    }
    
}
