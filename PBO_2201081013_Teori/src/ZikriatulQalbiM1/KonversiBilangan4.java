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
public class KonversiBilangan4 {
    public static void main(String[] args) {
        String bilanganHeksadesimal = "43F";

        // Konversi ke desimal
        int bilanganDesimal = Integer.parseInt(bilanganHeksadesimal, 16);
        System.out.println("Desimal: " + bilanganDesimal);

        // Konversi ke biner
        String bilanganBiner = Integer.toBinaryString(bilanganDesimal);
        System.out.println("Biner: " + bilanganBiner);

        // Konversi ke oktal
        String bilanganOktal = Integer.toOctalString(bilanganDesimal);
        System.out.println("Oktal: " + bilanganOktal);
    }
    
}
