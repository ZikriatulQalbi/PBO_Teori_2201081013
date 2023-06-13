/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZikriatulQalbiM1;

/**
 *
 * @author hp
 */
public class KonversiBilangan3 {
    public static void main(String[] args) {
        String bilanganOktal = "76";

        // Konversi ke desimal
        int bilanganDesimal = Integer.parseInt(bilanganOktal, 8);
        System.out.println("Desimal: " + bilanganDesimal);

        // Konversi ke biner
        String bilanganBiner = Integer.toBinaryString(bilanganDesimal);
        System.out.println("Biner: " + bilanganBiner);

        // Konversi ke heksadesimal
        String bilanganHeksadesimal = Integer.toHexString(bilanganDesimal);
        System.out.println("Heksadesimal: " + bilanganHeksadesimal);
    }
    
}
