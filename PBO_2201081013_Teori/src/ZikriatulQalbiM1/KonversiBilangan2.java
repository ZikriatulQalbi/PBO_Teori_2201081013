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
public class KonversiBilangan2 {
    public static void main(String[] args) {
        String bilanganBiner = "1001001101";

        // Konversi ke desimal
        int bilanganDesimal = Integer.parseInt(bilanganBiner, 2);
        System.out.println("Desimal: " + bilanganDesimal);

        // Konversi ke heksadesimal
        String bilanganHeksadesimal = Integer.toHexString(bilanganDesimal);
        System.out.println("Heksadesimal: " + bilanganHeksadesimal);

        // Konversi ke oktal
        String bilanganOktal = Integer.toOctalString(bilanganDesimal);
        System.out.println("Oktal: " + bilanganOktal);
    }
    
}
