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
public class TestPassByValue {
    public static void main(String[] args){
        int i = 10;
        // Mencetak nilai i
        System.out.println("Nilai i sebelum method dipanggil: " + i);

        // Memanggil method test
        // Passing i sebagai parameter
        test(i);

        // Mencetak nilai i setelah method dipanggil
        System.out.println("Nilai i setelah method dipanggil: " + i);
    }

    public static void test(int j) {
        // Merubah nilai parameter j
        j = 33;
        System.out.println("Nilai j di dalam method: " + j);
    }

        
}
    

